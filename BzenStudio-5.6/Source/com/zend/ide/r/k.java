package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class k
  implements ActionListener
{
  final ba a;

  k(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    d locald = (d)ba.a(this.a).getSelectedValue();
    int i = ba.a(this.a).getSelectedIndex();
    p.e().b(locald);
    ((DefaultListModel)ba.a(this.a).getModel()).removeElementAt(ba.a(this.a).getSelectedIndex());
    ba.a(this.a, locald);
    try
    {
      ba.a(this.a).setSelectedIndex(i);
    }
    catch (Exception localException)
    {
      ba.a(this.a).setSelectedIndex(0);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.k
 * JD-Core Version:    0.6.0
 */