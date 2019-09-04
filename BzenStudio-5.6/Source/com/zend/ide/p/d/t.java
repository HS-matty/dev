package com.zend.ide.p.d;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

class t extends AbstractAction
{
  final bw a;

  t(bw parambw)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.bq)
      bw.k(this.a);
    else
      this.a.getFileChooser().cancelSelection();
  }

  public boolean isEnabled()
  {
    return this.a.getFileChooser().isEnabled();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.t
 * JD-Core Version:    0.6.0
 */