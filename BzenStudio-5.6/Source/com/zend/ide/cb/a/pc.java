package com.zend.ide.cb.a;

import com.zend.ide.util.c.h;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class pc extends AbstractAction
{
  final dd a;

  public pc(dd paramdd)
  {
    super(ct.a(1524));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (dd.b())
      return;
    dd.a(this.a, true);
    ie localie = new ie(this);
    h.c().a(localie, true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.pc
 * JD-Core Version:    0.6.0
 */