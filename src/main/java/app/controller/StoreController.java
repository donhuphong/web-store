package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StoreController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "hello";
    }
}
