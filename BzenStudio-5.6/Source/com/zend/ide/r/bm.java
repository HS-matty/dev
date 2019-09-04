package com.zend.ide.r;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

class bm extends DefaultListCellRenderer
{
  final ba a;

  bm(ba paramba)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    if (((f)paramObject).b().equals(""))
      setText("[empty]");
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bm
 * JD-Core Version:    0.6.0
 */