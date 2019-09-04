package com.zend.ide.z;

import com.zend.ide.p.e.a.b;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

class bt extends DefaultTableCellRenderer
{
  private bt()
  {
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    setOpaque(true);
    setBorder(new EmptyBorder(1, 1, 1, 1));
    if (paramBoolean1)
    {
      setBackground(b.d);
      setForeground(Color.white);
    }
    else
    {
      setBackground(paramJTable.getBackground());
      setForeground(paramJTable.getForeground());
    }
    if ((paramObject instanceof r))
    {
      r localr = (r)paramObject;
      setToolTipText(ct.a(916, localr.k(), localr.h()));
      setText(" " + localr.k());
    }
    else
    {
      setText(paramObject.toString());
    }
    return this;
  }

  bt(bv parambv)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bt
 * JD-Core Version:    0.6.0
 */