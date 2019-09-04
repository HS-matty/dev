package com.zend.ide.p;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

class g extends MouseAdapter
{
  final bc a;

  g(bc parambc)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if ((paramMouseEvent.getClickCount() == 2) && (!this.a.e.getSelectionModel().isSelectionEmpty()))
    {
      for (Object localObject = this.a.e.getSelectedValue(); (localObject instanceof m); localObject = ((m)localObject).b());
      this.a.a(localObject);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.g
 * JD-Core Version:    0.6.0
 */