package com.zend.ide.bb;

import com.zend.ide.b.h;
import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.n.tb;
import com.zend.ide.s.bd;
import com.zend.ide.s.kc;
import com.zend.ide.s.z;
import com.zend.ide.util.cu;

public class f extends com.zend.ide.s.j
  implements cu
{
  private com.zend.ide.x.k[] h;
  private com.zend.ide.s.k i;
  private a j;

  public f(com.zend.ide.s.k paramk)
  {
    this.i = paramk;
    this.h = com.zend.ide.x.j.a("script");
  }

  public z b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return null;
  }

  protected h g()
  {
    return c.c();
  }

  public boolean i()
  {
    return this.i.i();
  }

  public z a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 != kc.h(129))
      return null;
    Object localObject = tb.a((ho)d().getDocument(), 0, paramInt2);
    int k = paramInt2;
    for (int m = paramInt2 - 1; (m >= 0) && (paramInt2 - 9 < m); m--)
    {
      int n = ((CharSequence)localObject).charAt(m);
      if (n != 60)
        continue;
      k = m;
      break;
    }
    if (k == paramInt2)
      return null;
    localObject = ((CharSequence)localObject).subSequence(k, paramInt2);
    String str = localObject.toString();
    if ((str.length() < 2) || (!"</SCRIPT".substring(0, str.length()).equalsIgnoreCase(str)))
      return null;
    if (this.j == null)
    {
      this.j = new a(this);
      a.a(this.j, this.i.p);
    }
    this.i.p.a(paramInt2, paramBoolean);
    return (z)this.j;
  }

  static com.zend.ide.x.k[] a(f paramf)
  {
    return paramf.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bb.f
 * JD-Core Version:    0.6.0
 */