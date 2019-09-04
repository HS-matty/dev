package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class ib
  implements ActionListener
{
  final bp a;
  final mb b;

  ib(mb parammb, bp parambp)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.b.getSelectedItem().equals(this.b.d))
    {
      int i = this.b.f.b().showOpenDialog(this.b.f);
      if (i == 0)
      {
        File localFile = this.b.f.b().getSelectedFile();
        bp.a(this.b.f, localFile.getPath());
        this.b.a(localFile.getName());
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.ib
 * JD-Core Version:    0.6.0
 */