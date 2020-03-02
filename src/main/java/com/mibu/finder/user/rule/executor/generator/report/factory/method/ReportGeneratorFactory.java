package com.mibu.finder.user.rule.executor.generator.report.factory.method;

public class ReportGeneratorFactory {

  public static ReportGenerator createReportGenerator(ReportType type) {
    if (type.equals(ReportType.SIMPLE)) {
      return new FileReportGeneratorSimpleTemplate();
    }

    if (type.equals(ReportType.EXTENDED)) {
      return new FileReportGeneratorExtendedTemplate();
    }

    return new FileReportGeneratorSimpleTemplate();
  }
}
