package com.zend.ide.p.d;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.filechooser.FileFilter;

public class ba extends DefaultListCellRenderer
{
  final bw a;

  public ba(bw parambw)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if ((paramObject != null) && ((paramObject instanceof FileFilter)))
      setText(((FileFilter)paramObject).getDescription());
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.ba
 * JD-Core Version:    0.6.0
 */