package com.zend.ide.util.f;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;

class b extends FocusAdapter
{
  final JTextPane a;
  final p b;

  b(p paramp, JTextPane paramJTextPane)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    this.a.setFocusable(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.b
 * JD-Core Version:    0.6.0
 */