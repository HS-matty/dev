package com.zend.ide.f.b;

import com.zend.ide.b.m;
import com.zend.ide.f.dd;
import com.zend.ide.f.di;
import com.zend.ide.f.s;
import com.zend.ide.m.ba;
import com.zend.ide.m.bh;
import com.zend.ide.m.bj;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class c extends b
{
  private static final ImageIcon m = cv.b("classbrowser/phpclassdata.gif");

  public c(v paramv, s params)
  {
    super(params, paramv, true);
  }

  public String toString()
  {
    v localv = (v)this.userObject;
    String str = bj.a(localv.k());
    if (str.length() > 0)
      return str + " " + localv.a();
    return localv.a();
  }

  public Object d()
  {
    if (dd.c())
      return a();
    return b();
  }

  protected Object a()
  {
    v localv = (v)this.userObject;
    int i = 0;
    String str1 = localv.c() != null ? localv.c().a() : null;
    int j = (str1 != null) && (str1.length() > 0) ? 1 : 0;
    i += (j != 0 ? 1 : 0);
    w[] arrayOfw = localv.d();
    int k = (arrayOfw != null) && (arrayOfw.length > 0) ? 1 : 0;
    i += (k != 0 ? 1 : 0);
    com.zend.ide.m.c[] arrayOfc = localv.a();
    a(arrayOfc);
    i += arrayOfc.length;
    z[] arrayOfz = localv.g();
    a(arrayOfz);
    i += arrayOfz.length;
    bh[] arrayOfbh = localv.h();
    a(arrayOfbh);
    i += arrayOfbh.length;
    Object[] arrayOfObject = new Object[i];
    int n = 0;
    if (j != 0)
    {
      String str2 = null;
      if (localv.e())
        str2 = localv.f().c();
      Object localObject = a(str2, str1);
      if (localObject == null)
        localObject = di.a(str1, 0, null, null, null, null, di.g, di.j, di.c);
      arrayOfObject[(n++)] = localObject;
    }
    if (k != 0)
      arrayOfObject[(n++)] = k.k;
    System.arraycopy(arrayOfc, 0, arrayOfObject, n, arrayOfc.length);
    n += arrayOfc.length;
    System.arraycopy(arrayOfz, 0, arrayOfObject, n, arrayOfz.length);
    n += arrayOfz.length;
    System.arraycopy(arrayOfbh, 0, arrayOfObject, n, arrayOfbh.length);
    return arrayOfObject;
  }

  protected Object b()
  {
    v localv = (v)this.userObject;
    int i = 0;
    String str = localv.c() != null ? localv.c().a() : null;
    int j = (str != null) && (str.length() > 0) ? 1 : 0;
    i += (j != 0 ? 1 : 0);
    w[] arrayOfw = localv.d();
    int k = (arrayOfw != null) && (arrayOfw.length > 0) ? 1 : 0;
    i += (k != 0 ? 1 : 0);
    com.zend.ide.m.c[] arrayOfc = localv.a();
    i += arrayOfc.length;
    z[] arrayOfz = localv.g();
    i += arrayOfz.length;
    bh[] arrayOfbh = localv.h();
    i += arrayOfbh.length;
    Object[] arrayOfObject = new Object[i];
    int n = 0;
    if (j != 0)
    {
      localObject1 = null;
      if (localv.e())
        localObject1 = localv.f().c();
      Object localObject2 = a((String)localObject1, str);
      if (localObject2 == null)
        localObject2 = di.a(str, 0, null, null, null, null, di.g, di.j, di.c);
      arrayOfObject[(n++)] = localObject2;
    }
    if (k != 0)
      arrayOfObject[(n++)] = k.k;
    Object localObject1 = new ba[arrayOfc.length + arrayOfz.length + arrayOfbh.length];
    int i1 = 0;
    System.arraycopy(arrayOfc, 0, localObject1, 0, arrayOfc.length);
    i1 += arrayOfc.length;
    System.arraycopy(arrayOfz, 0, localObject1, i1, arrayOfz.length);
    i1 += arrayOfz.length;
    System.arraycopy(arrayOfbh, 0, localObject1, i1, arrayOfbh.length);
    a(localObject1);
    System.arraycopy(localObject1, 0, arrayOfObject, n, localObject1.length);
    return arrayOfObject;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if ((paramObject instanceof v))
      return new d((v)paramObject, this.k);
    if (paramObject.equals(k.k))
      return new k();
    return super.a(paramObject);
  }

  public String g()
  {
    v localv = (v)this.userObject;
    String str = localv.a();
    if ((localv.c() != null) && (localv.c().a() != null))
      str = str + "\nextends " + localv.c().a();
    w[] arrayOfw = localv.d();
    if ((arrayOfw != null) && (arrayOfw.length > 0))
    {
      str = str + "\nimplements " + arrayOfw[0].a();
      for (int i = 1; i < arrayOfw.length; i++)
        str = str + ", " + arrayOfw[i].a();
    }
    if (localv.e())
      str = str + "\n" + localv.f().c();
    if ((localv.b() != null) && (!localv.b().equals("")) && (!localv.b().equals(ct.a(558))))
      str = str + "\n" + localv.b();
    return str;
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "classDataContext";
  }

  protected void a(ba[] paramArrayOfba)
  {
    dd.a(paramArrayOfba);
  }

  protected com.zend.ide.b.d a(String paramString1, String paramString2)
  {
    v localv = this.k.a(paramString1, paramString2, false);
    if (localv == null)
      localv = this.k.b(paramString1, paramString2);
    return localv;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.c
 * JD-Core Version:    0.6.0
 */