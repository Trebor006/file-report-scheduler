package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

import java.util.Date;

public class GreaterThanExpression extends ComparisonExpression {

  public GreaterThanExpression(Expression expressionA, Expression expressionB) {
    super(expressionA, expressionB);
  }

  // to review
  @Override
  public Object interpret(File file) {
    return (((Date) expressionA.interpret(file))
            .compareTo((Date) expressionB.interpret(file)))
        > 0;
  }

  @Override
  public String toString() {
    return "(" + expressionA + " greaterThan " + expressionB + ")";
  }
}
