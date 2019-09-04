package com.zend.ide.n;

import com.zend.ide.util.ch;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

public class gh extends AbstractAction
{
  final cj a;

  public gh(cj paramcj)
  {
    super("print");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.b().e();
    if ((localJTextComponent instanceof gz))
      ch.a((gz)localJTextComponent);
    else
      ch.a(localJTextComponent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gh
 * JD-Core Version:    0.6.0
 */