package com.zend.ide.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class bi
{
  private static Properties c = new Properties();
  private static Properties a = new Properties(c);
  private static final String b = new String("ZendIDE.config");
  private static final String d = new String("ZendIDE.newconfig");
  public static boolean e = false;

  public static String a(String paramString)
  {
    String str = System.getProperty(paramString);
    if (str == null)
      str = a.getProperty(paramString);
    return str;
  }

  public static String a(String paramString1, String paramString2)
  {
    String str = a(paramString1);
    if (str == null)
      str = paramString2;
    return str;
  }

  public static void b(String paramString1, String paramString2)
  {
    if (paramString2 == null)
      c.remove(paramString1);
    else
      c.put(paramString1, paramString2);
    try
    {
      PrintStream localPrintStream = new PrintStream(new FileOutputStream(b));
      c.store(localPrintStream, null);
      localPrintStream.close();
    }
    catch (Exception localException)
    {
      cl.a("Could not save System Properties File: " + b);
    }
  }

  static
  {
    try
    {
      FileInputStream localFileInputStream1 = new FileInputStream(b);
      c.load(localFileInputStream1);
      localFileInputStream1.close();
    }
    catch (Exception localException1)
    {
      cl.a("Could not load System Properties File: " + b);
    }
    try
    {
      FileInputStream localFileInputStream2 = new FileInputStream(d);
      a.load(localFileInputStream2);
      localFileInputStream2.close();
    }
    catch (Exception localException2)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bi
 * JD-Core Version:    0.6.0
 */