package com.zend.ide.d;

import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class bv
  implements ActionListener
{
  final ca a;

  bv(ca paramca)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = ca.c(this.a).showDialog(this.a, null);
    if (i != 0)
      return;
    File localFile = ca.c(this.a).getSelectedFile();
    if (localFile != null)
      ca.d(this.a).setText(localFile.getAbsolutePath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bv
 * JD-Core Version:    0.6.0
 */