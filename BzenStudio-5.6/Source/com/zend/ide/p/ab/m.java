package com.zend.ide.p.ab;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

class m
  implements Icon
{
  private boolean a;
  private int b;
  private int c;

  public m(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramBoolean;
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    Color localColor = paramComponent == null ? Color.GRAY : paramComponent.getBackground();
    int i = (int)(this.b / 2 * Math.pow(0.8D, this.c));
    int j = this.a ? i : -i;
    paramInt2 = paramInt2 + 5 * this.b / 6 + (this.a ? -j : 0);
    int k = this.a ? 1 : -1;
    paramGraphics.translate(paramInt1, paramInt2);
    paramGraphics.setColor(localColor.darker());
    paramGraphics.drawLine(i / 2, j, 0, 0);
    paramGraphics.drawLine(i / 2, j + k, 0, k);
    paramGraphics.setColor(localColor.brighter());
    paramGraphics.drawLine(i / 2, j, i, 0);
    paramGraphics.drawLine(i / 2, j + k, i, k);
    if (this.a)
      paramGraphics.setColor(localColor.darker().darker());
    else
      paramGraphics.setColor(localColor.brighter().brighter());
    paramGraphics.drawLine(i, 0, 0, 0);
    paramGraphics.setColor(localColor);
    paramGraphics.translate(-paramInt1, -paramInt2);
  }

  public int getIconWidth()
  {
    return this.b;
  }

  public int getIconHeight()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.m
 * JD-Core Version:    0.6.0
 */