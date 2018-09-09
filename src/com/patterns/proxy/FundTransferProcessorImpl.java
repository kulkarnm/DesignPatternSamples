package com.patterns.proxy;

public class FundTransferProcessorImpl implements FundTransferProcessor {
    public FundTransferProcessorImpl(){
    }
    public Response execute(Request request){
        boolean responseCode = transfer(request);
        return new Response(responseCode,request.getSourceAccountId(),request.getDestinationAccountId());
    }

    private boolean transfer(Request request){
        AccountDAO accountDAO = AccountDAO.getInstance();
        Account srcAccount = accountDAO.findAccountById(request.getSourceAccountId());
        Account destAccount = accountDAO.findAccountById(request.getDestinationAccountId());
        srcAccount.debit(request.getTransferAmount());
        srcAccount.credit(request.getTransferAmount());
        return true;
    }

} 
