package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.r;
import java.awt.Component;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class dm extends DefaultTableCellRenderer
{
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    r localr = (r)paramObject;
    String str1 = localr.f().c();
    String str2 = new File(str1).getName();
    setText(str2 + ", " + (localr.f().b() + 1));
    setToolTipText(str1);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dm
 * JD-Core Version:    0.6.0
 */