package com.zend.ide.cb.a;

public class lb
  implements Comparable
{
  private int a;
  private String b;

  public lb(int paramInt)
  {
    a(paramInt);
  }

  public void a(int paramInt)
  {
    this.a = paramInt;
    this.b = String.valueOf(paramInt);
  }

  public String toString()
  {
    return this.b;
  }

  public int compareTo(Object paramObject)
  {
    lb locallb = (lb)paramObject;
    return this.a - locallb.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.lb
 * JD-Core Version:    0.6.0
 */