package com.registeration.mail.email;

public interface EmailSender {
    void send(String to, String email);
}