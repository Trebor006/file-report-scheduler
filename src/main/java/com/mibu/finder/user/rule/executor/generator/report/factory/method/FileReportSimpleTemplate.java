package com.mibu.finder.user.rule.executor.generator.report.factory.method;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

import java.util.List;

public class FileReportSimpleTemplate implements Report {

  private List<File> files;

  public FileReportSimpleTemplate(List<File> files) {
    this.files = files;
  }

  @Override
  public String getContent() {
    StringBuilder stringBuilder = new StringBuilder();
    for (File file : files) {
      stringBuilder
          .append("- FileName: ")
          .append(file.getFileName())
          .append(" , location: ")
          .append(file.getLocation())
          .append("\n");
    }
    return "FileReportSimpleTemplate{\n" + stringBuilder.toString() + "}";
  }
}
