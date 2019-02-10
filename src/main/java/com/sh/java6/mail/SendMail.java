package com.sh.java6.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    private static final String CONTENT_TYPE = "text/html";

    private SendMail() {

    }

    public static boolean sendMail(String subject, String mailBody, String recipient) {


        final String fromEmail = "idw.dbadmin@impetus.in";
        final String password = "Pass@123";

        Properties props = setSmtpProperties();
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        sendMessage(session, subject, mailBody, fromEmail, recipient);
        return true;
    }

    private static Properties setSmtpProperties() {
        Properties props = new Properties();
        props.put("mail.smtp.user", "idw.dbadmin@impetus.in");
        props.put("mail.smtp.host", "192.168.100.50");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "false");
        props.put("mail.smtp.auth", "true");
        return props;
    }

    private static void sendMessage(Session session, String subject, String mailBody, String from,
            String recipient) {
       
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.setReplyTo(InternetAddress.parse("no_reply@impetus-idw.com", false));
            msg.setSubject(subject);
            msg.setContent(mailBody, CONTENT_TYPE);
            msg.setSentDate(new Date());
            msg.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse(recipient));
            Transport.send(msg);
            System.out.println("Email Sent Successfully to [ " + recipient + " ]");
        } catch (AddressException e) {
            System.out.println("Error in recipient address : "+ e);
        } catch (SendFailedException e) {
            System.out.println("Mail sending fail : "+ e);
        } catch (MessagingException e) {
            System.out.println("Unable to send mail  : "+ e);
        }

    }
    
    public static void main(String[] args) {
        sendMail("test subject", "test", "aditya.singh@impetus.co.in");
    }

}