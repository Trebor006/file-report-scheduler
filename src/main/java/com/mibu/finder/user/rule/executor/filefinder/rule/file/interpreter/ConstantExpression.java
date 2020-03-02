package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

public class ConstantExpression implements Expression {

  private Object value;

  public ConstantExpression(Object newValue) {
    this.value = newValue;
  }

  @Override
  public Object interpret(File file) {
    return value;
  }

  @Override
  public String toString() {
    return "'" + value + "'";
  }
}
