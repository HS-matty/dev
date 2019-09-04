package com.zend.ide.s;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class df extends AbstractAction
{
  final db a;

  private df(db paramdb)
  {
    super("keys.showFunctionArguments");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    db.a(this.a).b(true);
  }

  df(db paramdb, cm paramcm)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.df
 * JD-Core Version:    0.6.0
 */