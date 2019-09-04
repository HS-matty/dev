package com.zend.ide.gb.a;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class vb extends DefaultTableModel
{
  final sb a;

  vb(sb paramsb, Vector paramVector, int paramInt)
  {
    super(paramVector, paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 == 2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.vb
 * JD-Core Version:    0.6.0
 */