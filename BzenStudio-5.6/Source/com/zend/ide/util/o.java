package com.zend.ide.util;

import javax.swing.Icon;
import javax.swing.KeyStroke;

public class o
{
  private String a;
  private String b;
  private Icon c;
  private Integer e;
  private KeyStroke f;

  public o(String paramString1, String paramString2, Icon paramIcon, KeyStroke paramKeyStroke)
  {
    int i = paramString1.indexOf("&");
    if (i != -1)
      try
      {
        paramString1 = paramString1.substring(0, i) + paramString1.substring(i + 1, paramString1.length());
      }
      catch (Exception localException)
      {
      }
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramIcon;
    if (i != -1)
      this.e = new Integer(paramString1.charAt(i));
    this.f = paramKeyStroke;
  }

  public String g()
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

  public Icon c()
  {
    return this.c;
  }

  public void a(Icon paramIcon)
  {
    this.c = paramIcon;
  }

  public Integer e()
  {
    return this.e;
  }

  public KeyStroke f()
  {
    return this.f;
  }

  public void a(KeyStroke paramKeyStroke)
  {
    this.f = paramKeyStroke;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.o
 * JD-Core Version:    0.6.0
 */