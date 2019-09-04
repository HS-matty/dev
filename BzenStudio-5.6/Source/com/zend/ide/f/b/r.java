package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.dd;
import com.zend.ide.f.di;
import com.zend.ide.m.ab;
import com.zend.ide.m.ba;
import com.zend.ide.m.bh;
import com.zend.ide.m.t;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import javax.swing.tree.DefaultMutableTreeNode;

public class r extends c
{
  public r(v paramv, com.zend.ide.f.s params)
  {
    super(paramv, params);
  }

  public String f()
  {
    return "wsClassDataContext";
  }

  protected Object a()
  {
    t localt = (t)this.userObject;
    int i = 0;
    String str1 = localt.c() != null ? localt.c().a() : null;
    int j = (str1 != null) && (str1.length() > 0) ? 1 : 0;
    i += (j != 0 ? 1 : 0);
    w[] arrayOfw = localt.d();
    int k = (arrayOfw != null) && (arrayOfw.length > 0) ? 1 : 0;
    i += (k != 0 ? 1 : 0);
    ab[] arrayOfab = localt.d();
    int m = (arrayOfab != null) && (arrayOfab.length > 0) ? 1 : 0;
    i += (m != 0 ? 1 : 0);
    com.zend.ide.m.c[] arrayOfc = localt.a();
    dd.a(arrayOfc);
    i += arrayOfc.length;
    z[] arrayOfz = localt.g();
    dd.a(arrayOfz);
    i += arrayOfz.length;
    bh[] arrayOfbh = localt.h();
    dd.a(arrayOfbh);
    i += arrayOfbh.length;
    Object[] arrayOfObject = new Object[i];
    int n = 0;
    if (j != 0)
    {
      String str2 = null;
      if (localt.e())
        str2 = localt.f().c();
      v localv = this.k.a(str2, str1, false);
      if (localv == null)
        localv = this.k.b(str2, str1);
      if (localv == null)
        localv = di.a(str1, 0, null, null, null, null, di.g, di.j, di.c);
      arrayOfObject[(n++)] = localv;
    }
    if (k != 0)
      arrayOfObject[(n++)] = k.k;
    if (m != 0)
      arrayOfObject[(n++)] = s.h;
    System.arraycopy(arrayOfc, 0, arrayOfObject, n, arrayOfc.length);
    n += arrayOfc.length;
    System.arraycopy(arrayOfz, 0, arrayOfObject, n, arrayOfz.length);
    n += arrayOfz.length;
    System.arraycopy(arrayOfbh, 0, arrayOfObject, n, arrayOfbh.length);
    return arrayOfObject;
  }

  protected Object b()
  {
    t localt = (t)this.userObject;
    int i = 0;
    String str = localt.c() != null ? localt.c().a() : null;
    int j = (str != null) && (str.length() > 0) ? 1 : 0;
    i += (j != 0 ? 1 : 0);
    w[] arrayOfw = localt.d();
    int k = (arrayOfw != null) && (arrayOfw.length > 0) ? 1 : 0;
    i += (k != 0 ? 1 : 0);
    com.zend.ide.m.c[] arrayOfc = localt.a();
    i += arrayOfc.length;
    z[] arrayOfz = localt.g();
    i += arrayOfz.length;
    bh[] arrayOfbh = localt.h();
    i += arrayOfbh.length;
    ab[] arrayOfab = localt.d();
    i += arrayOfab.length;
    Object[] arrayOfObject = new Object[i];
    int m = 0;
    if (j != 0)
    {
      localObject = null;
      if (localt.e())
        localObject = localt.f().c();
      v localv = this.k.a((String)localObject, str, false);
      if (localv == null)
        localv = this.k.b((String)localObject, str);
      if (localv == null)
        localv = di.a(str, 0, null, null, null, null, di.g, di.j, di.c);
      arrayOfObject[(m++)] = localv;
    }
    if (k != 0)
      arrayOfObject[(m++)] = k.k;
    Object localObject = new ba[arrayOfc.length + arrayOfz.length + arrayOfbh.length + arrayOfab.length];
    int n = 0;
    System.arraycopy(arrayOfc, 0, localObject, 0, arrayOfc.length);
    n += arrayOfc.length;
    System.arraycopy(arrayOfz, 0, localObject, n, arrayOfz.length);
    n += arrayOfz.length;
    System.arraycopy(arrayOfbh, 0, localObject, n, arrayOfbh.length);
    n += arrayOfbh.length;
    System.arraycopy(arrayOfab, 0, localObject, n, arrayOfab.length);
    dd.a(localObject);
    System.arraycopy(localObject, 0, arrayOfObject, m, localObject.length);
    return arrayOfObject;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if ((paramObject instanceof v))
    {
      if (((v)paramObject).a().equals("SoapClient"))
        return new d((v)paramObject, this.k);
      if ((paramObject instanceof ab))
        return new p((ab)paramObject, this.k);
      return new c((v)paramObject, this.k);
    }
    if (paramObject.equals(k.k))
      return new k();
    if (paramObject.equals(s.h))
      return new s();
    return super.a(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.r
 * JD-Core Version:    0.6.0
 */