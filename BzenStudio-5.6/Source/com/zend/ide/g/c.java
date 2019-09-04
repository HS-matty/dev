package com.zend.ide.g;

import com.zend.ide.n.gx;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class c
  implements PropertyChangeListener
{
  final n a;

  private c(n paramn)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    String str = localFont.getFontName();
    if (str.indexOf(".") != -1)
      str = str.substring(0, str.indexOf("."));
    this.a.a.setFont(new Font(str, localFont.getStyle(), localFont.getSize()));
  }

  c(n paramn, a parama)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.c
 * JD-Core Version:    0.6.0
 */