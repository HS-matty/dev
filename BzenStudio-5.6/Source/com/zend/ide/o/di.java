package com.zend.ide.o;

import com.zend.ide.n.a.a;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;

public class di extends a
  implements cu
{
  static final long serialVersionUID = 8217568055748309793L;
  private int e = -1;
  private int f;
  private int g;
  private String h = "";
  private boolean i;
  private boolean j = false;
  private boolean k = true;

  public di()
  {
    this("", -1);
  }

  public di(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    b(true);
    this.g = 2;
    this.i = true;
  }

  public void b(int paramInt)
  {
    if (this.e != paramInt)
    {
      int m = this.e;
      this.e = paramInt;
      a(this, "id", new Integer(m), new Integer(paramInt));
    }
  }

  public int c()
  {
    return this.e;
  }

  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public boolean d()
  {
    return this.k;
  }

  public boolean e()
  {
    return this.j;
  }

  public void c(int paramInt)
  {
    if ((paramInt < 4) && (this.f != paramInt))
    {
      int m = this.f;
      this.f = paramInt;
      this.j = (paramInt >= 2);
      this.k = ((paramInt == 1) || (paramInt == 3));
      a(this, "type", new Integer(m), new Integer(this.e));
    }
  }

  public int f()
  {
    int m = this.k ? 1 : 0;
    int n = this.j ? 2 : 0;
    this.f = (m + n);
    return this.f;
  }

  public void d(int paramInt)
  {
    if (((paramInt == 1) || (paramInt == 2)) && (this.g != paramInt))
    {
      int m = paramInt;
      this.g = paramInt;
      a(this, "lifetime", new Integer(m), new Integer(this.e));
    }
  }

  public int g()
  {
    return this.g;
  }

  public void b(String paramString)
  {
    if (!this.h.equals(paramString))
    {
      String str = this.h;
      this.h = paramString;
      if (!paramString.equals(""))
        a(true);
      else
        a(false);
      a(this, "expression", str, paramString);
    }
  }

  public String h()
  {
    return this.h;
  }

  public void c(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      boolean bool = this.i;
      this.i = paramBoolean;
      a(this, "enable", new Boolean(bool), new Boolean(paramBoolean));
    }
  }

  public boolean i()
  {
    return this.i;
  }

  public String toString()
  {
    return ct.a(398, "" + this.e, "" + this.f, j(), "" + b());
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = super.equals(paramObject);
    if ((bool) || ((paramObject instanceof di)))
    {
      di localdi = (di)paramObject;
      bool = (this.e == localdi.e) && (this.f == localdi.f) && (this.g == localdi.g) && (j().equals(localdi.j())) && (b() == localdi.b());
    }
    return bool;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.di
 * JD-Core Version:    0.6.0
 */