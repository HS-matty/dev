package com.zend.ide.util.f;

import java.util.GregorianCalendar;

public class d
{
  private int a;
  private int b;
  private int c;
  private int d;

  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }

  public GregorianCalendar a()
  {
    return new GregorianCalendar(this.a, this.b - 1, this.c);
  }

  public int b()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.d
 * JD-Core Version:    0.6.0
 */