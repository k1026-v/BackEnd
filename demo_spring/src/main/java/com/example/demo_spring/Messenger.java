package com.example.demo_spring;

public class Messenger {
    DeliveryService service;

    public Messenger(DeliveryService service) {
        this.service = service;
    }

    public void sendMessange (String msg){
        System.out.println("Send new messange" + msg);
        System.out.println("Start sending");
        //InternetDeliveryService service = new InternetDeliveryService();
        service.deliveryMessage();
        System.out.println("finish sending");
    }
}
