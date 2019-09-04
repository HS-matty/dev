package com.zend.ide.w.b;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class bd
  implements ChangeListener
{
  private boolean a;
  private int b;
  final z c;

  public bd(z paramz, int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("Unfamiliar type - " + paramInt);
    this.b = paramInt;
    a(true);
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (!this.a)
      return;
    if (this.b == 0)
      z.e(this.c);
    else
      z.f(this.c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bd
 * JD-Core Version:    0.6.0
 */