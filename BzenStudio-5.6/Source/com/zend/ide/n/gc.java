package com.zend.ide.n;

import com.zend.ide.bc.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class gc extends AbstractAction
{
  final ch a;

  public gc(ch paramch)
  {
    super("save-File");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a().a("save_file");
    bw localbw = this.a.b();
    localbw.grabFocus();
    dz localdz = (dz)localbw.getDocument();
    br.a(localdz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gc
 * JD-Core Version:    0.6.0
 */