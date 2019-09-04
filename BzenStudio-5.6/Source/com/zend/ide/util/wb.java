package com.zend.ide.util;

import com.zend.ide.j.h;
import com.zend.ide.r.d;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import java.io.File;

public class wb
{
  private static d a = p.e().b("php");
  private static o b = p.e().g("Web Documents");

  public static boolean a(File paramFile)
  {
    if (b == null)
      return false;
    return (b.a(paramFile)) || (b(paramFile.getPath()));
  }

  public static boolean a(String paramString)
  {
    return a(h.m.g(paramString));
  }

  public static boolean b(String paramString)
  {
    if (a == null)
      return false;
    String str = a.g();
    if ((str == null) || (str.length() == 0))
      return false;
    return paramString.startsWith(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.wb
 * JD-Core Version:    0.6.0
 */