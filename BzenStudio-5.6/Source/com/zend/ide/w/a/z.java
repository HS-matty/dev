package com.zend.ide.w.a;

import com.zend.ide.j.y;
import com.zend.ide.l.be;
import com.zend.ide.l.l;
import com.zend.ide.l.u;
import com.zend.ide.util.cl;
import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

class z
{
  private Hashtable a = new Hashtable();

  public boolean a(File paramFile)
  {
    File localFile1 = e(paramFile);
    if ((localFile1 != null) && (localFile1.exists()))
    {
      File localFile2 = new File(localFile1, "Entries");
      if (localFile2.exists())
        return !a(paramFile, localFile2);
    }
    return false;
  }

  public boolean b(File paramFile)
  {
    File localFile1 = e(paramFile);
    if ((localFile1 != null) && (localFile1.exists()))
    {
      File localFile2 = new File(localFile1, "Entries");
      if (localFile2.exists())
        return (a(paramFile, localFile2)) && (b(paramFile, localFile2));
    }
    return false;
  }

  public boolean c(File paramFile)
  {
    File localFile1 = e(paramFile);
    File localFile2;
    if ((localFile1 != null) && (localFile1.exists()))
    {
      localFile2 = new File(localFile1, "Entries");
      if (localFile2.exists())
        return a(paramFile, localFile2);
      return false;
    }
    if (paramFile.isDirectory())
    {
      localFile2 = new File(paramFile, "CVS");
      if (localFile2.exists())
        return true;
    }
    return false;
  }

  public static boolean a(File[] paramArrayOfFile)
  {
    Vector localVector = new Vector();
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile1 = paramArrayOfFile[i];
      File localFile2 = a(localFile1, null);
      if (localFile2 == null)
        continue;
      localVector.add(localFile2);
    }
    File[] arrayOfFile = new File[localVector.size()];
    localVector.toArray(arrayOfFile);
    for (int j = 0; j < arrayOfFile.length; j++)
    {
      File localFile3 = arrayOfFile[j];
      Enumeration localEnumeration = localVector.elements();
      while (localEnumeration.hasMoreElements())
      {
        File localFile4 = (File)localEnumeration.nextElement();
        if (!localFile3.equals(localFile4))
          return false;
      }
    }
    return true;
  }

  public static File a(File paramFile, u paramu)
  {
    File localFile1 = null;
    Object localObject = paramu != null ? ((be)((l)paramu.d().get("project_roots")).b()).b() : null;
    int i = 0;
    File localFile2 = paramFile;
    File localFile3;
    while (((localFile2 = localFile2.getParentFile()) != null) && (i == 0))
    {
      if ((localObject != null) && (localObject.m(localFile2)))
        i = 1;
      localFile3 = new File(localFile2, "CVS");
      if (!localFile3.exists())
        break;
      localFile1 = localFile3.getParentFile();
    }
    if (localFile1 == null)
    {
      localFile3 = new File(paramFile, "CVS");
      if (localFile3.exists())
        return paramFile;
    }
    return localFile1;
  }

  private static File e(File paramFile)
  {
    if (paramFile.getName().equalsIgnoreCase("CVS"))
      return null;
    File localFile = paramFile.getParentFile();
    if (localFile != null)
      return new File(localFile, "CVS");
    return null;
  }

  public int a(String paramString)
  {
    File localFile1 = new File(paramString);
    File localFile2 = e(localFile1);
    if ((localFile2 != null) && (localFile2.exists()))
    {
      File localFile3 = new File(localFile2, "Entries");
      if ((localFile3.exists()) && (a(localFile1, localFile3)))
      {
        ba localba = g(localFile3);
        if (!localba.b(localFile1))
          return 1;
        if (localba.c(localFile1))
          return 4;
        long l1 = localba.a(localFile1);
        if (l1 == -1L)
          return 0;
        long l2 = localFile1.lastModified();
        return l2 - l1 > 5000L ? 3 : 0;
      }
      return 5;
    }
    return 8;
  }

  private boolean a(File paramFile1, File paramFile2)
  {
    boolean bool = false;
    try
    {
      bool = g(paramFile2).a(paramFile1);
      if (!bool)
      {
        File localFile = new File(paramFile2.getParentFile(), "Entries.Log");
        bool = g(localFile).a(paramFile1);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return bool;
  }

  private boolean b(File paramFile1, File paramFile2)
  {
    boolean bool = false;
    try
    {
      bool = g(paramFile2).b(paramFile1);
      if (!bool)
      {
        File localFile = new File(paramFile2.getParentFile(), "Entries.Log");
        bool = g(localFile).b(paramFile1);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return bool;
  }

  private ba g(File paramFile)
  {
    ba localba = (ba)this.a.get(paramFile);
    if (localba == null)
    {
      localba = new ba(paramFile);
      this.a.put(paramFile, localba);
    }
    return localba;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.z
 * JD-Core Version:    0.6.0
 */