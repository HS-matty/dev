package com.zend.ide.gb.b;

public class d
{
  private String a;
  private String b;

  public d(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof d)) && (this.a.equals(((d)paramObject).a));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.b.d
 * JD-Core Version:    0.6.0
 */