package com.mibu.finder.user.rule.executor;

import com.mibu.finder.user.rule.executor.observer.MailSubscriber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MailSubscriberClient {

  public static List<MailSubscriber> generateMailSubscribers(String mails) {
    String[] mailSubscriberList = mails.split(",");
    return Arrays.stream(mailSubscriberList).map(MailSubscriber::new).collect(Collectors.toList());
  }
}
