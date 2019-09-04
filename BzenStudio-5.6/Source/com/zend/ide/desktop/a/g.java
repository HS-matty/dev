package com.zend.ide.desktop.a;

import com.zend.ide.o.fk;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

class g
  implements PropertyChangeListener
{
  final b a;

  private g(b paramb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if ((!b.a(this.a).e()) || (b.b(this.a)))
    {
      String str = paramPropertyChangeEvent.getNewValue().toString();
      Object localObject = paramPropertyChangeEvent.getNewValue();
      if ((localObject instanceof File))
        str = ((File)localObject).getPath();
      b.c(this.a).g(str);
    }
  }

  g(b paramb, c paramc)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.g
 * JD-Core Version:    0.6.0
 */