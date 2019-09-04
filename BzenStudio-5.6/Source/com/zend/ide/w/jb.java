package com.zend.ide.w;

import com.zend.ide.h.be;
import java.awt.Container;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class jb
  implements PropertyChangeListener
{
  final fb a;

  private jb(fb paramfb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    if (bool == this.a.f)
      return;
    if (!bool)
    {
      Font localFont = fb.c(this.a).getFont();
      fb.c(this.a).setFont(localFont.deriveFont(0));
      this.a.c.a();
    }
    else
    {
      fb.a(this.a, null);
    }
    this.a.f = bool;
    this.a.b.getParent().repaint();
  }

  jb(fb paramfb, gb paramgb)
  {
    this(paramfb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.jb
 * JD-Core Version:    0.6.0
 */