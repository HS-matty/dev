package com.zend.ide.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kb extends AbstractAction
{
  final mb a;

  public kb(mb parammb)
  {
    super("ResetAllPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.kb
 * JD-Core Version:    0.6.0
 */