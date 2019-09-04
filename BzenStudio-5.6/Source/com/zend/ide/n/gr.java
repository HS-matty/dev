package com.zend.ide.n;

import javax.swing.event.CaretEvent;

final class gr extends CaretEvent
{
  private CaretEvent a;

  gr(Object paramObject)
  {
    super(paramObject);
  }

  private void a(CaretEvent paramCaretEvent)
  {
    this.a = paramCaretEvent;
  }

  public int getDot()
  {
    return this.a.getDot();
  }

  public int getMark()
  {
    return this.a.getMark();
  }

  static void a(gr paramgr, CaretEvent paramCaretEvent)
  {
    paramgr.a(paramCaretEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gr
 * JD-Core Version:    0.6.0
 */