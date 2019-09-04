package com.zend.ide.l;

import com.zend.ide.h.g;
import com.zend.ide.util.cl;
import java.io.File;
import java.util.Vector;

public class c extends g
  implements w
{
  public void a(w paramw)
  {
    a(paramw);
  }

  public void c(File[] paramArrayOfFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.a(paramArrayOfFile);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void d(File[] paramArrayOfFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.b(paramArrayOfFile);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void e(u paramu)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.a(paramu);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void f(u paramu)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.b(paramu);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void g(u paramu)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.c(paramu);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void h(u paramu)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.d(paramu);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void a(File paramFile1, File paramFile2)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.c(paramFile1, paramFile2);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void c(File paramFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.r(paramFile);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void a(File paramFile, boolean paramBoolean)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.c(paramFile, paramBoolean);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void d(File paramFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.s(paramFile);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void e(File paramFile)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      w localw = (w)this.a.get(j);
      try
      {
        localw.t(paramFile);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void a(File paramFile)
  {
    b(paramFile);
  }

  public void r(File paramFile)
  {
    c(paramFile);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    a(paramFile, paramBoolean);
  }

  public void c(File paramFile1, File paramFile2)
  {
    a(paramFile1, paramFile2);
  }

  public void s(File paramFile)
  {
    d(paramFile);
  }

  public void t(File paramFile)
  {
    e(paramFile);
  }

  public void a(File[] paramArrayOfFile)
  {
    c(paramArrayOfFile);
  }

  public void b(File[] paramArrayOfFile)
  {
    d(paramArrayOfFile);
  }

  public void a(u paramu)
  {
    e(paramu);
  }

  public void b(u paramu)
  {
    f(paramu);
  }

  public void c(u paramu)
  {
    g(paramu);
  }

  public void d(u paramu)
  {
    h(paramu);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.c
 * JD-Core Version:    0.6.0
 */