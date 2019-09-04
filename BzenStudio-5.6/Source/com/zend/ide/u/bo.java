package com.zend.ide.u;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.GrayFilter;
import javax.swing.Icon;
import javax.swing.ImageIcon;

class bo
  implements Icon
{
  private f a;
  private Icon b;
  private ImageIcon c = null;

  bo(f paramf, Icon paramIcon)
  {
    this.b = paramIcon;
    this.a = paramf;
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    if (((bh)this.a.c()).i())
    {
      this.b.paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
      this.c = null;
    }
    else
    {
      if (this.c == null)
        this.c = new ImageIcon(GrayFilter.createDisabledImage(((ImageIcon)this.b).getImage()));
      this.c.paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
    }
  }

  public int getIconWidth()
  {
    return this.b.getIconWidth();
  }

  public int getIconHeight()
  {
    return this.b.getIconHeight();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bo
 * JD-Core Version:    0.6.0
 */