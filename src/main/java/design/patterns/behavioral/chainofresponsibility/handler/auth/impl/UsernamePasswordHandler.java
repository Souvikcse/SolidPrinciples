package design.patterns.behavioral.chainofresponsibility.handler.auth.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.chainofresponsibility.handler.auth.AuthenticationHandler;
import design.patterns.behavioral.chainofresponsibility.request.AuthenticationRequest;
import design.patterns.behavioral.chainofresponsibility.request.impl.OAuthTokenRequest;

import java.io.*;

public class UsernamePasswordHandler extends AuthenticationHandler{
    public UsernamePasswordHandler(AuthenticationHandler next) {
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
