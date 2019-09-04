package com.zend.ide.util;

public class dj extends RuntimeException
{
  private String a;
  private String b;
  private String c = ct.a(132);
  private int d = 0;

  public dj(String paramString)
  {
    super(paramString);
  }

  public dj(String paramString1, String paramString2, String paramString3)
  {
    super(paramString2);
    this.c = paramString1;
    this.a = paramString3;
  }

  public dj(Exception paramException)
  {
    super(paramException);
  }

  public dj(String paramString, Exception paramException)
  {
    super(paramException);
    this.b = paramString;
  }

  public dj(String paramString1, String paramString2, int paramInt)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt;
  }

  public String getMessage()
  {
    if ((this.b != null) && (this.b.length() > 0))
      return this.b;
    return super.getMessage();
  }

  public String d()
  {
    return this.a;
  }

  public int c()
  {
    return this.d;
  }

  public String b()
  {
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dj
 * JD-Core Version:    0.6.0
 */