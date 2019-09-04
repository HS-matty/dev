package com.zend.ide.z;

import com.zend.ide.p.e.a.b;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class z extends DefaultTableCellRenderer
{
  com.zend.ide.p.z a = null;
  final y b;

  private z(y paramy)
  {
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    this.a = new com.zend.ide.p.z();
    this.a.setOpaque(true);
    if (paramBoolean1)
    {
      this.a.setBackground(b.d);
      this.a.setForeground(Color.white);
    }
    else
    {
      this.a.setBackground(paramJTable.getBackground());
      this.a.setForeground(paramJTable.getForeground());
    }
    String str = "";
    if ((paramObject instanceof n))
    {
      localObject = (n)paramObject;
      str = ((n)localObject).e();
    }
    else
    {
      str = (String)paramObject;
    }
    Object localObject = str;
    if (str.indexOf("/") != -1)
      localObject = str.substring(str.lastIndexOf("/") + 1);
    if (str.indexOf("\\") != -1)
      localObject = str.substring(str.lastIndexOf("\\") + 1);
    this.a.setText(" " + (String)localObject);
    this.a.setToolTipText(str);
    return (Component)this.a;
  }

  z(y paramy, be parambe)
  {
    this(paramy);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.z
 * JD-Core Version:    0.6.0
 */