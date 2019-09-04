package com.zend.ide.z;

import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class bs extends DefaultTableCellRenderer
{
  z a = null;
  final bl b;

  private bs(bl parambl)
  {
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    this.a = new z();
    this.a.setOpaque(true);
    this.a.setUI(new bq(this.b));
    this.a.setBackground(paramJTable.getBackground());
    if ((paramObject instanceof t))
    {
      t localt = (t)paramObject;
      String str1 = bi.f(this.b.g).format(localt.d());
      String str2 = bi.f(this.b.g).format(localt.b());
      this.a.setToolTipText(ct.a(915, str1, str2));
      this.a.setText("" + localt.c());
    }
    return this.a;
  }

  bs(bl parambl, bv parambv)
  {
    this(parambl);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bs
 * JD-Core Version:    0.6.0
 */