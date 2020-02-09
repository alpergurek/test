package com.alper.test.webservicedemo.restcontroller;

import com.alper.test.webservicedemo.restmodel.SambaToken;
import com.alper.test.webservicedemo.restservice.AuthSambaTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthTokenSambaControllerImpl implements AuthTokenSambaController {


    private AuthSambaTokenService authSambaTokenService;

    @Autowired
    public AuthTokenSambaControllerImpl(AuthSambaTokenService authSambaTokenService)
    {
        this.authSambaTokenService = authSambaTokenService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/getAuthToken")
    @Override
    public ResponseEntity<SambaToken> getAuthToken() {

        try {
            SambaToken sambaToken = authSambaTokenService.getToken();

            return ResponseEntity.ok(sambaToken);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
