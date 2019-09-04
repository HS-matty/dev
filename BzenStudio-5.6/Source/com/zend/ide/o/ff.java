package com.zend.ide.o;

import com.zend.ide.util.cv;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JComponent;

class ff extends JComponent
{
  private Image a = cv.a("connecting.gif");
  final fi b;

  private ff(fi paramfi)
  {
  }

  public void paint(Graphics paramGraphics)
  {
    super.paint(paramGraphics);
    Rectangle localRectangle = getVisibleRect();
    int i = this.a.getWidth(fi.b(this.b));
    int j = this.a.getHeight(fi.b(this.b));
    paramGraphics.drawImage(this.a, localRectangle.x, localRectangle.y, i, j, fi.b(this.b));
  }

  ff(fi paramfi, be parambe)
  {
    this(paramfi);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ff
 * JD-Core Version:    0.6.0
 */