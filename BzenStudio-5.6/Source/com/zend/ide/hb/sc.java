package com.zend.ide.hb;

import com.zend.ide.p.bw;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class sc extends AbstractAction
{
  final bw a;
  final yc b;

  sc(yc paramyc, bw parambw)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.b.a(this.a.getSelectedValue());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.sc
 * JD-Core Version:    0.6.0
 */