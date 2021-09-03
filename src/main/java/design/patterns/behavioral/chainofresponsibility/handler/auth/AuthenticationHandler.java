package design.patterns.behavioral.chainofresponsibility.handler.auth;
/**
 * @author nayanava
 */

import design.patterns.behavioral.chainofresponsibility.handler.Handler;
import design.patterns.behavioral.chainofresponsibility.request.AuthenticationRequest;

import java.io.*;

public abstract class AuthenticationHandler implements Handler<AuthenticationRequest, Boolean> {

    protected AuthenticationHandler successor;
    @Override
    public abstract Boolean handleRequest(AuthenticationRequest request);
}
