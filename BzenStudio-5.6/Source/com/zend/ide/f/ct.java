package com.zend.ide.f;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ct extends AbstractAction
{
  final db a;

  public ct(db paramdb)
  {
    super("GotoIncludeFileAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = db.b(this.a);
    if ((str == null) || (str.trim().length() == 0))
      return;
    db.a(this.a).a(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ct
 * JD-Core Version:    0.6.0
 */