package com.zend.ide.cb.a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class yd extends sd
  implements TableCellRenderer
{
  private Color a = new Color(243, 242, 244);
  private Color b = new Color(212, 212, 213);

  public yd()
  {
    setBorder(BorderFactory.createLineBorder(this.a, 1));
    setBackground(this.b);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return super.getTableCellRendererComponent(paramJTable, null, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    setText(paramObject.toString());
    setBackground(paramBoolean1 ? this.a : this.b);
    return this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.yd
 * JD-Core Version:    0.6.0
 */