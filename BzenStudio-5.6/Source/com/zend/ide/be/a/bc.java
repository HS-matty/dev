package com.zend.ide.be.a;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class bc extends AbstractAction
{
  private Component a;
  private String c;
  final bo b;

  public bc(bo parambo, Component paramComponent, String paramString)
  {
    this.a = paramComponent;
    this.c = paramString;
  }

  public void a(Component paramComponent)
  {
    this.a = paramComponent;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bo.b(this.b).show(bo.a(this.b), this.c);
    this.b.d(this.c);
    bo.a(this.b, this.a);
  }

  static Component a(bc parambc)
  {
    return parambc.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bc
 * JD-Core Version:    0.6.0
 */