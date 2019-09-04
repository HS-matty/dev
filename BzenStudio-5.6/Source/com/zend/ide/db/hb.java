package com.zend.ide.db;

import com.zend.ide.util.bh;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class hb extends Hashtable
{
  private static final long serialVersionUID = 4112578634029874840L;
  protected hb a;

  public hb()
  {
    this(null);
  }

  public hb(hb paramhb)
  {
    this.a = paramhb;
  }

  public synchronized boolean a(InputStream paramInputStream, String paramString)
    throws IOException
  {
    int i = 1;
    BufferedReader localBufferedReader;
    if (bh.a.c().equals(paramString))
      localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    else
      localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, paramString));
    while (true)
    {
      String str1 = localBufferedReader.readLine();
      if (str1 == null)
        return i == 0;
      i = 0;
      if (str1.length() > 0)
      {
        int j = str1.length();
        for (int k = 0; (k < j) && (" \t\r\n\f".indexOf(str1.charAt(k)) != -1); k++);
        if (k == j)
          continue;
        int m = str1.charAt(k);
        if (";#![".indexOf(m) == -1)
        {
          for (int n = k; n < j; n++)
          {
            i1 = str1.charAt(n);
            if ("=:".indexOf(i1) != -1)
              break;
          }
          for (int i1 = n; (i1 < j) && (" \t\r\n\f".indexOf(str1.charAt(i1)) != -1); i1++);
          if ((i1 < j) && ("=:".indexOf(str1.charAt(i1)) != -1))
            i1++;
          while ((i1 < j) && (" \t\r\n\f".indexOf(str1.charAt(i1)) != -1))
            i1++;
          if (n == j)
            return false;
          String str2 = str1.substring(k, n);
          String str3 = n < j ? str1.substring(i1, j) : "";
          put(str2.trim(), str3.trim());
        }
      }
    }
  }

  public synchronized void a(OutputStream paramOutputStream, String paramString1, String paramString2)
    throws IOException
  {
    BufferedWriter localBufferedWriter;
    if (bh.a.c().equals(paramString2))
      localBufferedWriter = new BufferedWriter(new OutputStreamWriter(paramOutputStream));
    else
      localBufferedWriter = new BufferedWriter(new OutputStreamWriter(paramOutputStream, paramString2));
    if (paramString1 != null)
      a(localBufferedWriter, ";" + paramString1 + ", " + new Date().toString());
    Enumeration localEnumeration = keys();
    while (localEnumeration.hasMoreElements())
    {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = (String)get(str1);
      a(localBufferedWriter, str1 + "=" + str2);
      localBufferedWriter.newLine();
    }
    localBufferedWriter.flush();
  }

  private static void a(BufferedWriter paramBufferedWriter, String paramString)
    throws IOException
  {
    paramBufferedWriter.write(paramString);
    paramBufferedWriter.newLine();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.hb
 * JD-Core Version:    0.6.0
 */