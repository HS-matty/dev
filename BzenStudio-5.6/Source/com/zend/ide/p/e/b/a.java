package com.zend.ide.p.e.b;

import com.sun.java.swing.plaf.windows.WindowsLabelUI;
import com.zend.ide.p.bj;
import com.zend.ide.p.e.d;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.ComponentUI;

public class a extends WindowsLabelUI
{
  private static a a = new a();

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return a;
  }

  protected void paintEnabledText(JLabel paramJLabel, Graphics paramGraphics, String paramString, int paramInt1, int paramInt2)
  {
    d.a((bj)paramJLabel, paramGraphics, paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.a
 * JD-Core Version:    0.6.0
 */