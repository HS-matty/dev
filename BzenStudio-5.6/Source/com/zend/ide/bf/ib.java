package com.zend.ide.bf;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Hashtable;

class ib
  implements PropertyChangeListener
{
  private ib()
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
    a(bool);
    b(bool);
  }

  private void a(boolean paramBoolean)
  {
    d locald = r.b().a("HTML", "form");
    if ((locald == null) || (locald.a()))
      return;
    if (paramBoolean)
    {
      if (locald.c().indexOf("get") != -1)
        return;
      ((Hashtable)r.a(r.b()).get("HTML")).put("form", new c("form", "HTML", "create a get form", "<form action=\"${action}\" method=\"${get}\">\n${END}\n</form>", false));
    }
    else
    {
      if (locald.c().indexOf("GET") != -1)
        return;
      ((Hashtable)r.a(r.b()).get("HTML")).put("form", new c("form", "HTML", "create a get form", "<form action=\"${action}\" method=\"${GET}\">\n${END}\n</form>", false));
    }
  }

  private void b(boolean paramBoolean)
  {
    d locald = r.b().a("HTML", "formp");
    if ((locald == null) || (locald.a()))
      return;
    if (paramBoolean)
    {
      if (locald.c().indexOf("post") != -1)
        return;
      ((Hashtable)r.a(r.b()).get("HTML")).put("formp", new c("formp", "HTML", "create a post form", "<form action=\"${action}\" method=\"${post}\" enctype=\"text/plain\">\n${END}\n</form>", false));
    }
    else
    {
      if (locald.c().indexOf("POST") != -1)
        return;
      ((Hashtable)r.a(r.b()).get("HTML")).put("formp", new c("formp", "HTML", "create a post form", "<form action=\"${action}\" method=\"${POST}\" enctype=\"text/plain\">\n${END}\n</form>", false));
    }
  }

  ib(hb paramhb)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.ib
 * JD-Core Version:    0.6.0
 */