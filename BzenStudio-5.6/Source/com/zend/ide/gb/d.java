package com.zend.ide.gb;

import com.zend.ide.p.bw;
import com.zend.ide.p.m;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.JComponent;
import javax.swing.ListModel;

class d extends com.zend.ide.k.d
{
  final p f;

  public d(p paramp)
  {
    super(p.a(paramp), "wsdlMessages", ct.a(1601), cv.b("wsdlCreator_16.gif"), ct.a(1604));
  }

  public boolean c()
  {
    return true;
  }

  public void h()
  {
    for (Object localObject = p.b(this.f).getSelectedValue(); (localObject instanceof m); localObject = ((m)localObject).b());
    this.f.a(localObject);
  }

  public void i()
  {
    int i = p.c(this.f).getSelectedIndex();
    int j = p.d(this.f).getModel().getSize();
    if ((i == -1) && (j == 0))
      return;
    if (i == -1)
      p.e(this.f).setSelectedIndex(0);
    Object localObject;
    if (j - 1 == i)
    {
      p.f(this.f).setSelectedIndex(0);
      localObject = p.g(this.f).getModel().getElementAt(0);
    }
    else
    {
      p.h(this.f).setSelectedIndex(i + 1);
      localObject = p.i(this.f).getModel().getElementAt(i + 1);
    }
    p.k(this.f).ensureIndexIsVisible(p.j(this.f).getSelectedIndex());
    while ((localObject instanceof m))
      localObject = ((m)localObject).b();
    this.f.a(localObject);
  }

  public void d()
  {
    p.l(this.f).removeAll();
    super.d();
  }

  public JComponent g()
  {
    return this.f;
  }

  public int o()
  {
    return p.m(this.f).getModel().getSize();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.d
 * JD-Core Version:    0.6.0
 */