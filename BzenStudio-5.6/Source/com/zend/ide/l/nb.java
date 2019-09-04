package com.zend.ide.l;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class nb extends AbstractAction
{
  private bp a = new bp(false);
  final tb b;

  public nb(tb paramtb)
  {
    super(ct.a(1845));
    this.a.setAcceptAllFileFilterUsed(false);
    this.a.resetChoosableFileFilters();
    this.a.setFileFilter(new rb(this, paramtb));
    this.a.setDialogTitle(ct.a(1845));
    this.a.setMultiSelectionEnabled(true);
    this.a.setFileSelectionMode(0);
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
 * Qualified Name:     com.zend.ide.l.nb
 * JD-Core Version:    0.6.0
 */