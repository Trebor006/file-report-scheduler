package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

import com.mibu.finder.user.rule.executor.generator.mail.observer.Observable;
import com.mibu.finder.user.rule.executor.generator.mail.observer.Observer;
import com.mibu.finder.user.rule.executor.observer.MailSubscriber;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Mail implements Observable {
  protected Date createdAt;
  protected String from;
  protected String to;
  protected String subject;
  protected FileAttachment fileAttachment;

  public abstract String getContent();

  @Override
  public void notifyToSubscribers() {
    List<Observer> mailSubscribers = generateMailSubscribers(to);
    for (Observer mailSubscriber : mailSubscribers) {
      mailSubscriber.update(this);
    }
  }

  private static List<Observer> generateMailSubscribers(String mails) {
    String[] mailSubscriberList = mails.split(",");
    return Arrays.stream(mailSubscriberList).map(MailSubscriber::new).collect(Collectors.toList());
  }

  // region Getter And Setter

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public FileAttachment getFileAttachment() {
    return fileAttachment;
  }

  public void setFileAttachment(FileAttachment fileAttachment) {
    this.fileAttachment = fileAttachment;
  }

  // endregion Getter And Setter
}
