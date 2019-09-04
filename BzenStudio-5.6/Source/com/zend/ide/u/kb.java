package com.zend.ide.u;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class kb
  implements ActionListener
{
  final ce a;

  kb(ce paramce)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ce.i(this.a);
    if (!ce.j(this.a).isSelected())
    {
      ce.k(this.a).setText("");
      ce.l(this.a).setText("");
      ce.h(this.a).setSelected(true);
    }
    ce.f(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.kb
 * JD-Core Version:    0.6.0
 */