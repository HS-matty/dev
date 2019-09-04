package com.zend.ide.l;

import com.zend.ide.j.h;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.JComponent;

public class bl extends AbstractAction
{
  bp a = null;
  final g b;

  public bl(g paramg)
  {
    super("AddExistingToProject");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = b();
    localbp.setMultiSelectionEnabled(true);
    int i = localbp.showOpenDialog(this.b.c().getTopLevelAncestor());
    if (i == 0)
    {
      File[] arrayOfFile = localbp.getSelectedFiles();
      for (int j = 0; j < arrayOfFile.length; j++)
      {
        if (!arrayOfFile[j].exists())
          continue;
        arrayOfFile[j] = h.m.g(arrayOfFile[j].getAbsolutePath());
        try
        {
          this.b.b(arrayOfFile[j].getCanonicalFile());
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
      }
    }
  }

  private bp b()
  {
    if (this.a == null)
    {
      this.a = new bp(false);
      this.a.setDialogTitle(ct.a(133));
      this.a.setApproveButtonText(ct.a(134));
      this.a.setFileSelectionMode(2);
    }
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bl
 * JD-Core Version:    0.6.0
 */