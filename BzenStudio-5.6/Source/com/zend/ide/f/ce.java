package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.bd;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.util.cz;

class ce extends br
  implements bd
{
  private String e;

  public ce(String paramString1, String paramString2, m paramm, g paramg)
  {
    super(paramString1, paramg, paramm);
    this.e = paramString2;
  }

  public String c()
  {
    return this.e;
  }

  public int compareTo(Object paramObject)
  {
    int i = super.compareTo(paramObject);
    if (i != 0)
      return i;
    if (!(paramObject instanceof ce))
      return -1;
    ce localce = (ce)paramObject;
    return a().compareTo(localce.a());
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ce
 * JD-Core Version:    0.6.0
 */