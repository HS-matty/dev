package com.zend.ide.gb.a;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class ub extends DefaultTableModel
{
  final rb a;

  ub(rb paramrb, Vector paramVector, int paramInt)
  {
    super(paramVector, paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 != 1;
  }

  public Class getColumnClass(int paramInt)
  {
    if (paramInt == 0)
      return Boolean.class;
    return Object.class;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.ub
 * JD-Core Version:    0.6.0
 */