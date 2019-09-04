package com.zend.ide.l;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;

class t
  implements ActionListener
{
  final bw f;

  t(bw parambw)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = true;
    File localFile = null;
    Object localObject;
    while (bool)
    {
      localObject = bw.d(this.f);
      int i = ((bp)localObject).showOpenDialog(this.f);
      if (i != 0)
        return;
      localFile = ((bp)localObject).getSelectedFile();
      bool = localFile instanceof bd;
      if (bool)
        ba.a(this.f, ct.a(1176), ct.a(94), 0);
    }
    if (localFile.isFile())
    {
      localObject = localFile.getName();
      bw.e(this.f).setText(((String)localObject).substring(0, ((String)localObject).lastIndexOf(".")));
      localFile = localFile.getParentFile();
    }
    bw.f(this.f).setText(localFile.getPath() + h.m.A(localFile).d() + bw.e(this.f).getText() + ".zpj");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.t
 * JD-Core Version:    0.6.0
 */