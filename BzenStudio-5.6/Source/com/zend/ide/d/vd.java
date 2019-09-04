package com.zend.ide.d;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

class vd extends DefaultTableCellRenderer
{
  final ud a;

  vd(ud paramud)
  {
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    Component localComponent = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    ud.c(this.a).setBackground(localComponent.getBackground());
    ud.c(this.a).setForeground(localComponent.getForeground());
    ud.c(this.a).setSelected(paramInt1 == ud.b(this.a));
    String str = (String)this.a.getModel().getValueAt(paramInt1, paramInt2);
    ud.c(this.a).setText(str);
    return ud.c(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.vd
 * JD-Core Version:    0.6.0
 */