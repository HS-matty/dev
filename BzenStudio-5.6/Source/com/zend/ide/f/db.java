package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.f.b.c;
import com.zend.ide.f.b.i;
import com.zend.ide.m.bf;
import com.zend.ide.m.t;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.bb;
import com.zend.ide.util.cu;

public class db extends com.zend.ide.p.f.d
  implements cu, pd, com.zend.ide.r.r
{
  protected s p;
  private g q;

  public db(s params, Object paramObject)
  {
    super(paramObject);
    this.p = params;
    setToggleClickCount(0);
    a(1000);
    a(false);
    params.g().a(this);
    addMouseListener(new b(this));
    p.e().a(this);
  }

  protected bb d()
  {
    return new l(this);
  }

  public void a(g paramg)
  {
    this.q = paramg;
  }

  protected void k()
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject instanceof com.zend.ide.f.b.b))
    {
      com.zend.ide.b.d locald = (com.zend.ide.b.d)((com.zend.ide.f.b.b)localObject).getUserObject();
      if (locald.e())
      {
        m localm = locald.f();
        this.q.b(localm.c(), localm.f());
      }
    }
  }

  private String m()
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject instanceof i))
    {
      com.zend.ide.m.r localr = (com.zend.ide.m.r)((i)localObject).getUserObject();
      String str1 = localr.f().c();
      String str2 = localr.a();
      return this.q.c(str1, str2);
    }
    return null;
  }

  private String a()
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject instanceof c))
    {
      t localt = (t)((c)localObject).getUserObject();
      String str = localt.c();
      return str;
    }
    return null;
  }

  public void a(bf parambf)
  {
  }

  public void b(bf parambf)
  {
  }

  public void c(bf parambf)
  {
  }

  public void h()
  {
  }

  public void a(bo parambo)
  {
  }

  public void a(o paramo)
  {
  }

  public void c(o paramo)
  {
  }

  static g a(db paramdb)
  {
    return paramdb.q;
  }

  static String b(db paramdb)
  {
    return paramdb.m();
  }

  static String a(db paramdb)
  {
    return paramdb.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.db
 * JD-Core Version:    0.6.0
 */