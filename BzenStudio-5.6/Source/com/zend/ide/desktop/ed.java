package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.u.bh;
import com.zend.ide.u.ch;
import javax.swing.JComponent;

class ed
  implements ch
{
  final ec a;

  ed(ec paramec)
  {
  }

  public void a(bh parambh)
  {
    this.a.b.v().c().repaint();
    this.a.b.l().c().repaint();
  }

  public void a(bh parambh, boolean paramBoolean)
  {
    this.a.b.v().c().repaint();
    if (paramBoolean)
      this.a.b.l().a(parambh);
    this.a.b.l().c().repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ed
 * JD-Core Version:    0.6.0
 */