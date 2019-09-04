package com.zend.ide.bf;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

class gb
  implements ActionListener
{
  final ba a;

  gb(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = ba.a(this.a, 1);
    int i = localbp.showDialog(this.a, ct.a(1741));
    if (i == 0)
    {
      File localFile = localbp.getSelectedFile();
      if (!localFile.exists())
      {
        JOptionPane.showMessageDialog(this.a, ct.a(1779, localFile.getName()), ct.a(1743), 0);
        return;
      }
      ba.a(this.a, localFile);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.gb
 * JD-Core Version:    0.6.0
 */