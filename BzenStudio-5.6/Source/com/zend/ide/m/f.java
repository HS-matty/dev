package com.zend.ide.m;

import java.util.HashMap;

public class f
  implements j
{
  private int a;
  private String b;
  private static HashMap c;

  public f(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }

  public int a()
  {
    return this.a;
  }

  public String a()
  {
    return this.b;
  }

  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
      return "abstract";
    case 1:
      return "author";
    case 14:
      return "access";
    case 15:
      return "category";
    case 16:
      return "copyright";
    case 2:
      return "deprecated";
    case 18:
      return "example";
    case 3:
      return "final";
    case 19:
      return "filesource";
    case 4:
      return "global";
    case 20:
      return "ignore";
    case 21:
      return "internal";
    case 22:
      return "license";
    case 23:
      return "link";
    case 5:
      return "name";
    case 6:
      return "return";
    case 13:
      return "package";
    case 7:
      return "param";
    case 8:
      return "see";
    case 24:
      return "since";
    case 9:
      return "static";
    case 10:
      return "staticvar";
    case 25:
      return "subpackage";
    case 11:
      return "todo";
    case 26:
      return "tutorial";
    case 27:
      return "uses";
    case 12:
      return "var";
    case 28:
      return "version";
    case 17:
      return "desc";
    }
    return "";
  }

  public static int a(String paramString)
  {
    Integer localInteger = (Integer)a().get(paramString);
    if (localInteger == null)
      return -1;
    return localInteger.intValue();
  }

  private static HashMap a()
  {
    if (c == null)
    {
      c = new HashMap();
      c.put("abstract", new Integer(0));
      c.put("access", new Integer(14));
      c.put("author", new Integer(1));
      c.put("category", new Integer(15));
      c.put("copyright", new Integer(16));
      c.put("deprecated", new Integer(2));
      c.put("desc", new Integer(17));
      c.put("example", new Integer(18));
      c.put("final", new Integer(3));
      c.put("filesource", new Integer(19));
      c.put("global", new Integer(4));
      c.put("ignore", new Integer(20));
      c.put("internal", new Integer(21));
      c.put("license", new Integer(22));
      c.put("link", new Integer(23));
      c.put("name", new Integer(5));
      c.put("return", new Integer(6));
      c.put("package", new Integer(13));
      c.put("param", new Integer(7));
      c.put("see", new Integer(8));
      c.put("since", new Integer(24));
      c.put("static", new Integer(9));
      c.put("staticvar", new Integer(10));
      c.put("subpackage", new Integer(25));
      c.put("todo", new Integer(11));
      c.put("tutorial", new Integer(26));
      c.put("uses", new Integer(27));
      c.put("var", new Integer(12));
      c.put("version", new Integer(28));
    }
    return c;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("@");
    localStringBuffer.append(a(a()));
    localStringBuffer.append(" ");
    if (a() != null)
      localStringBuffer.append(a().toString());
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.f
 * JD-Core Version:    0.6.0
 */