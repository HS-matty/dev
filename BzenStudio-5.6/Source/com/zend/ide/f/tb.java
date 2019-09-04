package com.zend.ide.f;

import java.io.Serializable;

class tb
  implements vb, Serializable
{
  private final String a;
  private final String b;
  private final String c;
  private int d;

  tb(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }

  public final String c()
  {
    return this.a;
  }

  public final String a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof tb))
      return false;
    tb localtb = (tb)paramObject;
    return (this.a.equals(localtb.a)) && (this.b.equals(localtb.b)) && (this.c.equals(localtb.c));
  }

  public int hashCode()
  {
    int i = this.d;
    if (i == 0)
    {
      i = this.c.hashCode();
      i = 31 * i + this.b.hashCode();
      i = 31 * i + this.c.hashCode();
      this.d = i;
    }
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.tb
 * JD-Core Version:    0.6.0
 */