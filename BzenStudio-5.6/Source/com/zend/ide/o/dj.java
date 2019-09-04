package com.zend.ide.o;

import com.zend.ide.n.a.a;
import com.zend.ide.n.a.c;
import com.zend.ide.n.a.d;
import com.zend.ide.n.bw;
import com.zend.ide.y.f;
import java.awt.Color;
import java.beans.PropertyChangeListener;

public class dj extends c
{
  private PropertyChangeListener k = new l(this, null);
  private com.zend.ide.y.e l;
  private fk m;
  private com.zend.ide.n.a.e n;

  public dj(fk paramfk, bw parambw)
  {
    super("currenttStepPositionHighlighter", parambw, -2);
    this.m = paramfk;
    a(Color.darkGray);
    l();
    super.a(true);
  }

  public void k()
  {
    if (this.n != null)
    {
      super.b(this.n);
      this.n = null;
    }
    String str = this.m.W();
    if (str != null)
    {
      int i = this.m.U();
      this.n = new a(str, i);
      super.a(this.n);
    }
  }

  protected void l()
  {
    f localf = new f();
    this.l = new com.zend.ide.y.e(localf);
    localf.a("highlighting.debugStepColor", this.k);
    this.l.a("highlighting.debugStepColor");
  }

  protected d e()
  {
    return new dl(this);
  }

  static com.zend.ide.n.a.e a(dj paramdj)
  {
    return paramdj.n;
  }

  static bw b(dj paramdj)
  {
    return paramdj.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dj
 * JD-Core Version:    0.6.0
 */