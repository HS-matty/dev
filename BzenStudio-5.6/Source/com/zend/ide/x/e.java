package com.zend.ide.x;

import com.zend.ide.util.cz;

class e extends com.zend.ide.b.e
  implements k
{
  private h[] c;

  private e(String paramString1, String paramString2, h[] paramArrayOfh)
  {
    super(paramString1, paramString2);
    this.c = paramArrayOfh;
  }

  public h[] c()
  {
    return this.c;
  }

  public h a(String paramString)
  {
    for (int i = 0; i < this.c.length; i++)
      if (this.c[i].a().equalsIgnoreCase(paramString))
        return this.c[i];
    return null;
  }

  public void a(cz paramcz)
  {
    ((i)paramcz).a(this);
  }

  e(String paramString1, String paramString2, h[] paramArrayOfh, m paramm)
  {
    this(paramString1, paramString2, paramArrayOfh);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.e
 * JD-Core Version:    0.6.0
 */