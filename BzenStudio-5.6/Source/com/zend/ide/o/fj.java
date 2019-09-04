package com.zend.ide.o;

import com.zend.ide.p.bw;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class fj extends bw
{
  final fn a;

  public fj(fn paramfn)
  {
    putClientProperty("help_file", "zend_ide_helpdebugging_messages.htm");
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    int i = this.a.d().locationToIndex(paramMouseEvent.getPoint());
    if (i != -1)
      return fn.p(this.a).getElementAt(i).toString();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fj
 * JD-Core Version:    0.6.0
 */