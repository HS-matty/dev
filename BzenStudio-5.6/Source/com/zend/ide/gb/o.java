package com.zend.ide.gb;

import com.zend.ide.p.bw;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class o extends bw
{
  final p e;

  public o(p paramp)
  {
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    int i = this.e.d().locationToIndex(paramMouseEvent.getPoint());
    if (i != -1)
      return p.n(this.e).getElementAt(i).toString();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.o
 * JD-Core Version:    0.6.0
 */