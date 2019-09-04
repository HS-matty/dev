package com.zend.ide.cb.a;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

class d extends MouseAdapter
{
  final pd a;

  private d(pd parampd)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  public void a(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isPopupTrigger())
    {
      Point localPoint = paramMouseEvent.getPoint();
      int i = this.a.rowAtPoint(localPoint);
      int j = this.a.columnAtPoint(localPoint);
      if ((i > -1) && (j > -1))
      {
        this.a.setRowSelectionInterval(i, i);
        this.a.setColumnSelectionInterval(j, j);
        c(paramMouseEvent);
      }
    }
    else if ((paramMouseEvent.getClickCount() > 1) && (paramMouseEvent.getID() == 502))
    {
      b(paramMouseEvent);
    }
  }

  public void b(MouseEvent paramMouseEvent)
  {
    int i = this.a.getSelectedRow();
    int j = this.a.getSelectedColumn();
    if ((i < 0) || (j < 0))
      return;
    Class localClass = this.a.getColumnClass(j);
    if ((localClass == Blob.class) || (localClass == Clob.class))
      pd.b(this.a);
    else if ((localClass == String.class) && (!this.a.isCellEditable(i, j)))
      pd.c(this.a);
  }

  public void c(MouseEvent paramMouseEvent)
  {
    int i = this.a.getSelectedRow();
    int j = this.a.getSelectedColumn();
    if ((i < 0) || (j < 0))
      return;
    if (this.a.d().equals("processTable"))
    {
      pd.d(this.a);
      pd.a(this.a, pd.j(this.a), paramMouseEvent);
      return;
    }
    Class localClass = this.a.getColumnClass(j);
    if (localClass == Blob.class)
      pd.e(this.a).setEnabled(true);
    else
      pd.e(this.a).setEnabled(false);
    if ((localClass == Blob.class) || (localClass == Clob.class))
    {
      pd.a(this.a, pd.f(this.a), paramMouseEvent);
    }
    else if ((localClass == String.class) || (Number.class.isAssignableFrom(localClass)))
    {
      pd.g(this.a);
      pd.a(this.a, pd.h(this.a), paramMouseEvent);
    }
    else if (Date.class.isAssignableFrom(localClass))
    {
      pd.i(this.a);
      pd.a(this.a, pd.k(this.a), paramMouseEvent);
    }
  }

  d(pd parampd, g paramg)
  {
    this(parampd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.d
 * JD-Core Version:    0.6.0
 */