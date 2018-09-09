package com.patterns.decorator;

public class Response {
    private final boolean transferStatus;
    private final long sourceAccountId;
    private final long destinationAccountId;

    public Response(boolean transferStatus, long sourceAccountId, long destinationAccountId) {
        this.transferStatus = transferStatus;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
    }

    public boolean getTransferStatus() {
        return transferStatus;
    }

    public long getSourceAccountId() {
        return sourceAccountId;
    }

    public long getDestinationAccountId() {
        return destinationAccountId;
    }

    @Override
    public String toString() {
        return "Response{" +
                "transferStatus=" + transferStatus +
                ", sourceAccountId=" + sourceAccountId +
                ", destinationAccountId=" + destinationAccountId +
                '}';
    }
}
