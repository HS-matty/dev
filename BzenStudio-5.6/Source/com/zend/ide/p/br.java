package com.zend.ide.p;

import java.awt.Font;

public class br
{
  private Font a;
  private Font g;
  private Font b;
  private Font c;
  private Font d;
  private static br e;
  public static br f = b();

  public void a(Font paramFont)
  {
    if ((this.a == null) || (!paramFont.equals(this.a)))
    {
      this.a = paramFont;
      this.g = null;
      this.b = null;
      this.c = null;
      this.d = null;
    }
  }

  private static br b()
  {
    if (e == null)
      e = new br();
    return e;
  }

  public Font a(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
      if (this.b == null)
        this.b = this.a.deriveFont(1);
      return this.b;
    case 2:
      if (this.c == null)
        this.c = this.a.deriveFont(2);
      return this.c;
    case 3:
      if (this.d == null)
        this.d = this.a.deriveFont(paramInt);
      return this.d;
    }
    if (this.g == null)
      this.g = this.a.deriveFont(0);
    return this.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.br
 * JD-Core Version:    0.6.0
 */