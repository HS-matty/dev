package com.zend.ide.l;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class bs extends AbstractAction
{
  final g a;

  public bs(g paramg)
  {
    super("RemoveFromProjectAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File[] arrayOfFile = g.a(this.a).b();
    this.a.b(arrayOfFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bs
 * JD-Core Version:    0.6.0
 */