package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.observer.MailSubscriber;

import java.util.Date;
import java.util.stream.Collectors;

public class MailGeneratorExtended implements MailGenerator {

  @Override
  public Mail generateMail(Rule rule, FileAttachment fileAttachment) {
    MailExtended mailExtended = new MailExtended();
    mailExtended.setCreatedAt(new Date());
    mailExtended.setFrom("Automatic System MailExtended Sender");
    mailExtended.setTo(
        rule.getWho().stream()
            .map(MailSubscriber::getMail)
            .collect(Collectors.toList())
            .toString());
    mailExtended.setSubject(rule.getRuleTitle());
    mailExtended.setFileAttachment(fileAttachment);
    return mailExtended;
  }
}
