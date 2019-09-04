package com.zend.ide.hb;

import com.zend.ide.j.h;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.db;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ComboBoxEditor;

class i
  implements ActionListener
{
  final pb a;

  i(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    pb.a(this.a).setFileSelectionMode(2);
    pb.a(this.a).setDialogTitle(ct.a(169));
    String str = (String)pb.b(this.a).getEditor().getItem();
    if ((str != null) && (!str.equals("")))
      pb.a(this.a).setCurrentDirectory(h.m.g(str).getParentFile());
    pb.a(this.a).showDialog(this.a, null);
    File localFile = pb.a(this.a).getSelectedFile();
    if (localFile != null)
      this.a.a(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.i
 * JD-Core Version:    0.6.0
 */