package com.zend.ide.desktop;

import com.zend.ide.be.d;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

class bc
  implements PropertyChangeListener
{
  final cj a;

  private bc(cj paramcj)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Font localFont = (Font)paramPropertyChangeEvent.getNewValue();
    d locald = cj.a(this.a).c();
    locald.d().setFont(new Font(localFont.getFontName(), localFont.getStyle(), localFont.getSize()));
    JRootPane localJRootPane = locald.b().getRootPane();
    localJRootPane.setFont(new Font(localFont.getFontName(), localFont.getStyle(), localFont.getSize()));
    localJRootPane.repaint();
  }

  bc(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bc
 * JD-Core Version:    0.6.0
 */