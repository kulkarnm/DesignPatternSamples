package com.patterns.decorator;

public class FundTransferProcessor implements Processor {
    private Processor nextProcessor;
    public FundTransferProcessor(Processor processor){
        this.nextProcessor = processor;
    }
    public Response execute(Request request){
        boolean responseCode = transfer(request);
        if(null != nextProcessor){
            return nextProcessor.execute(request);
        }else {

            return new Response(responseCode, request.getSourceAccountId(), request.getDestinationAccountId());
        }
    }

    private boolean transfer(Request request){
        AccountDAO accountDAO = AccountDAO.getInstance();
        Account srcAccount = accountDAO.findAccountById(request.getSourceAccountId());
        Account destAccount = accountDAO.findAccountById(request.getDestinationAccountId());
        srcAccount.debit(request.getTransferAmount());
        srcAccount.credit(request.getTransferAmount());
        System.out.println("Transfer done");
        return true;
    }

} 
