package com.zend.ide.p.d;

import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JList;

public class z extends DefaultListCellRenderer
{
  final bw a;

  protected z(bw parambw)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    File localFile = (File)paramObject;
    String str = this.a.getFileChooser().getName(localFile);
    setText(str);
    Icon localIcon = this.a.getFileChooser().getIcon(localFile);
    setIcon(localIcon);
    if (paramBoolean1)
      this.a.br = (localIcon.getIconWidth() + 4);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.z
 * JD-Core Version:    0.6.0
 */