package de.telran.gateway;

import de.telran.model.User;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class UserGateWay {
    String registerUrl = "http://localhost:8080/user/register";

    public UserGateWay(RestTemplate rest) {
        this.rest = rest;
    }

    RestTemplate rest;

    public boolean registerUser(User user) {

        HttpEntity<User> request = new HttpEntity<>(user,null);
        ResponseEntity<Void> exchange = rest.exchange(registerUrl,HttpMethod.POST,request,Void.class);
        return exchange.getStatusCode() == HttpStatus.OK;
    }
}
