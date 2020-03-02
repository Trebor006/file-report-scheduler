package com.mibu.finder.user.rule.executor.observer;

import com.mibu.finder.user.rule.executor.mailsender.MailSenderFactory;
import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;
import com.mibu.finder.user.rule.executor.generator.mail.observer.Observer;
import com.mibu.finder.user.rule.executor.mailsender.MailSender;

import java.util.Objects;

public class MailSubscriber implements Observer {

  private String mail;
  private MailSender mailSender;

  public MailSubscriber(String mail) {
    this.mail = mail;
    mailSender = MailSenderFactory.createMailSender(mail);
  }

  @Override
  public void update(Mail mail) {
    if (Objects.nonNull(mailSender)) {
      mailSender.sendMail(mail);
    }
  }

  // region Getter And Setter

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public MailSender getMailSender() {
    return mailSender;
  }

  public void setMailSender(MailSender mailSender) {
    this.mailSender = mailSender;
  }

  // endregion Getter And Setter

  @Override
  public String toString() {
    return mail;
  }
}
