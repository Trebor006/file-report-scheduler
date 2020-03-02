package com.mibu.finder.user.rule.executor.generator.mail.observer;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;

public interface Observer {
  void update(Mail mail);
}
