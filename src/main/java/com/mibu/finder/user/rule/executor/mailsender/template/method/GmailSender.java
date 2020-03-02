package com.mibu.finder.user.rule.executor.mailsender.template.method;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;

import java.util.Objects;

public class GmailSender extends MailSenderTemplate {

  public static GmailSender instance;

  private GmailSender() {}

  public static GmailSender getInstance() {
    if (Objects.isNull(instance)) {
      instance = new GmailSender();
    }
    return instance;
  }

  @Override
  public void openConnectionWithServer() {
    System.out.println("conectando con el servidor de GOOGLE.....");
  }

  @Override
  public void executeSendMail(Mail mail) {
    System.out.println("enviando el mail con GmailApi....." + mail.getTo());
  }

  @Override
  public void closeConnection() {
    System.out.println("cerrando conexión con el servidor de GOOGLE.....");
  }

}
