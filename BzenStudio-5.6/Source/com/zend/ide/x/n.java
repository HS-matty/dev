package com.zend.ide.x;

import com.zend.ide.b.e;
import com.zend.ide.util.cz;

class n extends e
  implements o
{
  public n(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }

  public void a(cz paramcz)
  {
    ((i)paramcz).a(this);
  }

  public int compareTo(Object paramObject)
  {
    if (!(paramObject instanceof n))
      return -1;
    n localn = (n)paramObject;
    int i = a().compareToIgnoreCase(localn.a());
    if (i != 0)
      return i;
    return b().compareToIgnoreCase(localn.b());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.n
 * JD-Core Version:    0.6.0
 */