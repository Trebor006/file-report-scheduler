package com.mibu.finder.user.rule.executor.facade;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.Folder;
import com.mibu.finder.user.rule.executor.filefinder.FolderClient;
import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;
import com.mibu.finder.user.rule.executor.generator.mail.MailGeneratorClient;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.Report;
import com.mibu.finder.user.rule.executor.generator.report.ReportGeneratorClient;

import java.util.List;

public class RuleExecutorFacade {

  public static void execute(List<Rule> rules, Folder folder) {
    rules.forEach(rule -> execute(rule, folder));
  }

  public static void execute(Rule rule, Folder folder) {
    // ****FileFinder
    List<File> filesThatMeetTheRule = FolderClient.findFilesThatMeetTheRule(rule, folder);

    // ****ReportGenerator
    if (!filesThatMeetTheRule.isEmpty()) {
      Report report = ReportGeneratorClient.generateReport(filesThatMeetTheRule, rule.getReportType());
      Mail mail = MailGeneratorClient.generateMail(rule, report);
      NotifierClient.notifySubscribers(mail);
    }
  }
}
