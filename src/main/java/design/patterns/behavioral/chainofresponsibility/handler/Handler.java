package design.patterns.behavioral.chainofresponsibility.handler;


import design.patterns.behavioral.chainofresponsibility.request.LoggingRequest;

/**
 * @author nayanava
 */

public interface Handler<TReq, TRes> {

    public abstract TRes handleRequest(TReq request);
}
