package com.zend.ide.n;

import java.awt.Color;

public class it
  implements is
{
  private Color a;
  private int b;
  private String c;
  private int d;

  public it(Color paramColor, int paramInt1, String paramString, int paramInt2)
  {
    if ((paramInt2 != 0) && (paramInt2 != 1))
      throw new IllegalArgumentException();
    this.a = paramColor;
    this.b = paramInt1;
    this.c = paramString;
    this.d = paramInt2;
  }

  public Color b()
  {
    return this.a;
  }

  public int c()
  {
    return this.b;
  }

  public String d()
  {
    return this.c;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public int e()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.it
 * JD-Core Version:    0.6.0
 */