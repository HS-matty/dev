package com.zend.ide.cb.a.b;

import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;

class ub extends lb
{
  final bb c;

  public ub(bb parambb, KeyStroke paramKeyStroke)
  {
    super("Trigger Element");
    putValue("AcceleratorKey", paramKeyStroke);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bb.a(this.c).h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.ub
 * JD-Core Version:    0.6.0
 */