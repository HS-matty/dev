package com.zend.ide.w.c.b;

import com.zend.ide.w.c.f;
import com.zend.ide.w.c.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class w extends d
  implements x
{
  public w(com.zend.ide.w.c.d paramd)
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
    Boolean localBoolean1 = (Boolean)paramMap.get("NONRECURSIVE");
    if (Boolean.TRUE.equals(localBoolean1))
      localArrayList.add("-N");
    Boolean localBoolean2 = (Boolean)paramMap.get("QUIET");
    if (Boolean.TRUE.equals(localBoolean2))
      localArrayList.add("-q");
    for (int i = 0; i < arrayOfString1.length; i++)
      localArrayList.add(arrayOfString1[i]);
    String str2 = (String)paramMap.get("ADDITIONAL");
    if ((str2 != null) && (!str2.trim().equals("")))
    {
      arrayOfString2 = str2.split(" ");
      for (int j = 0; j < arrayOfString2.length; j++)
      {
        String str3 = arrayOfString2[j].trim();
        if (str3.equals(""))
          continue;
        localArrayList.add(str3);
      }
      localArrayList.add("--non-interactive");
    }
    a("update");
    String[] arrayOfString2 = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString2);
    a(arrayOfString2);
  }

  public void a()
    throws y
  {
    f localf = this.f.d().a();
    if (localf == null)
      return;
    Map localMap = c();
    localMap.put("NONRECURSIVE", Boolean.valueOf(localf.b()));
    localMap.put("QUIET", Boolean.valueOf(localf.d()));
    localMap.put("ADDITIONAL", localf.l());
    localMap.put("REVISION", localf.k());
    a(localMap);
    super.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.w
 * JD-Core Version:    0.6.0
 */