package com.zend.ide.p.d;

import java.awt.event.ActionEvent;
import javax.swing.plaf.basic.BasicFileChooserUI.ApproveSelectionAction;

public class bx extends BasicFileChooserUI.ApproveSelectionAction
{
  final bw a;

  protected bx(bw parambw)
  {
    super(parambw);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    super.actionPerformed(paramActionEvent);
    if (!(this.a.getFileChooser() instanceof bp))
      return;
    bp localbp = (bp)this.a.getFileChooser();
    if (localbp.getSelectedFile() == null)
    {
      localbp.a(null);
      return;
    }
    localbp.a(this.a.a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bx
 * JD-Core Version:    0.6.0
 */