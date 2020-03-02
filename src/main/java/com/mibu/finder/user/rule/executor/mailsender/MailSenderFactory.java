package com.mibu.finder.user.rule.executor.mailsender;

import com.mibu.finder.user.rule.executor.mailsender.template.method.GmailSender;
import com.mibu.finder.user.rule.executor.mailsender.template.method.HotmailSender;

public class MailSenderFactory {

  public static MailSender createMailSender(String email) {
    if (email.endsWith("@gmail.com")) {
      return GmailSender.getInstance();
    }
    if (email.endsWith("@hotmail.com")) {
      return HotmailSender.getInstance();
    }
    return null;
  }
}
