package com.zend.ide.c;

import com.zend.ide.util.cv;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class d extends JComponent
  implements b
{
  private final int a = 5;
  private Image b = cv.b("debuggerbug16.gif").getImage();
  private int c = 0;
  private int d = this.b.getWidth(this);
  private int e = this.b.getHeight(this);
  private boolean f = false;

  public void b()
  {
    Rectangle localRectangle = getVisibleRect();
    if (this.c + this.d + 5 >= localRectangle.x + localRectangle.width)
      this.c = 0;
    else
      this.c += 5;
  }

  public void d()
  {
    this.f = true;
    repaint();
  }

  public void c()
  {
    this.f = false;
    repaint();
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    if (this.f)
    {
      int i = (getVisibleRect().height - this.e) / 2;
      paramGraphics.drawImage(this.b, this.c, i, this.d, this.e, this);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.c.d
 * JD-Core Version:    0.6.0
 */