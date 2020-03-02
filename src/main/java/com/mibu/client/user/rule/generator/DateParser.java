package com.mibu.client.user.rule.generator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {

  private static final String FORMAT_TIME = "dd/MM/yyyy HH:mm:ss";

  public static Date formatToDate(String value) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_TIME);
    return simpleDateFormat.parse(value);
  }
}
