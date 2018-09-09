package com.patterns.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Request request = new Request("usr1","pw1",1L,2L,500);
        Processor operation = new FundTransferProcessor(
                new LoggingProcessor(
                        new AuthenticationProcessor(
                                new EligibilityValidationProcessor(
                                        null
                                )
                        )
                )
        );

        Response response = operation.execute(request);
        System.out.println("The Response of the transfer operation is :" + response.getTransferStatus());
    }

}
