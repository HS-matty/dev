package com.zend.ide.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cd extends AbstractAction
{
  private static final long serialVersionUID = 1L;
  final sd a;

  public cd(sd paramsd)
  {
    super("ResetAllPropertiesAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    sd.c(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cd
 * JD-Core Version:    0.6.0
 */