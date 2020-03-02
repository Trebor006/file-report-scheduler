package com.mibu.finder.user.rule.executor.rulerepository;

import com.mibu.finder.user.rule.executor.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuleRepository {

  private static List<Rule> database;
  private static RuleRepository instance;

  private RuleRepository() {
    database = new ArrayList<>();
  }

  public static RuleRepository getInstance() {
    if (Objects.isNull(instance)) {
      instance = new RuleRepository();
    }
    return instance;
  }

  public void saveNewRule(Rule newRule) {
    if (!database.contains(newRule)) {
      database.add(newRule);
    }
  }

  public void saveNewRules(List<Rule> newRules) {
    if (!database.containsAll(newRules)) {
      database.addAll(newRules);
    }
  }

  // Todo this has to check the rules to filter by when scheduler
  public List<Rule> loadRulesToVerifyFilteredByWhen() {
    return database;
  }

  public void removeValue(Rule rule) {
    if (database.contains(rule)) {
      database.remove(rule);
    }
  }
}
