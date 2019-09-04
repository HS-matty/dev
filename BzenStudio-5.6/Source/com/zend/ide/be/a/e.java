package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.SwingConstants;

class e
  implements Icon, SwingConstants
{
  private Icon a;
  private Icon b;
  private int c;
  private int d;
  private int e;

  public e(Icon paramIcon1, Icon paramIcon2, int paramInt)
  {
    this(paramIcon1, paramIcon2, paramInt, 0, 0);
  }

  public e(Icon paramIcon1, Icon paramIcon2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramIcon1;
    this.b = paramIcon2;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i = getIconWidth();
    int j = getIconHeight();
    Icon localIcon1;
    Icon localIcon2;
    if ((this.c == 2) || (this.c == 4))
    {
      if (this.c == 2)
      {
        localIcon1 = this.a;
        localIcon2 = this.b;
      }
      else
      {
        localIcon1 = this.b;
        localIcon2 = this.a;
      }
      a(paramComponent, paramGraphics, localIcon1, paramInt1, paramInt2, i, j, 2, this.e);
      a(paramComponent, paramGraphics, localIcon2, paramInt1 + localIcon1.getIconWidth(), paramInt2, i, j, 2, this.e);
    }
    else if ((this.c == 1) || (this.c == 3))
    {
      if (this.c == 1)
      {
        localIcon1 = this.a;
        localIcon2 = this.b;
      }
      else
      {
        localIcon1 = this.b;
        localIcon2 = this.a;
      }
      a(paramComponent, paramGraphics, localIcon1, paramInt1, paramInt2, i, j, this.d, 1);
      a(paramComponent, paramGraphics, localIcon2, paramInt1, paramInt2 + localIcon1.getIconHeight(), i, j, this.d, 1);
    }
    else
    {
      a(paramComponent, paramGraphics, this.a, paramInt1, paramInt2, i, j, this.d, this.e);
      a(paramComponent, paramGraphics, this.b, paramInt1, paramInt2, i, j, this.d, this.e);
    }
  }

  private static void a(Component paramComponent, Graphics paramGraphics, Icon paramIcon, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramIcon != null)
    {
      int i;
      switch (paramInt5)
      {
      case 2:
        i = paramInt1;
        break;
      case 4:
        i = paramInt1 + paramInt3 - paramIcon.getIconWidth();
        break;
      default:
        i = paramInt1 + (paramInt3 - paramIcon.getIconWidth()) / 2;
      }
      int j;
      switch (paramInt6)
      {
      case 1:
        j = paramInt2;
        break;
      case 3:
        j = paramInt2 + paramInt4 - paramIcon.getIconHeight();
        break;
      default:
        j = paramInt2 + (paramInt4 - paramIcon.getIconHeight()) / 2;
      }
      paramIcon.paintIcon(paramComponent, paramGraphics, i, j);
    }
  }

  public int getIconWidth()
  {
    int i = this.a != null ? this.a.getIconWidth() : 0;
    int j = this.b != null ? this.b.getIconWidth() : 0;
    if ((this.c == 2) || (this.c == 4))
      return i + j;
    return Math.max(i, j);
  }

  public int getIconHeight()
  {
    int i = this.a != null ? this.a.getIconHeight() : 0;
    int j = this.b != null ? this.b.getIconHeight() : 0;
    if ((this.c == 1) || (this.c == 3))
      return i + j;
    return Math.max(i, j);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.e
 * JD-Core Version:    0.6.0
 */