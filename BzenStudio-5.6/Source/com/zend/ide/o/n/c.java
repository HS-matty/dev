package com.zend.ide.o.n;

import java.io.BufferedReader;
import java.io.IOException;

public class c
{
  public static int a(BufferedReader paramBufferedReader)
    throws IOException, b
  {
    String str1 = paramBufferedReader.readLine();
    if ((str1 != null) && (str1.indexOf("PORT:") != -1))
    {
      String str2 = str1.substring(str1.indexOf("PORT:") + "PORT:".length());
      return Integer.parseInt(str2.trim());
    }
    throw new b(str1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.c
 * JD-Core Version:    0.6.0
 */