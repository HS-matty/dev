package com.zend.ide.s;

import com.zend.ide.n.ha;
import com.zend.ide.r.p;
import com.zend.ide.y.b;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class cx extends ha
{
  wb d = new wb(this);
  ic b = new ic(this);
  rb e = new rb(this);
  hc f = new hc(this, null);

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new cx();
  }

  protected View a(Element paramElement)
  {
    return new cy();
  }

  public void installUI(JComponent paramJComponent)
  {
    super.installUI(paramJComponent);
    if ((paramJComponent instanceof JTextComponent))
      ((JTextComponent)paramJComponent).addPropertyChangeListener("document", this.e);
    p.e().a(this.b);
    b.a(this.f, "desktop.phpVersion");
  }

  public void uninstallUI(JComponent paramJComponent)
  {
    super.uninstallUI(paramJComponent);
    if ((paramJComponent instanceof JTextComponent))
      ((JTextComponent)paramJComponent).removePropertyChangeListener(this.e);
    p.e().b(this.b);
    b.c(this.f, "desktop.phpVersion");
  }

  static View a(cx paramcx)
  {
    return paramcx.c;
  }

  static View b(cx paramcx)
  {
    return paramcx.c;
  }

  static View c(cx paramcx)
  {
    return paramcx.c;
  }

  static View d(cx paramcx)
  {
    return paramcx.c;
  }

  static View e(cx paramcx)
  {
    return paramcx.c;
  }

  static View f(cx paramcx)
  {
    return paramcx.c;
  }

  static View g(cx paramcx)
  {
    return paramcx.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cx
 * JD-Core Version:    0.6.0
 */