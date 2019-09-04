package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class vb extends AbstractAction
{
  final pd a;

  public vb(pd parampd)
  {
    super(ct.a(1482));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = this.a.getSelectedRow();
    int j = this.a.getSelectedColumn();
    if ((i > -1) && (j > -1))
      this.a.setValueAt("(null)", i, j);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.vb
 * JD-Core Version:    0.6.0
 */