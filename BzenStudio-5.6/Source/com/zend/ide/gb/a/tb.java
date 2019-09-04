package com.zend.ide.gb.a;

import java.awt.Component;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

class tb extends JTextField
  implements TableCellRenderer
{
  final sb a;

  tb(sb paramsb)
  {
    setBorder(BorderFactory.createEmptyBorder());
  }

  public Component a(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    String str = paramObject.toString();
    setToolTipText(str);
    int i = str.lastIndexOf(File.separator);
    if (i + 1 != str.length())
      setText(str.substring(i + 1));
    else
      setText(str);
    return this;
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    return a(paramJTable, paramObject, paramBoolean1, paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.tb
 * JD-Core Version:    0.6.0
 */