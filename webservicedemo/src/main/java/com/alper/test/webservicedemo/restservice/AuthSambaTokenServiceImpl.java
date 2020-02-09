package com.alper.test.webservicedemo.restservice;

import com.alper.test.webservicedemo.configuration.HeaderConfig;
import com.alper.test.webservicedemo.restmodel.SambaToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Service
public class AuthSambaTokenServiceImpl implements AuthSambaTokenService {


    private RestTemplate restTemplate;

    @Autowired
    private HeaderConfig headers;

    @Autowired
    public AuthSambaTokenServiceImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @Override
    public SambaToken getToken() {

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/test").build().toUri();

        SambaToken sambaToken = restTemplate.postForObject(location.toString(), headers.httpHeaders(), SambaToken.class);
        return sambaToken;
    }
}
