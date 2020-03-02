package com.mibu.client.user.rule.generator;

import com.mibu.finder.user.rule.executor.MailSubscriberClient;
import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.generator.report.factory.method.ReportType;
import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

public class UserRuleParser {

  public static List<Rule> parse(List<UserRule> userRules) {
    return userRules.stream().map(UserRuleParser::parse).collect(Collectors.toList());
  }

  public static Rule parse(UserRule userRule) {
    Rule rule = new Rule();
    try {
      Expression expression = ExpresionGeneratorDemoParser.parseToExpresion(userRule.getWhat());
      rule.setWhat(expression);
      // todo Setting When in Rule

      rule.setWho(MailSubscriberClient.generateMailSubscribers(userRule.getWho()));
      rule.setReportType(ReportType.valueOf(userRule.getReportType()));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return rule;
  }
}
