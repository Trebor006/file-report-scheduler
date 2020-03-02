package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

public class MailSimple extends Mail {

  @Override
  public String getContent() {
    return toString();
  }

  @Override
  public String toString() {
    return "MailSimple{"
        + "createdAt="
        + createdAt
        + ", from='"
        + from
        + '\''
        + ", to='"
        + to
        + '\''
        + ", subject='"
        + subject
        + '\''
        + ", content as string="
        + fileAttachment.getContent()
        + '}';
  }
}
