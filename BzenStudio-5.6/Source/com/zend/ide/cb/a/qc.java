package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.desktop.cj;
import com.zend.ide.util.bn;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class qc extends AbstractAction
{
  final n a;

  public qc(n paramn)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bn localbn = n.c(this.a).a().d();
    if ((localbn instanceof cj))
      ((cj)localbn).a(10);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.qc
 * JD-Core Version:    0.6.0
 */