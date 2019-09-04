package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class be
  implements ActionListener
{
  final ba a;

  be(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    o localo = (o)ba.b(this.a).getSelectedValue();
    ba.a(this.a).d(localo.b());
    ((DefaultListModel)ba.b(this.a).getModel()).removeElementAt(ba.b(this.a).getSelectedIndex());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.be
 * JD-Core Version:    0.6.0
 */