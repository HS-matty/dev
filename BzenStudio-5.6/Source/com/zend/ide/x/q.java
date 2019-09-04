package com.zend.ide.x;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class q
  implements PropertyChangeListener
{
  private q()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    if (bool)
      j.b("method", new l[] { j.a("get"), j.a("post") });
    else
      j.b("method", new l[] { j.a("GET"), j.a("POST") });
    h[] arrayOfh = { j.b("accept-charset"), j.b("action"), j.b("class"), j.b("dir"), j.b("enctype"), j.b("id"), j.b("lang"), j.b("method"), j.b("onclick"), j.b("ondblclick"), j.b("onkeydown"), j.b("onkeypress"), j.b("onkeyup"), j.b("onmousedown"), j.b("onmousemove"), j.b("onmouseout"), j.b("onreset"), j.b("onsubmit"), j.b("style"), j.b("target"), j.b("title") };
    j.b("form", arrayOfh);
  }

  q(p paramp)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.q
 * JD-Core Version:    0.6.0
 */