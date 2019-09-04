package com.zend.ide.n;

import com.zend.ide.n.a.m;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class rb
  implements TableModelListener
{
  final sc a;

  private rb(sc paramsc)
  {
  }

  public void tableChanged(TableModelEvent paramTableModelEvent)
  {
    int i = paramTableModelEvent.getFirstRow();
    int j = paramTableModelEvent.getColumn();
    if ((j == 1) && (i != -1))
    {
      Object localObject = sc.b(this.a).getValueAt(i, j);
      co localco1 = (co)sc.b(this.a).getValueAt(i, 0);
      co localco2 = (co)sc.c(this.a).a(localco1.j(), localco1.b());
      if (localco2 != null)
      {
        localco2.b((String)localObject);
        it localit = sc.a(this.a).a(localco2);
        localit.a((String)localObject);
      }
    }
  }

  rb(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.rb
 * JD-Core Version:    0.6.0
 */