package com.zend.ide.w;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTextPane;

class n
  implements PropertyChangeListener
{
  final bb a;

  private n(bb parambb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    String str = localFont.getFontName();
    if (str.indexOf(".") != -1)
      str = str.substring(0, str.indexOf("."));
    bb.a(this.a).setFont(new Font(str, localFont.getStyle(), localFont.getSize()));
    this.a.repaint();
  }

  n(bb parambb, m paramm)
  {
    this(parambb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.n
 * JD-Core Version:    0.6.0
 */