package com.zend.ide.z;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class e
  implements ListSelectionListener
{
  final y a;

  e(y paramy)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    if (paramListSelectionEvent.getValueIsAdjusting())
      return;
    ListSelectionModel localListSelectionModel = (ListSelectionModel)paramListSelectionEvent.getSource();
    if (!localListSelectionModel.isSelectionEmpty())
      this.a.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.e
 * JD-Core Version:    0.6.0
 */