package com.zend.ide.e;

import com.zend.ide.p.w;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class i extends AbstractAction
{
  final c a;

  public i(c paramc)
  {
    super("LeftAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.d(this.a).doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.i
 * JD-Core Version:    0.6.0
 */