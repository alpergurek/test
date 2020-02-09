package com.alper.test.webservicedemo.restmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SambaToken {

    private String token_type;
    private String access_token;
    private Long expires_in;
    private BigDecimal consented_on;
    private String scope;

    public String getToken_type() { return token_type; }

    public void setToken_type(String token_type) { this.token_type = token_type; }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in;
    }

    public BigDecimal getConsented_on() {
        return consented_on;
    }

    public void setConsented_on(BigDecimal consented_on) {
        this.consented_on = consented_on;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}