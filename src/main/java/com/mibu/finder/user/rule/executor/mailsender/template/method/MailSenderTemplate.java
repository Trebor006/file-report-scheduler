package com.mibu.finder.user.rule.executor.mailsender.template.method;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;
import com.mibu.finder.user.rule.executor.mailsender.MailSender;

public abstract class MailSenderTemplate implements MailSender {

  @Override
  public void sendMail(Mail mail) {
    openConnectionWithServer();
    executeSendMail(mail);
    closeConnection();
  }

  public abstract void openConnectionWithServer();

  public abstract void executeSendMail(Mail mail);

  public abstract void closeConnection();
}
