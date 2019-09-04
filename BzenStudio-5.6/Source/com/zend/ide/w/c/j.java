package com.zend.ide.w.c;

import com.zend.ide.util.cl;
import com.zend.ide.w.c.c.a;
import java.io.File;
import java.util.Date;
import java.util.HashMap;

public class j
{
  private static final String a = File.separator + ".svn";
  private static final String b = File.separator + "entries";
  private HashMap c = new HashMap();
  private HashMap d = new HashMap();

  public static boolean a(File paramFile)
  {
    if (paramFile != null)
    {
      if (".svn".equals(paramFile.getName()))
        return false;
      return (new File(paramFile.getParent() + a).exists()) || (new File(paramFile, ".svn" + b).exists());
    }
    return false;
  }

  public boolean b(File paramFile)
  {
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    return ((locali == null) || (locali.b() == null)) && (!i(paramFile));
  }

  public boolean c(File paramFile)
  {
    if (i(paramFile))
      return true;
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    if (locali == null)
      return false;
    return !locali.c();
  }

  public boolean d(File paramFile)
  {
    if (i(paramFile))
      return true;
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    if ((locali == null) || (locali.d()))
      return false;
    if (paramFile.isDirectory())
      return true;
    long l = paramFile.lastModified();
    Date localDate = locali.b();
    if (localDate == null)
      return true;
    return l != localDate.getTime();
  }

  public boolean e(File paramFile)
  {
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    return (locali != null) && (!locali.c());
  }

  public boolean f(File paramFile)
  {
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    return ((locali != null) && (!locali.c())) || (i(paramFile));
  }

  public boolean g(File paramFile)
  {
    if (i(paramFile))
      return true;
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    if (locali == null)
      return false;
    if (paramFile.isDirectory())
      return true;
    long l = paramFile.lastModified();
    Date localDate = locali.b();
    if (localDate == null)
      return true;
    return (l != localDate.getTime()) || (locali.c()) || (locali.d());
  }

  public boolean h(File paramFile)
  {
    h localh = j(paramFile);
    if (localh == null)
      return false;
    i locali = localh.a(paramFile.getName());
    return ((locali != null) && (locali.d())) || (i(paramFile));
  }

  private boolean i(File paramFile)
  {
    if (this.d.containsKey(paramFile))
      return true;
    if (!paramFile.isDirectory())
      return false;
    File localFile = new File(paramFile.getParent() + a);
    if (localFile.exists())
      return false;
    localFile = new File(paramFile, ".svn");
    if (localFile.exists())
    {
      this.d.put(paramFile, paramFile);
      return true;
    }
    return false;
  }

  public int a(String paramString)
  {
    File localFile = new File(paramString);
    h localh = j(localFile);
    if (localh != null)
    {
      i locali = localh.a(localFile.getName());
      if (locali != null)
      {
        if (locali.d())
          return 4;
        if (locali.c())
          return 1;
        Date localDate = locali.b();
        if (localDate == null)
          return 5;
        long l = localFile.lastModified();
        return l - localDate.getTime() > 2000L ? 3 : 0;
      }
      return 5;
    }
    return 8;
  }

  private h j(File paramFile)
  {
    if (".svn".equals(paramFile.getName()))
      return null;
    File localFile1 = new File(paramFile.getParent() + a);
    File localFile2;
    if (localFile1.exists())
    {
      localFile2 = new File(localFile1, b);
      return k(localFile2);
    }
    if (paramFile.isDirectory())
    {
      localFile2 = new File(paramFile, ".svn" + b);
      if (localFile2.exists())
        return k(localFile2);
    }
    return null;
  }

  private h k(File paramFile)
  {
    String str = paramFile.getAbsolutePath();
    if (this.c.containsKey(str))
    {
      h localh = (h)this.c.get(str);
      if (localh.b() == paramFile.lastModified())
        return localh;
    }
    l(paramFile);
    return (h)this.c.get(str);
  }

  private void l(File paramFile)
  {
    try
    {
      h localh = a.a(paramFile.getAbsolutePath());
      localh.a(paramFile.lastModified());
      this.c.put(paramFile.getAbsolutePath(), localh);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.j
 * JD-Core Version:    0.6.0
 */