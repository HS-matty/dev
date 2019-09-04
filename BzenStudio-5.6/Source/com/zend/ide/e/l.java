package com.zend.ide.e;

import com.zend.ide.p.w;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class l extends AbstractAction
{
  final c a;

  public l(c paramc)
  {
    super("RightAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.e(this.a).doClick();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.l
 * JD-Core Version:    0.6.0
 */