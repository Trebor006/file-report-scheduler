package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

import com.mibu.finder.user.rule.executor.Rule;

public interface MailGenerator {
  Mail generateMail(Rule rule, FileAttachment fileAttachment);
}
