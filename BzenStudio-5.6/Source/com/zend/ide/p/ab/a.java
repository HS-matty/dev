package com.zend.ide.p.ab;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

class a extends MouseAdapter
{
  final o a;

  private a(o paramo)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    o.a(this.a, false);
    JTableHeader localJTableHeader = (JTableHeader)paramMouseEvent.getSource();
    TableColumnModel localTableColumnModel = localJTableHeader.getColumnModel();
    int i = localTableColumnModel.getColumnIndexAtX(paramMouseEvent.getX());
    int j = localTableColumnModel.getColumn(i).getModelIndex();
    if (j != -1)
    {
      int k = o.b(this.a, j);
      if (!paramMouseEvent.isControlDown())
        o.e(this.a);
      k += (paramMouseEvent.isShiftDown() ? -1 : 1);
      k = (k + 4) % 3 - 1;
      this.a.a(j, k);
      o.h(this.a).b();
      o.h(this.a).a();
    }
    o.a(this.a, true);
  }

  a(o paramo, b paramb)
  {
    this(paramo);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.a
 * JD-Core Version:    0.6.0
 */