package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.ab;
import com.zend.ide.m.ba;
import com.zend.ide.m.bc;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.bk;
import com.zend.ide.m.c;
import com.zend.ide.m.d;
import com.zend.ide.m.f;
import com.zend.ide.m.g;
import com.zend.ide.m.i;
import com.zend.ide.m.j;
import com.zend.ide.m.q;
import com.zend.ide.m.r;
import com.zend.ide.m.t;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.x;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.b.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class xc
{
  private static String a;

  public static void a(a[] paramArrayOfa, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfa != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfa.length);
      for (int i = 0; i < paramArrayOfa.length; i++)
        a((bf)paramArrayOfa[i], paramDataOutputStream);
    }
    else
    {
      paramDataOutputStream.writeInt(0);
    }
  }

  private static void a(bf parambf, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (parambf != null)
    {
      a = parambf.a();
      a(a, paramDataOutputStream);
      a(parambf.f(), paramDataOutputStream);
      a(parambf.c(), paramDataOutputStream);
      a(parambf.a(), paramDataOutputStream);
      a(parambf.b(), paramDataOutputStream);
      a(parambf.d(), paramDataOutputStream);
      a(parambf.g(), paramDataOutputStream);
      a(parambf.h(), paramDataOutputStream);
      a(parambf.k(), paramDataOutputStream);
      a(parambf.i(), paramDataOutputStream);
      a(parambf.a(), paramDataOutputStream);
      a(parambf.a(), paramDataOutputStream);
      paramDataOutputStream.writeLong(parambf.b());
    }
  }

  private static void a(m paramm, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramm != null)
    {
      paramDataOutputStream.writeBoolean(true);
      paramDataOutputStream.writeInt(paramm.d());
      paramDataOutputStream.writeInt(paramm.e());
      paramDataOutputStream.writeInt(paramm.f());
      paramDataOutputStream.writeInt(paramm.b());
    }
    else
    {
      paramDataOutputStream.writeBoolean(false);
    }
  }

  private static void a(v[] paramArrayOfv, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfv != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfv.length);
      for (int i = 0; i < paramArrayOfv.length; i++)
        a(paramArrayOfv[i], paramDataOutputStream);
    }
  }

  private static void a(v paramv, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramv != null)
    {
      a(paramv.a(), paramDataOutputStream);
      paramDataOutputStream.writeInt(paramv.k());
      a(paramv.a(), paramDataOutputStream);
      a(paramv.f(), paramDataOutputStream);
      if ((paramv instanceof t))
        a(((t)paramv).c(), paramDataOutputStream);
      a(paramv.c(), paramDataOutputStream);
      a(paramv.d(), paramDataOutputStream);
      a(paramv.g(), paramDataOutputStream);
      a(paramv.a(), paramDataOutputStream);
      a(paramv.h(), paramDataOutputStream);
      if ((paramv instanceof t))
        a(((t)paramv).d(), paramDataOutputStream);
    }
  }

  private static void a(c[] paramArrayOfc, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfc != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfc.length);
      for (int i = 0; i < paramArrayOfc.length; i++)
        a(paramArrayOfc[i], paramDataOutputStream);
    }
  }

  private static void a(c paramc, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramc != null)
    {
      a(paramc.a(), paramDataOutputStream);
      a(paramc.a(), paramDataOutputStream);
      a(paramc.f(), paramDataOutputStream);
    }
  }

  private static void a(z[] paramArrayOfz, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfz != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfz.length);
      for (int i = 0; i < paramArrayOfz.length; i++)
        a(paramArrayOfz[i], paramDataOutputStream);
    }
  }

  private static void a(z paramz, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramz != null)
    {
      a(paramz.a(), paramDataOutputStream);
      paramDataOutputStream.writeInt(paramz.d());
      a(paramz.c(), paramDataOutputStream);
      a(paramz.a(), paramDataOutputStream);
      a(paramz.f(), paramDataOutputStream);
    }
  }

  private static void a(w[] paramArrayOfw, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfw != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfw.length);
      for (int i = 0; i < paramArrayOfw.length; i++)
        a(paramArrayOfw[i], paramDataOutputStream);
    }
  }

  private static void a(w paramw, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramw != null)
    {
      a(paramw.a(), paramDataOutputStream);
      a(paramw.f(), paramDataOutputStream);
    }
  }

  private static void a(y paramy, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramy != null)
    {
      a(paramy.a(), paramDataOutputStream);
      a(paramy.f(), paramDataOutputStream);
    }
  }

  private static void a(g paramg, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeBoolean(paramg != null);
    if (paramg != null)
    {
      a(paramg.a(), paramDataOutputStream);
      a(paramg.b(), paramDataOutputStream);
      a(paramg.a(), paramDataOutputStream);
      paramDataOutputStream.writeInt(paramg.d());
      paramDataOutputStream.writeInt(paramg.a());
      paramDataOutputStream.writeInt(paramg.b());
    }
  }

  private static void a(bd[] paramArrayOfbd, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfbd != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfbd.length);
      for (int i = 0; i < paramArrayOfbd.length; i++)
        a(paramArrayOfbd[i], paramDataOutputStream);
    }
  }

  private static void a(bd parambd, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (parambd != null)
    {
      a(parambd.a(), paramDataOutputStream);
      a(parambd.c(), paramDataOutputStream);
      a(parambd.f(), paramDataOutputStream);
      a(parambd.a(), paramDataOutputStream);
    }
  }

  private static void a(j[] paramArrayOfj, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfj != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfj.length);
      for (int i = 0; i < paramArrayOfj.length; i++)
        a(paramArrayOfj[i], paramDataOutputStream);
    }
  }

  private static void a(j paramj, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramj != null)
    {
      paramDataOutputStream.writeInt(paramj.a());
      a(paramj.a(), paramDataOutputStream);
    }
  }

  private static void a(d[] paramArrayOfd, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfd != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfd.length);
      for (int i = 0; i < paramArrayOfd.length; i++)
        a(paramArrayOfd[i], paramDataOutputStream);
    }
  }

  private static void a(d paramd, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramd != null)
    {
      a(paramd.a(), paramDataOutputStream);
      a(paramd.b(), paramDataOutputStream);
    }
  }

  private static void a(bc[] paramArrayOfbc, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfbc != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfbc.length);
      for (int i = 0; i < paramArrayOfbc.length; i++)
        a(paramArrayOfbc[i], paramDataOutputStream);
    }
  }

  private static void a(bc parambc, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (parambc != null)
    {
      a(parambc.c(), paramDataOutputStream);
      a(parambc.b(), paramDataOutputStream);
    }
  }

  private static void a(bk parambk, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    Map localMap = parambk.a();
    Iterator localIterator = localMap.keySet().iterator();
    paramDataOutputStream.writeInt(localMap.size());
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (vb)localIterator.next();
      localObject2 = (x[])(x[])localMap.get(localObject1);
      a((vb)localObject1, paramDataOutputStream);
      paramDataOutputStream.writeInt(localObject2.length);
      for (int i = 0; i < localObject2.length; i++)
        a(localObject2[i], paramDataOutputStream);
    }
    Object localObject1 = parambk.b();
    localIterator = ((Map)localObject1).keySet().iterator();
    paramDataOutputStream.writeInt(((Map)localObject1).size());
    while (localIterator.hasNext())
    {
      localObject2 = (String)localIterator.next();
      List localList = (List)((Map)localObject1).get(localObject2);
      a((String)localObject2, paramDataOutputStream);
      paramDataOutputStream.writeInt(localList.size());
      for (int j = 0; j < localList.size(); j++)
      {
        q localq = (q)localList.get(j);
        a(localq, paramDataOutputStream);
      }
    }
  }

  private static void a(q paramq, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    a(paramq.c(), paramDataOutputStream);
    paramDataOutputStream.writeInt(paramq.d());
    paramDataOutputStream.writeInt(paramq.a());
    paramDataOutputStream.writeBoolean(paramq.b());
  }

  private static void a(vb paramvb, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    a(paramvb.c(), paramDataOutputStream);
    a(paramvb.a(), paramDataOutputStream);
    a(paramvb.b(), paramDataOutputStream);
  }

  private static void a(r[] paramArrayOfr, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfr != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfr.length);
      for (int i = 0; i < paramArrayOfr.length; i++)
        a(paramArrayOfr[i], paramDataOutputStream);
    }
  }

  private static void a(r paramr, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    a(paramr, paramDataOutputStream);
  }

  private static void a(x paramx, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramx != null)
    {
      a(paramx.a(), paramDataOutputStream);
      paramDataOutputStream.writeBoolean(paramx.i());
      a(paramx.a(), paramDataOutputStream);
      a(paramx.f(), paramDataOutputStream);
    }
  }

  private static void a(ba paramba, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramba != null)
    {
      a(paramba.a(), paramDataOutputStream);
      a(paramba.a(), paramDataOutputStream);
      a(paramba.f(), paramDataOutputStream);
    }
  }

  private static void a(bh[] paramArrayOfbh, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfbh != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfbh.length);
      for (int i = 0; i < paramArrayOfbh.length; i++)
        a(paramArrayOfbh[i], paramDataOutputStream);
    }
  }

  private static void a(bh parambh, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (parambh != null)
    {
      a(parambh.a(), paramDataOutputStream);
      paramDataOutputStream.writeInt(parambh.a());
      a(parambh.a(), paramDataOutputStream);
      a(parambh.f(), paramDataOutputStream);
      a(parambh.c(), paramDataOutputStream);
      a(parambh.d(), paramDataOutputStream);
    }
  }

  private static void a(bi[] paramArrayOfbi, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (paramArrayOfbi != null)
    {
      paramDataOutputStream.writeInt(paramArrayOfbi.length);
      for (int i = 0; i < paramArrayOfbi.length; i++)
        a(paramArrayOfbi[i], paramDataOutputStream);
    }
  }

  private static void a(bi parambi, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    if (parambi != null)
    {
      a(parambi.a(), paramDataOutputStream);
      a(parambi.f(), paramDataOutputStream);
      paramDataOutputStream.writeBoolean(parambi.c());
      paramDataOutputStream.writeBoolean(parambi.d());
      a(parambi.g(), paramDataOutputStream);
      a(parambi.h(), paramDataOutputStream);
    }
  }

  public static bf[] a(DataInputStream paramDataInputStream)
    throws IOException
  {
    int i = paramDataInputStream.readInt();
    bf[] arrayOfbf = new bf[i];
    for (int j = 0; j < i; j++)
      arrayOfbf[j] = b(paramDataInputStream);
    return arrayOfbf;
  }

  private static bf b(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    a = str;
    m localm = c(paramDataInputStream);
    v[] arrayOfv1 = d(paramDataInputStream);
    v[] arrayOfv2 = a(paramDataInputStream);
    v[] arrayOfv3 = d(paramDataInputStream);
    bh[] arrayOfbh = A(paramDataInputStream);
    bk localbk = v(paramDataInputStream);
    r[] arrayOfr = t(paramDataInputStream);
    bd[] arrayOfbd = r(paramDataInputStream);
    bc[] arrayOfbc = p(paramDataInputStream);
    d[] arrayOfd = n(paramDataInputStream);
    g localg = m(paramDataInputStream);
    long l = paramDataInputStream.readLong();
    bf localbf = di.a(str, localm, arrayOfv1, arrayOfv2, arrayOfv3, arrayOfbh, localbk, arrayOfr, arrayOfbd, arrayOfbc, arrayOfd, localg, l);
    for (int i = 0; i < arrayOfv1.length; i++)
      arrayOfv1[i].a(localbf);
    for (i = 0; i < arrayOfv2.length; i++)
      arrayOfv2[i].a(localbf);
    for (i = 0; i < arrayOfv3.length; i++)
      arrayOfv3[i].a(localbf);
    return localbf;
  }

  private static m c(DataInputStream paramDataInputStream)
    throws IOException
  {
    boolean bool = paramDataInputStream.readBoolean();
    m localm = null;
    if (bool)
    {
      int i = paramDataInputStream.readInt();
      int j = paramDataInputStream.readInt();
      int k = paramDataInputStream.readInt();
      int m = paramDataInputStream.readInt();
      localm = di.a(a, i, j, k, m);
    }
    return localm;
  }

  private static v[] d(DataInputStream paramDataInputStream)
    throws IOException
  {
    v[] arrayOfv = new v[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfv.length; i++)
      arrayOfv[i] = e(paramDataInputStream);
    return arrayOfv;
  }

  private static v e(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    y localy = l(paramDataInputStream);
    w[] arrayOfw = j(paramDataInputStream);
    z[] arrayOfz = h(paramDataInputStream);
    c[] arrayOfc = f(paramDataInputStream);
    bh[] arrayOfbh = A(paramDataInputStream);
    v localv = di.a(str, i, localg, localm, localy, arrayOfw, arrayOfz, arrayOfc, arrayOfbh);
    for (int j = 0; j < arrayOfz.length; j++)
      arrayOfz[j].a(localv);
    for (j = 0; j < arrayOfc.length; j++)
      arrayOfc[j].a(localv);
    for (j = 0; j < arrayOfbh.length; j++)
      arrayOfbh[j].a(localv);
    return localv;
  }

  private static v[] a(DataInputStream paramDataInputStream)
    throws IOException
  {
    v[] arrayOfv = new v[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfv.length; i++)
      arrayOfv[i] = b(paramDataInputStream);
    return arrayOfv;
  }

  private static v b(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    String str2 = G(paramDataInputStream);
    y localy = l(paramDataInputStream);
    w[] arrayOfw = j(paramDataInputStream);
    z[] arrayOfz = h(paramDataInputStream);
    c[] arrayOfc = f(paramDataInputStream);
    String str3 = a;
    a = str2;
    bh[] arrayOfbh = A(paramDataInputStream);
    ab[] arrayOfab = c(paramDataInputStream);
    a = str3;
    t localt = di.a(str1, i, localg, localm, localy, arrayOfw, arrayOfz, arrayOfc, arrayOfbh, arrayOfab, str2);
    for (int j = 0; j < arrayOfz.length; j++)
      arrayOfz[j].a(localt);
    for (j = 0; j < arrayOfc.length; j++)
      arrayOfc[j].a(localt);
    for (j = 0; j < arrayOfbh.length; j++)
      arrayOfbh[j].a(localt);
    for (j = 0; j < arrayOfab.length; j++)
      arrayOfab[j].a(localt);
    return localt;
  }

  private static ab[] c(DataInputStream paramDataInputStream)
    throws IOException
  {
    ab[] arrayOfab = new ab[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfab.length; i++)
      arrayOfab[i] = d(paramDataInputStream);
    return arrayOfab;
  }

  private static ab d(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    y localy = l(paramDataInputStream);
    w[] arrayOfw = j(paramDataInputStream);
    z[] arrayOfz = h(paramDataInputStream);
    c[] arrayOfc = f(paramDataInputStream);
    bh[] arrayOfbh = A(paramDataInputStream);
    ab localab = di.a(str, i, localg, localm, localy, arrayOfw, arrayOfz, arrayOfc, arrayOfbh);
    for (int j = 0; j < arrayOfz.length; j++)
      arrayOfz[j].a(localab);
    for (j = 0; j < arrayOfc.length; j++)
      arrayOfc[j].a(localab);
    for (j = 0; j < arrayOfbh.length; j++)
      arrayOfbh[j].a(localab);
    return localab;
  }

  private static c[] f(DataInputStream paramDataInputStream)
    throws IOException
  {
    c[] arrayOfc = new c[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfc.length; i++)
      arrayOfc[i] = g(paramDataInputStream);
    return arrayOfc;
  }

  private static c g(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.a(str, localg, localm);
  }

  private static z[] h(DataInputStream paramDataInputStream)
    throws IOException
  {
    z[] arrayOfz = new z[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfz.length; i++)
      arrayOfz[i] = i(paramDataInputStream);
    return arrayOfz;
  }

  private static z i(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    String str2 = G(paramDataInputStream);
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.a(str1, i, str2, localg, localm);
  }

  private static w[] j(DataInputStream paramDataInputStream)
    throws IOException
  {
    w[] arrayOfw = new w[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfw.length; i++)
      arrayOfw[i] = k(paramDataInputStream);
    return arrayOfw;
  }

  private static w k(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.b(str, localm);
  }

  private static y l(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.a(str, localm);
  }

  private static g m(DataInputStream paramDataInputStream)
    throws IOException
  {
    boolean bool = paramDataInputStream.readBoolean();
    if (bool)
    {
      String str1 = G(paramDataInputStream);
      String str2 = G(paramDataInputStream);
      j[] arrayOfj = E(paramDataInputStream);
      int i = paramDataInputStream.readInt();
      int j = paramDataInputStream.readInt();
      int k = paramDataInputStream.readInt();
      i locali = new i(str1, str2, arrayOfj, i);
      locali.a(j);
      locali.b(k);
      return locali;
    }
    return null;
  }

  private static d[] n(DataInputStream paramDataInputStream)
    throws IOException
  {
    d[] arrayOfd = new d[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfd.length; i++)
      arrayOfd[i] = o(paramDataInputStream);
    return arrayOfd;
  }

  private static d o(DataInputStream paramDataInputStream)
    throws IOException
  {
    m localm1 = c(paramDataInputStream);
    m localm2 = c(paramDataInputStream);
    return new d(localm1, localm2);
  }

  private static bc[] p(DataInputStream paramDataInputStream)
    throws IOException
  {
    bc[] arrayOfbc = new bc[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfbc.length; i++)
      arrayOfbc[i] = q(paramDataInputStream);
    return arrayOfbc;
  }

  private static bc q(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return new bc(str, localm);
  }

  private static bd[] r(DataInputStream paramDataInputStream)
    throws IOException
  {
    bd[] arrayOfbd = new bd[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfbd.length; i++)
      arrayOfbd[i] = s(paramDataInputStream);
    return arrayOfbd;
  }

  private static bd s(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    String str2 = G(paramDataInputStream);
    m localm = c(paramDataInputStream);
    g localg = m(paramDataInputStream);
    return di.a(str1, str2, localm, localg);
  }

  private static r[] t(DataInputStream paramDataInputStream)
    throws IOException
  {
    r[] arrayOfr = new r[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfr.length; i++)
      arrayOfr[i] = u(paramDataInputStream);
    return arrayOfr;
  }

  private static r u(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.a(str, localg, localm);
  }

  private static bk v(DataInputStream paramDataInputStream)
    throws IOException
  {
    int i = paramDataInputStream.readInt();
    HashMap localHashMap1 = new HashMap(i);
    Object localObject;
    for (int j = 0; j < i; j++)
    {
      vb localvb = z(paramDataInputStream);
      localObject = x(paramDataInputStream);
      localHashMap1.put(localvb, localObject);
    }
    i = paramDataInputStream.readInt();
    HashMap localHashMap2 = new HashMap(i);
    for (int k = 0; k < i; k++)
    {
      localObject = G(paramDataInputStream);
      int m = paramDataInputStream.readInt();
      ArrayList localArrayList = new ArrayList(m);
      for (int n = 0; n < m; n++)
        localArrayList.add(w(paramDataInputStream));
      localHashMap2.put(localObject, localArrayList);
    }
    return (bk)bv.a(localHashMap1, localHashMap2);
  }

  private static q w(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    int j = paramDataInputStream.readInt();
    boolean bool = paramDataInputStream.readBoolean();
    return bv.a(str, i, j, bool);
  }

  private static x[] x(DataInputStream paramDataInputStream)
    throws IOException
  {
    x[] arrayOfx = new x[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfx.length; i++)
      arrayOfx[i] = y(paramDataInputStream);
    return arrayOfx;
  }

  private static x y(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str = G(paramDataInputStream);
    boolean bool = paramDataInputStream.readBoolean();
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    return di.a(str, bool, localg, localm);
  }

  private static vb z(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    String str2 = G(paramDataInputStream);
    String str3 = G(paramDataInputStream);
    return bl.a(str1, str2, str3);
  }

  private static bh[] A(DataInputStream paramDataInputStream)
    throws IOException
  {
    bh[] arrayOfbh = new bh[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfbh.length; i++)
      arrayOfbh[i] = B(paramDataInputStream);
    return arrayOfbh;
  }

  private static bh B(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    int i = paramDataInputStream.readInt();
    g localg = m(paramDataInputStream);
    m localm = c(paramDataInputStream);
    bi[] arrayOfbi = C(paramDataInputStream);
    String str2 = G(paramDataInputStream);
    bh localbh = di.a(str1, i, localg, localm, arrayOfbi, str2);
    for (int j = 0; j < arrayOfbi.length; j++)
      arrayOfbi[j].a(localbh);
    return localbh;
  }

  private static bi[] C(DataInputStream paramDataInputStream)
    throws IOException
  {
    bi[] arrayOfbi = new bi[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfbi.length; i++)
      arrayOfbi[i] = D(paramDataInputStream);
    return arrayOfbi;
  }

  private static bi D(DataInputStream paramDataInputStream)
    throws IOException
  {
    String str1 = G(paramDataInputStream);
    m localm = c(paramDataInputStream);
    boolean bool1 = paramDataInputStream.readBoolean();
    boolean bool2 = paramDataInputStream.readBoolean();
    String str2 = G(paramDataInputStream);
    String str3 = G(paramDataInputStream);
    return di.a(str1, localm, bool1, bool2, str2, str3);
  }

  private static j[] E(DataInputStream paramDataInputStream)
    throws IOException
  {
    j[] arrayOfj = new j[paramDataInputStream.readInt()];
    for (int i = 0; i < arrayOfj.length; i++)
      arrayOfj[i] = F(paramDataInputStream);
    return arrayOfj;
  }

  private static j F(DataInputStream paramDataInputStream)
    throws IOException
  {
    f localf = new f(paramDataInputStream.readInt(), G(paramDataInputStream));
    return localf;
  }

  private static String G(DataInputStream paramDataInputStream)
    throws IOException
  {
    boolean bool = paramDataInputStream.readBoolean();
    if (bool)
      return paramDataInputStream.readUTF();
    return null;
  }

  private static void a(String paramString, DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeBoolean(paramString != null);
    if (paramString != null)
      paramDataOutputStream.writeUTF(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.xc
 * JD-Core Version:    0.6.0
 */