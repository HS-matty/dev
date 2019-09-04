package com.zend.ide.w.a;

import com.zend.ide.j.bd;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class i
  implements ActionListener
{
  final br a;

  i(br parambr)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (br.a(this.a) == null)
      br.a(this.a, new bp(false));
    br.a(this.a).setFileSelectionMode(1);
    boolean bool = true;
    File localFile = null;
    while (bool)
    {
      int i = br.a(this.a).showOpenDialog(this.a);
      if (i != 0)
        return;
      localFile = br.a(this.a).getSelectedFile();
      bool = localFile instanceof bd;
      if (bool)
        ba.a(this.a, ct.a(1789), ct.a(94), 0);
    }
    br.b(this.a).setText(localFile.getPath());
    br.a(this.a, localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.i
 * JD-Core Version:    0.6.0
 */