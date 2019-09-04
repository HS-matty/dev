package com.zend.ide.db;

import com.zend.ide.j.bd;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class bb
  implements ActionListener
{
  final x a;

  bb(x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = true;
    bp localbp = x.b(this.a, 1);
    File localFile = null;
    while (bool)
    {
      int i = localbp.showOpenDialog(this.a);
      if (i != 0)
        return;
      localFile = localbp.getSelectedFile();
      bool = localFile instanceof bd;
      if (bool)
        ba.a(this.a, ct.a(1573), ct.a(94), 0);
    }
    Dimension localDimension = x.g(this.a).getPreferredSize();
    x.g(this.a).setText(localFile.getPath());
    x.g(this.a).setPreferredSize(localDimension);
    x.h(this.a);
    x.f(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.bb
 * JD-Core Version:    0.6.0
 */