package com.zend.ide.util;

import java.awt.event.ActionEvent;
import javax.swing.Action;

public class dr extends dn
{
  private v b;
  final s c;

  public dr(s params, Action paramAction, v paramv)
  {
    super(paramAction);
    params.a(paramv);
    this.b = paramv;
    paramv.b(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    super.actionPerformed(paramActionEvent);
    this.b.c();
  }

  public void b()
  {
    this.b.a(d());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dr
 * JD-Core Version:    0.6.0
 */