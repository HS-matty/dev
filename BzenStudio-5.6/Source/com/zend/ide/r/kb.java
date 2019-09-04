package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

class kb
  implements ActionListener
{
  final y a;

  kb(y paramy)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (y.b(this.a) != null)
    {
      d locald1 = (d)y.b(this.a).getSelectedValue();
      d locald2 = locald1;
      p.e().a(locald1, new f(y.b(this.a), false));
      p.e().a(new bo(locald2, locald1));
    }
    y.a(this.a, null);
    y.a(this.a, true);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.kb
 * JD-Core Version:    0.6.0
 */