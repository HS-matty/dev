package com.zend.ide.n;

import java.awt.Cursor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingUtilities;

class mb extends MouseAdapter
  implements KeyListener, FocusListener
{
  private boolean a = false;
  private ob b = null;
  private MouseMotionListener d = new j(this, null);
  final gz c;

  mb(gz paramgz)
  {
    paramgz.addKeyListener(this);
    paramgz.a(new lc(this, null));
    paramgz.addMouseListener(this);
    paramgz.addFocusListener(this);
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    int i = gz.b() ? 4 : 2;
    if ((paramKeyEvent.getModifiers() & i) != 0)
      a(true);
    else
      a(false);
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
    a(false);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    boolean bool = gz.b() ? paramMouseEvent.isMetaDown() : paramMouseEvent.isControlDown();
    if ((bool) && (SwingUtilities.isLeftMouseButton(paramMouseEvent)))
    {
      ob localob = this.c.a().a(this.c, this.c.getCaretPosition());
      if (localob != null)
        localob.d();
    }
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isControlDown())
      a(true);
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    a(false);
  }

  private void a(boolean paramBoolean)
  {
    if (this.a == paramBoolean)
      return;
    a(null);
    this.a = paramBoolean;
    if (paramBoolean)
      this.c.addMouseMotionListener(this.d);
    else
      this.c.removeMouseMotionListener(this.d);
  }

  private void a(ob paramob)
  {
    if (paramob == this.b)
      return;
    Cursor localCursor;
    if (paramob == null)
    {
      if (this.c.isEditable())
        localCursor = Cursor.getPredefinedCursor(2);
      else
        localCursor = Cursor.getPredefinedCursor(0);
    }
    else
      localCursor = Cursor.getPredefinedCursor(12);
    this.c.setCursor(localCursor);
    this.b = paramob;
    this.c.repaint();
  }

  static ob a(mb parammb)
  {
    return parammb.b;
  }

  static boolean b(mb parammb)
  {
    return parammb.a;
  }

  static void a(mb parammb, ob paramob)
  {
    parammb.a(paramob);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.mb
 * JD-Core Version:    0.6.0
 */