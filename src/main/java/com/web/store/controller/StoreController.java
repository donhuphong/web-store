package com.web.store.controller;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.web.store.base.BaseResponse;
import com.web.store.request.RequestLogin;
import com.web.store.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class StoreController {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    SysUsersService sysUsersService;

    public static Gson gson = new Gson();

    @RequestMapping(value = "/test-jwt", method = RequestMethod.GET)
    public String index() {
        return "hello";
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonObject> testBase() {
        BaseResponse test = new BaseResponse();
        JsonObject temp = new JsonObject();
        temp.addProperty("test", "test");
        test.setBody(temp);
        return ResponseEntity.ok(test.toJson());
    }


    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> authenticateUser(@RequestBody RequestLogin loginRequest) {

        // Xác thực từ username và password.
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        // Nếu không xảy ra exception tức là thông tin hợp lệ
        // Set thông tin authentication vào Security Context
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // Trả về jwt cho người dùng.

        return sysUsersService.generateToken(loginRequest.getEmail());
    }

}
