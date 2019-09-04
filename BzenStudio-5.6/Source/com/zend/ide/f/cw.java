package com.zend.ide.f;

import com.zend.ide.p.x;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class cw extends AbstractAction
{
  final da a;

  public cw(da paramda)
  {
    super("CloseAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    b.a("application.showListDialog").a(new Boolean(!da.b(this.a).isSelected()));
    this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cw
 * JD-Core Version:    0.6.0
 */