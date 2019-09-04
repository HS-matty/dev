package com.zend.ide.cb.a;

import com.zend.ide.util.c.h;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class oc extends AbstractAction
{
  final dd a;

  public oc(dd paramdd)
  {
    super(ct.a(116));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (dd.b())
      return;
    dd.a(this.a, true);
    he localhe = new he(this);
    h.c().a(localhe, true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.oc
 * JD-Core Version:    0.6.0
 */