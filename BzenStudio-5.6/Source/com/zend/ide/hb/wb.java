package com.zend.ide.hb;

import java.awt.event.ActionEvent;
import javax.swing.text.TextAction;

class wb extends TextAction
{
  final pb a;

  public wb(pb parampb)
  {
    super(pb.j(parampb));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    pb.f(this.a).a(-1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.wb
 * JD-Core Version:    0.6.0
 */