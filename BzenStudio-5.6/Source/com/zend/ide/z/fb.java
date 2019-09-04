package com.zend.ide.z;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class fb extends DefaultTableModel
{
  final y a;

  fb(y paramy, Vector paramVector, int paramInt)
  {
    super(paramVector, paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.fb
 * JD-Core Version:    0.6.0
 */