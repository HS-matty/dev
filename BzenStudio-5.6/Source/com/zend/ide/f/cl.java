package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.util.cz;

public class cl extends br
  implements bh
{
  private bi[] g;
  private String h = "unknown";
  private int i;

  public cl(String paramString1, int paramInt, g paramg, m paramm, bi[] paramArrayOfbi, String paramString2)
  {
    super(paramString1, paramg, paramm);
    this.i = paramInt;
    this.g = paramArrayOfbi;
    if ((paramString2 != null) && (paramString2.trim().length() != 0))
      this.h = paramString2;
  }

  public bi[] c()
  {
    return this.g;
  }

  public void a(String paramString)
  {
    this.h = paramString;
  }

  public String d()
  {
    return this.h;
  }

  public int a()
  {
    return this.i;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cl
 * JD-Core Version:    0.6.0
 */