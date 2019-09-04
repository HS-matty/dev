package com.zend.ide.p.ab;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class g
  implements ListSelectionListener
{
  private JTable a;
  final o b;

  public g(o paramo, JTable paramJTable)
  {
    this.a = paramJTable;
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if ((!paramListSelectionEvent.getValueIsAdjusting()) && (o.i(this.b)))
      a();
  }

  public void a()
  {
    o.a(this.b, this.a.getSelectedRows());
    if (o.c(this.b))
      for (int i = 0; i < o.j(this.b).length; i++)
        o.j(this.b)[i] = d.a(o.k(this.b)[o.j(this.b)[i]]);
  }

  public void b()
  {
    if (this.a == null)
      return;
    ListSelectionModel localListSelectionModel = this.a.getSelectionModel();
    if (o.j(this.b) != null)
    {
      d[] arrayOfd = o.k(this.b) == null ? o.l(this.b) : o.k(this.b);
      for (int i = 0; i < o.j(this.b).length; i++)
        for (int j = 0; j < arrayOfd.length; j++)
        {
          if (d.a(arrayOfd[j]) != o.j(this.b)[i])
            continue;
          localListSelectionModel.addSelectionInterval(j, j);
          break;
        }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.g
 * JD-Core Version:    0.6.0
 */