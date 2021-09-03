package design.patterns.behavioral.chainofresponsibility.handler.auth.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.chainofresponsibility.handler.auth.AuthenticationHandler;
import design.patterns.behavioral.chainofresponsibility.request.AuthenticationRequest;
import design.patterns.behavioral.chainofresponsibility.request.impl.OAuthTokenRequest;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

import java.io.*;

public class OAuthHandler extends AuthenticationHandler {

    public OAuthHandler(AuthenticationHandler next) {
        super.successor = next;
    }
    @Override
    public Boolean handleRequest(AuthenticationRequest request) {
        if(request instanceof OAuthTokenRequest) {
            return true;
        } else if(super.successor != null) {
            return successor.handleRequest(request);
        }
        return false;
    }
}
