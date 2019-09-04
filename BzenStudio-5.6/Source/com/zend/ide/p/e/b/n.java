package com.zend.ide.p.e.b;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class n extends BasicProgressBarUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new n();
  }

  protected Rectangle getBox(Rectangle paramRectangle)
  {
    return super.getBox(paramRectangle);
  }

  protected int getBoxLength(int paramInt1, int paramInt2)
  {
    return super.getBoxLength(paramInt1, paramInt2);
  }

  protected int getCellSpacing()
  {
    return 3;
  }

  protected Dimension getPreferredInnerVertical()
  {
    return new Dimension(10, 146);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.n
 * JD-Core Version:    0.6.0
 */