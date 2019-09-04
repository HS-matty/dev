package com.zend.ide.d;

import java.io.File;

public class fc
{
  private String a;
  private String b;

  public fc(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public fc()
  {
    this("", "");
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public boolean c()
  {
    return new File(this.b).exists();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.fc
 * JD-Core Version:    0.6.0
 */