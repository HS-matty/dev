package com.zend.ide.s;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class de extends AbstractAction
{
  final db a;

  private de(db paramdb)
  {
    super("keys.showCompletionList");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    db.a(this.a).a(true);
  }

  de(db paramdb, cm paramcm)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.de
 * JD-Core Version:    0.6.0
 */