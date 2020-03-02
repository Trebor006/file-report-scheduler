package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

public class EqualsExpression extends ComparisonExpression {

  public EqualsExpression(Expression expressionA, Expression expressionB) {
    super(expressionA, expressionB);
  }

  @Override
  public Object interpret(File file) {
    return (expressionA.interpret(file)).equals(expressionB.interpret(file));
  }

  @Override
  public String toString() {
    return "(" + expressionA + " equals " + expressionB + ")";
  }
}
