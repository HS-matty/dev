package com.zend.ide.cb.a;

import com.zend.ide.util.bs;
import com.zend.ide.util.en;
import java.awt.Component;

class od extends en
{
  final u b;

  public od(u paramu, String paramString)
  {
    super(paramString);
  }

  protected void e()
  {
    this.c = new nb(this);
    this.c.b();
  }

  public boolean a(Component paramComponent, boolean paramBoolean)
  {
    return a(a(paramComponent), paramBoolean);
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    this.b.b(getTitleAt(paramInt));
    return true;
  }

  public boolean a(boolean paramBoolean)
  {
    this.b.a();
    if (getComponentCount() == 0);
    return this.a.d(!paramBoolean);
  }

  public com.zend.ide.util.u a()
  {
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.od
 * JD-Core Version:    0.6.0
 */