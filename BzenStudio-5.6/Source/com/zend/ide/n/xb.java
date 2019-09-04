package com.zend.ide.n;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class xb
  implements el
{
  private static final el a = new bq();
  private ArrayList b = new ArrayList();

  public String a(MouseEvent paramMouseEvent)
  {
    if (this.b.size() == 0)
      return a.a(paramMouseEvent);
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      el localel = (el)localIterator.next();
      String str = localel.a(paramMouseEvent);
      if ((str != null) && (str.length() != 0))
        return str;
    }
    return "";
  }

  public void a(el paramel)
  {
    this.b.add(paramel);
  }

  public void b(el paramel)
  {
    this.b.remove(paramel);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.xb
 * JD-Core Version:    0.6.0
 */