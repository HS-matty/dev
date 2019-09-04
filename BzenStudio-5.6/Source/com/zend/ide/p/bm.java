package com.zend.ide.p;

import com.zend.ide.p.ab.n;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class bm extends JTable
{
  public bm()
  {
  }

  public bm(TableModel paramTableModel)
  {
    super(paramTableModel);
  }

  public void b()
  {
    if (getSelectedRow() != -1)
    {
      Rectangle localRectangle = getCellRect(getSelectedRow(), 0, true);
      scrollRectToVisible(localRectangle);
    }
  }

  public void a()
  {
    if (getAutoResizeMode() != 0)
      setAutoResizeMode(0);
    n.a(this);
  }

  public int a(Object paramObject, int paramInt)
  {
    for (int i = 0; i < getRowCount(); i++)
      if (paramObject.equals(getValueAt(i, paramInt)))
        return i;
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bm
 * JD-Core Version:    0.6.0
 */