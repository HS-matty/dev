package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.f.b.g;
import com.zend.ide.m.ba;
import com.zend.ide.m.bf;
import com.zend.ide.p.f.e;
import com.zend.ide.p.f.f;
import com.zend.ide.p.fb.b;
import com.zend.ide.r.bo;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.i;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;

public class dd extends db
{
  private static final String v = ct.a(532);
  private String k = v;
  private HashMap m = new HashMap();
  private long n = 0L;
  private static boolean i = true;
  private static boolean j = true;
  static Comparator o = new hd();

  public dd(s params)
  {
    super(params, new Object[] { v, params });
    ((f)getModel()).a(new lc(this));
    setName("File Inspector");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    Object[] arrayOfObject = (Object[])(Object[])paramObject;
    String str = (String)arrayOfObject[0];
    s locals = (s)arrayOfObject[1];
    bf localbf = a(locals, str);
    g localg = new g(localbf, locals);
    localg.a(g.b);
    return localg;
  }

  public void a(String paramString)
  {
    this.k = (paramString != null ? paramString : v);
    d(a(this.p, this.k));
    setRootVisible(paramString != null);
  }

  private void d(bf parambf)
  {
    e locale = (e)getModel().getRoot();
    String str = ((bf)locale.getUserObject()).a();
    if ((!str.equals(parambf.a())) && (System.currentTimeMillis() - this.n > 3000L))
    {
      this.m.remove(str);
      this.m.put(str, a());
      this.n = System.currentTimeMillis();
    }
    locale.setUserObject(parambf);
    b();
  }

  public void a()
  {
    bf localbf = (bf)((e)getModel().getRoot()).getUserObject();
    b localb = (b)this.m.get(localbf.a());
    if (localb != null)
    {
      setVisible(false);
      a(localb);
      setVisible(true);
    }
  }

  public void a(bf parambf)
  {
    if (this.k.equals(parambf.a()))
      d(parambf);
  }

  public void b(bf parambf)
  {
    if (this.k.equals(parambf.a()))
      d(parambf);
  }

  public void c(bf parambf)
  {
    if (this.k.equals(parambf.a()))
      d(parambf);
  }

  public void h()
  {
    d(a(this.p, this.k));
  }

  public void a(bo parambo)
  {
    a(this.k);
  }

  private static bf a(s params, String paramString)
  {
    bf localbf = null;
    if (paramString != null)
      localbf = params.a(paramString);
    if (localbf == null)
    {
      m localm = di.a(paramString, 0, 0, 0, 0);
      localbf = di.a(paramString, localm, di.b, di.b, di.b, di.c, null, di.d, di.e, di.f, di.i, null, -1L);
    }
    return localbf;
  }

  public Action a()
  {
    return new i(new ge(this));
  }

  public Action b()
  {
    return new i(new he(this));
  }

  public static boolean c()
  {
    return j;
  }

  public void b(boolean paramBoolean)
  {
    j = paramBoolean;
  }

  public static boolean d()
  {
    return i;
  }

  public void c(boolean paramBoolean)
  {
    i = paramBoolean;
  }

  public static void a(ba[] paramArrayOfba)
  {
    if ((i) || ((paramArrayOfba.length > 0) && (!paramArrayOfba[0].e())))
      Arrays.sort(paramArrayOfba);
    else
      Arrays.sort(paramArrayOfba, o);
  }

  static boolean e(boolean paramBoolean)
  {
    return dd.j = paramBoolean;
  }

  static boolean e()
  {
    return j;
  }

  static boolean f(boolean paramBoolean)
  {
    return dd.i = paramBoolean;
  }

  static boolean f()
  {
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dd
 * JD-Core Version:    0.6.0
 */