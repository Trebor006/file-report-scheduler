package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.Expression;

public abstract class ComparisonExpression implements Expression {

  protected Expression expressionA;
  protected Expression expressionB;

  public ComparisonExpression(Expression expressionA, Expression expressionB) {
    this.expressionA = expressionA;
    this.expressionB = expressionB;
  }
}
