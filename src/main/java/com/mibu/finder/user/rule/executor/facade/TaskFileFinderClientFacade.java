package com.mibu.finder.user.rule.executor.facade;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.filefinder.FileGeneratorDemo;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.Folder;

import java.util.List;

public class TaskFileFinderClientFacade {

  public static void executeFacadeMethod() {
    // Esto deberia ser un Api de Google para conectarse y obtener el directorio root
    // folders and files to explore
    Folder root = FileGeneratorDemo.generateTestDemoDirectory();

    // ****RuleFinderTask
    List<Rule> rules = RuleFinderClient.findRulesToExecute();

    // executeAllRules
    RuleExecutorFacade.execute(rules, root);
  }
}
