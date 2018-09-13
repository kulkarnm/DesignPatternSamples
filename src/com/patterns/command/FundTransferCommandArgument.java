package com.patterns.command;

public class FundTransferCommandArgument {
    private long sourceAccountId;
    private long destinationAccountId;
    private double amountTobeTransferred;

    public FundTransferCommandArgument(long sourceAccountId, long destinationAccountId, double amountTobeTransferred) {
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.amountTobeTransferred = amountTobeTransferred;
    }

    public long getSourceAccountId() {
        return sourceAccountId;
    }

    public long getDestinationAccountId() {
        return destinationAccountId;
    }

    public double getAmountTobeTransferred() {
        return amountTobeTransferred;
    }
}
