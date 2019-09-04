package com.zend.ide.p.d;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComboBox;

class c extends FocusAdapter
{
  final bw a;

  c(bw parambw)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    if (paramFocusEvent.getOppositeComponent() == null)
      this.a.m.hidePopup();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.c
 * JD-Core Version:    0.6.0
 */