package com.zend.ide.r;

public class f
{
  private String a;
  private boolean b;

  public f(String paramString)
  {
    this(paramString, false);
  }

  public f(String paramString, boolean paramBoolean)
  {
    if (paramString == null)
      throw new RuntimeException("extension name can't be null !");
    this.a = (paramString.startsWith(".") ? paramString.substring(1) : paramString);
    this.b = paramBoolean;
  }

  public String b()
  {
    return this.a;
  }

  public String toString()
  {
    return this.a.startsWith(".") ? this.a.substring(1) : this.a;
  }

  public boolean equals(Object paramObject)
  {
    f localf = (f)paramObject;
    String str1 = this.a.startsWith(".") ? this.a.substring(1) : this.a;
    String str2 = localf.b().startsWith(".") ? localf.b().substring(1) : localf.b();
    return str1.equals(str2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.f
 * JD-Core Version:    0.6.0
 */