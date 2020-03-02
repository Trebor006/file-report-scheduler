package com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile {

  private String name;
  private List<IFile> fileDirectory;

  public Folder(String name) {
    this.name = name;
    this.fileDirectory = new ArrayList<>();
  }

  public void addNewItem(IFile fileOrDirectory) {
    fileDirectory.add(fileOrDirectory);
  }

  @Override
  public List<File> interpretMatchFiles(Expression expression) {
    List<File> result = new ArrayList<>();
    for (IFile iFile : fileDirectory) {
      result.addAll(iFile.interpretMatchFiles(expression));
    }
    return result;
  }

  // region Getter And Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<IFile> getFileDirectory() {
    return fileDirectory;
  }

  public void setFileDirectory(List<IFile> fileDirectory) {
    this.fileDirectory = fileDirectory;
  }

  // endregion Getter And Setter
}
