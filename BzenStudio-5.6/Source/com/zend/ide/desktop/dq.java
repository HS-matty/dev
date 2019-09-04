package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class dq extends AbstractAction
{
  final bx a;

  public dq(bx parambx)
  {
    super("AddToProjectAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.f().a(bx.b(this.a).v().b());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dq
 * JD-Core Version:    0.6.0
 */