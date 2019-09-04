package com.zend.ide.util.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class e
  implements MouseListener
{
  MouseListener a;

  public e(MouseListener paramMouseListener)
  {
    this.a = paramMouseListener;
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    try
    {
      this.a.mouseClicked(paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    try
    {
      this.a.mousePressed(paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    try
    {
      this.a.mouseReleased(paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    try
    {
      this.a.mouseEntered(paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    try
    {
      this.a.mouseExited(paramMouseEvent);
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.a.e
 * JD-Core Version:    0.6.0
 */