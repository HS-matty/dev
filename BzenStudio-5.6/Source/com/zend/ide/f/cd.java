package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.cz;

public class cd extends br
  implements v
{
  private z[] g;
  private c[] n;
  private bh[] h;
  private bh i;
  private boolean j;
  private int k;
  private y l;
  private w[] m;

  private cd(String paramString, int paramInt, g paramg, m paramm, y paramy, w[] paramArrayOfw, z[] paramArrayOfz, c[] paramArrayOfc, bh[] paramArrayOfbh)
  {
    super(paramString, paramg, paramm);
    this.k = paramInt;
    this.m = paramArrayOfw;
    this.g = paramArrayOfz;
    this.n = paramArrayOfc;
    this.l = paramy;
    a(paramArrayOfz);
    a(paramArrayOfbh);
  }

  public y c()
  {
    return this.l;
  }

  public w[] d()
  {
    return this.m;
  }

  public void a(z[] paramArrayOfz)
  {
    this.g = paramArrayOfz;
  }

  public z[] g()
  {
    return this.g;
  }

  public void a(c[] paramArrayOfc)
  {
    this.n = paramArrayOfc;
  }

  public c[] a()
  {
    return this.n;
  }

  public void a(bh[] paramArrayOfbh)
  {
    this.h = paramArrayOfbh;
    this.j = false;
    for (int i1 = 0; i1 < paramArrayOfbh.length; i1++)
    {
      String str = paramArrayOfbh[i1].a();
      if ((!str.equals("__construct")) && (!str.equalsIgnoreCase(a())))
        continue;
      this.i = paramArrayOfbh[i1];
      this.j = true;
      break;
    }
    if (!this.j)
    {
      this.i = di.a("__construct", 1, null, f(), di.k, null);
      ((cl)this.i).a(this);
    }
  }

  public bh[] h()
  {
    return this.h;
  }

  public boolean i()
  {
    return this.j;
  }

  public bh j()
  {
    return this.i;
  }

  public int k()
  {
    return this.k;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }

  public d[] b(String paramString)
  {
    return bl.a(this.h, paramString);
  }

  public d[] a(String paramString)
  {
    return bl.a(this.n, paramString);
  }

  cd(String paramString, int paramInt, g paramg, m paramm, y paramy, w[] paramArrayOfw, z[] paramArrayOfz, c[] paramArrayOfc, bh[] paramArrayOfbh, dj paramdj)
  {
    this(paramString, paramInt, paramg, paramm, paramy, paramArrayOfw, paramArrayOfz, paramArrayOfc, paramArrayOfbh);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cd
 * JD-Core Version:    0.6.0
 */