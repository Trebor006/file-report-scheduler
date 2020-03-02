package com.mibu.finder.user.rule.executor;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportType;
import com.mibu.finder.user.rule.executor.observer.MailSubscriber;

import java.util.List;

public class Rule {

  private Expression what;
  private String when;
  private List<MailSubscriber> who;
  private ReportType reportType;

  public Rule() {}

  public Rule(Expression what, String when, List<MailSubscriber> who, ReportType reportType) {
    this.what = what;
    this.when = when;
    this.who = who;
    this.reportType = reportType;
  }

  public String getRuleTitle() {
    return "Files with condicion " + what.toString();
  }

  // region Getter And Setter

  public Expression getWhat() {
    return what;
  }

  public void setWhat(Expression what) {
    this.what = what;
  }

  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public List<MailSubscriber> getWho() {
    return who;
  }

  public void setWho(List<MailSubscriber> who) {
    this.who = who;
  }

  public ReportType getReportType() {
    return reportType;
  }

  public void setReportType(ReportType reportType) {
    this.reportType = reportType;
  }

  // endregion Getter And Setter

  @Override
  public String toString() {
    return "{what='" + what + ",\n" + "when='" + when + ",\n" + "who='" + who + "\n" + "'}\n";
  }
}
