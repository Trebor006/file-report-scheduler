package com.mibu.finder.user.rule.executor.mailsender.template.method;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;

import java.util.Objects;

public class HotmailSender extends MailSenderTemplate {

  public static HotmailSender instance;

  private HotmailSender() {}

  public static HotmailSender getInstance() {
    if (Objects.isNull(instance)) {
      instance = new HotmailSender();
    }
    return instance;
  }

  @Override
  public void openConnectionWithServer() {
    System.out.println("conectando con el servidor de Microsoft.....");
  }

  @Override
  public void executeSendMail(Mail mail) {
    System.out.println("enviando el mail OutlookApi....." + mail.getTo());
  }

  @Override
  public void closeConnection() {
    System.out.println("cerrando conexión con el servidor de Microsoft.....");
  }
}
