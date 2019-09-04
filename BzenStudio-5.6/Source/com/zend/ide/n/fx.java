package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fx extends AbstractAction
{
  final ch a;

  public fx(ch paramch)
  {
    super("close-All-Documents");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b().b(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fx
 * JD-Core Version:    0.6.0
 */