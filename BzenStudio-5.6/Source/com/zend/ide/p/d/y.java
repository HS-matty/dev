package com.zend.ide.p.d;

import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JList;

class y extends DefaultListCellRenderer
{
  o a = new o(this.b);
  final bw b;

  y(bw parambw)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (paramObject == null)
    {
      setText("");
      return this;
    }
    File localFile = (File)paramObject;
    setText(this.b.getFileChooser().getName(localFile));
    Icon localIcon = this.b.getFileChooser().getIcon(localFile);
    this.a.a = localIcon;
    this.a.b = bw.g(this.b).a(paramInt);
    setIcon(this.a);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.y
 * JD-Core Version:    0.6.0
 */