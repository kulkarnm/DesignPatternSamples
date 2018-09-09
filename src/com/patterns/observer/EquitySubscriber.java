package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class EquitySubscriber implements Observer {
    public void update(Observable equityShare, Object arg) {
        EquityShare share=(EquityShare) equityShare;
        System.out.println("***Share value changed to :" + share.getValuePerUnit());
        sendSms(share.getValuePerUnit());
    }
    private void sendSms(double updatedValuePerUnit){
        System.out.println("SMS Sent:::" + updatedValuePerUnit);
    }
} 
