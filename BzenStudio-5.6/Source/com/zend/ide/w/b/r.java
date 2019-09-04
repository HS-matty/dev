package com.zend.ide.w.b;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class r
  implements ChangeListener
{
  private int a;
  final br b;

  public r(br parambr, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 1))
      throw new IllegalArgumentException("Unfamiliar side identification - " + paramInt);
    this.a = paramInt;
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (this.a == 0)
      br.a(this.b, paramChangeEvent);
    else
      br.b(this.b, paramChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.r
 * JD-Core Version:    0.6.0
 */