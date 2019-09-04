package com.zend.ide.util;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.KeyStroke;

public class q
  implements PropertyChangeListener
{
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Object localObject1 = paramPropertyChangeEvent.getNewValue();
    KeyStroke localKeyStroke = null;
    if ((localObject1 instanceof KeyStroke))
    {
      localKeyStroke = (KeyStroke)localObject1;
    }
    else if ((localObject1 instanceof KeyStroke[]))
    {
      localObject2 = (KeyStroke[])(KeyStroke[])localObject1;
      if (localObject2.length > 0)
        for (i = 0; i < localObject2.length; i++)
        {
          if (localObject2[i] == null)
            continue;
          localKeyStroke = localObject2[i];
          break;
        }
    }
    else
    {
      return;
    }
    Object localObject2 = paramPropertyChangeEvent.getPropertyName();
    int i = ((String)localObject2).lastIndexOf('.') + 1;
    String str = "keys." + ((String)localObject2).substring(i);
    str = n.a(n.c(), str);
    o localo = n.c().a(str);
    if (localo == null)
      return;
    localo.a(localKeyStroke);
    n.c().a(new dk(paramPropertyChangeEvent.getSource(), str));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.q
 * JD-Core Version:    0.6.0
 */