package com.zend.ide.u;

import com.zend.ide.util.cv;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JComponent;

class cc extends JComponent
{
  private Image a = cv.a("connecting.gif");
  final cd b;

  cc(cd paramcd)
  {
  }

  public void paint(Graphics paramGraphics)
  {
    super.paint(paramGraphics);
    Rectangle localRectangle = getVisibleRect();
    int i = this.a.getWidth(cd.a(this.b));
    int j = this.a.getHeight(cd.a(this.b));
    paramGraphics.drawImage(this.a, localRectangle.x, localRectangle.y, i, j, cd.a(this.b));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.cc
 * JD-Core Version:    0.6.0
 */