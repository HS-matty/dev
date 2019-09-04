package com.zend.ide.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class tc extends AbstractAction
{
  final rd a;

  public tc(rd paramrd)
  {
    super("ResetAllPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rd.n(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.tc
 * JD-Core Version:    0.6.0
 */