package com.zend.ide.e;

import com.zend.ide.i.n;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class g extends AbstractAction
{
  final c a;

  public g(c paramc)
  {
    super("CloseAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.b(this.a).setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.g
 * JD-Core Version:    0.6.0
 */