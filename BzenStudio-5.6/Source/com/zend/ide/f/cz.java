package com.zend.ide.f;

import com.zend.ide.f.b.b;
import com.zend.ide.m.bh;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class cz extends AbstractAction
{
  final de a;

  public cz(de paramde)
  {
    super("showFunctionHelpAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!(this.a.getLastSelectedPathComponent() instanceof b))
      return;
    b localb = (b)this.a.getLastSelectedPathComponent();
    if ((localb != null) && ((localb.getUserObject() instanceof bh)))
    {
      bh localbh = (bh)localb.getUserObject();
      bm.a(this.a.c(), localbh.a());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cz
 * JD-Core Version:    0.6.0
 */