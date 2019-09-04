package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class bh extends MouseInputAdapter
  implements SwingConstants
{
  int a = 16;
  int b;
  int c;
  int d;
  int e;
  Rectangle f;
  int g;
  final int h = 0;
  private boolean i = false;
  final bt j;

  private bh(bt parambt)
  {
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    this.j.setCursor(Cursor.getPredefinedCursor(0));
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    Insets localInsets = this.j.getInsets();
    Point localPoint = new Point(paramMouseEvent.getX(), paramMouseEvent.getY());
    if (localPoint.x <= localInsets.left)
    {
      if (localPoint.y < this.a + localInsets.top)
        this.j.setCursor(Cursor.getPredefinedCursor(6));
      else if (localPoint.y > this.j.getHeight() - this.a - localInsets.bottom)
        this.j.setCursor(Cursor.getPredefinedCursor(4));
      else
        this.j.setCursor(Cursor.getPredefinedCursor(10));
    }
    else if (localPoint.x >= this.j.getWidth() - localInsets.right)
    {
      if (localPoint.y < this.a + localInsets.top)
        this.j.setCursor(Cursor.getPredefinedCursor(7));
      else if (localPoint.y > this.j.getHeight() - this.a - localInsets.bottom)
        this.j.setCursor(Cursor.getPredefinedCursor(5));
      else
        this.j.setCursor(Cursor.getPredefinedCursor(11));
    }
    else if (localPoint.y <= localInsets.top)
    {
      if (localPoint.x < this.a + localInsets.left)
        this.j.setCursor(Cursor.getPredefinedCursor(6));
      else if (localPoint.x > this.j.getWidth() - this.a - localInsets.right)
        this.j.setCursor(Cursor.getPredefinedCursor(7));
      else
        this.j.setCursor(Cursor.getPredefinedCursor(8));
    }
    else if (localPoint.y >= this.j.getHeight() - localInsets.bottom)
    {
      if (localPoint.x < this.a + localInsets.left)
        this.j.setCursor(Cursor.getPredefinedCursor(4));
      else if (localPoint.x > this.j.getWidth() - this.a - localInsets.right)
        this.j.setCursor(Cursor.getPredefinedCursor(5));
      else
        this.j.setCursor(Cursor.getPredefinedCursor(9));
    }
    else
      this.j.setCursor(Cursor.getPredefinedCursor(0));
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    Point localPoint1 = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(localPoint1, (Component)paramMouseEvent.getSource());
    this.d = paramMouseEvent.getX();
    this.e = paramMouseEvent.getY();
    this.b = localPoint1.x;
    this.c = localPoint1.y;
    this.f = this.j.getBounds();
    this.g = 0;
    Insets localInsets = this.j.getInsets();
    Point localPoint2 = new Point(this.d, this.e);
    if (localPoint2.x <= localInsets.left)
    {
      if (localPoint2.y < this.a + localInsets.top)
        this.g = 8;
      else if (localPoint2.y > this.j.getHeight() - this.a - localInsets.bottom)
        this.g = 6;
      else
        this.g = 7;
    }
    else if (localPoint2.x >= this.j.getWidth() - localInsets.right)
    {
      if (localPoint2.y < this.a + localInsets.top)
        this.g = 2;
      else if (localPoint2.y > this.j.getHeight() - this.a - localInsets.bottom)
        this.g = 4;
      else
        this.g = 3;
    }
    else if (localPoint2.y <= localInsets.top)
    {
      if (localPoint2.x < this.a + localInsets.left)
        this.g = 8;
      else if (localPoint2.x > this.j.getWidth() - this.a - localInsets.right)
        this.g = 2;
      else
        this.g = 1;
    }
    else if (localPoint2.y >= this.j.getHeight() - localInsets.bottom)
    {
      if (localPoint2.x < this.a + localInsets.left)
        this.g = 6;
      else if (localPoint2.x > this.j.getWidth() - this.a - localInsets.right)
        this.g = 4;
      else
        this.g = 5;
    }
    else
    {
      this.i = true;
      return;
    }
    Cursor localCursor = Cursor.getPredefinedCursor(0);
    switch (this.g)
    {
    case 5:
      localCursor = Cursor.getPredefinedCursor(9);
      break;
    case 1:
      localCursor = Cursor.getPredefinedCursor(8);
      break;
    case 7:
      localCursor = Cursor.getPredefinedCursor(10);
      break;
    case 3:
      localCursor = Cursor.getPredefinedCursor(11);
      break;
    case 4:
      localCursor = Cursor.getPredefinedCursor(5);
      break;
    case 6:
      localCursor = Cursor.getPredefinedCursor(4);
      break;
    case 8:
      localCursor = Cursor.getPredefinedCursor(6);
      break;
    case 2:
      localCursor = Cursor.getPredefinedCursor(7);
    }
    this.j.getGlassPane().setVisible(true);
    this.j.getGlassPane().setCursor(localCursor);
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    if (this.f == null)
      return;
    Point localPoint = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(localPoint, (Component)paramMouseEvent.getSource());
    int k = this.b - localPoint.x;
    int m = this.c - localPoint.y;
    Dimension localDimension1 = this.j.getMinimumSize();
    Dimension localDimension2 = this.j.getMaximumSize();
    int n = this.j.getX();
    int i1 = this.j.getY();
    int i2;
    int i3;
    switch (this.g)
    {
    case 0:
      return;
    case 1:
      if (this.f.height + m < localDimension1.height)
        m = -(this.f.height - localDimension1.height);
      else if (this.f.height + m > localDimension2.height)
        m = localDimension2.height - this.f.height;
      if (this.f.y - m < 0)
        m = this.f.y;
      n = this.f.x;
      i1 = this.f.y - m;
      i2 = this.f.width;
      i3 = this.f.height + m;
      break;
    case 2:
      if (this.f.height + m < localDimension1.height)
        m = -(this.f.height - localDimension1.height);
      else if (this.f.height + m > localDimension2.height)
        m = localDimension2.height - this.f.height;
      if (this.f.y - m < 0)
        m = this.f.y;
      if (this.f.width - k < localDimension1.width)
        k = this.f.width - localDimension1.width;
      else if (this.f.width - k > localDimension2.width)
        k = -(localDimension2.width - this.f.width);
      n = this.f.x;
      i1 = this.f.y - m;
      i2 = this.f.width - k;
      i3 = this.f.height + m;
      break;
    case 3:
      if (this.f.width - k < localDimension1.width)
        k = this.f.width - localDimension1.width;
      else if (this.f.width - k > localDimension2.width)
        k = -(localDimension2.width - this.f.width);
      i2 = this.f.width - k;
      i3 = this.f.height;
      break;
    case 4:
      if (this.f.width - k < localDimension1.width)
        k = this.f.width - localDimension1.width;
      else if (this.f.width - k > localDimension2.width)
        k = -(localDimension2.width - this.f.width);
      if (this.f.height - m < localDimension1.height)
        m = this.f.height - localDimension1.height;
      else if (this.f.height - m > localDimension2.height)
        m = -(localDimension2.height - this.f.height);
      i2 = this.f.width - k;
      i3 = this.f.height - m;
      break;
    case 5:
      if (this.f.height - m < localDimension1.height)
        m = this.f.height - localDimension1.height;
      else if (this.f.height - m > localDimension2.height)
        m = -(localDimension2.height - this.f.height);
      i2 = this.f.width;
      i3 = this.f.height - m;
      break;
    case 6:
      if (this.f.height - m < localDimension1.height)
        m = this.f.height - localDimension1.height;
      else if (this.f.height - m > localDimension2.height)
        m = -(localDimension2.height - this.f.height);
      if (this.f.width + k < localDimension1.width)
        k = -(this.f.width - localDimension1.width);
      else if (this.f.width + k > localDimension2.width)
        k = localDimension2.width - this.f.width;
      n = this.f.x - k;
      i1 = this.f.y;
      i2 = this.f.width + k;
      i3 = this.f.height - m;
      break;
    case 7:
      if (this.f.width + k < localDimension1.width)
        k = -(this.f.width - localDimension1.width);
      else if (this.f.width + k > localDimension2.width)
        k = localDimension2.width - this.f.width;
      n = this.f.x - k;
      i1 = this.f.y;
      i2 = this.f.width + k;
      i3 = this.f.height;
      break;
    case 8:
      if (this.f.width + k < localDimension1.width)
        k = -(this.f.width - localDimension1.width);
      else if (this.f.width + k > localDimension2.width)
        k = localDimension2.width - this.f.width;
      if (this.f.height + m < localDimension1.height)
        m = -(this.f.height - localDimension1.height);
      else if (this.f.height + m > localDimension2.height)
        m = localDimension2.height - this.f.height;
      if (this.f.y - m < 0)
        m = this.f.y;
      n = this.f.x - k;
      i1 = this.f.y - m;
      i2 = this.f.width + k;
      i3 = this.f.height + m;
      break;
    default:
      return;
    }
    this.j.setBounds(n, i1, i2, i3);
    this.j.validate();
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.i)
    {
      this.i = false;
      return;
    }
    this.j.getGlassPane().setCursor(Cursor.getPredefinedCursor(0));
    this.j.getGlassPane().setVisible(false);
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = null;
    this.g = 0;
    this.j.validate();
  }

  bh(bt parambt, n paramn)
  {
    this(parambt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bh
 * JD-Core Version:    0.6.0
 */