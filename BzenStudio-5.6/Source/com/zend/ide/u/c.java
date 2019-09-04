package com.zend.ide.u;

import com.zend.ide.j.s;
import java.io.Serializable;

class c extends f
  implements Serializable
{
  public c(bh parambh, String paramString)
  {
    super(parambh, paramString);
    this.j = 0;
    this.j |= 1;
    this.j |= 4;
  }

  public String getParent()
  {
    return null;
  }

  public String getPath()
  {
    return c().d(super.getPath());
  }

  public boolean isAbsolute()
  {
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.c
 * JD-Core Version:    0.6.0
 */