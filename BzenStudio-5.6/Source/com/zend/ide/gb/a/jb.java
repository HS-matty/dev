package com.zend.ide.gb.a;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;

class jb extends JCheckBox
  implements TableCellRenderer
{
  private static Integer a = new Integer(0);

  jb()
  {
    setHorizontalAlignment(0);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    a(paramJTable, paramObject, paramBoolean1, paramInt1, paramInt2);
    return this;
  }

  private void a(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
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
    SwingUtilities.invokeLater(new fb(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.jb
 * JD-Core Version:    0.6.0
 */