package com.zend.ide.p.e.a;

import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.plaf.basic.BasicMenuUI.MouseInputHandler;

class o extends BasicMenuUI.MouseInputHandler
{
  final n a;

  private o(n paramn)
  {
    super(paramn);
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    super.mouseEntered(paramMouseEvent);
    n.a(this.a, true);
    n.a(this.a).repaint();
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    super.mouseExited(paramMouseEvent);
    n.a(this.a, false);
    n.b(this.a).repaint();
  }

  o(n paramn, k paramk)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.o
 * JD-Core Version:    0.6.0
 */