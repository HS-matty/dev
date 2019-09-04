package com.zend.ide.p.e.a;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalTreeUI;
import javax.swing.tree.TreePath;

public class j extends MetalTreeUI
{
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new j();
  }

  protected void paintVerticalLine(Graphics paramGraphics, JComponent paramJComponent, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt3 - paramInt2;
    int j = paramInt2;
    while (i > 3)
    {
      paramGraphics.drawLine(paramInt1, j, paramInt1, j + 1);
      j += 3;
      i = paramInt3 - j;
    }
    paramGraphics.drawLine(paramInt1, j, paramInt1, paramInt3);
  }

  protected void paintHorizontalLine(Graphics paramGraphics, JComponent paramJComponent, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt3 - paramInt2;
    int j = paramInt2;
    while (i > 3)
    {
      paramGraphics.drawLine(j, paramInt1, j + 1, paramInt1);
      j += 3;
      i = paramInt3 - j;
    }
    paramGraphics.drawLine(j, paramInt1, paramInt3, paramInt1);
  }

  protected boolean shouldPaintExpandControl(TreePath paramTreePath, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = super.shouldPaintExpandControl(paramTreePath, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
    bool = !paramBoolean3;
    return bool;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.j
 * JD-Core Version:    0.6.0
 */