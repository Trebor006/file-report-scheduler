package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.observer.MailSubscriber;

import java.util.Date;
import java.util.stream.Collectors;

public class MailGeneratorSimple implements MailGenerator {

  @Override
  public Mail generateMail(Rule rule, FileAttachment fileAttachment) {
    MailSimple mailSimple = new MailSimple();
    mailSimple.setCreatedAt(new Date());
    mailSimple.setFrom("Automatic System MailSimple Sender");
    mailSimple.setTo(
        rule.getWho().stream()
            .map(MailSubscriber::getMail)
            .collect(Collectors.toList())
            .toString());
    mailSimple.setSubject(rule.getRuleTitle());
    mailSimple.setFileAttachment(fileAttachment);
    return mailSimple;
  }
}
