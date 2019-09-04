package com.zend.ide.eb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.TreeSelectionModel;

class n
  implements ActionListener
{
  final k a;

  n(k paramk)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = k.d(this.a).getSelectionModel().getLeadSelectionRow();
    k.j(this.a);
    if (i > 0)
      k.d(this.a).setSelectionRow(i + 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.n
 * JD-Core Version:    0.6.0
 */