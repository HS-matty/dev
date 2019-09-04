package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mc extends AbstractAction
{
  final dd a;

  public mc(dd paramdd)
  {
    super(ct.a(117));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    dd.a(this.a, false);
    dd.b(this.a, true);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.mc
 * JD-Core Version:    0.6.0
 */