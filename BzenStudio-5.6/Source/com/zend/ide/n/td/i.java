package com.zend.ide.n.td;

import com.zend.ide.util.cl;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public abstract class i
  implements fb
{
  protected static boolean a = System.getProperty("debugMode") != null;
  protected int b;
  protected int c;
  protected gb d;
  protected pb e;
  protected int f;
  protected int g;
  protected int h;
  protected int i;
  protected pb j;
  protected pb k;

  public i(pb parampb, int paramInt1, int paramInt2)
  {
    this.e = parampb;
    a(paramInt1, paramInt2);
  }

  public void a()
  {
    if (this.d != null)
      System.out.println("first() was called before end of iteration!");
    this.i = 0;
    this.j = this.e;
    this.k = null;
    this.f = -1;
    this.g = -1;
    this.h = -1;
    d();
  }

  public gb a()
  {
    return this.d;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    a();
  }

  public boolean hasNext()
  {
    return this.d != null;
  }

  public gb b()
  {
    if (this.d == null)
      throw new NoSuchElementException("There are no more folds to iterate");
    gb localgb = this.d;
    c();
    return localgb;
  }

  protected void c()
  {
    int m = 1;
    try
    {
      while (m != 0)
      {
        gb localgb;
        if (this.i == 0)
        {
          if ((this.f + 1 < this.j.b()) && (this.j.b() > 0))
          {
            this.f += 1;
            localgb = this.j.b(this.f);
            if (a(localgb))
              this.d = localgb;
            if (localgb.j().b() > 0)
            {
              this.j = localgb.j();
              this.k = this.j;
              this.g = -1;
              this.i += 1;
            }
            if (this.d == localgb)
              m = 0;
            continue;
          }
          this.k = null;
          this.d = null;
          return;
        }
        if (this.i == 1)
        {
          if ((this.g + 1 < this.j.b()) && (this.j.b() > 0))
          {
            this.g += 1;
            localgb = this.j.b(this.g);
            if (a(localgb))
              this.d = localgb;
            if (localgb.j().b() > 0)
            {
              this.j = localgb.j();
              this.h = -1;
              this.i += 1;
            }
            if (this.d == localgb)
              m = 0;
            continue;
          }
          this.i -= 1;
          this.j = this.e;
          this.k = null;
          continue;
        }
        if (this.i != 2)
          continue;
        if ((this.h + 1 < this.j.b()) && (this.j.b() > 0))
        {
          this.h += 1;
          localgb = this.j.b(this.h);
          if (a(localgb))
            this.d = localgb;
          if (this.d == localgb)
            m = 0;
          continue;
        }
        this.i -= 1;
        this.j = this.k;
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      this.d = null;
      if (a)
        cl.a(localIndexOutOfBoundsException);
    }
  }

  protected abstract boolean a(gb paramgb);

  protected abstract void d();

  public void remove()
  {
    throw new UnsupportedOperationException("Remove is unsupported in the folds tree");
  }

  public Object next()
  {
    return b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.i
 * JD-Core Version:    0.6.0
 */