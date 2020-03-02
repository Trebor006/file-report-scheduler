package com.mibu.client.user.rule.generator;

public class UserRule {

  private String what;
  private String when;
  private String who;
  private String reportType;

  public UserRule() {}

  public UserRule(String what, String when, String who, String reportType) {
    this.what = what;
    this.when = when;
    this.who = who;
    this.reportType = reportType;
  }

  @Override
  public String toString() {
    return "{what='" + what + ",\n" + "when='" + when + ",\n" + "who='" + who + "\n" + "'}\n";
  }

  // region Getter And Setter

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public String getWho() {
    return who;
  }

  public void setWho(String who) {
    this.who = who;
  }

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  // endregion Getter And Setter

}
