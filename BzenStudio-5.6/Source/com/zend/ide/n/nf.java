package com.zend.ide.n;

import com.zend.ide.bd.c;
import com.zend.ide.p.d.bp;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class nf
  implements ActionListener
{
  final lg a;

  nf(lg paramlg)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.getSelectedItem().equals(lg.c))
    {
      bp localbp = br.c();
      br.a().setMultiSelectionEnabled(false);
      localbp.setFileSelectionMode(0);
      localbp.setDialogTitle(ct.a(1728));
      localbp.setFileFilter(p.f().j());
      int i = br.c().showOpenDialog(c.b().h());
      if (i == 0)
      {
        File localFile = br.c().getSelectedFile();
        lg.a(this.a, localFile.getPath());
        this.a.a(localFile.getName());
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.nf
 * JD-Core Version:    0.6.0
 */