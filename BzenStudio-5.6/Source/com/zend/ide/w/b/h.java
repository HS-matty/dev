package com.zend.ide.w.b;

import java.awt.Color;

public class h
{
  private Color a = new Color(133, 213, 250);
  private Color b = new Color(245, 166, 201);
  private Color c = new Color(134, 243, 168);
  private Color d = Color.white;
  private Color e = Color.gray;

  public Color b()
  {
    return this.a;
  }

  public void a(Color paramColor)
  {
    this.a = paramColor;
  }

  public Color c()
  {
    return this.b;
  }

  public void b(Color paramColor)
  {
    this.b = paramColor;
  }

  public Color d()
  {
    return this.c;
  }

  public void c(Color paramColor)
  {
    this.c = paramColor;
  }

  public Color e()
  {
    return this.d;
  }

  public Color f()
  {
    return this.e;
  }

  public Color a(int paramInt)
  {
    Color localColor = e();
    switch (paramInt)
    {
    case 0:
      localColor = b();
      break;
    case 1:
      localColor = d();
      break;
    case 2:
      localColor = c();
      break;
    case 3:
      localColor = f();
    }
    return localColor;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.h
 * JD-Core Version:    0.6.0
 */