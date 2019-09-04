package com.zend.ide.util;

import java.math.BigInteger;

public class ac
{
  private static final String a = new String(new byte[] { 80, 87, 68 });
  private static zb b;

  public static String a(char[] paramArrayOfChar)
  {
    return a(new String(paramArrayOfChar));
  }

  public static String a(String paramString)
  {
    if ((b == null) || (paramString == null))
      return null;
    if (paramString.length() == 0)
      return paramString;
    try
    {
      paramString = b.b(paramString);
      byte[] arrayOfByte = paramString.getBytes();
      int[] arrayOfInt = b.a(arrayOfByte, arrayOfByte.length);
      return a + b.d(arrayOfInt);
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
    }
    return null;
  }

  public static String b(String paramString)
    throws qb
  {
    if ((b == null) || (paramString == null))
      return null;
    if (paramString.length() == 0)
      return paramString;
    if (!paramString.startsWith(a))
      throw new qb("Invalid prefix");
    String str;
    try
    {
      paramString = paramString.substring(a.length());
      int[] arrayOfInt = b.a(paramString);
      byte[] arrayOfByte = b.c(arrayOfInt);
      str = new String(arrayOfByte).trim();
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return null;
    }
    return str;
  }

  static
  {
    String str = new String(new byte[] { 51, 56, 100, 56, 54, 50, 101, 51, 53, 97, 102, 48, 99, 56, 50, 97, 97, 102, 99, 53, 55, 99, 100, 51, 100, 48, 100, 100, 50, 97, 57 });
    byte[] arrayOfByte = new BigInteger(str, 16).toByteArray();
    b = new zb(arrayOfByte);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ac
 * JD-Core Version:    0.6.0
 */