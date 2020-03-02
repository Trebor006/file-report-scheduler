package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VariableExpression implements Expression {

  private String methodName;

  public VariableExpression(String newMethodName) {
    this.methodName = newMethodName;
  }

  @Override
  public Object interpret(File file) {
    try {
      Method method = file.getClass().getMethod(methodName);
      return method.invoke(file);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public String toString() {
    return "'" + methodName + "'";
  }
}
