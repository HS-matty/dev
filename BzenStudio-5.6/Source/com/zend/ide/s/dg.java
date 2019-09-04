package com.zend.ide.s;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class dg extends AbstractAction
{
  final dj a;

  private dg(dj paramdj)
  {
    super("CloseWindowAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    dj.c(this.a).b();
  }

  dg(dj paramdj, cp paramcp)
  {
    this(paramdj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.dg
 * JD-Core Version:    0.6.0
 */