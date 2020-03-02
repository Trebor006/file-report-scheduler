package com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;

import java.util.List;

public interface IFile {
  List<File> interpretMatchFiles(Expression expression);
}
