package com.zend.ide.hb;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class tb
  implements ActionListener
{
  final x a;
  final rb f;

  tb(rb paramrb, x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rb.a(this.f, this.a.isSelected());
    rb.a(this.f, rb.a(this.f).getText());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.tb
 * JD-Core Version:    0.6.0
 */