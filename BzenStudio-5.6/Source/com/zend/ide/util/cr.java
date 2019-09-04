package com.zend.ide.util;

import java.awt.Font;
import java.io.File;
import java.util.Locale;

public class cr
{
  private static int a = -1;
  private static Font b = null;
  private static String d = "";
  private static final String c = "C:\\Program Files" + File.separator + "Internet Explorer\\IEXPLORE.EXE";

  public static int c()
  {
    if (a == -1)
    {
      String str = System.getProperty("os.name");
      if (str == null)
        a = 0;
      else if (str.indexOf("Windows") > -1)
        a = 1;
      else if (str.indexOf("Linux") > -1)
        a = 2;
      else if (str.indexOf("Mac") > -1)
        a = 3;
      d = str != null ? str : "";
    }
    return a;
  }

  public static String a()
  {
    return d;
  }

  public static Font b()
  {
    if (b == null)
      if (Locale.getDefault().getLanguage().equals(new Locale("zh", "", "").getLanguage()))
        b = new Font("DialogInput", 0, 12);
      else
        switch (c())
        {
        case 1:
          if (Locale.getDefault().equals(Locale.JAPAN))
            b = new Font("MS UI Gothic", 0, 12);
          else
            b = new Font("Courier New", 0, 12);
          break;
        case 3:
          b = new Font("Courier New", 0, 12);
          break;
        case 2:
        default:
          b = new Font("monospaced", 0, 12);
        }
    return b;
  }

  public static final String d()
  {
    switch (c())
    {
    case 1:
      return c;
    case 2:
      return "mozilla";
    case 3:
      return "./runBrowser.sh";
    }
    return "";
  }

  public static final String b()
  {
    switch (c())
    {
    case 1:
      return "cmd.exe /c start";
    case 3:
      return "open";
    case 2:
    }
    return null;
  }

  public static final String a(String paramString)
  {
    switch (c())
    {
    case 1:
      if (paramString.indexOf(" ") != -1)
      {
        File localFile = new File(paramString);
        String str = "";
        while (localFile != null)
        {
          if (localFile.getName().indexOf(" ") != -1)
            str = "\"" + localFile.getName() + "\"" + (str.length() > 0 ? File.separator + str : str);
          else
            str = localFile.getName() + (str.length() > 0 ? File.separator + str : str);
          localFile = localFile.getParentFile();
        }
        paramString = str;
      }
      return paramString;
    case 2:
    case 3:
      return "\"" + paramString + "\"";
    }
    return null;
  }

  public static boolean a(File paramFile)
  {
    if (paramFile == null)
      return false;
    String str = paramFile.getAbsolutePath();
    return (str != null) && ((str.startsWith("A:\\")) || (str.startsWith("B:\\")));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cr
 * JD-Core Version:    0.6.0
 */