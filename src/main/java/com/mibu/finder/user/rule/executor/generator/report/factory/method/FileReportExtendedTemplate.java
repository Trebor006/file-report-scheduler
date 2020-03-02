package com.mibu.finder.user.rule.executor.generator.report.factory.method;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

import java.util.List;

public class FileReportExtendedTemplate implements Report {

  private List<File> files;

  public FileReportExtendedTemplate(List<File> files) {
    this.files = files;
  }

  @Override
  public String getContent() {
    StringBuilder stringBuilder = new StringBuilder();
    for (File file : files) {
      stringBuilder
          .append("- FileName:")
          .append(file.getFileName())
          .append(",\t\n")
          .append("\tlocation:")
          .append(file.getLocation())
          .append(",\t\n")
          .append("\tsize:")
          .append(file.getSize())
          .append("\n");
    }
    return "FileReportExtendedTemplate{\n" + stringBuilder.toString() + "}";
  }
}
