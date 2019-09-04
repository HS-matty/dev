package com.zend.ide.z;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class a extends MouseAdapter
{
  final bb a;
  final bp b;

  a(bp parambp, bb parambb)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if ((paramMouseEvent.getClickCount() == 2) && (bp.b(this.b)))
      this.a.actionPerformed(new ActionEvent(paramMouseEvent.getSource(), paramMouseEvent.getID(), ""));
    int i = this.b.getRowForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    if (i != -1)
      this.b.setSelectionRow(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.a
 * JD-Core Version:    0.6.0
 */