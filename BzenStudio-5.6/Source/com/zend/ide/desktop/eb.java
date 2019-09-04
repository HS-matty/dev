package com.zend.ide.desktop;

import com.zend.ide.be.k;
import com.zend.ide.util.ct;
import com.zend.ide.util.eq;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class eb extends AbstractAction
{
  final cj a;

  public eb(cj paramcj)
  {
    super("openAutoUpdateDialogAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cj.a(this.a).d().a(ct.a(1269));
    eq.a(true);
    cj.a(this.a).d().b(ct.a(1269));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eb
 * JD-Core Version:    0.6.0
 */