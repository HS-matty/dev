package com.zend.ide.p.e.b;

import com.sun.java.swing.plaf.windows.WindowsToggleButtonUI;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class h extends WindowsToggleButtonUI
{
  private static final h a = new h();

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return a;
  }

  protected void paintButtonPressed(Graphics paramGraphics, AbstractButton paramAbstractButton)
  {
    if (paramAbstractButton.isContentAreaFilled())
    {
      paramGraphics.setColor(paramGraphics.getColor().brighter());
      paramGraphics.fillRect(0, 0, paramAbstractButton.getWidth(), paramAbstractButton.getHeight());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.h
 * JD-Core Version:    0.6.0
 */