package com.zend.ide.n;

import com.zend.ide.n.b.g;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.text.Document;

public class gp extends dn
{
  private bw b;

  public gp(Action paramAction, bw parambw)
  {
    super(paramAction);
    this.b = parambw;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    g localg = b();
    if (localg != null)
      localg.a(d(), paramActionEvent);
    super.actionPerformed(paramActionEvent);
    if (localg != null)
      localg.b(d(), paramActionEvent);
  }

  private g b()
  {
    return (g)this.b.getDocument().getProperty("undoTool");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gp
 * JD-Core Version:    0.6.0
 */