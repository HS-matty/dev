package com.zend.ide.n;

import com.zend.ide.n.c.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

public class fk extends AbstractAction
{
  final cd a;

  public fk(cd paramcd)
  {
    super("phpBlockComment");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bw localbw = this.a.b();
    if ((localbw != null) && (localbw.e().isEditable()))
      c.b(localbw, localbw.e().getSelectionStart(), localbw.e().getSelectionEnd());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fk
 * JD-Core Version:    0.6.0
 */