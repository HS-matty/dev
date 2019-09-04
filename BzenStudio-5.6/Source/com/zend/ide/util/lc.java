package com.zend.ide.util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.dnd.Autoscroll;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;

public class lc
  implements Autoscroll
{
  Component a;
  Insets b;
  Insets c;
  final eo d;

  public lc(eo parameo, Component paramComponent, Insets paramInsets)
  {
    this(parameo, paramComponent, paramInsets, paramInsets);
  }

  public lc(eo parameo, Component paramComponent, Insets paramInsets1, Insets paramInsets2)
  {
    this.a = paramComponent;
    this.b = paramInsets1;
    this.c = paramInsets2;
  }

  public void autoscroll(Point paramPoint)
  {
    JViewport localJViewport = a();
    if (localJViewport == null)
      return;
    Point localPoint = localJViewport.getViewPosition();
    int i = localJViewport.getExtentSize().height;
    int j = localJViewport.getExtentSize().width;
    if (paramPoint.y - localPoint.y < this.b.top)
      localJViewport.setViewPosition(new Point(localPoint.x, Math.max(localPoint.y - this.c.top, 0)));
    else if (localPoint.y + i - paramPoint.y < this.b.bottom)
      localJViewport.setViewPosition(new Point(localPoint.x, Math.min(localPoint.y + this.c.bottom, this.a.getHeight() - i)));
    else if (paramPoint.x - localPoint.x < this.b.left)
      localJViewport.setViewPosition(new Point(Math.max(localPoint.x - this.c.left, 0), localPoint.y));
    else if (localPoint.x + j - paramPoint.x < this.b.right)
      localJViewport.setViewPosition(new Point(Math.min(localPoint.x + this.c.right, this.a.getWidth() - j), localPoint.y));
  }

  public Insets getAutoscrollInsets()
  {
    int i = this.a.getHeight();
    int j = this.a.getWidth();
    return new Insets(i, j, i, j);
  }

  JViewport a()
  {
    return (JViewport)SwingUtilities.getAncestorOfClass(JViewport.class, this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.lc
 * JD-Core Version:    0.6.0
 */