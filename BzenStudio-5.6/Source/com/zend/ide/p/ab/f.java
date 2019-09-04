package com.zend.ide.p.ab;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class f
  implements TableModelListener
{
  final o a;

  private f(o paramo)
  {
  }

  public void tableChanged(TableModelEvent paramTableModelEvent)
  {
    if (!o.c(this.a))
    {
      o.d(this.a);
      this.a.fireTableChanged(paramTableModelEvent);
      return;
    }
    if (paramTableModelEvent.getFirstRow() == -1)
    {
      o.e(this.a);
      this.a.fireTableChanged(paramTableModelEvent);
      return;
    }
    int i = paramTableModelEvent.getColumn();
    if ((paramTableModelEvent.getFirstRow() == paramTableModelEvent.getLastRow()) && (i != -1) && (o.b(this.a, i) == 0) && (o.f(this.a) != null))
    {
      int j = o.g(this.a)[paramTableModelEvent.getFirstRow()];
      this.a.fireTableChanged(new TableModelEvent(this.a, j, j, i, paramTableModelEvent.getType()));
      return;
    }
    o.d(this.a);
    this.a.fireTableDataChanged();
  }

  f(o paramo, b paramb)
  {
    this(paramo);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.f
 * JD-Core Version:    0.6.0
 */