package com.zend.ide.j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class l extends k
  implements y
{
  public l()
  {
    this("searchPath");
  }

  public l(String paramString)
  {
    super(paramString, new m(h.m));
  }

  public void c(File[] paramArrayOfFile)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      localObject = paramArrayOfFile[i];
      if ((!this.i.contains(localObject)) && ((localObject instanceof bd)))
      {
        localArrayList.add(localObject);
      }
      else
      {
        if (this.i.contains(localObject))
          continue;
        localArrayList.add(localObject);
      }
    }
    i = localArrayList.size();
    if (i == 0)
      return;
    Object localObject = new File[i];
    localArrayList.toArray(localObject);
    this.i.addAll(localArrayList);
    e(localObject);
  }

  public void a(File paramFile)
  {
    c(new File[] { paramFile });
  }

  public void d(File[] paramArrayOfFile)
  {
    if (paramArrayOfFile == null)
      return;
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      boolean bool = this.i.remove(localFile);
      if (!bool)
        continue;
      localArrayList.add(localFile);
    }
    File[] arrayOfFile = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile);
    this.i.removeAll(localArrayList);
    f(arrayOfFile);
  }

  public void b(File paramFile)
  {
    d(new File[] { paramFile });
  }

  public String a(String paramString, File paramFile)
  {
    String str1 = paramFile.getPath() + d() + paramString;
    String str2 = a(str1, true);
    if (str2 == null)
      str2 = a(paramString, false);
    return str2;
  }

  public String a(String paramString, boolean paramBoolean)
  {
    File[] arrayOfFile = b();
    for (int i = 0; i < arrayOfFile.length; i++)
    {
      File localFile1 = arrayOfFile[i];
      String str = localFile1.getPath();
      if ((str.endsWith(a(paramString))) && (!paramString.equals("")))
        return str;
      File localFile2 = paramBoolean ? h.m.g(paramString) : h.m.a(localFile1, paramString);
      try
      {
        if (localFile1.isDirectory())
        {
          if ((localFile2.exists()) && (localFile2.getCanonicalPath().startsWith(str + File.separator)))
            return localFile2.getPath();
        }
        else if ((localFile1.isFile()) && (localFile2.getCanonicalPath().equals(str)))
          return str;
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  private String a(String paramString)
  {
    String str = paramString.trim();
    if ((str.startsWith("./")) || (str.startsWith(".\\")))
      str = str.substring(2);
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.l
 * JD-Core Version:    0.6.0
 */