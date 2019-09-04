package com.zend.ide.n;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class uc extends DefaultTableModel
{
  final sc a;

  uc(sc paramsc, Vector paramVector1, Vector paramVector2)
  {
    super(paramVector1, paramVector2);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 == 1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.uc
 * JD-Core Version:    0.6.0
 */