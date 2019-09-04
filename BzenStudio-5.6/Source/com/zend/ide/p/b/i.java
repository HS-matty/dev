package com.zend.ide.p.b;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class i extends AbstractAction
{
  final k a;

  public i(k paramk)
  {
    super(ct.a(117));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (k.b(this.a).c())
    {
      this.a.setVisible(false);
      k.b(this.a).b();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.i
 * JD-Core Version:    0.6.0
 */