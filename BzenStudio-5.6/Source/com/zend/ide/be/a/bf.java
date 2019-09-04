package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class bf extends MouseInputAdapter
  implements SwingConstants
{
  private Point a;
  private JComponent b = new u(this);
  private boolean c = false;
  private Dimension d;
  private int e;
  private int f;
  final f g;

  public bf(f paramf)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    JComponent localJComponent = (JComponent)paramMouseEvent.getComponent();
    f.b(this.g, f.b(localJComponent));
    f.a(this.g, paramMouseEvent.getPoint());
    this.a = SwingUtilities.convertPoint((Component)paramMouseEvent.getSource(), f.c(this.g), f.a(this.g, f.g(this.g)));
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    f.a(this.g, null);
    this.a = null;
    f.b(this.g, null);
    if (this.c)
    {
      i locali = f.d(f.g(this.g));
      locali.c = this.e;
      locali.e = this.f;
      locali.b = false;
      locali.f.setSize(this.d);
      f.d(this.g).remove(this.b);
      f.a(this.g).a(f.g(this.g).e(), locali);
      f.d(this.g).validate();
    }
    this.d = null;
    this.c = false;
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    Point localPoint1 = paramMouseEvent.getPoint();
    Point localPoint2 = (Point)localPoint1.clone();
    SwingUtilities.convertPointToScreen(localPoint2, (Component)paramMouseEvent.getSource());
    if (f.h(this.g) != null)
      localPoint2.translate(f.h(this.g).x, f.h(this.g).y);
    if (a(localPoint2))
      return;
    JWindow localJWindow = f.a(this.g, f.g(this.g));
    if (this.a == null)
      this.a = SwingUtilities.convertPoint((Component)paramMouseEvent.getSource(), f.c(this.g), localJWindow);
    localPoint2.translate(-this.a.x, -this.a.y);
    if (!this.c)
    {
      localJWindow.setLocation(localPoint2);
      return;
    }
    this.c = false;
    f.d(this.g).remove(this.b);
    f.d(this.g).validate();
    localJWindow.setBounds(localPoint2.x, localPoint2.y, this.d.width, this.d.height);
    localJWindow.validate();
  }

  private boolean a(Point paramPoint)
  {
    Point localPoint = (Point)paramPoint.clone();
    SwingUtilities.convertPointFromScreen(localPoint, f.e(this.g));
    if (f.e(this.g).contains(localPoint))
    {
      int i = -1;
      if (localPoint.x < 70)
        i = 3;
      else if (localPoint.y < 70)
        i = 0;
      else if (localPoint.y > f.e(this.g).getHeight() - 70)
        i = 1;
      else if (localPoint.x > f.e(this.g).getWidth() - 70)
        i = 2;
      if (i != -1)
      {
        if (this.c)
          return true;
        a(i, -1);
        return true;
      }
    }
    this.e = 0;
    this.f = -1;
    return false;
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    JWindow localJWindow = f.a(this.g, f.g(this.g));
    i locali = f.d(f.g(this.g));
    locali.c = paramInt1;
    locali.e = paramInt2;
    locali.b = false;
    this.d = localJWindow.getSize();
    f.d(this.g).add(this.b, locali);
    f.d(this.g).validate();
    Point localPoint = this.b.getLocationOnScreen();
    localJWindow.setBounds(localPoint.x, localPoint.y, this.b.getWidth(), this.b.getHeight());
    localJWindow.validate();
    this.c = true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bf
 * JD-Core Version:    0.6.0
 */