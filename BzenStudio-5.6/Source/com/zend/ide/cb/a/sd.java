package com.zend.ide.cb.a;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class sd extends DefaultTableCellRenderer
{
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return pd.v().getTableCellRendererComponent(paramJTable, null, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    JLabel localJLabel = (JLabel)super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    TableColumn localTableColumn = paramJTable.getColumnModel().getColumn(paramInt2);
    if (localTableColumn.getPreferredWidth() <= localJLabel.getPreferredSize().width)
    {
      String str = pd.b(paramObject.toString());
      setToolTipText(str);
    }
    else
    {
      setToolTipText(null);
    }
    return localJLabel;
  }

  public void setValue(Object paramObject)
  {
    super.setValue(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.sd
 * JD-Core Version:    0.6.0
 */