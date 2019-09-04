package com.zend.ide.o;

import com.zend.ide.k.d;
import com.zend.ide.p.bw;
import com.zend.ide.p.m;
import com.zend.ide.util.ct;
import javax.swing.JComponent;
import javax.swing.ListModel;

public class dh extends d
{
  final fn f;

  public dh(fn paramfn)
  {
    super(fn.c(paramfn), "debugMessages", ct.a(765), fn.c(), ct.a(759));
  }

  public boolean c()
  {
    return false;
  }

  public void h()
  {
    for (Object localObject = fn.d(this.f).getSelectedValue(); (localObject instanceof m); localObject = ((m)localObject).b());
    this.f.a(localObject);
  }

  public void i()
  {
    int i = fn.e(this.f).getSelectedIndex();
    int j = fn.f(this.f).getModel().getSize();
    if ((i == -1) && (j == 0))
      return;
    if (i == -1)
      fn.g(this.f).setSelectedIndex(0);
    Object localObject;
    if (j - 1 == i)
    {
      fn.h(this.f).setSelectedIndex(0);
      localObject = fn.i(this.f).getModel().getElementAt(0);
    }
    else
    {
      fn.j(this.f).setSelectedIndex(i + 1);
      localObject = fn.k(this.f).getModel().getElementAt(i + 1);
    }
    fn.m(this.f).ensureIndexIsVisible(fn.l(this.f).getSelectedIndex());
    while ((localObject instanceof m))
      localObject = ((m)localObject).b();
    this.f.a(localObject);
  }

  public void d()
  {
    fn.n(this.f).removeAll();
    super.d();
  }

  public JComponent g()
  {
    return this.f;
  }

  public int o()
  {
    return fn.o(this.f).getModel().getSize();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dh
 * JD-Core Version:    0.6.0
 */