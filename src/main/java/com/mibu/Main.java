package com.mibu;

import com.mibu.client.user.rule.generator.UserRuleClientDemo;
import com.mibu.finder.user.rule.executor.facade.TaskFileFinderClientFacade;

public class Main {

  public static void main(String[] args) {
    UserRuleClientDemo.executeUserRuleDemoSave();
    // -----------------------------------------------------------------------------------------------------------------
    // --------------------------------       S E G U N D A    P A R T E
    // -----------------------------------------------------------------------------------------------------------------

    // todo esto tiene que ser ejecutado por un Hilo...
    TaskFileFinderClientFacade.executeFacadeMethod();
  }
}
