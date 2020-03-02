package com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class File implements IFile {

  private String fileName;
  private String fileExtension;
  private String size;
  private String location;
  private Date created;
  private Date modified;
  private Date opened;

  public File() {}

  public File(
      String fileName,
      String fileExtension,
      String size,
      String location,
      Date created,
      Date modified,
      Date opened) {
    this.fileName = fileName;
    this.fileExtension = fileExtension;
    this.size = size;
    this.location = location;
    this.created = created;
    this.modified = modified;
    this.opened = opened;
  }

  @Override
  public List<File> interpretMatchFiles(Expression expression) {
    boolean interpret = (Boolean) expression.interpret(this);
    return interpret ? Collections.singletonList(this) : new ArrayList<>();
  }

  //region Getter And Setter
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public Date getOpened() {
    return opened;
  }

  public void setOpened(Date opened) {
    this.opened = opened;
  }

  //endregion Getter And Setter

  @Override
  public String toString() {
    return "{"
        + "fileName='"
        + fileName
        + '\''
        + ", fileExtension='"
        + fileExtension
        + '\''
        + ", size='"
        + size
        + '\''
        + ", location='"
        + location
        + '\''
        + ", created="
        + created
        + ", modified="
        + modified
        + ", opened="
        + opened
        + "}\n";
  }
}
