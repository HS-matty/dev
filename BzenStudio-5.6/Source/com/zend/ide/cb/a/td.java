package com.zend.ide.cb.a;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class td extends sd
  implements TableCellRenderer
{
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject != null)
      paramObject = "[Blob]";
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.td
 * JD-Core Version:    0.6.0
 */