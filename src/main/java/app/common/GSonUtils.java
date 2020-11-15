package app.common;

import com.google.gson.Gson;

public class GSonUtils<T> {
    public static Gson gson = new Gson();
    private  T t;
    public String convertToGSon(T t){
        this.t = t;
        String json = gson.toJson(t);
        return json;
    }
}
