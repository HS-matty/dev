package com.zend.ide.r;

import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.plaf.ListUI;

class v extends JList
{
  final ba a;

  v(ba paramba, ListModel paramListModel)
  {
    super(paramListModel);
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    int i = ba.a(this.a).getUI().locationToIndex(ba.a(this.a), paramMouseEvent.getPoint());
    if (i == -1)
      return "";
    d locald = (d)ba.a(this.a).getModel().getElementAt(i);
    return locald.getDescription() == null ? "" : locald.getDescription();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.v
 * JD-Core Version:    0.6.0
 */