package com.zend.ide.n;

import com.zend.ide.n.b.g;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class gn extends AbstractAction
{
  final cl a;

  public gn(cl paramcl)
  {
    super("redo");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b().grabFocus();
    cl.a(this.a).redo();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gn
 * JD-Core Version:    0.6.0
 */