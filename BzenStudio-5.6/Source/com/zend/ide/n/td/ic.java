package com.zend.ide.n.td;

import com.zend.ide.n.gx;
import com.zend.ide.n.ha;
import com.zend.ide.n.td.a.s;
import com.zend.ide.n.td.a.t;
import com.zend.ide.r.p;
import com.zend.ide.y.b;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class ic extends ha
{
  dc d = new dc(this);
  ac e = new ac(this);
  yb f = new yb(this);
  zb g = new zb(this, null);

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new ic();
  }

  public View create(Element paramElement)
  {
    gx localgx = (gx)getComponent();
    s locals1 = (s)this.c;
    this.c = a(paramElement);
    s locals2 = (s)this.c;
    if (locals1 != null)
    {
      localgx.removeComponentListener(locals1.m());
      localgx.addComponentListener(locals2.m());
      if (locals1.j() != null)
      {
        locals1.j().b(locals1);
        locals2.a(locals1.j());
      }
    }
    locals2.a(localgx);
    return this.c;
  }

  protected View a(Element paramElement)
  {
    return new t(paramElement);
  }

  public void installUI(JComponent paramJComponent)
  {
    super.installUI(paramJComponent);
    if ((paramJComponent instanceof JTextComponent))
      ((JTextComponent)paramJComponent).addPropertyChangeListener("document", this.f);
    p.e().a(this.e);
    b.a(this.g, "desktop.phpVersion");
  }

  public void uninstallUI(JComponent paramJComponent)
  {
    super.uninstallUI(paramJComponent);
    if ((paramJComponent instanceof JTextComponent))
      ((JTextComponent)paramJComponent).removePropertyChangeListener(this.f);
    p.e().b(this.e);
    b.c(this.g, "desktop.phpVersion");
  }

  static View a(ic paramic)
  {
    return paramic.c;
  }

  static View b(ic paramic)
  {
    return paramic.c;
  }

  static View c(ic paramic)
  {
    return paramic.c;
  }

  static View d(ic paramic)
  {
    return paramic.c;
  }

  static View e(ic paramic)
  {
    return paramic.c;
  }

  static View f(ic paramic)
  {
    return paramic.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.ic
 * JD-Core Version:    0.6.0
 */