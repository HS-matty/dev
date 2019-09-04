package com.zend.ide.gb.a;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class i
  implements ListDataListener
{
  final pb a;

  i(pb parampb)
  {
  }

  public void intervalAdded(ListDataEvent paramListDataEvent)
  {
  }

  public void intervalRemoved(ListDataEvent paramListDataEvent)
  {
    int i = paramListDataEvent.getIndex0();
    if (pb.c(this.a).getModel().getSize() == 0)
    {
      SwingUtilities.invokeLater(new j(this));
      return;
    }
    if (i >= pb.c(this.a).getModel().getSize())
      i = pb.c(this.a).getModel().getSize() - 1;
    pb.c(this.a).setSelectedIndex(i);
    pb.c(this.a).updateUI();
  }

  public void contentsChanged(ListDataEvent paramListDataEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.i
 * JD-Core Version:    0.6.0
 */