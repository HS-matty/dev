package com.zend.ide.p.b;

import javax.swing.SwingUtilities;

public class a
  implements c
{
  private k a = new k();
  private String b;
  private boolean c;
  private boolean d;
  private e e;
  private float f;
  private String g;

  public a(String paramString1, boolean paramBoolean1, boolean paramBoolean2, float paramFloat, String paramString2)
  {
    this.b = paramString1;
    this.d = paramBoolean2;
    this.c = paramBoolean1;
    this.f = paramFloat;
    this.g = paramString2;
  }

  public void b(String paramString)
  {
    this.a.b(paramString);
  }

  public String j()
  {
    return this.b;
  }

  public void b()
  {
  }

  public boolean c()
  {
    return this.c;
  }

  public void d()
  {
  }

  public boolean e()
  {
    return this.d;
  }

  public void a(e parame)
  {
    this.e = parame;
  }

  public void g()
  {
    this.a.a(this);
    SwingUtilities.invokeLater(new b(this));
  }

  public void h()
  {
    SwingUtilities.invokeLater(new l(this));
  }

  public void a(String paramString)
  {
    this.a.a(paramString);
  }

  public float f()
  {
    return this.f;
  }

  public String a()
  {
    return this.g;
  }

  static k a(a parama)
  {
    return parama.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.a
 * JD-Core Version:    0.6.0
 */