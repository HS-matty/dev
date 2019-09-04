package com.zend.ide.f;

import com.zend.ide.bc.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cv extends AbstractAction
{
  final db a;

  public cv(db paramdb)
  {
    super("GotoSourceAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a().a("go_to_source");
    this.a.k();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cv
 * JD-Core Version:    0.6.0
 */