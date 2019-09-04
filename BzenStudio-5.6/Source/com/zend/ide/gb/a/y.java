package com.zend.ide.gb.a;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class y
  implements ListDataListener
{
  final rb a;

  y(rb paramrb)
  {
  }

  public void intervalAdded(ListDataEvent paramListDataEvent)
  {
    if (rb.u().getModel().getSize() == 1)
    {
      this.a.remove(rb.b(this.a));
      this.a.add(rb.c(this.a), "Center");
      this.a.validate();
    }
    this.a.b();
  }

  public void intervalRemoved(ListDataEvent paramListDataEvent)
  {
    if (rb.u().getModel().getSize() == 0)
    {
      this.a.remove(rb.c(this.a));
      this.a.add(rb.b(this.a), "Center");
      this.a.validate();
      rb.b(this.a).repaint();
      rb.a(null);
      this.a.b();
      return;
    }
    int i = paramListDataEvent.getIndex0();
    if (i >= rb.u().getModel().getSize())
      i = rb.u().getModel().getSize() - 1;
    rb.u().setSelectedIndex(i);
    SwingUtilities.invokeLater(new z(this));
  }

  public void contentsChanged(ListDataEvent paramListDataEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.y
 * JD-Core Version:    0.6.0
 */