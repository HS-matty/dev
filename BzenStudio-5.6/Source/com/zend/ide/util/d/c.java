package com.zend.ide.util.d;

import java.util.Enumeration;
import java.util.NoSuchElementException;

class c
  implements Enumeration
{
  public boolean hasMoreElements()
  {
    return false;
  }

  public Object nextElement()
  {
    throw new NoSuchElementException("Hashtable Enumerator");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.d.c
 * JD-Core Version:    0.6.0
 */