package com.zend.ide.p.ab;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class e
  implements TableCellRenderer
{
  private TableCellRenderer a;
  final o b;

  public e(o paramo, TableCellRenderer paramTableCellRenderer)
  {
    this.a = paramTableCellRenderer;
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    Component localComponent = this.a.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if ((localComponent instanceof JLabel))
    {
      JLabel localJLabel = (JLabel)localComponent;
      localJLabel.setHorizontalTextPosition(2);
      int i = paramJTable.convertColumnIndexToModel(paramInt2);
      localJLabel.setIcon(o.a(this.b, i, localJLabel.getFont().getSize()));
    }
    return localComponent;
  }

  static TableCellRenderer a(e parame)
  {
    return parame.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.e
 * JD-Core Version:    0.6.0
 */