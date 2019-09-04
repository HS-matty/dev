package com.zend.ide.n;

import com.zend.ide.n.a.m;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.DefaultTableModel;

class pc extends AbstractAction
{
  final sc a;

  private pc(sc paramsc)
  {
    super("RemoveAllFromTableAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    sc.e(this.a).setNumRows(0);
    sc.c(this.a).b();
    sc.d(this.a);
  }

  pc(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.pc
 * JD-Core Version:    0.6.0
 */