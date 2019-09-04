package com.zend.ide.f.zc.b;

import java.util.HashMap;
import java.util.Map;

public final class m
{
  private static final Map a = new HashMap();

  public static final String a(String paramString)
  {
    String str = (String)a.get(paramString);
    return str == null ? paramString : str;
  }

  static
  {
    a.put("java.lang.String", "string");
    a.put("java.lang.Integer", "int");
    a.put("java.lang.Long", "int");
    a.put("long", "int");
    a.put("java.lang.Byte", "int");
    a.put("byte", "int");
    a.put("java.lang.Char", "int");
    a.put("char", "int");
    a.put("java.lang.Short", "int");
    a.put("short", "int");
    a.put("java.lang.Double", "float");
    a.put("double", "float");
    a.put("java.lang.Float", "float");
    a.put("java.lang.Boolean", "bool");
    a.put("boolean", "bool");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.m
 * JD-Core Version:    0.6.0
 */