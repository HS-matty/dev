package com.zend.ide.db;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTextArea;

class n
  implements PropertyChangeListener
{
  final z a;

  private n(z paramz)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    String str = localFont.getFontName();
    if (str.indexOf(".") != -1)
      str = str.substring(0, str.indexOf("."));
    z.a(this.a).setFont(new Font(str, localFont.getStyle(), localFont.getSize()));
    this.a.repaint();
  }

  n(z paramz, m paramm)
  {
    this(paramz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.n
 * JD-Core Version:    0.6.0
 */