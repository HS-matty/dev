package com.zend.ide.f.zc.b;

public class g
{
  private String a;

  public g(String paramString)
  {
    this.a = paramString;
  }

  public String a()
  {
    return this.a;
  }

  public String toString()
  {
    return this.a != null ? this.a : "Invalid Path";
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject instanceof g))
    {
      if (this.a != null)
        return this.a.equals(((g)paramObject).a);
      return ((g)paramObject).a == null;
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.g
 * JD-Core Version:    0.6.0
 */