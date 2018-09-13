package com.patterns.command;

public class TransferFundCommandReceiver {
    private static TransferFundCommandReceiver transferFundCommandReceiver = new TransferFundCommandReceiver();
    private FundTransferCommandArgument commandArgument;
    private TransferFundCommandReceiver(){}

    public static TransferFundCommandReceiver getInstance() {
        return transferFundCommandReceiver;
    }

    public void setCommandArgument(FundTransferCommandArgument commandArgument){
        this.commandArgument=commandArgument;
    }
    public void handleCommand(){
        transfer(commandArgument.getSourceAccountId(),commandArgument.getDestinationAccountId(),commandArgument.getAmountTobeTransferred());
    }

    private void transfer(long srcAccountId,long destinationAccountId,double amountToBeTransferred){
        AccountDAO accountDAO = AccountDAO.getInstance();
        Account srcAccount = accountDAO.findAccountById(srcAccountId);
        Account destAccount = accountDAO.findAccountById(destinationAccountId);
        if(srcAccount.getBalance() > amountToBeTransferred) {
            srcAccount.debit(amountToBeTransferred);
            srcAccount.credit(amountToBeTransferred);
            System.out.println("Fund transferred");
        }else{
            throw new InsufficientBalanceException("Insufficient Balance in source account");
        }
    }

} 
