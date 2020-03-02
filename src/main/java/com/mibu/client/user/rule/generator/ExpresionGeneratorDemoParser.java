package com.mibu.client.user.rule.generator;

import com.mibu.finder.user.rule.executor.filefinder.rule.file.interpreter.*;

import java.text.ParseException;
import java.util.HashMap;

public class ExpresionGeneratorDemoParser {

  // todo GENERAR LAS EXPRESIONES Dinamicamente
  public static Expression parseToExpresion(String userRule) throws ParseException {
    HashMap<String, String> mapper = generateMapper();
    final String[] userRoleCopy = {userRule};
    mapper.forEach(
        (key, value) -> {
          userRoleCopy[0] = userRoleCopy[0].replaceAll(key, value);
        });

    System.out.println(userRoleCopy[0]);

    if (userRule.equals("('File Extension' equals 'mp4') AND ('Filename' contains 'cat')")) {
      return createCase1();
    }

    if (userRule.equals(
        "(('File Extension' equals 'mp4' ) OR ( 'File Extension' equals 'mkv')) AND ( 'Created' greaterThan '24/12/2019 00:00:00')")) {
      return createCase2();
    }
    if (userRule.equals(
        "('File Extension' equals 'avi' ) AND ( 'Modified' greaterOrEqualTo '24/12/2019 00:00:00')")) {
      return createCase3();
    }

    return null;
  }

  private static HashMap<String, String> generateMapper() {
    HashMap<String, String> mapper = new HashMap<>();
    mapper.put("'Filename'", "getFilename");
    mapper.put("'File Extension'", "getFileExtension");
    mapper.put("'Size'", "getSize");
    mapper.put("'Location'", "getLocation");
    mapper.put("'Created'", "getCreated");
    mapper.put("'Modified'", "getModified");
    mapper.put("'Opened'", "getOpened");
    return mapper;
  }

  private static Expression createCase1() {
    //    "('File extension' equals 'mp4') AND ('Filename' contains 'cat')"
    // region A Expression
    VariableExpression methodAToFindExpression =
        new VariableExpression("getFileExtension"); // tengo que interpretar esto
    ConstantExpression aValue = new ConstantExpression("mp4");
    EqualsExpression aExpresion = new EqualsExpression(methodAToFindExpression, aValue);

    // endregion A Expression

    // region B Expression
    VariableExpression methodBToFindExpression =
        new VariableExpression("getFileName"); // tengo que interpretar esto
    ConstantExpression bValue = new ConstantExpression("cat");
    ContainsExpression bExpresion = new ContainsExpression(methodBToFindExpression, bValue);

    // region B Expression

    AndExpression finalExpression = new AndExpression(aExpresion, bExpresion);
    return finalExpression;
  }

  private static Expression createCase2() throws ParseException {
    // "(('File Extension' equals 'mp4' ) OR ( 'File Extension' equals 'mkv')) AND ( 'Created'
    // greaterThan '24/12/2019 00:00:00')"

    // region A Expression
    VariableExpression methodA1ToFindExpression =
        new VariableExpression("getFileExtension"); // tengo que interpretar esto
    ConstantExpression a1Value = new ConstantExpression("mp4");
    EqualsExpression a1Expresion = new EqualsExpression(methodA1ToFindExpression, a1Value);

    VariableExpression methodA2ToFindExpression =
        new VariableExpression("getFileExtension"); // tengo que interpretar esto
    ConstantExpression a2Value = new ConstantExpression("mkv");
    EqualsExpression a2Expresion = new EqualsExpression(methodA2ToFindExpression, a2Value);

    OrExpression aExpresion = new OrExpression(a1Expresion, a2Expresion);
    // endregion A Expression

    // region B Expression
    VariableExpression methodBToFindExpression =
        new VariableExpression("getCreated"); // tengo que interpretar esto
    ConstantExpression bValue =
        new ConstantExpression(DateParser.formatToDate("24/12/2019 00:00:00"));
    GreaterThanExpression bExpresion = new GreaterThanExpression(methodBToFindExpression, bValue);

    // endregion A Expression

    AndExpression finalExpression = new AndExpression(aExpresion, bExpresion);
    return finalExpression;
  }

  private static Expression createCase3() throws ParseException {
    //  "('File Extension' equals 'avi' ) AND ( 'Modified' greaterOrEqualTo '24/12/2019 00:00:00')"

    // region A Expression
    VariableExpression methodAToFindExpression =
        new VariableExpression("getFileExtension"); // tengo que interpretar esto
    ConstantExpression aValue = new ConstantExpression("avi");
    EqualsExpression aExpresion = new EqualsExpression(methodAToFindExpression, aValue);

    // endregion A Expression

    // region B Expression
    VariableExpression methodBToFindExpression =
        new VariableExpression("getModified"); // tengo que interpretar esto
    ConstantExpression bValue =
        new ConstantExpression(DateParser.formatToDate("24/12/2019 00:00:00"));
    GreaterOrEqualToExpression bExpresion =
        new GreaterOrEqualToExpression(methodBToFindExpression, bValue);

    // region B Expression

    AndExpression finalExpression = new AndExpression(aExpresion, bExpresion);
    return finalExpression;
  }
}
