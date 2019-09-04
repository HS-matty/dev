package com.zend.ide.d;

import com.zend.ide.util.en;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class d extends ComponentAdapter
{
  final bg a;

  d(bg parambg)
  {
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
    bg.a(this.a).getSelectedComponent().requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.d
 * JD-Core Version:    0.6.0
 */