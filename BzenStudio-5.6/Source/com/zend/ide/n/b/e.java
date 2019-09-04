package com.zend.ide.n.b;

import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class e extends dn
{
  private g b;

  public e(Action paramAction, g paramg)
  {
    super(paramAction);
    this.b = paramg;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.b.a(d(), paramActionEvent);
    super.actionPerformed(paramActionEvent);
    this.b.b(d(), paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.b.e
 * JD-Core Version:    0.6.0
 */