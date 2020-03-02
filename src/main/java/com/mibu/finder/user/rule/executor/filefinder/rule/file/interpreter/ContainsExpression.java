package com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;

public class ContainsExpression extends ComparisonExpression {

  public ContainsExpression(Expression expressionA, Expression expressionB) {
    super(expressionA, expressionB);
  }

  @Override
  public Object interpret(File file) {
    Object expAResult = expressionA.interpret(file);
    Object expBResult = expressionB.interpret(file);

    if ((expAResult instanceof String) && (expBResult instanceof String)) {
      if (((String) expAResult).contains((String) expBResult)) {
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }

  @Override
  public String toString() {
    return "(" + expressionA + " contains " + expressionB + ")";
  }
}
