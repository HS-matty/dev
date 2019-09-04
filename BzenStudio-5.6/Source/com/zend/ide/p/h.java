package com.zend.ide.p;

import com.zend.ide.i.n;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class h extends WindowAdapter
{
  private boolean a = false;
  final n b;
  final ba c;

  h(ba paramba, n paramn)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    this.b.d();
    this.c.setValue(null);
  }

  public void windowGainedFocus(WindowEvent paramWindowEvent)
  {
    if (!this.a)
    {
      this.c.selectInitialValue();
      this.a = true;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.h
 * JD-Core Version:    0.6.0
 */