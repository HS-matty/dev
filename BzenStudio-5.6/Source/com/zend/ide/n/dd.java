package com.zend.ide.n;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dd
  implements PropertyChangeListener
{
  final gz a;

  private dd(gz paramgz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    String str = localFont.getFontName();
    if (str.indexOf(".plain") != -1)
      str = str.substring(0, str.indexOf(".plain"));
    this.a.setFont(new Font(str, localFont.getStyle(), localFont.getSize()));
    this.a.setSize(this.a.getPreferredScrollableViewportSize());
    this.a.repaint();
  }

  dd(gz paramgz, cy paramcy)
  {
    this(paramgz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dd
 * JD-Core Version:    0.6.0
 */