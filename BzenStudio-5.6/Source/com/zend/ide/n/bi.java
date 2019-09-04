package com.zend.ide.n;

class bi
{
  private String a;
  private int b;

  public bi(String paramString, int paramInt)
  {
    a(paramString);
    a(paramInt);
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String c()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public int b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof bi))
    {
      bi localbi = (bi)paramObject;
      return (this.a.equals(localbi.a)) && (this.b == localbi.b);
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bi
 * JD-Core Version:    0.6.0
 */