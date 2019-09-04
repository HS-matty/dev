package com.zend.ide.f;

import com.zend.ide.bc.a;
import javax.swing.JFrame;

public class bg
{
  private dc a;
  private dd b;
  private de c;
  private bh d;
  private da e;
  private g f;
  private JFrame g;
  private s h;

  public bg(s params, JFrame paramJFrame)
  {
    this.g = paramJFrame;
    this.h = params;
    this.d = new bh(this);
    this.a = new dc(params);
    this.a.a(this.d);
    a.a(this.a, "PROJECT_INSPECTOR");
    this.b = new dd(params);
    this.b.a(this.d);
    a.a(this.b, "FILE_INSPECTOR");
    this.c = new de(params);
    this.c.a(this.d);
  }

  public dd e()
  {
    return this.b;
  }

  public dc b()
  {
    return this.a;
  }

  public de c()
  {
    return this.c;
  }

  public da d()
  {
    if (this.e == null)
      this.e = new da(this.g, this.h, this.f);
    return this.e;
  }

  public void a(String paramString)
  {
    this.b.a(paramString);
  }

  public void a(g paramg)
  {
    this.f = paramg;
  }

  static g a(bg parambg)
  {
    return parambg.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bg
 * JD-Core Version:    0.6.0
 */