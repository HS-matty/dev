package com.zend.ide.y;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

class o
  implements PropertyChangeListener
{
  private String a;
  final n b;

  public o(n paramn, String paramString)
  {
    this.a = paramString;
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    n.b(n.a(this.b), this.a);
    KeyStroke[] arrayOfKeyStroke = (KeyStroke[])(KeyStroke[])paramPropertyChangeEvent.getNewValue();
    for (int i = 0; i < arrayOfKeyStroke.length; i++)
      n.a(this.b).put(arrayOfKeyStroke[i], this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.o
 * JD-Core Version:    0.6.0
 */