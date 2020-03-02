package com.mibu.client.user.rule.generator;

import java.util.Arrays;
import java.util.List;

public class UserRuleGeneratorDemo {

  public static List<UserRule> generateTestDemoRules() {
    UserRule userRule1 = new UserRule();
    userRule1.setWhat("('File Extension' equals 'mp4') AND ('Filename' contains 'cat')");
    userRule1.setWhen("Daily (Todos los dias) at 11:00 P.M.");
    userRule1.setWho("my_personal_email@gmail.com");
    userRule1.setReportType("SIMPLE");

    UserRule userRule2 = new UserRule();
    userRule2.setWhat(
        "(('File Extension' equals 'mp4' ) OR ( 'File Extension' equals 'mkv')) AND ( 'Created' greaterThan '24/12/2019 00:00:00')");
    userRule2.setWhen("Every Sunday (Todos los Domingos) at 08:00 P.M");
    userRule2.setWho(
        "my_personal_email@gmail.com, my_other_personal_email@hotmail.com, my_other_personal_email@gmail.com");
    userRule2.setReportType("EXTENDED");

    UserRule userRule3 = new UserRule();
    userRule3.setWhat(
        "('File Extension' equals 'avi' ) AND ( 'Modified' greaterOrEqualTo '24/12/2019 00:00:00')");
    userRule3.setWhen("Monthly at 08:00 P.M");
    userRule3.setWho("my_personal_email@hotmail.com, my_other_personal_email@hotmail.com");
    userRule3.setReportType("SIMPLE");

    return Arrays.asList(userRule1, userRule2, userRule3);
  }
}
