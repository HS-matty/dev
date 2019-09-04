package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class eh extends AbstractAction
{
  final fq a;

  public eh(fq paramfq)
  {
    super("DisableAllBreakpointAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    fq.a(this.a).b(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.eh
 * JD-Core Version:    0.6.0
 */