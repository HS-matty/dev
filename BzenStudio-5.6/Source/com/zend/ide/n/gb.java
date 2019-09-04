package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class gb extends AbstractAction
{
  final ch a;

  public gb(ch paramch)
  {
    super("save-As");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bw localbw = this.a.b();
    localbw.grabFocus();
    dz localdz = (dz)localbw.getDocument();
    while (br.b(localdz) == -1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gb
 * JD-Core Version:    0.6.0
 */