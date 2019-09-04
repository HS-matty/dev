package com.zend.ide.db;

import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JTextField;

class j
  implements ActionListener
{
  final x a;

  j(x paramx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = x.b(this.a, 0);
    int i = 1;
    while (i != 0)
    {
      int j = localbp.showOpenDialog(this.a);
      if (j != 0)
      {
        x.f(this.a).setText("");
        return;
      }
      x.a(this.a, localbp.c());
      x.e(this.a).setSelectedItem(x.d(this.a));
      File localFile = localbp.getSelectedFile();
      Dimension localDimension = x.f(this.a).getPreferredSize();
      x.f(this.a).setText(localFile.getPath());
      x.f(this.a).setPreferredSize(localDimension);
      if (x.a(this.a, localFile.getAbsolutePath()))
      {
        i = 0;
        x.f(this.a);
      }
      else
      {
        ba.a(this.a, ct.a(1409), ct.a(94), 0);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.j
 * JD-Core Version:    0.6.0
 */