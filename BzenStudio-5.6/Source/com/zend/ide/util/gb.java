package com.zend.ide.util;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class gb
{
  private static final URL[] a = new URL[0];
  private ClassLoader b = gb.class.getClassLoader();
  private URLClassLoader d;
  private List e;

  public void a(URL[] paramArrayOfURL)
  {
    if ((paramArrayOfURL != null) && (paramArrayOfURL.length > 0))
    {
      this.d = new hb(this, paramArrayOfURL, gb.class.getClassLoader());
      this.b = this.d;
    }
  }

  public void a(String paramString)
  {
    if (this.e == null)
      this.e = new ArrayList(5);
    if (!this.e.contains(paramString))
      this.e.add(paramString);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.b == this.d)
    {
      URL[] arrayOfURL = this.d.getURLs();
      for (int i = 0; i < arrayOfURL.length; i++)
      {
        localStringBuffer.append(arrayOfURL[i]);
        localStringBuffer.append('\n');
      }
    }
    return localStringBuffer.toString();
  }

  public Object b(String paramString)
    throws ClassNotFoundException, IllegalAccessException, InstantiationException
  {
    return Class.forName(paramString, false, this.b).newInstance();
  }

  static List a(gb paramgb)
  {
    return paramgb.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.gb
 * JD-Core Version:    0.6.0
 */