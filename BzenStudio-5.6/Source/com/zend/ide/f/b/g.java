package com.zend.ide.f.b;

import com.zend.ide.f.dd;
import com.zend.ide.f.s;
import com.zend.ide.m.ba;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.r;
import com.zend.ide.m.v;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class g extends b
{
  private static final ImageIcon m = cv.b("classbrowser/phpfiledata.gif");

  public g(bf parambf, s params)
  {
    super(params, parambf, true);
  }

  public Object d()
  {
    if (dd.c())
      return a();
    return b();
  }

  private Object a()
  {
    bf localbf = (bf)getUserObject();
    v[] arrayOfv = localbf.c();
    dd.a(arrayOfv);
    bh[] arrayOfbh = localbf.d();
    dd.a(arrayOfbh);
    int i = localbf.h().length > 0 ? 1 : 0;
    int j = i != 0 ? 1 : 0;
    int k = localbf.k().length > 0 ? 1 : 0;
    int n = k != 0 ? 1 : 0;
    int i1 = localbf.a().length > 0 ? 1 : 0;
    int i2 = i1 != 0 ? 1 : 0;
    int i3 = j + n + i2 + arrayOfv.length + arrayOfbh.length;
    Object[] arrayOfObject = new Object[i3];
    int i4 = 0;
    if (i != 0)
    {
      arrayOfObject[i4] = l.k;
      i4++;
    }
    if (k != 0)
    {
      arrayOfObject[i4] = j.k;
      i4++;
    }
    if (i1 != 0)
    {
      arrayOfObject[i4] = o.j;
      i4++;
    }
    System.arraycopy(arrayOfv, 0, arrayOfObject, i4, arrayOfv.length);
    i4 += arrayOfv.length;
    System.arraycopy(arrayOfbh, 0, arrayOfObject, i4, arrayOfbh.length);
    return arrayOfObject;
  }

  private Object b()
  {
    bf localbf = (bf)getUserObject();
    v[] arrayOfv1 = localbf.c();
    bh[] arrayOfbh = localbf.d();
    r[] arrayOfr = localbf.h();
    bd[] arrayOfbd = localbf.k();
    v[] arrayOfv2 = localbf.a();
    int i = arrayOfr.length + arrayOfbh.length + arrayOfv1.length + arrayOfbd.length + arrayOfv2.length;
    int j = 0;
    ba[] arrayOfba = new ba[i];
    System.arraycopy(arrayOfv1, 0, arrayOfba, j, arrayOfv1.length);
    j += arrayOfv1.length;
    System.arraycopy(arrayOfbh, 0, arrayOfba, j, arrayOfbh.length);
    j += arrayOfbh.length;
    System.arraycopy(arrayOfr, 0, arrayOfba, j, arrayOfr.length);
    j += arrayOfr.length;
    System.arraycopy(arrayOfbd, 0, arrayOfba, j, arrayOfbd.length);
    j += arrayOfbd.length;
    System.arraycopy(arrayOfv2, 0, arrayOfba, j, arrayOfv2.length);
    j += arrayOfv2.length;
    dd.a(arrayOfba);
    return arrayOfba;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if (paramObject.equals(j.k))
      return new j(0, this.k);
    if (paramObject.equals(o.j))
      return new o(0, this.k);
    if (paramObject.equals(l.k))
      return new l();
    return super.a(paramObject);
  }

  public Icon e()
  {
    return m;
  }

  public String f()
  {
    return "fileDataContext";
  }

  public String g()
  {
    bf localbf = (bf)this.userObject;
    String str1 = toString();
    String str2 = localbf.b();
    if ((localbf.b() != null) && (!localbf.b().equals("")) && (!localbf.b().equals(ct.a(558))))
      str1 = str1 + "\n" + str2;
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.g
 * JD-Core Version:    0.6.0
 */