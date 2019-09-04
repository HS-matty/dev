package com.zend.ide.w.c.b;

import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.w.b.bi;
import com.zend.ide.w.b.cb;
import com.zend.ide.w.c.f;
import com.zend.ide.w.c.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public class l extends d
{
  public l(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile = d();
    if ((arrayOfFile == null) || (arrayOfFile.length == 0))
      throw new y("Missing target(s)");
    String[] arrayOfString1 = (String[])(String[])paramMap.get("TARGETS");
    String str1 = (String)paramMap.get("REVISION");
    if ((str1 != null) && (!"".equals(str1.trim())))
      localArrayList.add("-r" + str1);
    String str2 = (String)paramMap.get("EXTENSIONS");
    if ((str2 != null) && (str2.length() != 0))
    {
      localArrayList.add("--diff-cmd");
      localArrayList.add("diff");
      localArrayList.add("-x");
      localArrayList.add(str2);
    }
    Boolean localBoolean = (Boolean)paramMap.get("NONRECURSIVE");
    if (Boolean.TRUE.equals(localBoolean))
      localArrayList.add("-N");
    for (int i = 0; i < arrayOfString1.length; i++)
      localArrayList.add(arrayOfString1[i]);
    String str3 = (String)paramMap.get("ADDITIONAL");
    if ((str3 != null) && (!str3.trim().equals("")))
    {
      arrayOfString2 = str3.split(" ");
      for (int j = 0; j < arrayOfString2.length; j++)
      {
        String str4 = arrayOfString2[j].trim();
        if (str4.equals(""))
          continue;
        localArrayList.add(str4);
      }
    }
    a("diff");
    String[] arrayOfString2 = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString2);
    a(arrayOfString2);
  }

  public void a()
    throws y
  {
    Map localMap = c();
    f localf = this.f.d().a(true);
    if (localf == null)
      return;
    localMap.put("REVISION", localf.k());
    localMap.put("NONRECURSIVE", Boolean.valueOf(localf.b()));
    localMap.put("ADDITIONAL", localf.l());
    Object localObject1;
    Object localObject2;
    if (localf.e())
    {
      localObject1 = new StringBuffer();
      ((StringBuffer)localObject1).append('u');
      if (localf.i())
        ((StringBuffer)localObject1).append('B');
      if (localf.j())
        ((StringBuffer)localObject1).append('i');
      if (localf.h())
        ((StringBuffer)localObject1).append('w');
      if (((StringBuffer)localObject1).length() > 0)
        ((StringBuffer)localObject1).insert(0, '-');
      if (localf.f() != null)
      {
        localObject2 = localf.f().split(" ");
        for (int i = 0; i < localObject2.length; i++)
        {
          if ("".equals(localObject2[i]))
            continue;
          if (localObject2[i].startsWith("-"))
            ((StringBuffer)localObject1).append(localObject2[i].substring(1));
          else
            ((StringBuffer)localObject1).append(localObject2[i]);
        }
      }
      localMap.put("EXTENSIONS", ((StringBuffer)localObject1).toString());
    }
    else
    {
      localMap.remove("EXTENSIONS");
    }
    a(localMap);
    super.a();
    if ((!b()) && (g.j()))
      try
      {
        localObject1 = d()[0];
        localObject2 = new FileInputStream((File)localObject1);
        InputStreamReader localInputStreamReader = null;
        bh localbh = bh.a();
        if (!localbh.equals(bh.a))
          try
          {
            localInputStreamReader = new InputStreamReader((InputStream)localObject2, localbh.c());
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
          }
        if (localInputStreamReader == null)
          localInputStreamReader = new InputStreamReader((InputStream)localObject2);
        bi.a(new cb(), localInputStreamReader, a(), ((File)localObject1).getName());
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.l
 * JD-Core Version:    0.6.0
 */