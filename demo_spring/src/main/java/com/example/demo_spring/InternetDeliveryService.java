package com.example.demo_spring;

public class InternetDeliveryService implements DeliveryService {

    public void deliveryMessage(){
        TCPConnection connection= new TCPConnection();
        System.out.println("Internet delivery");
        connection.init();
        connection.send();
        connection.close();
        System.out.println("delivered");

    }
}
