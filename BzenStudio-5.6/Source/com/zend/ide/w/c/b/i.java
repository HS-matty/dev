package com.zend.ide.w.c.b;

import com.zend.ide.w.c.f;
import com.zend.ide.w.c.g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class i extends d
  implements x
{
  public i(com.zend.ide.w.c.d paramd)
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
    Boolean localBoolean1 = (Boolean)paramMap.get("NONRECURSIVE");
    if (Boolean.TRUE.equals(localBoolean1))
      localArrayList.add("-N");
    Boolean localBoolean2 = (Boolean)paramMap.get("QUIET");
    if (Boolean.TRUE.equals(localBoolean2))
      localArrayList.add("-q");
    String str1 = (String)paramMap.get("COMMIT_MESSAGE");
    if (str1 == null)
      throw new y("Missing commit message");
    try
    {
      File localFile = File.createTempFile("jsvn", ".tmp", null);
      localFile.deleteOnExit();
      BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(localFile));
      localBufferedWriter.write(str1);
      localBufferedWriter.close();
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
      }
      localArrayList.add("-F");
      localArrayList.add(localFile.getCanonicalPath());
      localArrayList.add("--non-interactive");
      a("commit");
      String[] arrayOfString2 = new String[localArrayList.size()];
      localArrayList.toArray(arrayOfString2);
      a(arrayOfString2);
    }
    catch (IOException localIOException)
    {
      throw new y("Error while executing the SVN commit command. \n" + localIOException.getMessage());
    }
  }

  public void a()
    throws y
  {
    Map localMap = c();
    f localf = this.f.d().b();
    if (localf == null)
      return;
    localMap.put("NONRECURSIVE", Boolean.valueOf(localf.b()));
    localMap.put("QUIET", Boolean.valueOf(localf.d()));
    String str = localf.m();
    if (str == null)
      str = "";
    else
      str = '"' + str + '"';
    localMap.put("COMMIT_MESSAGE", str);
    localMap.put("ADDITIONAL", localf.l());
    a(localMap);
    super.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.i
 * JD-Core Version:    0.6.0
 */