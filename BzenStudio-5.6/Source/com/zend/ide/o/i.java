package com.zend.ide.o;

import com.zend.ide.util.ex;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

public class i
{
  private static String a(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString1);
    char c = localStringBuffer.toString().indexOf('?') == -1 ? '?' : '&';
    localStringBuffer.append(c);
    localStringBuffer.append(ex.b(paramInt1));
    try
    {
      localStringBuffer.append("&get_file_content=" + URLEncoder.encode(paramString2, "UTF-8"));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localStringBuffer.append("&get_file_content=" + paramString2);
    }
    localStringBuffer.append("&line_number=" + paramInt2);
    return localStringBuffer.toString();
  }

  private static String a(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString1);
    localStringBuffer.append(paramString1.endsWith("/") ? "" : "/");
    localStringBuffer.append(paramString2 + "?");
    localStringBuffer.append(ex.b(paramInt, paramBoolean));
    localStringBuffer.append("&testConnection=true");
    return localStringBuffer.toString();
  }

  public static void b(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    try
    {
      URL localURL = new URL(a(paramString1, paramInt1, paramString2, paramInt2));
      a(localURL);
    }
    catch (Exception localException)
    {
    }
  }

  public static void b(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    try
    {
      URL localURL = new URL(a(paramString1, paramInt, paramString2, paramBoolean));
      a(localURL);
    }
    catch (Exception localException)
    {
    }
  }

  private static void a(URL paramURL)
  {
    try
    {
      new Thread(new et(paramURL)).start();
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.i
 * JD-Core Version:    0.6.0
 */