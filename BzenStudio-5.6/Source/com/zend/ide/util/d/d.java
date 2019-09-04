package com.zend.ide.util.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

class d
  implements Iterator
{
  public boolean hasNext()
  {
    return false;
  }

  public Object next()
  {
    throw new NoSuchElementException("Hashtable Iterator");
  }

  public void remove()
  {
    throw new IllegalStateException("Hashtable Iterator");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.d
 * JD-Core Version:    0.6.0
 */