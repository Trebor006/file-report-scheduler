package com.mibu.finder.user.rule.executor.generator.report;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.Report;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportGenerator;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportGeneratorFactory;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportType;

import java.util.List;

public class ReportGeneratorClient {

  public static Report generateReport(List<File> files, ReportType reportType) {
    System.out.println("---------------- GENERATING REPORT");
    ReportGenerator reportGenerator = ReportGeneratorFactory.createReportGenerator(reportType);
    Report report = reportGenerator.generateReport(files);
    System.out.println(report.getContent());
    return report;
  }
}
