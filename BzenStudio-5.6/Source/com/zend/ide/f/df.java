package com.zend.ide.f;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class df extends DefaultTableModel
{
  final da a;

  df(da paramda, Vector paramVector1, Vector paramVector2)
  {
    super(paramVector1, paramVector2);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.df
 * JD-Core Version:    0.6.0
 */