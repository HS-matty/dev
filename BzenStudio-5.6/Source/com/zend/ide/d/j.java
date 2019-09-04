package com.zend.ide.d;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class j extends MouseAdapter
{
  final ud a;

  j(ud paramud)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (this.a.getSelectedColumn() == 0)
      SwingUtilities.invokeLater(new ac(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.j
 * JD-Core Version:    0.6.0
 */