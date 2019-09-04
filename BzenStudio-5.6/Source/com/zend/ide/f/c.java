package com.zend.ide.f;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

class c extends MouseAdapter
{
  final da a;

  private c(da paramda)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      da.c(this.a);
    if (SwingUtilities.isRightMouseButton(paramMouseEvent))
    {
      int i = da.a(this.a).rowAtPoint(paramMouseEvent.getPoint());
      da.a(this.a).setRowSelectionInterval(i, i);
    }
  }

  c(da paramda, d paramd)
  {
    this(paramda);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.c
 * JD-Core Version:    0.6.0
 */