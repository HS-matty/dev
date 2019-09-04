package com.zend.ide.util;

import com.zend.ide.util.e.c;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class bt extends bs
  implements FocusListener, MouseListener, KeyListener
{
  private JPopupMenu e;
  private c f;
  private ArrayList g = new ArrayList();

  public bt(bn parambn)
  {
    super(parambn);
    f();
  }

  private void f()
  {
    JComponent localJComponent = this.c.c();
    a(localJComponent);
  }

  public void i()
  {
    this.f = b(this.c.c());
  }

  public void a(Component paramComponent)
  {
    paramComponent.addFocusListener(this);
    paramComponent.addMouseListener(this);
    paramComponent.addKeyListener(this);
  }

  protected c b(Component paramComponent)
  {
    return new com.zend.ide.util.e.a(paramComponent);
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    b();
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    d();
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
  }

  public boolean g()
  {
    boolean bool = false;
    if (this.e != null)
      bool = this.e.isShowing();
    return bool;
  }

  protected void a(JPopupMenu paramJPopupMenu, Map paramMap)
  {
  }

  protected boolean a(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isPopupTrigger())
    {
      h();
      Map localMap = this.c.q().c(this.c.a(paramMouseEvent.getX(), paramMouseEvent.getY()));
      if (!localMap.isEmpty())
      {
        this.e = cn.e().a(localMap);
        Point localPoint = a(paramMouseEvent, this.e);
        a(this.e, localMap);
        if (!this.c.c().isShowing())
          return false;
        SwingUtilities.invokeLater(new sb(this, paramMouseEvent, localPoint));
        return true;
      }
    }
    return false;
  }

  private void h()
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
      ((bl)localIterator.next()).b();
  }

  private static Point a(MouseEvent paramMouseEvent, JPopupMenu paramJPopupMenu)
  {
    Dimension localDimension = paramJPopupMenu.getPreferredSize();
    Point localPoint1 = new Point(paramMouseEvent.getX(), paramMouseEvent.getY());
    SwingUtilities.convertPointToScreen(localPoint1, paramMouseEvent.getComponent());
    Rectangle localRectangle = a(localPoint1);
    int i = (int)localPoint1.getX();
    int j = (int)localPoint1.getY();
    if (i + localDimension.getWidth() > localRectangle.x + localRectangle.width)
    {
      int k = i - (int)localDimension.getWidth();
      Point localPoint2 = new Point(k, j);
      SwingUtilities.convertPointFromScreen(localPoint2, paramMouseEvent.getComponent());
      return localPoint2;
    }
    return paramMouseEvent.getPoint();
  }

  private static Rectangle a(Point paramPoint)
  {
    GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] arrayOfGraphicsDevice = localGraphicsEnvironment.getScreenDevices();
    for (int i = 0; i < arrayOfGraphicsDevice.length; i++)
    {
      GraphicsDevice localGraphicsDevice = arrayOfGraphicsDevice[i];
      Rectangle localRectangle = localGraphicsDevice.getDefaultConfiguration().getBounds();
      if (localRectangle.contains(paramPoint))
        return localRectangle;
    }
    return new Rectangle();
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    if (i == 27)
    {
      if (g())
        this.e.setVisible(false);
      return;
    }
    if ((paramKeyEvent.getModifiers() == 0) && (i == 112))
    {
      Component localComponent = (paramKeyEvent.getSource() instanceof JComponent) ? (JComponent)paramKeyEvent.getSource() : null;
      if (localComponent == null)
        return;
      if ((!com.zend.ide.bc.a.a()) && (com.zend.ide.bc.a.a(localComponent)))
        com.zend.ide.bc.a.a(new ActionEvent(paramKeyEvent.getSource(), paramKeyEvent.getID(), "" + paramKeyEvent.getKeyCode(), paramKeyEvent.getWhen(), paramKeyEvent.getModifiers()));
    }
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
  }

  public void a(bl parambl)
  {
    this.g.add(parambl);
  }

  public void b(bl parambl)
  {
    this.g.remove(parambl);
  }

  static JPopupMenu a(bt parambt)
  {
    return parambt.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bt
 * JD-Core Version:    0.6.0
 */