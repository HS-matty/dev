package com.zend.ide.cb.a;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class y
  implements ActionListener
{
  final dd a;

  y(dd paramdd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (dd.a(this.a).isSelected())
    {
      dd.b(this.a).setEnabled(true);
    }
    else
    {
      dd.b(this.a).setSelected(false);
      dd.b(this.a).setEnabled(false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.y
 * JD-Core Version:    0.6.0
 */