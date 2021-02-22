//package app.controller;
//
//import app.reponse.UserInfo;
//import org.sonatype.inject.Parameters;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api/admin")
//public class AdminController {
//
//    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
//    public String createUser() {
//        return "hello";
//    }
//
//    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
//    public String getUser(@Parameters String user) {
//        UserInfo res = new UserInfo("phongchodien","phongchodien@gmail.com",
//                "Lươn Như Phong","+84964129341","male","06/12/1997");
//        return res.convertToGSon(res);
//    }
//
//    @RequestMapping(value = "/get-all-user", method = RequestMethod.GET)
//    public String getAllUser() {
//        return "listUser";
//    }
//
//
//}
