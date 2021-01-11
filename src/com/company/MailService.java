package com.company;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
