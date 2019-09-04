package com.zend.ide.d;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JTextField;

class uc extends AbstractAction
{
  private bp a = new bp(false);
  final ld b;

  public uc(ld paramld)
  {
    super(ct.a(224));
    this.a.setFileSelectionMode(1);
    this.a.setApproveButtonText(ct.a(1838));
    this.a.setDialogTitle(ct.a(1837));
    this.a.setAcceptAllFileFilterUsed(true);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.setCurrentDirectory(new File(ld.c(this.b).getText()));
    if (this.a.showOpenDialog(this.b) == 0)
    {
      ld.c(this.b).setText(this.a.getSelectedFile().getAbsolutePath());
      ld.d(this.b);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.uc
 * JD-Core Version:    0.6.0
 */