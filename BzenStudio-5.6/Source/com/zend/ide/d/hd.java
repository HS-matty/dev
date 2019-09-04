package com.zend.ide.d;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableModel;

class hd extends DefaultCellEditor
{
  final JCheckBox a;
  final ud b;

  hd(ud paramud, JCheckBox paramJCheckBox1, JCheckBox paramJCheckBox2)
  {
    super(paramJCheckBox1);
  }

  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ud.a(this.b, paramInt1);
    String str = (String)this.b.getModel().getValueAt(paramInt1, paramInt2);
    this.a.setText(str);
    this.a.setSelected(true);
    return getComponent();
  }

  public Object getCellEditorValue()
  {
    return this.a.getText();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.hd
 * JD-Core Version:    0.6.0
 */