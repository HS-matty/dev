package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

class j
  implements ActionListener
{
  final ba a;

  j(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    o localo1 = (o)ba.a(this.a).getSelectedValue();
    o localo2 = this.a.a(localo1, 0);
    if (localo2 != null)
      ba.a(this.a).a(new bo(localo1, localo2));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.j
 * JD-Core Version:    0.6.0
 */