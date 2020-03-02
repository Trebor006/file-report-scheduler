package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

public class OrExpression extends ComparisonExpression {

  public OrExpression(Expression expressionA, Expression expressionB) {
    super(expressionA, expressionB);
  }

  @Override
  public Object interpret(File file) {
    return (boolean) expressionA.interpret(file) || (boolean) expressionB.interpret(file);
  }

  @Override
  public String toString() {
    return "(" + expressionA + " OR " + expressionB + ")";
  }
}
