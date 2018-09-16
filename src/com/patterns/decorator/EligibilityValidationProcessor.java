package com.patterns.decorator;

public class EligibilityValidationProcessor implements Processor {
    private Processor nextProcessor;
    public EligibilityValidationProcessor(Processor processor){
        this.nextProcessor = processor;
    }
    public Response execute(Request request){
        Account sourceAccount= AccountDAO.getInstance().findAccountById(request.getSourceAccountId());
        if(sourceAccount.getBalance()>request.getTransferAmount()){
            System.out.println("Adequate balance is available");
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
