package com.mibu.client.user.rule.generator;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.rulerepository.RepositoryClient;

import java.util.List;

public class UserRuleClientDemo {

  public static void executeUserRuleDemoSave() {
    // ****UserRuleInterfaces
    List<UserRule> rulesCreatedByUser = UserRuleGeneratorDemo.generateTestDemoRules();

    // ****RuleGenerator()
    List<Rule> rulesToSave = UserRuleParser.parse(rulesCreatedByUser);

    RepositoryClient.saveRules(rulesToSave);
  }
}
