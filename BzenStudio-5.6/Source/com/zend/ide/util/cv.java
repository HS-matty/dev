package com.zend.ide.util;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;

public class cv
{
  private static String a = "com/zend/ide/resources/images/";
  private static String e = "com/zend/ide/resources/codeanalyzerresources/";
  private static String f = System.getProperty("user.home") + "/ZDE/";
  private static String d = null;
  private static Font b;
  private static String g = "config";
  private static String[] c = null;
  private static Map h = new HashMap();
  private static Map i = new HashMap();

  public static String f()
  {
    return f;
  }

  public static String b()
  {
    return a;
  }

  public static String d()
  {
    if (d == null)
    {
      g();
      File localFile = new File(d);
      if (!localFile.exists())
        localFile.mkdirs();
    }
    return d;
  }

  private static void g()
  {
    int[] arrayOfInt = { 5, 5 };
    String str1 = "".equalsIgnoreCase("beta") ? "_BETA" : "";
    String str2;
    if ("".equals(""))
      str2 = g + "_" + arrayOfInt[0] + "." + arrayOfInt[1] + str1;
    else
      str2 = g + "_" + "";
    File localFile = new File(f, str2);
    try
    {
      if (localFile.exists())
      {
        d = localFile.getAbsolutePath();
        return;
      }
      File[] arrayOfFile = new File(f).listFiles();
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; (arrayOfFile != null) && (j < arrayOfFile.length); j++)
      {
        localObject = arrayOfFile[j];
        if (!((File)localObject).getName().startsWith(g))
          continue;
        localArrayList.add(((File)localObject).getName());
      }
      if (localArrayList.size() == 0)
      {
        d = localFile.getAbsolutePath();
        return;
      }
      localArrayList.add(localFile.getName());
      String str3 = a(localArrayList, str2);
      if (str3 == null)
      {
        d = localFile.getAbsolutePath();
        return;
      }
      d = localFile.getAbsolutePath();
      Object localObject = new bg(str3, str2);
      ((bg)localObject).setVisible(true);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      d = localFile.getAbsolutePath();
    }
  }

  private static void a(String[] paramArrayOfString)
  {
    String[] arrayOfString = new String[paramArrayOfString.length];
    String str1;
    String str2;
    for (int j = 0; j < paramArrayOfString.length; j++)
    {
      str1 = paramArrayOfString[j];
      str2 = (String)i.get(str1);
      arrayOfString[j] = (str2 != null ? str2 : str1);
    }
    Arrays.sort(arrayOfString);
    for (j = 0; j < arrayOfString.length; j++)
    {
      if ((j + 1 >= arrayOfString.length) || (!arrayOfString[(j + 1)].equalsIgnoreCase(arrayOfString[j] + "_beta")))
        continue;
      str1 = arrayOfString[j];
      arrayOfString[j] = arrayOfString[(j + 1)];
      arrayOfString[(j + 1)] = str1;
    }
    for (j = 0; j < arrayOfString.length; j++)
    {
      str1 = arrayOfString[j];
      str2 = (String)h.get(str1);
      paramArrayOfString[j] = (str2 != null ? str2 : str1);
    }
  }

  private static String a(ArrayList paramArrayList, String paramString)
  {
    String[] arrayOfString = new String[paramArrayList.size()];
    paramArrayList.toArray(arrayOfString);
    a(arrayOfString);
    for (int j = 0; j < arrayOfString.length; j++)
    {
      String str = arrayOfString[j];
      if ((str.equalsIgnoreCase(paramString)) && (j > 0))
        return arrayOfString[(j - 1)];
    }
    return null;
  }

  private static void a(String paramString1, String paramString2)
  {
    File localFile1 = new File(f, paramString1);
    File localFile2 = new File(f, paramString2);
    localFile2.mkdir();
    b(localFile1.getAbsolutePath(), localFile2.getAbsolutePath());
  }

  public static Image a(String paramString)
  {
    URL localURL = ClassLoader.getSystemResource(a + paramString);
    return Toolkit.getDefaultToolkit().getImage(localURL);
  }

  public static ImageIcon b(String paramString)
  {
    URL localURL = ClassLoader.getSystemResource(a + paramString);
    return new ImageIcon(localURL);
  }

  public static URL c(String paramString)
  {
    Locale localLocale = (Locale)b.a("desktop.language").c();
    String str = e + localLocale.getLanguage() + "/" + paramString;
    URL localURL = ClassLoader.getSystemResource(str);
    if (localURL == null)
      localURL = ClassLoader.getSystemResource(e + "en/" + paramString);
    return localURL;
  }

  public static Font e()
  {
    if (b == null)
      b = b();
    return b;
  }

  private static Font b()
  {
    Font localFont = null;
    if (Locale.getDefault().getLanguage().equals(new Locale("zh", "", "").getLanguage()))
    {
      localFont = new Font("Dialog", 0, 12);
    }
    else
    {
      if (cr.c() == 1)
      {
        String[] arrayOfString = c();
        for (int j = 0; j < arrayOfString.length; j++)
        {
          if (!arrayOfString[j].equals("Arial Unicode MS"))
            continue;
          localFont = new Font("Arial Unicode MS", 0, 11);
        }
      }
      else if (cr.c() == 3)
      {
        localFont = new Font("Dialog", 0, 11);
      }
      if (localFont == null)
        localFont = new Font("Dialog", 0, 11);
    }
    return localFont;
  }

  public static String[] c()
  {
    if (c == null)
      try
      {
        c = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(Locale.getDefault());
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
        c = new String[0];
      }
    return c;
  }

  public static void b(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      File localFile1 = new File(paramString1);
      if ((localFile1.exists()) && (localFile1.isDirectory()))
      {
        File[] arrayOfFile = localFile1.listFiles();
        int j = arrayOfFile.length;
        int k = 0;
        while (k < j)
        {
          File localFile2 = arrayOfFile[k];
          k++;
          Object localObject;
          if (localFile2.isFile())
          {
            localObject = paramString2 + File.separator + localFile2.getName();
            c(localFile2.getPath(), (String)localObject);
          }
          else if (localFile2.isDirectory())
          {
            localObject = new File(paramString2 + File.separator + localFile2.getName());
            ((File)localObject).mkdirs();
            b(localFile2.getPath(), ((File)localObject).getPath());
          }
        }
      }
    }
  }

  public static void c(String paramString1, String paramString2)
  {
    FileInputStream localFileInputStream = null;
    FileOutputStream localFileOutputStream = null;
    try
    {
      localFileInputStream = new FileInputStream(paramString1);
      localFileOutputStream = new FileOutputStream(paramString2);
      byte[] arrayOfByte = new byte[2048];
      int j;
      while ((j = localFileInputStream.read(arrayOfByte)) != -1)
        localFileOutputStream.write(arrayOfByte, 0, j);
    }
    catch (IOException localIOException5)
    {
    }
    finally
    {
      if (localFileInputStream != null)
        try
        {
          localFileInputStream.close();
        }
        catch (IOException localIOException6)
        {
        }
      if (localFileOutputStream != null)
        try
        {
          localFileOutputStream.close();
        }
        catch (IOException localIOException7)
        {
        }
    }
  }

  static void d(String paramString1, String paramString2)
  {
    a(paramString1, paramString2);
  }

  static String a()
  {
    return f;
  }

  static
  {
    h.put("config_4.1", "config_Xenon");
    i.put("config_Xenon", "config_4.1");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cv
 * JD-Core Version:    0.6.0
 */