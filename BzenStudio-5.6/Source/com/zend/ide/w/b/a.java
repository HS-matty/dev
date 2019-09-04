package com.zend.ide.w.b;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class a extends ComponentAdapter
{
  final bs a;

  private a(bs parambs)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    int i = this.a.getWidth();
    int j = bs.d(this.a).h();
    Dimension localDimension = new Dimension((int)(i * 0.45D), j);
    bs.d(this.a).a(localDimension);
    bs.d(this.a).b(localDimension);
    bs.h(this.a).a(localDimension);
    bs.h(this.a).b(localDimension);
    bs.d(this.a).c(localDimension);
    bs.h(this.a).c(localDimension);
    localDimension = new Dimension((int)(i * 0.1D), j);
    bs.e(this.a).setMaximumSize(localDimension);
    bs.e(this.a).setMinimumSize(localDimension);
    bs.e(this.a).setPreferredSize(localDimension);
    bs.e(this.a).a(bs.d(this.a).h() / 2);
    bs.i(this.a).d(bs.d(this.a).h() / 2);
    this.a.validate();
  }

  a(bs parambs, s params)
  {
    this(parambs);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.a
 * JD-Core Version:    0.6.0
 */