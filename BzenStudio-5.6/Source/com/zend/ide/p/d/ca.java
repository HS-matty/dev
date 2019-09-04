package com.zend.ide.p.d;

import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class ca extends DefaultTableCellRenderer
{
  JFileChooser a;
  DateFormat b;
  final bw c;

  ca(bw parambw, JFileChooser paramJFileChooser)
  {
    this.a = paramJFileChooser;
    this.b = DateFormat.getDateTimeInstance(3, 3, paramJFileChooser.getLocale());
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if ((paramInt2 == 1) || (paramInt2 == 4))
      setHorizontalAlignment(11);
    else
      setHorizontalAlignment(10);
    if ((paramInt2 == 0) && (paramJTable.isRowSelected(paramInt1)) && (paramJTable.isFocusOwner()))
    {
      super.setForeground(paramJTable.getSelectionForeground());
      super.setBackground(paramJTable.getSelectionBackground());
    }
    else
    {
      super.setForeground(paramJTable.getForeground());
      super.setBackground(paramJTable.getBackground());
    }
    setFont(paramJTable.getFont());
    setValue(paramObject);
    return this;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, Math.min(paramInt3, getPreferredSize().width + 4), paramInt4);
  }

  public void setValue(Object paramObject)
  {
    setIcon(null);
    if ((paramObject instanceof File))
    {
      File localFile = (File)paramObject;
      String str = this.a.getName(localFile);
      setText(str);
      Icon localIcon = this.a.getIcon(localFile);
      setIcon(localIcon);
    }
    else if ((paramObject instanceof Date))
    {
      setText(paramObject == null ? "" : this.b.format((Date)paramObject));
    }
    else
    {
      super.setValue(paramObject);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.ca
 * JD-Core Version:    0.6.0
 */