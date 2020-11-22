package com.web.store.service;


import com.web.store.base.BaseResponse;
import com.web.store.entity.RoleEntity;
import com.web.store.entity.SysUsersEntity;
import com.web.store.jwt.JwtToken;
import com.web.store.reponse.LoginResponse;
import com.web.store.repository.RoleRepository;
import com.web.store.repository.SysUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SysUsersService {

    @Autowired
    SysUsersRepository sysUsersRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private JwtToken tokenProvider;


    public ResponseEntity<?> getUser(int id) {
        SysUsersEntity s = new SysUsersEntity();

        SysUsersEntity sysUsersEntity = sysUsersRepository.findAllById(id);

        sysUsersRepository.save(sysUsersEntity);

        return ResponseEntity.ok(sysUsersEntity);
    }

    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(sysUsersRepository.findAll());
    }

    public SysUsersEntity findUserByEmail(String email) {
        return sysUsersRepository.findAllByEmail(email);
    }

    public RoleEntity findRolyById(Integer id) {
        return roleRepository.findAllById(id);
    }

    public ResponseEntity<BaseResponse> generateToken(String email) {
        BaseResponse response = new BaseResponse();
        try {
            String jwt = tokenProvider.generateToken(email);
            LoginResponse loginResponse = new LoginResponse(jwt, "Bearer");
            response.setResultCode(HttpStatus.OK.value());
            response.setResultMessage("success");
            response.setBody(loginResponse);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResponseEntity.ok(response);
    }


}
