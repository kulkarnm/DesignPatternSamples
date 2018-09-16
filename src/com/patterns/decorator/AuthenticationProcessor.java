package com.patterns.decorator;


public class AuthenticationProcessor implements Processor {
    private Processor nextProcessor;
    public AuthenticationProcessor(Processor processor){
        this.nextProcessor = processor;
    }
    public Response execute(Request request){
        User user= UserDAO.getInstance().findUserById(request.getUserId());
        if(request.getPassword().equals(user.getPassword())){
            System.out.println("User successfully authenticated");
            if(null !=nextProcessor) {
                return nextProcessor.execute(request);
            }else{
                return new Response(true,request.getSourceAccountId(),request.getDestinationAccountId());
            }
        }else{
            return new Response(false,request.getSourceAccountId(),request.getDestinationAccountId());

        }
    }

} 
