package com.zend.ide.j;

import com.zend.ide.util.cl;
import com.zend.ide.util.da;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class e
  implements u
{
  o a;
  private Map b;
  private Collection c;
  com.zend.ide.y.e d;
  f e;
  private PropertyChangeListener f = new q(this, null);
  private PropertyChangeListener g = new r(this, null);
  private Object i = new Object();
  private String h;

  protected e()
  {
    u();
  }

  protected e(String paramString)
  {
    this.h = paramString;
    u();
  }

  void u()
  {
    this.e = new f();
    this.d = new com.zend.ide.y.e(this.e);
    this.e.a("filesystem.filesystemModificationCheckEnabled", this.f);
    this.e.a("filesystem.filesystemModificationCheckTime", this.g);
    this.d.a("filesystem.filesystemModificationCheckEnabled");
    this.d.a("filesystem.filesystemModificationCheckTime");
  }

  public String c()
  {
    return this.h;
  }

  public void l(String paramString)
  {
    this.h = paramString;
  }

  public abstract File[] b();

  public File[] n(File paramFile)
  {
    return paramFile.listFiles();
  }

  public String[] i(File paramFile)
  {
    File[] arrayOfFile = n(paramFile);
    if (arrayOfFile == null)
      return null;
    String[] arrayOfString = new String[arrayOfFile.length];
    for (int j = 0; j < arrayOfFile.length; j++)
      arrayOfString[j] = arrayOfFile[j].getName();
    return arrayOfString;
  }

  public void o(File paramFile)
  {
  }

  public synchronized boolean p(File paramFile)
  {
    String str1 = paramFile.getAbsolutePath();
    File[] arrayOfFile = b();
    if ((arrayOfFile == null) || (str1 == null))
      return false;
    for (int j = 0; j < arrayOfFile.length; j++)
    {
      File localFile = arrayOfFile[j];
      String str2 = localFile.getAbsolutePath();
      if (str1.startsWith(str2))
        return true;
    }
    return false;
  }

  public boolean m(File paramFile)
  {
    File[] arrayOfFile = b();
    return Arrays.asList(arrayOfFile).contains(paramFile);
  }

  private Collection u(File paramFile)
  {
    if (this.b == null)
      return null;
    ArrayList localArrayList = null;
    try
    {
      localArrayList = new ArrayList();
      String str1 = paramFile.getCanonicalPath() + h.m.A(paramFile).d();
      Iterator localIterator = this.b.keySet().iterator();
      while (localIterator.hasNext())
      {
        File localFile = (File)localIterator.next();
        String str2 = localFile.getCanonicalPath();
        if ((str2.startsWith(str1)) && (str2.length() != str1.length()))
          localArrayList.add(localFile);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return localArrayList;
  }

  protected void v(File paramFile)
  {
    if (this.b != null)
    {
      v localv = (v)this.b.get(paramFile);
      if (localv != null)
        localv.r(paramFile);
    }
    a(paramFile, this.c);
  }

  protected void w(File paramFile)
  {
    e(paramFile, false);
  }

  void e(File paramFile, boolean paramBoolean)
  {
    if (this.b != null)
    {
      v localv = (v)this.b.get(paramFile);
      if (localv != null)
        localv.c(paramFile, paramBoolean);
    }
    a(paramFile, paramBoolean, this.c);
  }

  protected void d(File paramFile1, File paramFile2)
  {
    if (this.b != null)
    {
      v localv = (v)this.b.get(paramFile1);
      if (localv != null)
        localv.c(paramFile1, paramFile2);
    }
    a(paramFile1, paramFile2, this.c);
    if (paramFile2.isDirectory())
      e(paramFile1, paramFile2);
  }

  protected void e(File paramFile1, File paramFile2)
  {
    Collection localCollection = u(paramFile1);
    if (localCollection == null)
      return;
    Iterator localIterator = localCollection.iterator();
    while (localIterator.hasNext())
    {
      File localFile1 = (File)localIterator.next();
      File localFile2 = a(localFile1, paramFile1, paramFile2);
      if (this.b != null)
      {
        v localv = (v)this.b.get(localFile1);
        if (localv != null)
          localv.c(localFile1, localFile2);
      }
      a(localFile1, localFile2, this.c);
    }
  }

  private static File a(File paramFile1, File paramFile2, File paramFile3)
  {
    String str1 = paramFile1.getPath();
    String str2 = str1.substring(paramFile2.getPath().length(), str1.length());
    File localFile = h.m.g(paramFile3.getPath() + str2);
    return localFile;
  }

  protected void x(File paramFile)
  {
    if (this.b != null)
    {
      v localv = (v)this.b.get(paramFile);
      if (localv != null)
        localv.s(paramFile);
    }
    b(paramFile, this.c);
  }

  public void y(File paramFile)
  {
    if (this.b != null)
    {
      v localv = (v)this.b.get(paramFile);
      if (localv != null)
        localv.t(paramFile);
    }
    c(paramFile, this.c);
  }

  protected void e(File[] paramArrayOfFile)
  {
    a(paramArrayOfFile, this.c);
  }

  protected void f(File[] paramArrayOfFile)
  {
    b(paramArrayOfFile, this.c);
  }

  protected static void a(File paramFile, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.r(paramFile);
    }
  }

  protected static void b(File paramFile, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.s(paramFile);
    }
  }

  protected static void c(File paramFile, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.t(paramFile);
    }
  }

  protected static void a(File paramFile, boolean paramBoolean, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.c(paramFile, paramBoolean);
    }
  }

  protected static void a(File paramFile1, File paramFile2, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.c(paramFile1, paramFile2);
    }
  }

  protected static void a(File[] paramArrayOfFile, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.a(paramArrayOfFile);
    }
  }

  protected static void b(File[] paramArrayOfFile, Collection paramCollection)
  {
    if (paramCollection == null)
      return;
    Object[] arrayOfObject = paramCollection.toArray();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      v localv = (v)arrayOfObject[j];
      if (localv == null)
        continue;
      localv.b(paramArrayOfFile);
    }
  }

  public void a(v paramv, File paramFile)
  {
    synchronized (this.i)
    {
      if (this.b == null)
        this.b = new HashMap(10);
      this.b.put(paramFile, paramv);
    }
  }

  public void a(v paramv)
  {
    if (this.c == null)
      this.c = new da();
    if (!this.c.contains(paramv))
      this.c.add(paramv);
  }

  public void b(v paramv, File paramFile)
  {
    a(paramv, paramFile);
    if (this.a == null)
      this.a = new o(this);
    this.a.b(paramFile);
  }

  public void c(v paramv, File paramFile)
  {
    synchronized (this.i)
    {
      if (this.b != null)
        this.b.remove(paramFile);
      if (this.a != null)
        this.a.c(paramFile);
    }
  }

  public void b(v paramv)
  {
    if (this.c != null)
      this.c.remove(paramv);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.e
 * JD-Core Version:    0.6.0
 */