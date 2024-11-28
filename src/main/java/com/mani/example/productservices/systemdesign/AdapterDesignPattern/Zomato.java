package com.mani.example.productservices.systemdesign.AdapterDesignPattern;

public class Zomato {

    private EmailAdapter adapter;

    public Zomato(EmailAdapter adapter) {
        this.adapter = adapter;
    }
    public void sendEmail(String to, String from, String content) {
        adapter.sendEmail(to, from, content);
    }

    public static void main(String[] args) {
        // Initialize SendgridAdapter with API key
//        String apiKey = "sonu";
//        EmailAdapter emailAdapter = new SendgridAdapter(apiKey);

        // Create Zomato instance with the email adapter
//        Zomato zomato = new Zomato(emailAdapter);

        // Send email
//        zomato.sendEmail("recipient@example.com", "sender@example.com", "This is a test email!");

        System.out.println("Email sent Successfully");
    }
}
