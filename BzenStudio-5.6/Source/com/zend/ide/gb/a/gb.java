package com.zend.ide.gb.a;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class gb extends DefaultCellEditor
  implements TableCellRenderer
{
  final rb a;

  gb(rb paramrb, JComboBox paramJComboBox)
  {
    super(paramJComboBox);
  }

  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Component localComponent = super.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
    boolean bool = ((Boolean)paramJTable.getValueAt(paramInt1, 0)).booleanValue();
    localComponent.setEnabled(bool);
    return localComponent;
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    return getTableCellEditorComponent(paramJTable, paramObject, paramBoolean1, paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.gb
 * JD-Core Version:    0.6.0
 */