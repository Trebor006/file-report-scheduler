package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

public class MailExtended extends Mail {

  @Override
  public String getContent() {
    return toString();
  }

  @Override
  public String toString() {
    return "MailExtended{"
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
        + ", fileAttachment="
        + fileAttachment
        + '}';
  }
}
