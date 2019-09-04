package com.zend.ide.z;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ci extends AbstractAction
{
  final bn a;

  public ci(bn parambn)
  {
    super("profilerExpandTreeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bn.d(this.a).h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.ci
 * JD-Core Version:    0.6.0
 */