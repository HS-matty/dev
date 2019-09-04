package com.zend.ide.hb;

import com.zend.ide.p.bw;
import com.zend.ide.util.ct;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class lb extends com.zend.ide.k.d
{
  final ub f;

  private lb(ub paramub)
  {
    super(paramub, "findInFiles", null, ub.a(), ub.e(paramub));
  }

  public boolean a()
  {
    return !ub.f(this.f).isSelectionEmpty();
  }

  public void d()
  {
    ((DefaultListModel)ub.g(this.f).getModel()).removeAllElements();
    super.d();
  }

  public String b()
  {
    return ub.h(this.f);
  }

  public String e()
  {
    if (ub.i(this.f))
      return ct.a(1355, ub.h(this.f));
    return ct.a(1356, ub.h(this.f), ub.j(this.f));
  }

  public boolean c()
  {
    return true;
  }

  public void h()
  {
    if (((ub.k(this.f).getSelectedValue() instanceof d)) && (a()))
    {
      d locald = (d)ub.l(this.f).getSelectedValue();
      ub.m(this.f).a(locald);
    }
  }

  public void i()
  {
    int i = ub.n(this.f).getSelectedIndex();
    int j = ub.o(this.f).getModel().getSize();
    if (j > 1)
    {
      if ((i == -1) && (j == 0))
        return;
      if (i == -1)
        ub.p(this.f).setSelectedIndex(1);
      else if (j - 1 == i)
        ub.q(this.f).setSelectedIndex(1);
      else
        ub.r(this.f).setSelectedIndex(i + 1);
      ub.t(this.f).ensureIndexIsVisible(ub.s(this.f).getSelectedIndex());
      h();
    }
  }

  public void j()
  {
    if (((ub.u(this.f).getSelectedValue() instanceof d)) && (a()) && (ub.v(this.f).getSelectedIndex() > 0))
    {
      DefaultListModel localDefaultListModel = (DefaultListModel)ub.w(this.f).getModel();
      Object[] arrayOfObject = ub.x(this.f).getSelectedValues();
      for (int i = 0; i < arrayOfObject.length; i++)
      {
        if (!(arrayOfObject[i] instanceof d))
          continue;
        localDefaultListModel.removeElement(arrayOfObject[i]);
      }
      n();
      ub.y(this.f).revalidate();
      ub.z(this.f).repaint();
    }
  }

  public int o()
  {
    return ub.A(this.f).getModel().getSize();
  }

  lb(ub paramub, eb parameb)
  {
    this(paramub);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.lb
 * JD-Core Version:    0.6.0
 */