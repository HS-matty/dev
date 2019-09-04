package com.zend.ide.util.kc;

import java.util.Calendar;
import java.util.Date;

public class c
{
  private Calendar a = Calendar.getInstance();
  private int b;
  private int c;
  private int d;
  private int e;

  public c(Date paramDate)
  {
    a(paramDate);
  }

  public void a(Date paramDate)
  {
    this.a.setTime(paramDate);
    a(this.a.get(11));
    b(this.a.get(12));
    c(this.a.get(13));
    d(this.a.get(14));
  }

  public int a()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public int b()
  {
    return this.c;
  }

  public void b(int paramInt)
  {
    this.c = paramInt;
  }

  public int c()
  {
    return this.d;
  }

  public void c(int paramInt)
  {
    this.d = paramInt;
  }

  public int d()
  {
    return this.e;
  }

  public void d(int paramInt)
  {
    this.e = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.c
 * JD-Core Version:    0.6.0
 */