package com.zend.ide.desktop;

import com.zend.ide.f.bp;
import com.zend.ide.j.y;
import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.l.x;
import com.zend.ide.u.bu;
import com.zend.ide.util.cl;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;

class cd extends x
{
  boolean a;
  u b;
  boolean d;
  final be c;

  cd(be parambe)
  {
  }

  public void a(u paramu)
  {
    this.a = true;
    this.b = paramu;
    be.a(this.c).a(new yb(this, paramu));
  }

  public void c(u paramu)
  {
    this.b = paramu;
    this.a = false;
    be.a(this.c).a(new zb(this, paramu));
  }

  public void b(u paramu)
  {
    a(be.d(this.c).g().b());
  }

  public void d(u paramu)
  {
    be.c(this.c);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    be.a(this.c, paramFile);
  }

  public void c(File paramFile1, File paramFile2)
  {
    be.a(this.c).a(new pc(this, paramFile1, paramFile2));
  }

  public void a(File[] paramArrayOfFile)
  {
    u localu = be.d(this.c).f();
    be.a(this.c).a(new bn(this, localu, paramArrayOfFile));
  }

  private boolean e(u paramu)
  {
    return (this.a) && (this.b.b().equals(paramu.b()));
  }

  public void b(File[] paramArrayOfFile)
  {
    if (!this.a)
      return;
    for (int i = 0; i < paramArrayOfFile.length; i++)
      b(paramArrayOfFile[i].getAbsoluteFile());
  }

  private void b(File paramFile)
  {
    try
    {
      synchronized (be.e(this.c))
      {
        Collection localCollection = be.h(this.c).a(paramFile.getCanonicalPath());
        Iterator localIterator;
        File localFile;
        if (localCollection != null)
        {
          localIterator = localCollection.iterator();
          while (localIterator.hasNext())
          {
            localFile = com.zend.ide.j.h.m.g((String)localIterator.next());
            if (!be.h(this.c).b(localFile.getCanonicalPath()))
            {
              be.a(this.c, localFile.getPath());
              be.d(this.c).a(localFile.getPath());
            }
          }
        }
        localCollection = be.a(this.c).a(paramFile.getCanonicalPath());
        if (localCollection != null)
        {
          localIterator = localCollection.iterator();
          while (localIterator.hasNext())
          {
            localFile = com.zend.ide.j.h.m.g((String)localIterator.next());
            if (!be.a(this.c).b(localFile.getCanonicalPath()))
            {
              be.a(this.c, localFile.getPath());
              be.d(this.c).a(localFile.getPath());
            }
          }
        }
      }
    }
    catch (bu localbu)
    {
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  static boolean a(cd paramcd, u paramu)
  {
    return paramcd.e(paramu);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cd
 * JD-Core Version:    0.6.0
 */