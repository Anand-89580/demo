package com.example.TurfServiceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClient {
//i have to write url acc to chatty user service
   // @Value("${user.service.url}")
    private String userServiceUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getUserEmail(Long userId) {
        String url = userServiceUrl + "/users/" + userId + "/email";
        return restTemplate.getForObject(url, String.class);
    }
}
