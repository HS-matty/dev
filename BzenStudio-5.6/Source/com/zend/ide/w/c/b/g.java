package com.zend.ide.w.c.b;

import com.zend.ide.w.c.f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class g extends d
  implements x
{
  public g(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    ArrayList localArrayList = new ArrayList();
    String str1 = (String)paramMap.get("REVISION");
    if ((str1 != null) && (!"".equals(str1.trim())))
      localArrayList.add("-r" + str1);
    String str2 = (String)paramMap.get("REPOS_URL");
    if ((str2 == null) || ("".equals(str2.trim())))
      throw new y("Missing url");
    localArrayList.add(str2);
    String str3 = (String)paramMap.get("DESTINATION");
    if ((str3 == null) || ("".equals(str3.trim())))
      throw new y("Missing destination");
    localArrayList.add(str3);
    Boolean localBoolean1 = (Boolean)paramMap.get("QUIET");
    if (Boolean.TRUE.equals(localBoolean1))
      localArrayList.add("-q");
    Boolean localBoolean2 = (Boolean)paramMap.get("NONRECURSIVE");
    if (Boolean.TRUE.equals(localBoolean2))
      localArrayList.add("-N");
    String str4 = (String)paramMap.get("USERNAME");
    if ((str4 != null) && (!str4.trim().equals("")))
    {
      localArrayList.add("--username");
      localArrayList.add(str4);
    }
    String str5 = (String)paramMap.get("PASSWORD");
    if ((str5 != null) && (!str5.trim().equals("")))
    {
      localArrayList.add("--password");
      localArrayList.add(str5);
    }
    String str6 = (String)paramMap.get("ADDITIONAL");
    if ((str6 != null) && (!str6.trim().equals("")))
    {
      arrayOfString = str6.split(" ");
      for (int i = 0; i < arrayOfString.length; i++)
      {
        String str7 = arrayOfString[i].trim();
        if (str7.equals(""))
          continue;
        localArrayList.add(str7);
      }
    }
    localArrayList.add("--non-interactive");
    a("checkout");
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    a(arrayOfString);
  }

  public void a()
    throws y
  {
    f localf = this.f.d().i();
    if (localf == null)
      return;
    HashMap localHashMap = new HashMap(7);
    localHashMap.put("REPOS_URL", localf.n());
    localHashMap.put("USERNAME", localf.p());
    localHashMap.put("PASSWORD", localf.q());
    localHashMap.put("REVISION", localf.k());
    localHashMap.put("NONRECURSIVE", Boolean.valueOf(localf.b()));
    localHashMap.put("QUIET", Boolean.valueOf(localf.d()));
    File localFile = localf.o();
    if (localFile == null)
      throw new y("Missing destination (Working Dir)");
    localHashMap.put("DESTINATION", localFile.getAbsolutePath());
    localHashMap.put("ADDITIONAL", localf.l());
    a(localHashMap);
    super.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.g
 * JD-Core Version:    0.6.0
 */