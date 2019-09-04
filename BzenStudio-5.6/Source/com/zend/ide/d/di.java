package com.zend.ide.d;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class di
  implements ListSelectionListener
{
  final dm a;

  private di(dm paramdm)
  {
  }

  public void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    this.a.k();
  }

  di(dm paramdm, dh paramdh)
  {
    this(paramdm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.di
 * JD-Core Version:    0.6.0
 */