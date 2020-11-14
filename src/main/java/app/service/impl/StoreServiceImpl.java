package app.service.impl;


import app.request.RequestLogin;
import app.service.StoreService;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    public static Gson gson = new Gson();


    public String login(RequestLogin requestLogin) {

        return "user or password fail";
    }
}
