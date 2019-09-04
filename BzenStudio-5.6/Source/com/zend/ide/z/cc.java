package com.zend.ide.z;

import com.zend.ide.util.ct;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class cc extends MouseMotionAdapter
{
  final bi a;

  public cc(bi parambi)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    JTableHeader localJTableHeader = (JTableHeader)paramMouseEvent.getSource();
    JTable localJTable = localJTableHeader.getTable();
    TableColumnModel localTableColumnModel = localJTable.getColumnModel();
    int i = localTableColumnModel.getColumnIndexAtX(paramMouseEvent.getX());
    if (i == 3)
      localJTableHeader.setToolTipText(ct.a(905));
    else if (i == 4)
      localJTableHeader.setToolTipText(ct.a(907));
    else
      localJTableHeader.setToolTipText("");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.cc
 * JD-Core Version:    0.6.0
 */