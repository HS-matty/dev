package com.zend.ide.bf;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

class eb
  implements ActionListener
{
  final ba a;

  eb(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int[] arrayOfInt = ba.d(this.a).getSelectedRows();
    if (arrayOfInt.length == 0)
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1750), ct.a(1746), 0);
      return;
    }
    bp localbp = ba.a(this.a, 0);
    int i = localbp.a(this.a, ct.a(1739));
    if (i == 0)
    {
      File localFile = localbp.getSelectedFile();
      ba.a(this.a, localFile, false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.eb
 * JD-Core Version:    0.6.0
 */