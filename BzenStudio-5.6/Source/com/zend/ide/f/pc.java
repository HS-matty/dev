package com.zend.ide.f;

import com.zend.ide.util.cm;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class pc
  implements PropertyChangeListener
{
  private pc()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    c localc = b.a("editing.manualUrl");
    cm localcm = (cm)localc.c();
    String str = (localcm.b()) && (localcm.toString().startsWith("file")) ? ".html" : ".php";
    qc.b = localcm.toString();
    qc.a = str;
  }

  pc(fb paramfb)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.pc
 * JD-Core Version:    0.6.0
 */