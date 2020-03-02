package com.mibu.finder.user.rule.executor.rulerepository;

import com.mibu.finder.user.rule.executor.Rule;

import java.util.List;

public class RepositoryClient {

  public static void saveRules(List<Rule> rules) {
    System.out.println("----------------  SAVING RULES!!!!");
    // ****RulesRepository
    RuleRepository repositoryToSave = RuleRepository.getInstance();
    repositoryToSave.saveNewRules(rules);
    System.out.println("\n\n\n");
  }

  public static List<Rule> loadRulesToVerifyFilteredByWhen() {
    RuleRepository repositoryToLoad = RuleRepository.getInstance();
    return repositoryToLoad.loadRulesToVerifyFilteredByWhen();
  }
}
