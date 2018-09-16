package com.patterns.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Request request = new Request("usr1","pw1",1L,2L,500);
        Processor processor= new LoggingProcessor(
                        new AuthenticationProcessor(
                                new EligibilityValidationProcessor(
                                        new FundTransferProcessor(null)
                                )
                        )
        );

        Response response = processor.execute(request);
    }

}
