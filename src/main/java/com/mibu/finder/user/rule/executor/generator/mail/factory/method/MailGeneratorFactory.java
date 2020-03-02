package com.mibu.finder.user.rule.executor.generator.mail.factory.method;

import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportType;

public class MailGeneratorFactory {

  public static MailGenerator createMailGenerator(ReportType type) {
    if (type.equals(ReportType.SIMPLE)) {
      return new MailGeneratorSimple();
    }

    if (type.equals(ReportType.EXTENDED)) {
      return new MailGeneratorExtended();
    }

    return new MailGeneratorSimple();
  }
}
