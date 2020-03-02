package com.mibu.finder.user.rule.executor.filefinder;

import com.mibu.finder.user.rule.executor.Rule;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.Folder;

import java.util.List;

public class FolderClient {

  public static List<File> findFilesThatMeetTheRule(Rule rule, Folder folder) {
    return folder.interpretMatchFiles(rule.getWhat());
  }
}
