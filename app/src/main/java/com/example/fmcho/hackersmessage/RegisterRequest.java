package com.example.fmcho.hackersmessage;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fmcho on 7/31/2016.
 */
public class RegisterRequest extends StringRequest {

    private static final String Register_request_URL = "http://fmchora.net23.net/Register.php";
    private Map<String, String> params;
    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> Listener) {
        super(Method.POST, Register_request_URL, Listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age+"");

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
