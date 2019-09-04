package com.zend.ide.gb.a;

import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.p.d.bp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class o
  implements ActionListener
{
  final pb a;

  o(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = pb.a(this.a, 2);
    int i = localbp.showOpenDialog(this.a);
    if (i != 0)
      return;
    File localFile = localbp.getSelectedFile();
    if (localFile.isFile())
    {
      String str = localFile.getName();
      pb.c(this.a).setText(str.substring(0, str.lastIndexOf(".")));
      localFile = localFile.getParentFile();
    }
    pb.d(this.a).setText(localFile.getPath() + h.m.A(localFile).d() + pb.c(this.a).getText() + ".wsdl");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.o
 * JD-Core Version:    0.6.0
 */