package com.zend.ide.d;

import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class qb
  implements ActionListener
{
  final od a;
  final JTextField b;
  final kd c;

  qb(kd paramkd, od paramod, JTextField paramJTextField)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = od.j(this.c.a).showDialog(this.c.a, null);
    if (i != 0)
      return;
    File localFile = od.j(this.c.a).getSelectedFile();
    if (localFile != null)
      this.b.setText(localFile.getAbsolutePath());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.qb
 * JD-Core Version:    0.6.0
 */