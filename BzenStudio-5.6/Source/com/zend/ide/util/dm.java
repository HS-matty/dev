package com.zend.ide.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class dm extends Properties
{
  private static dm a = null;
  private String[] b = null;

  public dm()
    throws IOException
  {
    c();
  }

  public static synchronized dm d()
  {
    try
    {
      if (a == null)
        a = new dm();
      return a;
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    return null;
  }

  public static String[] b()
  {
    return d().b;
  }

  private void c()
    throws IOException
  {
    ArrayList localArrayList = new ArrayList();
    Runtime localRuntime = Runtime.getRuntime();
    String str1 = System.getProperty("os.name").toLowerCase();
    Process localProcess;
    if (str1.indexOf("windows") > -1)
    {
      if (str1.indexOf("windows 9") > -1)
        localProcess = localRuntime.exec("command.com /c set");
      else
        localProcess = localRuntime.exec("cmd.exe /c set");
    }
    else if (str1.indexOf("linux") > -1)
    {
      localProcess = localRuntime.exec("env");
    }
    else if (str1.indexOf("unix") > -1)
    {
      localProcess = localRuntime.exec("/bin/env");
    }
    else if (str1.indexOf("sunos") > -1)
    {
      localProcess = localRuntime.exec("/bin/env");
    }
    else if (str1.indexOf("mac") > -1)
    {
      try
      {
        localProcess = localRuntime.exec("env");
      }
      catch (IOException localIOException)
      {
        localProcess = localRuntime.exec("setenv");
      }
    }
    else if (str1.indexOf("freebsd") > -1)
    {
      localProcess = localRuntime.exec("set");
    }
    else
    {
      cl.a("OS not known: " + str1);
      this.b = new String[0];
      return;
    }
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localProcess.getInputStream()));
    String str2;
    while ((str2 = localBufferedReader.readLine()) != null)
    {
      localArrayList.add(str2);
      int i = str2.indexOf('=');
      if (i < 0)
        continue;
      String str3 = str2.substring(0, i);
      String str4 = str2.substring(i + 1);
      setProperty(str3, str4);
    }
    localBufferedReader.close();
    this.b = new String[localArrayList.size()];
    localArrayList.toArray(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dm
 * JD-Core Version:    0.6.0
 */