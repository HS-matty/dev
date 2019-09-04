package com.zend.ide.o;

import com.zend.ide.bd.c;
import com.zend.ide.o.n.u;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class qb extends AbstractAction
{
  u a;
  final fk b;

  qb(fk paramfk)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a == null)
      this.a = new u(c.b().h());
    this.a.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.qb
 * JD-Core Version:    0.6.0
 */