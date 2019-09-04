package com.zend.ide.n;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class iv extends AbstractAction
{
  final ci a;

  public iv(ci paramci)
  {
    super("toggleLineWrap");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    b.a("editing.lineWrap").a(new Boolean(!((Boolean)b.a("editing.lineWrap").c()).booleanValue()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.iv
 * JD-Core Version:    0.6.0
 */