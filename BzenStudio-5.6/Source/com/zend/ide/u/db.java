package com.zend.ide.u;

import com.zend.ide.j.h;
import com.zend.ide.util.cl;
import java.util.List;

public class db
{
  public static String a = "";

  public static String a(String paramString)
  {
    String str1 = paramString;
    try
    {
      if ((a.equals("")) && (paramString.startsWith("ftp:/")))
      {
        String str2 = paramString.substring("ftp:/".length());
        int i = str2.indexOf("/");
        String str3 = str2.substring(0, i);
        str2 = str2.substring(i);
        List localList = h.m.a();
        for (int j = 0; j < localList.size(); j++)
        {
          if (!(localList.get(j) instanceof bh))
            continue;
          bh localbh = (bh)localList.get(j);
          if (localbh.l().equals(str3))
            return localbh.a() + str2;
        }
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return str1;
    }
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.db
 * JD-Core Version:    0.6.0
 */