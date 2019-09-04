package com.zend.ide.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class rc extends AbstractAction
{
  final od a;

  public rc(od paramod)
  {
    super("ResetAllPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    od.f(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.rc
 * JD-Core Version:    0.6.0
 */