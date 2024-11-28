package com.mani.example.productservices.systemdesign.AdapterDesignPattern;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;

public class SendgridAdapter implements EmailAdapter{

    private SendGrid sendGrid;
    @Override
    public void sendEmail(String to, String from, String content) {
        Email fromemail = new Email(from);
        Email toemail = new Email(to);
        Content emailContent = new Content("text/plain", content);
        Mail mail = new Mail(fromemail, "Subject", toemail, emailContent);

        Request request = new Request();
        try{
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sendGrid.api(request);
            System.out.println("SendGrid response: " + response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
