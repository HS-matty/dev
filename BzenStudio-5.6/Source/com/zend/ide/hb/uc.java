package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.j.h;
import com.zend.ide.r.p;
import com.zend.ide.util.cv;
import java.awt.Component;
import java.io.File;
import java.util.HashMap;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

class uc extends DefaultListCellRenderer
{
  private HashMap a = new HashMap();
  final yc b;

  public uc(yc paramyc)
  {
    this.a.put("php_file", cv.b("classbrowser/phpfiledata.gif"));
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    File localFile = h.m.g(((d)paramObject).a());
    setIcon(p.e().a(localFile));
    String str = localFile.getName();
    if (localFile.getParentFile() != null)
      str = str + " (" + localFile.getParentFile().getPath() + ")";
    setText(str);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.uc
 * JD-Core Version:    0.6.0
 */