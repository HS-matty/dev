package com.zend.ide.d;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;

class dq extends FocusAdapter
{
  final bg a;

  dq(bg parambg)
  {
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    bg.b(this.a).requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dq
 * JD-Core Version:    0.6.0
 */