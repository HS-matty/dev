package com.zend.ide.z;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class gb extends DefaultTableModel
{
  final bk a;

  gb(bk parambk, Vector paramVector, int paramInt)
  {
    super(paramVector, paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return false;
  }

  public Class getColumnClass(int paramInt)
  {
    if (paramInt == 0)
      return r.class;
    if ((paramInt == 1) || (paramInt == 2))
      return Integer.class;
    if ((paramInt == 3) || (paramInt == 4))
      return Double.class;
    return super.getColumnClass(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.gb
 * JD-Core Version:    0.6.0
 */