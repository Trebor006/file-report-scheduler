package com.mibu.finder.user.rule.executor.facade;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.rulerepository.RepositoryClient;
import com.mibu.finder.user.rule.executor.rulerepository.RuleRepository;

import java.util.List;

public class RuleFinderClient {

  public static List<Rule> findRulesToExecute() {
    System.out.println("----------------  LOADING RULES!!!!");

    List<Rule> rules = RepositoryClient.loadRulesToVerifyFilteredByWhen();

    System.out.println("\n");
    return rules;
  }
}
