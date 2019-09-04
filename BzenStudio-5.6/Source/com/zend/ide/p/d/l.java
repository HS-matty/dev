package com.zend.ide.p.d;

import javax.swing.SwingUtilities;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class l
  implements ListDataListener
{
  final bw a;

  l(bw parambw)
  {
  }

  public void contentsChanged(ListDataEvent paramListDataEvent)
  {
  }

  public void intervalAdded(ListDataEvent paramListDataEvent)
  {
    if (paramListDataEvent.getType() == 1)
      SwingUtilities.invokeLater(new db(this, paramListDataEvent));
  }

  public void intervalRemoved(ListDataEvent paramListDataEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.l
 * JD-Core Version:    0.6.0
 */