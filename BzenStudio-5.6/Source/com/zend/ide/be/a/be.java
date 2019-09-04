package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class be extends MouseInputAdapter
  implements SwingConstants
{
  final f a;

  private be(f paramf)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    JComponent localJComponent = (JComponent)paramMouseEvent.getComponent();
    f.b(this.a, f.b(localJComponent));
    f.a(this.a, paramMouseEvent.getPoint());
    f.b(this.a, ((JComponent)paramMouseEvent.getSource()).getTopLevelAncestor().getLocation());
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    f.a(this.a, null);
    f.b(this.a, null);
    f.b(this.a, null);
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    Point localPoint1 = paramMouseEvent.getPoint();
    Point localPoint2 = (Point)localPoint1.clone();
    SwingUtilities.convertPointToScreen(localPoint2, (Component)paramMouseEvent.getSource());
    double d = localPoint1.distance(f.c(this.a));
    if (d > 20.0D)
    {
      i locali = f.d(f.g(this.a));
      locali.b = true;
      if (f.c(this.a).x > locali.f.width)
        f.c(this.a).translate(-(f.c(this.a).x - locali.f.width + 30), 0);
      localPoint2.translate(-f.c(this.a).x, -f.c(this.a).y);
      locali.f.setLocation(localPoint2);
      f.a(this.a, f.g(this.a)).setLocation(localPoint2);
      f.a(this.a).a(f.g(this.a).e(), locali);
    }
  }

  be(f paramf, bi parambi)
  {
    this(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.be
 * JD-Core Version:    0.6.0
 */