package com.zend.ide.util;

import com.zend.ide.resources.resourcebundles.IDEResourceBundle;
import com.zend.ide.resources.resourcebundles.IDEResourceBundle_en;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.util.Locale;
import java.util.ResourceBundle;

public class ct
  implements cu
{
  public static final Locale[] a = { new Locale("en", ""), new Locale("de", ""), new Locale("fr", ""), new Locale("es", ""), new Locale("it", "") };
  public static final Locale[] d = new Locale[0];
  private static IDEResourceBundle b;
  private static IDEResourceBundle c;

  private static IDEResourceBundle b()
  {
    if (b == null)
    {
      Locale localLocale = (Locale)b.a("desktop.language").c();
      try
      {
        String str = "com.zend.ide.resources.resourcebundles.IDEResourceBundle";
        b = (IDEResourceBundle)ResourceBundle.getBundle(str, localLocale);
        c = new IDEResourceBundle_en();
      }
      catch (Exception localException)
      {
        b = new IDEResourceBundle_en();
      }
    }
    return b;
  }

  public static String a(int paramInt)
  {
    String str;
    try
    {
      str = b().a(paramInt);
    }
    catch (Exception localException1)
    {
      str = c.a(paramInt);
    }
    int i = str.indexOf("&");
    if (i != -1)
      try
      {
        str = str.substring(0, i) + str.substring(i + 1, str.length());
      }
      catch (Exception localException2)
      {
      }
    return str;
  }

  public static String b(int paramInt)
  {
    try
    {
      return b().a(paramInt);
    }
    catch (Exception localException)
    {
    }
    return c.a(paramInt);
  }

  public static String a(int paramInt, String paramString)
  {
    String str = a(paramInt);
    return a(str, paramString, 1);
  }

  public static String a(int paramInt, String paramString1, String paramString2)
  {
    String str = a(paramInt, paramString1);
    str = a(str, paramString2, 2);
    return str;
  }

  public static String a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    String str = a(paramInt, paramString1, paramString2);
    str = a(str, paramString3, 3);
    return str;
  }

  public static String a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = a(paramInt, paramString1, paramString2, paramString3);
    str = a(str, paramString4, 4);
    return str;
  }

  public static String a(int paramInt, String[] paramArrayOfString)
  {
    String str = a(paramInt);
    for (int i = 0; i < paramArrayOfString.length; i++)
      str = a(str, paramArrayOfString[i], i + 1);
    return str;
  }

  private static String a(String paramString1, String paramString2, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str = "<?" + paramInt + ">";
    int i = paramString1.indexOf(str);
    if (i != -1)
    {
      localStringBuffer.append(paramString1.substring(0, i));
      localStringBuffer.append(paramString2);
      localStringBuffer.append(paramString1.substring(i + str.length()));
    }
    else
    {
      localStringBuffer.append(paramString1 + "...");
    }
    return localStringBuffer.toString();
  }

  public static boolean a(Locale paramLocale)
  {
    for (int i = 0; i < a.length; i++)
      if (a[i].getLanguage().equals(paramLocale.getLanguage()))
        return true;
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ct
 * JD-Core Version:    0.6.0
 */