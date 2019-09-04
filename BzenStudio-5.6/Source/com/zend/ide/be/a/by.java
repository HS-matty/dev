package com.zend.ide.be.a;

import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

class by extends JPanel
  implements MouseListener, MouseMotionListener
{
  private h a;
  private Point b;
  private Component c;
  private Component d;
  private i e;
  private i f;
  private double g;
  private int h;
  final g i;

  public by(g paramg)
  {
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void a(h paramh)
  {
    this.a = paramh;
    setCursor(h.a(paramh) ? g.c() : g.d());
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    for (int j = 0; (j < h.c(this.a).size()) && (h.c(this.a).get(j) != this); j++);
    this.c = ((Component)h.d(this.a).get(j));
    this.e = ((i)h.e(this.a).get(j));
    this.d = ((Component)h.d(this.a).get(j + 1));
    this.f = ((i)h.e(this.a).get(j + 1));
    this.g = (this.e.d + this.f.d);
    this.b = paramMouseEvent.getPoint();
    if (h.a(this.a))
      this.h = (this.c.getWidth() + this.d.getWidth());
    else
      this.h = (this.c.getHeight() + this.d.getHeight());
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    if (h.a(this.a))
      j = this.c.getWidth() + paramMouseEvent.getPoint().x - this.b.x;
    else
      j = this.c.getHeight() + paramMouseEvent.getPoint().y - this.b.y;
    int j = j < 0 ? 0 : j;
    j = j > this.h ? this.h : j;
    double d1 = j / this.h * this.g;
    this.e.d = g.b(d1);
    this.f.d = (this.g - d1);
    if (this.e.d == 0.0D)
    {
      this.e.d = (this.g - Math.rint(this.g));
      if (this.e.d == 0.0D)
        this.e.d = 0.001D;
    }
    else if (this.f.d == 0.0D)
    {
      this.f.d = (Math.rint(this.g) - this.g);
      if (this.f.d == 0.0D)
        this.f.d = 0.001D;
    }
    g.a(this.i).invalidate();
    g.a(this.i).validate();
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.by
 * JD-Core Version:    0.6.0
 */