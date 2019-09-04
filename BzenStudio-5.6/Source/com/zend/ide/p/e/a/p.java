package com.zend.ide.p.e.a;

import com.zend.ide.p.bj;
import com.zend.ide.p.e.d;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalLabelUI;

public class p extends MetalLabelUI
{
  private static p a = new p();

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
 * Qualified Name:     com.zend.ide.p.e.a.p
 * JD-Core Version:    0.6.0
 */