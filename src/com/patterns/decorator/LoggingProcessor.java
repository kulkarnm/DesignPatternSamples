package com.patterns.decorator;

public class LoggingProcessor implements Processor {
    private Processor nextProcessor;
    public LoggingProcessor(Processor processor){
        this.nextProcessor = processor;
    }
    public Response execute(Request request){
        System.out.println("request parameters are: " + request.toString());
        Response response=null;
        if(null != nextProcessor){
            response = nextProcessor.execute(request);
        }
        System.out.println("Response is :" + response);
        return response;
    }

} 
