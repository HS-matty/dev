package com.zend.ide.p;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class bv extends DefaultListCellRenderer
{
  final bw a;

  protected bv(bw parambw)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    setText(this.a.a(paramObject, paramInt));
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bv
 * JD-Core Version:    0.6.0
 */