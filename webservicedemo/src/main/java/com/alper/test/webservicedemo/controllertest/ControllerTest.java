package com.alper.test.webservicedemo.controllertest;

import com.alper.test.webservicedemo.restmodel.SambaToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@RestController
public class ControllerTest {


    @PostMapping("/getAuthToken/test")
    public ResponseEntity<SambaToken> mainPage()
    {
       SambaToken sambaToken = new SambaToken();
       sambaToken.setToken_type("bearer");
       sambaToken.setAccess_token("AAAAAIKSADFSDFMSDGwswerfweorwoer324235345pol346l234234235235");
       sambaToken.setExpires_in((long) 1200);
       BigDecimal bg =BigDecimal.valueOf(1581066088);
       sambaToken.setConsented_on(bg);
       sambaToken.setScope("security");

       return ResponseEntity.ok(sambaToken);
    }
}
