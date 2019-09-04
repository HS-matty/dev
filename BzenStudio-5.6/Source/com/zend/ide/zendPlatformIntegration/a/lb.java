package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.ct;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

class lb extends AbstractTableModel
{
  private static final long serialVersionUID = 1L;
  private String[] a = { " ", ct.a(1916) };
  private Vector b = new Vector();
  final ib c;

  lb(ib paramib)
  {
  }

  public int getColumnCount()
  {
    return this.a.length;
  }

  public int getRowCount()
  {
    return this.b.size();
  }

  public String getColumnName(int paramInt)
  {
    return this.a[paramInt];
  }

  public Object getValueAt(int paramInt1, int paramInt2)
  {
    return ((Object[])(Object[])this.b.get(paramInt1))[paramInt2];
  }

  public Class getColumnClass(int paramInt)
  {
    return getValueAt(0, paramInt).getClass();
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 <= 0;
  }

  public void setValueAt(Object paramObject, int paramInt1, int paramInt2)
  {
    ((Object[])(Object[])this.b.get(paramInt1))[paramInt2] = paramObject;
    fireTableCellUpdated(paramInt1, paramInt2);
  }

  public void a(Object[] paramArrayOfObject)
  {
    this.b.add(paramArrayOfObject);
  }

  public void a()
  {
    this.b.removeAllElements();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.lb
 * JD-Core Version:    0.6.0
 */