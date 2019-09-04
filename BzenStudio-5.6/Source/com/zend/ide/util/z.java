package com.zend.ide.util;

import javax.swing.JComponent;

public abstract class z
  implements bn
{
  private bn a;
  private bb b;

  protected z(bn parambn)
  {
    this.a = parambn;
    this.b = e();
    parambn.a(this);
  }

  protected bn d()
  {
    return this.a;
  }

  public bs t()
  {
    return null;
  }

  protected abstract bb e();

  public boolean d(boolean paramBoolean)
  {
    return this.a.d(paramBoolean);
  }

  public bb q()
  {
    return this.b;
  }

  public JComponent c()
  {
    return this.a.c();
  }

  public void d(String paramString)
  {
    this.a.d(paramString);
  }

  public String r()
  {
    return this.a.r();
  }

  public String a(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, paramInt2);
  }

  public void a(bn parambn)
  {
    this.b.a(parambn.q());
  }

  public Object s()
  {
    return this.a.s();
  }

  public void c(Object paramObject)
  {
    this.a.c(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.z
 * JD-Core Version:    0.6.0
 */