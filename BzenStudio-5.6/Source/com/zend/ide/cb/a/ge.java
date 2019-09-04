package com.zend.ide.cb.a;

import javax.swing.SpinnerModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ge
  implements ChangeListener
{
  final hd a;

  ge(hd paramhd)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    Integer localInteger = (Integer)((SpinnerModel)paramChangeEvent.getSource()).getValue();
    this.a.j.a(localInteger);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ge
 * JD-Core Version:    0.6.0
 */