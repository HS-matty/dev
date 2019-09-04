package com.zend.ide.a;

import java.util.Hashtable;

abstract class c
  implements e
{
  protected Hashtable a = new Hashtable();

  protected void a(a parama, Object paramObject)
  {
    parama.a(paramObject);
    this.a.put(parama.j(), parama);
  }

  public a b(Object paramObject)
  {
    return (a)this.a.get(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.a.c
 * JD-Core Version:    0.6.0
 */