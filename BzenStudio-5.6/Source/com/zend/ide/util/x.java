package com.zend.ide.util;

public class x
{
  public static String b(String paramString1, String paramString2)
  {
    return c(b(paramString1), paramString2);
  }

  private static String c(String paramString1, String paramString2)
  {
    byte[] arrayOfByte1 = paramString1.getBytes();
    byte[] arrayOfByte2 = paramString2.getBytes();
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length];
    for (int i = 0; i < arrayOfByte1.length; i++)
      arrayOfByte3[i] = (byte)(arrayOfByte1[i] ^ arrayOfByte2[(i % arrayOfByte2.length)]);
    return new String(arrayOfByte3);
  }

  private static String b(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    String str = "";
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      char c = arrayOfChar[i];
      if (Character.isDigit(c))
      {
        str = str + c;
      }
      else
      {
        if (str.equals(""))
          continue;
        int j = Integer.valueOf(str).intValue();
        localStringBuffer.append((char)j);
        str = "";
      }
    }
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.x
 * JD-Core Version:    0.6.0
 */