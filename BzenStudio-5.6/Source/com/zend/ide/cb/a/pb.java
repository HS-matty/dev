package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class pb extends AbstractAction
{
  final ed a;

  public pb(ed paramed)
  {
    super(ct.a(117));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ed.a(this.a, 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.pb
 * JD-Core Version:    0.6.0
 */