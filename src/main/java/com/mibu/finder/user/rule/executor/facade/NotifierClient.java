package com.mibu.finder.user.rule.executor.facade;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;

public class NotifierClient {

  public static void notifySubscribers(Mail mail) {
    mail.notifyToSubscribers();
  }
}
