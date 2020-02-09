package com.alper.test.webservicedemo.restcontroller;

import com.alper.test.webservicedemo.restmodel.SambaToken;
import org.springframework.http.ResponseEntity;

public interface AuthTokenSambaController {

    public ResponseEntity<SambaToken> getAuthToken();
}
