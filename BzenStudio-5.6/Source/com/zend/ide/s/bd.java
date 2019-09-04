package com.zend.ide.s;

import com.zend.ide.b.d;

public class bd extends z
{
  private int d;
  protected String e;
  final j f;

  protected bd(j paramj)
  {
  }

  void b(int paramInt)
  {
    this.d = paramInt;
  }

  public int o()
  {
    return this.d;
  }

  public x f()
  {
    return this.f.c;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
  }

  protected void c(int paramInt)
  {
    a(paramInt);
    b(p());
    a(q());
  }

  protected int p()
  {
    return this.e.length();
  }

  protected d[] q()
  {
    return null;
  }

  public boolean g()
  {
    if (this.e.length() > 1)
    {
      this.e = this.e.substring(0, this.e.length() - 1);
      c(b() - 1);
      return true;
    }
    return false;
  }

  public boolean h()
  {
    int i = b();
    char c = this.f.c(i);
    if (a(c))
    {
      this.e += c;
      c(i + 1);
      return true;
    }
    return false;
  }

  protected boolean a(char paramChar)
  {
    return !Character.isWhitespace(paramChar);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bd
 * JD-Core Version:    0.6.0
 */