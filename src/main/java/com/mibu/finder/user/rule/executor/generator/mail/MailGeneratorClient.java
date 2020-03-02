package com.mibu.finder.user.rule.executor.generator.mail;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;
import com.mibu.finder.user.rule.executor.generator.mail.factory.method.MailGenerator;
import com.mibu.finder.user.rule.executor.generator.mail.factory.method.MailGeneratorFactory;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.Report;

public class MailGeneratorClient {

  public static Mail generateMail(Rule rule, Report report) {
    // ****MailGenerator
    System.out.println("---------------GENERATING MAIL FROM REPORT AND RULE ");
    MailGenerator mailGenerator = MailGeneratorFactory.createMailGenerator(rule.getReportType());
    Mail mail = mailGenerator.generateMail(rule, report);
    System.out.println(mail.getContent());
    return mail;
  }
}
