package com.zend.ide.f;

public class qc
{
  public static String a;
  public static String b;
  private String c;
  private String d;

  public qc(String paramString)
  {
    a(paramString);
  }

  public qc(String paramString1, String paramString2)
  {
    a(paramString1);
    this.d = paramString2;
  }

  public String a()
  {
    if (this.c == null)
      this.c = "";
    return this.c;
  }

  public void a(String paramString)
  {
    this.c = paramString;
    this.c = this.c.replace('_', '-');
  }

  public String b()
  {
    return this.d;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(b);
    localStringBuffer.append(a());
    localStringBuffer.append(a);
    if (b() != null)
      localStringBuffer.append(b());
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.qc
 * JD-Core Version:    0.6.0
 */