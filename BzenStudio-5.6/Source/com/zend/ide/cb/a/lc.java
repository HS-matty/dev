package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JButton;

class lc extends AbstractAction
{
  final v a;

  public lc(v paramv)
  {
    super("", v.q());
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    x localx = (x)this.a.m().get(0);
    boolean bool1 = localx.a();
    boolean bool2 = localx.a(!bool1);
    if (!bool2)
    {
      if (!localx.c())
        v.a(this.a).a(ct.a(1554) + ct.a(1556), true);
      else if (!localx.b())
        v.a(this.a).a(ct.a(1554) + ct.a(1555), true);
      else
        v.a(this.a).a(ct.a(1498), true);
    }
    else
    {
      bool1 = localx.a();
      this.a.l().a(bool1);
      if (bool1)
      {
        putValue("SmallIcon", v.r());
        ((JButton)paramActionEvent.getSource()).setToolTipText(ct.a(1499));
      }
      else
      {
        putValue("SmallIcon", v.q());
        ((JButton)paramActionEvent.getSource()).setToolTipText(ct.a(1492));
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.lc
 * JD-Core Version:    0.6.0
 */