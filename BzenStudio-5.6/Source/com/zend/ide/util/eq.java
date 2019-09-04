package com.zend.ide.util;

import com.zend.ide.bd.c;
import com.zend.ide.i.y;
import com.zend.ide.p.ba;
import com.zend.ide.util.f.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class eq
  implements cu
{
  public static void a(boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        new Thread(new er()).start();
      }
      catch (Exception localException)
      {
      }
    else
      a();
  }

  private static void a()
  {
    try
    {
      String str1 = a.a.a() ? "http://www.zend.com/studio-last-version.php?ea=true" : "http://www.zend.com/studio-last-version.php";
      URLConnection localURLConnection = new URL(str1).openConnection();
      localURLConnection.connect();
      String str2 = a(localURLConnection);
      boolean bool = a(str2);
      if (bool)
      {
        String str3 = a.a.a() ? "<center><a href='http://www.zend.com/store/products/zend-studio.php?ea=true'>http://www.zend.com/store/products/zend-studio.php?ea=true</a></center>" : ct.a(999);
        y localy = new y(c.b().h(), ct.a(991), ct.a(997), str3);
        localy.setResizable(false);
        localy.e();
      }
      else
      {
        ba.a(c.b().h(), ct.a(996), ct.a(991), 1);
      }
    }
    catch (Exception localException)
    {
      b();
    }
  }

  private static String a(URLConnection paramURLConnection)
    throws IOException
  {
    byte[] arrayOfByte = new byte[4096];
    StringBuffer localStringBuffer = null;
    InputStream localInputStream = (InputStream)paramURLConnection.getContent();
    localStringBuffer = new StringBuffer();
    int i = 0;
    while ((i = localInputStream.read(arrayOfByte)) != -1)
      localStringBuffer.append(new String(arrayOfByte, 0, i));
    return localStringBuffer.toString();
  }

  private static boolean a(String paramString)
  {
    String str1 = "last version = ";
    String str2 = paramString.substring(paramString.indexOf(str1) + str1.length(), paramString.indexOf("</TITLE"));
    str2 = str2.replaceAll("[.]", "");
    a locala = a.a;
    if (locala.a())
    {
      i = Integer.parseInt(str2.trim());
      String str3 = bi.a("BUILD_ID");
      if (str3 != null)
      {
        int j = Integer.parseInt(str3);
        return j < i;
      }
    }
    int i = Integer.parseInt(str2.trim().substring(0, 3));
    return 551 < i;
  }

  private static void b()
  {
    ba.a(c.b().h(), ct.a(998), ct.a(991), 0);
  }

  static void c()
  {
    a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.eq
 * JD-Core Version:    0.6.0
 */