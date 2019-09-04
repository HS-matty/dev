package com.zend.ide.cb.a;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class ad extends JCheckBox
  implements TableCellRenderer
{
  private static Integer a = new Integer(0);

  public ad()
  {
    setHorizontalAlignment(0);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return pd.v().getTableCellRendererComponent(paramJTable, null, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (paramBoolean1)
    {
      setForeground(paramJTable.getSelectionForeground());
      super.setBackground(paramJTable.getSelectionBackground());
    }
    else
    {
      setForeground(paramJTable.getForeground());
      setBackground(paramJTable.getBackground());
    }
    if ((paramObject instanceof Integer))
    {
      if (paramObject.equals(a))
        paramObject = Boolean.FALSE;
      else
        paramObject = Boolean.TRUE;
    }
    else if ((paramObject instanceof String))
    {
      Integer localInteger = Integer.getInteger((String)paramObject);
      if ((localInteger == null) || (localInteger.equals(a)))
        paramObject = Boolean.FALSE;
      else
        paramObject = Boolean.TRUE;
    }
    setSelected(((Boolean)paramObject).booleanValue());
    setToolTipText(paramObject.toString());
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ad
 * JD-Core Version:    0.6.0
 */