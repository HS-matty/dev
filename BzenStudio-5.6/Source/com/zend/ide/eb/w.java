package com.zend.ide.eb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class w
{
  public static String a()
    throws IOException
  {
    return a("http://www.zend.com/studio_get_snippets.php");
  }

  public static String a(String paramString1, String paramString2)
    throws IOException
  {
    paramString1 = paramString1.replaceAll("&", "%26");
    paramString2 = paramString2.replaceAll("&", "%26");
    return a("http://www.zend.com/studio_get_snippets.php?cat=" + paramString1 + "&sub=" + paramString2);
  }

  private static String a(String paramString)
    throws IOException
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramString = paramString.replaceAll(" ", "%20");
    URL localURL = new URL(paramString);
    URLConnection localURLConnection = localURL.openConnection();
    localURLConnection.setReadTimeout(10000);
    InputStreamReader localInputStreamReader = new InputStreamReader(localURLConnection.getInputStream());
    BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);
    String str;
    while ((str = localBufferedReader.readLine()) != null)
      localStringBuffer.append(str + "\n");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.w
 * JD-Core Version:    0.6.0
 */