package com.zend.ide.gb;

import com.zend.ide.k.e;
import com.zend.ide.k.f;
import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.p.v;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import javax.swing.DefaultListModel;
import javax.swing.Icon;

public class p extends bc
  implements cu, e
{
  private static final Icon f = cv.b("go16.gif");
  private static final Icon g = cv.b("stopdebugger16.gif");
  private f h;
  private i i;

  public p(i parami)
  {
    this.i = parami;
  }

  public void b(Object paramObject)
  {
    super.b(paramObject);
    this.e.ensureIndexIsVisible(((DefaultListModel)this.e.getModel()).indexOf(paramObject));
    ((com.zend.ide.k.d)x()).n();
  }

  protected void a(Object paramObject)
  {
    if ((paramObject instanceof k))
    {
      k localk = (k)paramObject;
      this.i.a(localk.a(), localk.b());
    }
  }

  protected bw a()
  {
    return new o(this);
  }

  public void a()
  {
    f();
    b(a(ct.a(1602), f));
  }

  public void b()
  {
    b(a(ct.a(1603), g));
  }

  public void a(k paramk)
  {
    b(a(paramk, paramk.c()));
  }

  public f x()
  {
    if (this.h == null)
      this.h = new d(this);
    return this.h;
  }

  protected v n()
  {
    return new n(this, null);
  }

  static bw a(p paramp)
  {
    return paramp.e;
  }

  static bw b(p paramp)
  {
    return paramp.e;
  }

  static bw c(p paramp)
  {
    return paramp.e;
  }

  static bw d(p paramp)
  {
    return paramp.e;
  }

  static bw e(p paramp)
  {
    return paramp.e;
  }

  static bw f(p paramp)
  {
    return paramp.e;
  }

  static bw g(p paramp)
  {
    return paramp.e;
  }

  static bw h(p paramp)
  {
    return paramp.e;
  }

  static bw i(p paramp)
  {
    return paramp.e;
  }

  static bw j(p paramp)
  {
    return paramp.e;
  }

  static bw k(p paramp)
  {
    return paramp.e;
  }

  static bw l(p paramp)
  {
    return paramp.e;
  }

  static bw m(p paramp)
  {
    return paramp.e;
  }

  static DefaultListModel n(p paramp)
  {
    return paramp.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.p
 * JD-Core Version:    0.6.0
 */