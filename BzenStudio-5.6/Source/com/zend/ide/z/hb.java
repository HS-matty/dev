package com.zend.ide.z;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class hb extends DefaultTableModel
{
  final bl a;

  hb(bl parambl, Vector paramVector, int paramInt)
  {
    super(paramVector, paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return false;
  }

  public Class getColumnClass(int paramInt)
  {
    if (paramInt == 1)
      return t.class;
    return r.class;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.hb
 * JD-Core Version:    0.6.0
 */