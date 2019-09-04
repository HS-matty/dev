package com.zend.ide.cb.a;

import com.zend.ide.bd.c;
import com.zend.ide.util.ct;
import com.zend.ide.util.kc.g;
import java.awt.Component;
import java.sql.Time;
import java.sql.Timestamp;
import javax.swing.AbstractCellEditor;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellEditor;

class pe extends AbstractCellEditor
  implements TableCellEditor
{
  protected g a = new g(this, c.b().h(), ct.a(635), false, 0);
  private java.util.Date b;
  protected sd c;
  private Class d;
  final pd e;

  public pe(pd parampd)
  {
    this.a.setAlwaysOnTop(true);
    this.c = new vd(parampd);
  }

  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if ((paramObject != null) && ((paramObject instanceof java.util.Date)))
      this.b = ((java.util.Date)paramObject);
    else
      this.b = null;
    java.util.Date localDate = this.b != null ? this.b : new java.util.Date();
    if (pd.y() > 0)
    {
      if (pd.z() != null)
      {
        pd.a(pd.z().getLocation());
        pd.z().dispose();
      }
      pd.a(0);
      pd.a(this.a);
    }
    this.a.a(localDate);
    this.a.pack();
    if (pd.A() == null)
      this.a.setLocationRelativeTo(c.b().h());
    else
      this.a.setLocation(pd.A());
    SwingUtilities.invokeLater(new me(this));
    this.d = paramJTable.getColumnClass(paramInt2);
    this.c.setValue(this.b);
    return this.c;
  }

  public Object getCellEditorValue()
  {
    java.util.Date localDate = this.a.a();
    if (localDate == null)
      return this.b;
    if (this.b != null)
      this.d = this.b.getClass();
    if (this.d == Timestamp.class)
      return new Timestamp(localDate.getTime());
    if (this.d == Time.class)
      return new Time(localDate.getTime());
    if (this.d == java.sql.Date.class)
      return new java.sql.Date(localDate.getTime());
    if (this.d == java.util.Date.class)
      return localDate;
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.pe
 * JD-Core Version:    0.6.0
 */