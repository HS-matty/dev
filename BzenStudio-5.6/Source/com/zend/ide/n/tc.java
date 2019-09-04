package com.zend.ide.n;

import java.awt.Component;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class tc extends DefaultTableCellRenderer
{
  final sc a;

  tc(sc paramsc)
  {
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    co localco = (co)paramObject;
    String str1 = localco.j();
    String str2 = new File(str1).getName();
    setText(str2 + ", " + (localco.b() + 1));
    setToolTipText(str1);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.tc
 * JD-Core Version:    0.6.0
 */