package com.zend.ide.desktop;

import com.zend.ide.hb.ab;
import com.zend.ide.hb.f;
import com.zend.ide.hb.ub;
import com.zend.ide.p.b.a;
import com.zend.ide.util.ct;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class gb extends a
{
  final co g;

  private gb(co paramco)
  {
    super(ct.a(933), true, true, 0.0F, "");
    b(ct.a(171));
  }

  public String j()
  {
    return ct.b(559);
  }

  public void b()
  {
    co.a(this.g).g().b();
  }

  public boolean c()
  {
    return true;
  }

  public void d()
  {
    co.a(this.g, true);
    if (co.b(this.g) == null)
      co.a(this.g, co.c(this.g));
    JList localJList = co.b(this.g).d();
    if (((DefaultListModel)localJList.getModel()).isEmpty())
      ((DefaultListModel)localJList.getModel()).addElement(ct.a(559));
  }

  public boolean e()
  {
    return true;
  }

  public float f()
  {
    return 2.0F;
  }

  gb(co paramco, bz parambz)
  {
    this(paramco);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.gb
 * JD-Core Version:    0.6.0
 */