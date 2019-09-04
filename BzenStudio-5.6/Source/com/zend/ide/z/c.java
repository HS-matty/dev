package com.zend.ide.z;

import com.zend.ide.p.eb;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class c extends MouseAdapter
{
  final bj a;

  c(bj parambj)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (SwingUtilities.isRightMouseButton(paramMouseEvent))
    {
      int i = this.a.b.rowAtPoint(paramMouseEvent.getPoint());
      this.a.b.setRowSelectionInterval(i, i);
    }
    if (paramMouseEvent.getClickCount() == 2)
      bi.c(this.a.d).actionPerformed(new ActionEvent(paramMouseEvent.getSource(), paramMouseEvent.getID(), ""));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.c
 * JD-Core Version:    0.6.0
 */