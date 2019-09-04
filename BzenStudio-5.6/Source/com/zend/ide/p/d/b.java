package com.zend.ide.p.d;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class b extends FocusAdapter
{
  final bw a;

  b(bw parambw)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    if (!paramFocusEvent.isTemporary())
      bw.a(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.b
 * JD-Core Version:    0.6.0
 */