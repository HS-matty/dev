package com.zend.ide.hb;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class u
  implements ActionListener
{
  final x a;
  final rb b;

  u(rb paramrb, x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rb.b(this.b, this.a.isSelected());
    rb.a(this.b, rb.a(this.b).getText());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.u
 * JD-Core Version:    0.6.0
 */