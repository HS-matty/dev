package com.zend.ide.n;

import com.zend.ide.bc.c;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.bh;
import com.zend.ide.util.ct;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.text.JTextComponent;

public class fz extends AbstractAction
{
  final ch a;

  public fz(ch paramch)
  {
    super("open-Document");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a().a("go_to_file");
    bp localbp = br.c();
    localbp.setFileSelectionMode(0);
    bh localbh1 = bh.a();
    localbp.a(localbh1);
    Object localObject = this.a.b().c();
    if (this.a.b().e() != null)
      localObject = this.a.b().e().getTopLevelAncestor();
    int i = localbp.showOpenDialog((Component)localObject);
    if (i != 0)
    {
      this.a.b().grabFocus();
      return;
    }
    File[] arrayOfFile = localbp.getSelectedFiles();
    if (arrayOfFile == null)
      return;
    bh localbh2 = localbp.c();
    for (int j = 0; j < arrayOfFile.length; j++)
    {
      File localFile = arrayOfFile[j];
      if (localFile.isDirectory())
        continue;
      String str = localFile.getPath();
      dz localdz = this.a.b().a(str);
      if (localdz == null)
      {
        this.a.b().a(str, localbh2, -1);
      }
      else
      {
        if (localdz.l())
        {
          ba localba = new ba(ct.a(157, str), 3, 0);
          JDialog localJDialog = localba.createDialog(this.a.b().e(), ct.a(159));
          localJDialog.setVisible(true);
          Integer localInteger = (Integer)localba.getValue();
          if ((localInteger != null) && (localInteger.intValue() == 0))
            try
            {
              localdz.a(localbh2);
              br.b(localdz);
            }
            catch (Exception localException)
            {
            }
        }
        this.a.b().a(localdz.k(), null, 0);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fz
 * JD-Core Version:    0.6.0
 */