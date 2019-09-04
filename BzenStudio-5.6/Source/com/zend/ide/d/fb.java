package com.zend.ide.d;

import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class fb
  implements ActionListener
{
  final nb a;

  fb(nb paramnb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = nb.a(this.a).showDialog(this.a, null);
    if (i == 0)
    {
      File localFile = nb.a(this.a).getSelectedFile();
      if (localFile != null)
        nb.b(this.a).setText(localFile.getAbsolutePath());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.fb
 * JD-Core Version:    0.6.0
 */