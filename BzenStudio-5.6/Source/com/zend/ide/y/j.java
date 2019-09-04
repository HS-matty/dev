package com.zend.ide.y;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

class j
  implements PropertyChangeListener
{
  private String a;
  private int b;
  final i c;

  public j(i parami, String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Action localAction = i.a(this.c).getActionMap().get(this.a);
    i.b(i.a(this.c), localAction, (KeyStroke[])(KeyStroke[])paramPropertyChangeEvent.getNewValue(), this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.j
 * JD-Core Version:    0.6.0
 */