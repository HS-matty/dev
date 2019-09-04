package com.zend.ide.l;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class mb extends AbstractAction
{
  private bp a = new bp(false);
  final tb b;

  public mb(tb paramtb)
  {
    super(ct.a(1846));
    this.a.resetChoosableFileFilters();
    this.a.setDialogTitle(ct.a(1846));
    this.a.setMultiSelectionEnabled(true);
    this.a.setFileSelectionMode(1);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.showDialog(this.b.g, ct.a(1838)) == 0)
    {
      File[] arrayOfFile = this.a.getSelectedFiles();
      this.b.a(arrayOfFile);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.mb
 * JD-Core Version:    0.6.0
 */