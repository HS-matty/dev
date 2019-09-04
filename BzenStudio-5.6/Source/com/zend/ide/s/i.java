package com.zend.ide.s;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPanel;

class i extends FocusAdapter
{
  final dc a;

  i(dc paramdc)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    if (!db.a(this.a.b).a().a().isAncestorOf(paramFocusEvent.getOppositeComponent()))
      db.a(this.a.b).j();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.i
 * JD-Core Version:    0.6.0
 */