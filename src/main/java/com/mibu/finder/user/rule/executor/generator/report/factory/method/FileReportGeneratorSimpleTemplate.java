package com.mibu.finder.user.rule.executor.generator.report.factory.method;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

import java.util.List;

public class FileReportGeneratorSimpleTemplate implements ReportGenerator {

  @Override
  public Report generateReport(List<File> files) {
    return new FileReportSimpleTemplate(files);
  }
}
