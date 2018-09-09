package com.patterns.proxy;


import com.patterns.decorator.EligibilityValidationProcessor;
import com.patterns.decorator.LoggingProcessor;

public class ProxyTest {

    public static void main(String[] args) {
        Request request = new Request("usr1","pw1",1L,2L,500);
        FundTransferProcessor operation = new FundTransferProcessorProxy();

        Response response = operation.execute(request);
        System.out.println("The Response of the transfer operation is :" + response.getTransferStatus());
    }

}
