package com.zend.ide.n;

import com.zend.ide.util.ca;
import javax.swing.event.CaretEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.Caret;

class gq extends CaretEvent
  implements ChangeListener, ca
{
  private gx a;
  private int b;
  private int c;
  final gx d;

  public gq(gx paramgx1, gx paramgx2)
  {
    super(paramgx2);
    this.a = paramgx2;
  }

  public final int getDot()
  {
    return this.b;
  }

  public final int getMark()
  {
    return this.c;
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (this.d.E())
      return;
    Caret localCaret = this.a.getCaret();
    this.b = localCaret.getDot();
    this.c = localCaret.getMark();
    gx.a(this.a, this);
  }

  public void e()
  {
  }

  public void f()
  {
    stateChanged(null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gq
 * JD-Core Version:    0.6.0
 */