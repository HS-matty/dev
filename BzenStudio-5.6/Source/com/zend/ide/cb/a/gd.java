package com.zend.ide.cb.a;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

class gd extends JPanel
{
  final v a;

  gd(v paramv, LayoutManager paramLayoutManager)
  {
    super(paramLayoutManager);
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if (this.a != null)
      this.a.a(paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.gd
 * JD-Core Version:    0.6.0
 */