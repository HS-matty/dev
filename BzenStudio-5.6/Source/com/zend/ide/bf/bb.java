package com.zend.ide.bf;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class bb extends DefaultTableModel
{
  final ba a;

  bb(ba paramba, Vector paramVector1, Vector paramVector2)
  {
    super(paramVector1, paramVector2);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.bb
 * JD-Core Version:    0.6.0
 */