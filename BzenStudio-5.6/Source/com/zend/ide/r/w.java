package com.zend.ide.r;

import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.plaf.ListUI;

class w extends JList
{
  final ba a;

  w(ba paramba, ListModel paramListModel)
  {
    super(paramListModel);
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    int i = ba.b(this.a).getUI().locationToIndex(ba.b(this.a), paramMouseEvent.getPoint());
    if (i == -1)
      return null;
    return ((o)ba.b(this.a).getModel().getElementAt(i)).getDescription();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.w
 * JD-Core Version:    0.6.0
 */