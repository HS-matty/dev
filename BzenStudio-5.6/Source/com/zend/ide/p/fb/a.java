package com.zend.ide.p.fb;

public class a
{
  private int a;
  private String b;

  public a(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }

  public int a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    a locala = (a)paramObject;
    return (this.a == locala.a) && (this.b.equals(locala.b));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.fb.a
 * JD-Core Version:    0.6.0
 */