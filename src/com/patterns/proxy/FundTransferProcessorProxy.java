package com.patterns.proxy;

public class FundTransferProcessorProxy implements FundTransferProcessor {
    private FundTransferProcessor realFundTransferProcessor;
    public FundTransferProcessorProxy(){
        this.realFundTransferProcessor = new FundTransferProcessorImpl();
    }
    public Response execute(Request request){
        User user= UserDAO.getInstance().findUserById(request.getUserId());
        if(request.getPassword().equals(user.getPassword())){
            if(null != realFundTransferProcessor) {
                return realFundTransferProcessor.execute(request);
            }else{
                return new Response(true,request.getSourceAccountId(),request.getDestinationAccountId());
            }
        }else{
            return new Response(false,request.getSourceAccountId(),request.getDestinationAccountId());

        }
    }

} 
