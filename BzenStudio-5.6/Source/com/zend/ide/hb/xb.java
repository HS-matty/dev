package com.zend.ide.hb;

import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.p.db;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.HashMap;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.TextAction;

class xb extends TextAction
{
  final pb a;

  public xb(pb parampb)
  {
    super(pb.h(parampb));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = (String)pb.g(this.a).getEditor().getItem();
    String str2 = pb.e(this.a).getSelectedItem().toString().trim();
    String str3 = (String)pb.b(this.a).getEditor().getItem();
    pb.g(this.a).a(str1);
    pb.a(this.a, str2, true);
    pb.b(this.a).a(str3);
    File localFile = h.m.g(str3);
    FileFilter localFileFilter = (FileFilter)pb.i(this.a).get(str2);
    if ((localFile.isFile()) && (localFileFilter != null) && (!localFileFilter.accept(localFile)))
    {
      ba.a(this.a, ct.a(1270), ct.a(94), 0);
      return;
    }
    pb.f(this.a).a(0);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.xb
 * JD-Core Version:    0.6.0
 */