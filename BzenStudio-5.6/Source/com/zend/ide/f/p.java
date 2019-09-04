package com.zend.ide.f;

import com.zend.ide.f.zc.b.f;
import com.zend.ide.j.h;
import com.zend.ide.m.ba;
import com.zend.ide.m.bc;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bg;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.bk;
import com.zend.ide.m.j;
import com.zend.ide.m.q;
import com.zend.ide.m.r;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.x;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class p extends o
{
  private String d = null;
  private List e = new ArrayList();
  private List f = new ArrayList();
  private List q = new ArrayList();
  private List g = new ArrayList();
  private List h = new ArrayList();
  private List r = new ArrayList();
  private List v = new ArrayList();
  private List i = new ArrayList();
  private List j = new ArrayList();
  private List k = new ArrayList();
  private List l = new ArrayList();
  private List m = new ArrayList();
  private com.zend.ide.m.g s;
  private bh w = null;
  private Stack x = new Stack();
  private Stack y = new Stack();
  private Stack z = new Stack();
  private Stack A = new Stack();
  private Stack B = new Stack();
  private bv n = new bv();
  private boolean o = false;
  private static kc t;
  private static boolean u;
  private static boolean C = com.zend.ide.util.f.a.a.b();
  private static final com.zend.ide.util.d.a p = new com.zend.ide.util.d.a();

  public p()
  {
    if (t == null)
    {
      t = new kc(this, null);
      b.a(t, "desktop.phpVersion");
      u = e();
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramString2 = paramString2.substring(1);
    com.zend.ide.b.m localm = di.a(this.d, paramInt1, paramInt3, paramInt3, paramInt4);
    bi localbi = di.a(paramString2, localm, paramBoolean1, paramBoolean2, paramString1, paramString3);
    this.k.add(localbi);
  }

  private static bi a(bi[] paramArrayOfbi, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return null;
    if (paramString.charAt(0) == '&')
      paramString = paramString.substring(1);
    if (paramString.charAt(0) == '$')
      paramString = paramString.substring(1);
    for (int i1 = 0; i1 < paramArrayOfbi.length; i1++)
      if (paramString.equalsIgnoreCase(paramArrayOfbi[i1].a()))
        return paramArrayOfbi[i1];
    return null;
  }

  public void a(String paramString, boolean paramBoolean, int paramInt1, com.zend.ide.m.g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
    bi[] arrayOfbi = new bi[this.k.size()];
    this.k.toArray(arrayOfbi);
    this.k.clear();
    Object localObject1 = null;
    if (paramg != null)
    {
      localObject2 = paramg.a(7);
      String str1;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (j)((Iterator)localObject2).next();
        str1 = ((j)localObject3).a().trim();
        String[] arrayOfString = str1.split(" ");
        String str2 = null;
        String str3 = null;
        int i3 = arrayOfString.length > 2 ? 2 : arrayOfString.length;
        for (int i4 = 0; i4 < i3; i4++)
        {
          if ((arrayOfString[i4].equals("")) && (i3 < arrayOfString.length))
            i3++;
          if (arrayOfString[i4].startsWith("$"))
          {
            str2 = arrayOfString[i4];
          }
          else
          {
            if (str3 != null)
              continue;
            str3 = arrayOfString[i4];
          }
        }
        if (str2 == null)
          str2 = arrayOfString[0];
        bi localbi = a(arrayOfbi, str2);
        if (localbi == null)
        {
          str3 = arrayOfString[0];
          str2 = arrayOfString.length > 1 ? arrayOfString[1] : null;
          localbi = a(arrayOfbi, str3);
        }
        if ((localbi != null) && (str3 != null) && (str3.length() > 0))
        {
          String str4 = localbi.g();
          if ((str4 == null) || (str4.length() == 0))
            localbi.a(str3);
        }
      }
      localObject3 = paramg.a(6);
      localObject1 = null;
      if (((Iterator)localObject3).hasNext())
      {
        str1 = ((j)((Iterator)localObject3).next()).a().trim();
        for (i2 = 0; i2 < str1.length(); i2++)
        {
          char c = str1.charAt(i2);
          if (!Character.isWhitespace(c))
            continue;
          localObject1 = str1.substring(0, i2);
          break;
        }
        if (localObject1 == null)
          localObject1 = str1;
      }
    }
    if (localObject1 == null)
      if ((paramBoolean) && (paramString.equals(f())))
        localObject1 = f();
      else
        localObject1 = "void";
    Object localObject2 = di.a(this.d, paramInt2, paramInt3, paramInt3, paramInt4);
    Object localObject3 = di.a(paramString, paramInt1, paramg, (com.zend.ide.b.m)localObject2, arrayOfbi, (String)localObject1);
    int i1 = 0;
    if ((this.w != null) && (this.w.a().equals(paramString)) && (this.w.f().d() == paramInt2))
      i1 = 1;
    this.w = ((bh)localObject3);
    if (paramBoolean)
    {
      if (i1 != 0)
        this.g.remove(this.g.size() - 1);
      this.g.add(localObject3);
    }
    else
    {
      if (i1 != 0)
        this.e.remove(this.e.size() - 1);
      this.e.add(localObject3);
    }
    this.x.push(localObject3);
    for (int i2 = 0; i2 < arrayOfbi.length; i2++)
    {
      ((dh)arrayOfbi[i2]).a((ba)localObject3);
      this.n.a(a(), arrayOfbi[i2]);
      this.n.a(a(), arrayOfbi[i2].a(), arrayOfbi[i2].g(), false, 0, paramInt2);
    }
  }

  public void a(String paramString, boolean paramBoolean, int paramInt)
  {
    bh localbh = null;
    boolean bool = this.x.isEmpty();
    if (!bool)
      localbh = (bh)this.x.pop();
    if ((localbh != null) && (localbh.a().equals(paramString)))
    {
      if ((this.o) && (localbh.d().equals("void")))
        ((cl)localbh).a("unknown");
      ((dk)localbh.f()).a(paramInt);
    }
    this.o = false;
    super.a(paramString, paramBoolean, paramInt);
  }

  public void a(String paramString1, int paramInt1, String paramString2, String paramString3, com.zend.ide.m.g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
    int i2;
    y localy;
    if (paramString2 != null)
    {
      int i1 = paramString2.indexOf(']');
      localObject = paramString2.substring(1, i1);
      paramString2 = paramString2.substring(i1 + 1);
      i2 = Integer.parseInt(((String)localObject).substring(0, ((String)localObject).indexOf(".")));
      int i3 = Integer.parseInt(((String)localObject).substring(((String)localObject).indexOf(".") + 1, ((String)localObject).length()));
      com.zend.ide.b.m localm1 = di.a(this.d, i2, i3, i2, 0);
      localy = di.a(paramString2, localm1);
    }
    else
    {
      localy = di.a(paramString2, null);
    }
    w[] arrayOfw;
    if (paramString3 != null)
    {
      localObject = paramString3.split(",");
      arrayOfw = new w[localObject.length];
      for (i2 = 0; i2 < localObject.length; i2++)
      {
        String str1 = localObject[i2];
        int i4 = str1.indexOf(']');
        String str2 = str1.substring(1, i4);
        str1 = str1.substring(i4 + 1);
        int i5 = Integer.parseInt(str2.substring(0, str2.indexOf(".")));
        int i6 = Integer.parseInt(str2.substring(str2.indexOf(".") + 1, str2.length()));
        com.zend.ide.b.m localm2 = di.a(this.d, i5, i6, i5, 0);
        arrayOfw[i2] = di.b(str1, localm2);
      }
    }
    else
    {
      arrayOfw = di.h;
    }
    Object localObject = di.a(this.d, paramInt2, paramInt3, paramInt3, paramInt4);
    v localv = di.a(paramString1, paramInt1, paramg, (com.zend.ide.b.m)localObject, localy, arrayOfw, di.g, di.j, di.c);
    this.h.add(localv);
    this.y.push(localv);
  }

  public void a(String paramString, int paramInt)
  {
    if ((f() != null) && (f().length() != 0))
    {
      this.z.push(this.f);
      this.A.push(this.q);
      this.B.push(this.g);
      this.f = new ArrayList();
      this.q = new ArrayList();
      this.g = new ArrayList();
    }
    super.a(paramString, paramInt);
  }

  public void c(String paramString, int paramInt)
  {
    if (!this.y.isEmpty())
    {
      cd localcd = (cd)this.y.pop();
      if (localcd.a().equals(paramString))
      {
        z[] arrayOfz = new z[this.f.size()];
        this.f.toArray(arrayOfz);
        Arrays.sort(arrayOfz);
        com.zend.ide.m.c[] arrayOfc = new com.zend.ide.m.c[this.q.size()];
        this.q.toArray(arrayOfc);
        Arrays.sort(arrayOfc);
        bh[] arrayOfbh = new bh[this.g.size()];
        this.g.toArray(arrayOfbh);
        Arrays.sort(arrayOfbh);
        for (int i1 = 0; i1 < arrayOfz.length; i1++)
          ((dg)arrayOfz[i1]).a(localcd);
        for (i1 = 0; i1 < arrayOfc.length; i1++)
          ((n)arrayOfc[i1]).a(localcd);
        for (i1 = 0; i1 < arrayOfbh.length; i1++)
          ((cl)arrayOfbh[i1]).a(localcd);
        localcd.a(arrayOfbh);
        localcd.a(arrayOfz);
        localcd.a(arrayOfc);
        ((dk)localcd.f()).a(paramInt);
      }
    }
    if (!this.z.isEmpty())
    {
      this.f = ((List)this.z.pop());
      this.q = ((List)this.A.pop());
      this.g = ((List)this.B.pop());
    }
    else
    {
      this.f.clear();
      this.q.clear();
      this.g.clear();
    }
    super.c(paramString, paramInt);
  }

  public void a(String paramString, int paramInt1, com.zend.ide.m.g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
    com.zend.ide.b.m localm = di.a(this.d, paramInt2, paramInt3, paramInt4, 0);
    String str = null;
    Object localObject2;
    Object localObject3;
    if (paramg != null)
    {
      localObject1 = paramg.a(12);
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        localObject3 = ((j)localObject2).a().trim();
        String[] arrayOfString = ((String)localObject3).split(" ");
        str = arrayOfString[0];
      }
    }
    Object localObject1 = new StringTokenizer(paramString, ",", false);
    while (((StringTokenizer)localObject1).hasMoreTokens())
    {
      localObject2 = ((StringTokenizer)localObject1).nextToken().substring(1);
      localObject3 = di.a((String)localObject2, paramInt1, str, paramg, localm);
      a((String)localObject2, str, null, 0, 0, false);
      this.f.add(localObject3);
    }
  }

  public void a(String paramString, com.zend.ide.m.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    com.zend.ide.b.m localm = di.a(this.d, paramInt1, paramInt2, paramInt3, 0);
    com.zend.ide.m.c localc = di.a(paramString, paramg, localm);
    this.q.add(localc);
  }

  public void a(String paramString, com.zend.ide.m.g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return;
    if ((paramString.charAt(0) == '\'') || (paramString.charAt(0) == '"'))
      paramString = paramString.substring(1, paramString.length() - 1);
    else
      return;
    com.zend.ide.b.m localm = di.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4);
    r localr = di.a(paramString, paramg, localm);
    this.i.add(localr);
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void b()
  {
    this.o = true;
  }

  public void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramString1 == null)
      return;
    String[] arrayOfString;
    String str1;
    Object localObject;
    if (("SoapClient".equalsIgnoreCase(paramString2)) && (paramString3 != null) && (!C))
    {
      arrayOfString = paramString3.split(",");
      str1 = arrayOfString[0];
      if ((str1 == null) || (str1.charAt(0) == '$') || (str1.length() <= 2))
        return;
      str1 = str1.substring(1, str1.length() - 1);
      try
      {
        com.zend.ide.b.m localm = di.a(this.d, paramInt2, paramInt2, paramInt2, paramInt1);
        localObject = h.m.g(this.d).getParentFile();
        v localv = com.zend.ide.f.yb.d.a().a(str1, (File)localObject, localm);
        if (localv != null)
        {
          this.n.a(a(), paramString1, localv.a(), false, paramInt1, paramInt2);
          String str3 = localv.a();
          for (int i1 = 0; i1 < this.r.size(); i1++)
            if (str3.equals(((v)this.r.get(i1)).a()))
              return;
          this.r.add(localv);
        }
        return;
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
      }
      catch (SAXException localSAXException)
      {
      }
      catch (IOException localIOException)
      {
      }
    }
    if (("Java".equalsIgnoreCase(paramString2)) && (paramString3 != null) && (!C))
    {
      arrayOfString = paramString3.split(",");
      if (arrayOfString.length == 0)
        return;
      try
      {
        str1 = arrayOfString[0];
        if ((str1 == null) || (str1.charAt(0) == '$') || (str1.length() <= 2))
          return;
        str1 = str1.substring(1, str1.length() - 1);
        String str2 = com.zend.ide.f.zc.b.m.a(str1);
        if (str2 != str1)
        {
          this.n.a(a(), paramString1);
          return;
        }
        localObject = f.a().a(str1, this.d, paramInt2);
        if (localObject != null)
        {
          this.v.add(localObject);
          this.n.a(a(), paramString1, ((v)localObject).a(), paramBoolean, paramInt1, paramInt2);
          return;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
      }
    }
    this.n.a(a(), paramString1, paramString2, paramBoolean, paramInt1, paramInt2);
  }

  public void b(String paramString, int paramInt)
  {
    this.n.a(a(), paramString);
  }

  public void c(String paramString)
  {
    x localx = di.a(paramString.substring(1), true, null, null);
    this.n.a(a(), localx);
  }

  public void d(String paramString)
  {
    super.d(paramString);
    this.d = paramString;
    this.n = new bv();
    this.e.clear();
    this.h.clear();
    this.r.clear();
    this.v.clear();
    this.f.clear();
    this.q.clear();
    this.g.clear();
    this.i.clear();
    this.j.clear();
    this.l.clear();
    this.m.clear();
    this.k.clear();
    this.x.clear();
    this.y.clear();
    this.z.clear();
    this.A.clear();
    this.B.clear();
    this.w = null;
  }

  private void a(int paramInt)
  {
    boolean bool = !f().equals("");
    if (!c().equals(""))
    {
      a(c(), bool, paramInt);
      a(paramInt);
    }
    if (bool)
    {
      c(f(), paramInt);
      a(paramInt);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    a(paramInt1);
    v[] arrayOfv1 = new v[this.h.size()];
    this.h.toArray(arrayOfv1);
    v[] arrayOfv2 = new v[this.r.size()];
    this.r.toArray(arrayOfv2);
    v[] arrayOfv3 = new v[this.v.size()];
    this.v.toArray(arrayOfv3);
    bh[] arrayOfbh = new bh[this.e.size()];
    this.e.toArray(arrayOfbh);
    r[] arrayOfr = new r[this.i.size()];
    this.i.toArray(arrayOfr);
    bc[] arrayOfbc = new bc[this.j.size()];
    this.j.toArray(arrayOfbc);
    if (this.l.size() % 2 == 1)
      this.l.add(di.a(this.d, paramInt1, paramInt1, paramInt1, 0));
    com.zend.ide.m.d[] arrayOfd = new com.zend.ide.m.d[this.l.size() + 1 >> 1];
    for (int i1 = 0; i1 < arrayOfd.length; i1++)
    {
      int i2 = i1 << 1;
      localObject = (com.zend.ide.b.m)this.l.get(i2);
      com.zend.ide.b.m localm2;
      if (i2 + 1 < this.l.size())
        localm2 = (com.zend.ide.b.m)this.l.get(i2 + 1);
      else
        localm2 = (com.zend.ide.b.m)this.l.get(i2);
      arrayOfd[i1] = new com.zend.ide.m.d((com.zend.ide.b.m)localObject, localm2);
    }
    a(arrayOfv1, arrayOfbh);
    bk localbk = this.n.b();
    com.zend.ide.b.m localm1 = di.a(this.d, 0, 0, 0, paramInt2);
    Object localObject = new bd[this.m.size()];
    this.m.toArray(localObject);
    long l1 = h.m.g(this.d).lastModified();
    bf localbf = di.a(this.d, localm1, arrayOfv1, arrayOfv2, arrayOfv3, arrayOfbh, localbk, arrayOfr, localObject, arrayOfbc, arrayOfd, this.s, l1);
    for (int i3 = 0; i3 < arrayOfv1.length; i3++)
      ((cd)arrayOfv1[i3]).a(localbf);
    for (i3 = 0; i3 < arrayOfv2.length; i3++)
      ((cd)arrayOfv2[i3]).a(localbf);
    for (i3 = 0; i3 < arrayOfv3.length; i3++)
      ((cd)arrayOfv3[i3]).a(localbf);
    bp.d().b().a(localbf);
  }

  private void a(v[] paramArrayOfv, bh[] paramArrayOfbh)
  {
    bk localbk = this.n.b();
    Map localMap = localbk.b();
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    LinkedList localLinkedList3 = new LinkedList();
    LinkedList localLinkedList4 = new LinkedList();
    LinkedList localLinkedList5 = new LinkedList();
    LinkedList localLinkedList6 = new LinkedList();
    Set localSet = localMap.keySet();
    Iterator localIterator1 = localSet.iterator();
    while (localIterator1.hasNext())
    {
      localObject1 = (String)localIterator1.next();
      localObject2 = ((String)localObject1).split(";");
      localObject3 = null;
      localObject4 = null;
      localObject5 = null;
      if ((localObject2[0].equals("this")) && (localObject2.length > 3))
      {
        int i1 = localObject2.length;
        localObject5 = localObject2[(i1 - 1)];
        localObject4 = localObject2[(i1 - 2)];
        for (int i2 = i1 - 3; i2 >= 0; i2--)
        {
          if (localObject2[i2].equals("null"))
            continue;
          localObject3 = localObject2[i2] + ";" + (String)localObject3;
        }
      }
      else
      {
        if (localObject2.length >= 3)
          localObject5 = localObject2[2];
        if (localObject2.length >= 2)
          localObject4 = localObject2[1];
        if (localObject2.length >= 1)
          localObject3 = localObject2[0];
      }
      localObject6 = bl.a((String)localObject4, (String)localObject5);
      List localList = (List)localMap.get(localObject1);
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext())
      {
        q localq = (q)localIterator2.next();
        String str = localq.c();
        int i3 = localq.d();
        int i4 = localq.a();
        boolean bool = localq.b();
        if ((str != null) && (str.startsWith("r_variable")))
          str = a(str, i4, i3, paramArrayOfv, paramArrayOfbh);
        localLinkedList1.add(localObject3);
        localLinkedList2.add(localObject6);
        localLinkedList3.add(str);
        localLinkedList4.add(Integer.valueOf(i3));
        localLinkedList5.add(Integer.valueOf(i4));
        localLinkedList6.add(Boolean.valueOf(bool));
      }
    }
    localMap.clear();
    Object localObject1 = localLinkedList2.iterator();
    Object localObject2 = localLinkedList1.iterator();
    Object localObject3 = localLinkedList3.iterator();
    Object localObject4 = localLinkedList4.iterator();
    Object localObject5 = localLinkedList5.iterator();
    Object localObject6 = localLinkedList6.iterator();
    while (((Iterator)localObject1).hasNext())
      this.n.a((vb)((Iterator)localObject1).next(), (String)((Iterator)localObject2).next(), (String)((Iterator)localObject3).next(), ((Boolean)((Iterator)localObject6).next()).booleanValue(), ((Integer)((Iterator)localObject4).next()).intValue(), ((Integer)((Iterator)localObject5).next()).intValue());
  }

  private String a(String paramString, int paramInt1, int paramInt2, v[] paramArrayOfv, bh[] paramArrayOfbh)
  {
    String[] arrayOfString = paramString.split(";");
    String str = null;
    int i1 = 1;
    if (arrayOfString.length < 2)
      return null;
    if (arrayOfString.length == 2)
      return bg.a(this.d, arrayOfString[1], paramInt1, paramInt2, bp.d().b(), true);
    if (arrayOfString[1].equals("function_call"))
    {
      str = a(arrayOfString[2], paramInt1, paramArrayOfv, paramArrayOfbh);
      i1 = 3;
    }
    else
    {
      i1 = 2;
      str = arrayOfString[1];
      if (str.charAt(0) == '$')
        str = bg.a(this.d, str, paramInt1, paramInt2, bp.d().b(), true);
    }
    while (i1 < arrayOfString.length)
    {
      if (!arrayOfString[i1].equals("null"))
      {
        str = a(str, arrayOfString[i1], paramArrayOfv, paramArrayOfbh);
        if ((str != null) && (str.equals("-")))
        {
          str = null;
          break;
        }
      }
      i1++;
    }
    return str;
  }

  private String a(String paramString, int paramInt, v[] paramArrayOfv, bh[] paramArrayOfbh)
  {
    for (int i1 = 0; i1 < paramArrayOfv.length; i1++)
    {
      v localv = paramArrayOfv[i1];
      com.zend.ide.b.m localm = localv.f();
      if ((paramInt > localm.d()) && (paramInt <= localm.e()))
        return a(localv.a(), paramString, paramArrayOfv, paramArrayOfbh);
    }
    return a(null, paramString, paramArrayOfv, paramArrayOfbh);
  }

  private String a(String paramString1, String paramString2, com.zend.ide.b.d[] paramArrayOfd1, com.zend.ide.b.d[] paramArrayOfd2)
  {
    Object localObject;
    if (paramString1 == null)
    {
      str = a(paramString2, paramArrayOfd2);
      if (str == null)
      {
        localObject = bp.d().b();
        str = a(paramString2, ((s)localObject).c());
      }
      return str;
    }
    String str = b(paramString1, paramString2, paramArrayOfd1, paramArrayOfd2);
    if (str == null)
    {
      localObject = bp.d().b();
      str = b(paramString1, paramString2, ((s)localObject).f(), ((s)localObject).c());
    }
    if (str == null)
      try
      {
        localObject = f.a().a(paramString1, "", 0);
        com.zend.ide.b.d[] arrayOfd = ((v)localObject).b(paramString2);
        if ((arrayOfd != null) && (arrayOfd.length != 0))
          for (int i1 = 0; str == null; i1++)
          {
            if (!(arrayOfd[i1] instanceof bh))
              continue;
            bh localbh = (bh)arrayOfd[i1];
            str = localbh.d();
          }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
      }
    return (String)str;
  }

  private String b(String paramString1, String paramString2, com.zend.ide.b.d[] paramArrayOfd1, com.zend.ide.b.d[] paramArrayOfd2)
  {
    for (int i1 = 0; i1 < paramArrayOfd1.length; i1++)
    {
      v localv = (v)paramArrayOfd1[i1];
      if (!localv.a().equals(paramString1))
        continue;
      Object localObject;
      String str;
      if (paramString2.charAt(0) == '*')
      {
        localObject = localv.g();
        str = b(paramString2.substring(1), localObject);
      }
      else
      {
        localObject = localv.h();
        str = a(paramString2, localObject);
      }
      if ((str == null) && (localv.c() != null))
      {
        localObject = localv.c().a();
        str = b((String)localObject, paramString2, paramArrayOfd1, paramArrayOfd2);
      }
      return str;
    }
    return (String)null;
  }

  private String a(String paramString, com.zend.ide.b.d[] paramArrayOfd)
  {
    for (int i1 = 0; i1 < paramArrayOfd.length; i1++)
    {
      bh localbh = (bh)paramArrayOfd[i1];
      if (!paramString.equals(localbh.a()))
        continue;
      String str = localbh.d();
      if ((str.equals("void")) || (str.equals("unknown")))
        return "-";
      return str;
    }
    return null;
  }

  private String b(String paramString, com.zend.ide.b.d[] paramArrayOfd)
  {
    for (int i1 = 0; i1 < paramArrayOfd.length; i1++)
    {
      z localz = (z)paramArrayOfd[i1];
      if (!paramString.equals(localz.a()))
        continue;
      String str = localz.c();
      if ((str != null) && (str.equals("unknown")))
        return "-";
      return str;
    }
    return null;
  }

  public void b(int paramInt1, int paramInt2)
  {
    this.l.add(di.a(this.d, paramInt1, paramInt2, paramInt2, 0));
  }

  public void c(int paramInt1, int paramInt2)
  {
    this.l.add(di.a(this.d, paramInt1, paramInt2, paramInt1, 0));
  }

  public void a(com.zend.ide.m.g paramg)
  {
    this.s = paramg;
  }

  public void a(String paramString1, String paramString2, com.zend.ide.m.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramString1.charAt(0);
    if ((i1 == 34) || (i1 == 39))
      paramString1 = paramString1.substring(1);
    i1 = paramString1.charAt(paramString1.length() - 1);
    if ((i1 == 34) || (i1 == 39))
      paramString1 = paramString1.substring(0, paramString1.length() - 1);
    com.zend.ide.b.m localm = di.a(this.d, paramInt1, paramInt2, paramInt3, 0);
    this.m.add(di.a(paramString1, paramString2, localm, paramg));
  }

  public void a(int paramInt1, String paramString, short[] paramArrayOfShort, int paramInt2, int paramInt3, int paramInt4)
  {
    String str1 = "";
    int i1;
    if (paramInt1 == (u ? 0 : 0))
    {
      i1 = 1;
      str1 = ct.a(1017);
    }
    else if (paramInt1 == (u ? 14 : 14))
    {
      i1 = 1;
      paramInt3 = paramInt2 + paramString.trim().length();
      str1 = ct.a(1018);
    }
    else
    {
      i1 = (paramString != null) && (paramString.trim().length() > 0) ? 1 : 0;
      if (i1 != 0)
      {
        str1 = paramString.trim();
        paramInt3 = paramInt2 + str1.length();
        str1 = '\'' + str1 + '\'';
      }
    }
    com.zend.ide.util.d.g localg = new com.zend.ide.util.d.g();
    for (int i2 = 0; i2 < paramArrayOfShort.length; i2 += 2)
    {
      int i3 = paramArrayOfShort[i2];
      localObject = d(i3);
      if ((localObject == null) || (((String)localObject).equals("")))
        continue;
      localg.b(i3);
    }
    i2 = localg.e();
    if (i2 > 3)
      i2 = 0;
    String str2 = "";
    if (i1 == 0)
      switch (i2)
      {
      case 0:
        str2 = ct.a(971);
        break;
      case 1:
        str2 = ct.a(972, d(localg.c(0)));
        break;
      case 2:
        str2 = ct.a(973, d(localg.c(0)), d(localg.c(1)));
        break;
      case 3:
        str2 = ct.a(974, d(localg.c(0)), d(localg.c(1)), d(localg.c(2)));
      }
    else
      switch (i2)
      {
      case 0:
        str2 = ct.a(975, str1);
        break;
      case 1:
        str2 = ct.a(976, str1, d(localg.c(0)));
        break;
      case 2:
        str2 = ct.a(977, str1, d(localg.c(0)), d(localg.c(1)));
        break;
      case 3:
        str2 = ct.a(978, str1, d(localg.c(0)), d(localg.c(1)), d(localg.c(2)));
      }
    Object localObject = di.a(this.d, paramInt2, paramInt3, paramInt2, paramInt4);
    this.j.add(new bc(str2, (com.zend.ide.b.m)localObject));
  }

  private static String d(int paramInt)
  {
    String str = (String)p.b(paramInt);
    if (str != null)
      return '\'' + str + '\'';
    if (paramInt == (u ? 6 : 6))
      return ct.a(1019);
    if (paramInt == (u ? 8 : 8))
      return ct.a(1020);
    return null;
  }

  private void a()
  {
    if (u)
      d();
    else
      c();
  }

  private void c()
  {
    p.c();
    p.a(107, "++");
    p.a(108, "--");
    p.a(91, "===");
    p.a(92, "!==");
    p.a(89, "==");
    p.a(90, "!=");
    p.a(93, "<=+");
    p.a(94, ">=+");
    p.a(71, "+=");
    p.a(72, "-=");
    p.a(73, "*=");
    p.a(74, "/=");
    p.a(75, ".=");
    p.a(76, "%=");
    p.a(80, "<<=");
    p.a(81, ">>=");
    p.a(77, "&=");
    p.a(78, "|+");
    p.a(79, "^=");
    p.a(84, "||");
    p.a(85, "&&");
    p.a(66, "OR");
    p.a(68, "AND");
    p.a(67, "XOR");
    p.a(97, "<<");
    p.a(98, ">>");
    p.a(83, ";");
    p.a(126, ":");
    p.a(65, ",");
    p.a(106, ".");
    p.a(117, "[");
    p.a(118, "]");
    p.a(124, "(");
    p.a(125, ")");
    p.a(86, "|");
    p.a(87, "^");
    p.a(88, "&");
    p.a(99, "+");
    p.a(100, "-");
    p.a(102, "/");
    p.a(101, "*");
    p.a(70, "=");
    p.a(103, "%");
    p.a(104, "!");
    p.a(105, "~");
    p.a(127, "$");
    p.a(95, "<");
    p.a(96, ">");
    p.a(82, "?");
    p.a(116, "@");
    p.a(2, "exit");
    p.a(32, "function");
    p.a(34, "const");
    p.a(35, "return");
    p.a(3, "if");
    p.a(121, "elseif");
    p.a(120, "endif");
    p.a(122, "else");
    p.a(17, "while");
    p.a(18, "endwhile");
    p.a(16, "do");
    p.a(19, "for");
    p.a(20, "endfor");
    p.a(21, "foreach");
    p.a(22, "endforeach");
    p.a(25, "as");
    p.a(26, "switch");
    p.a(27, "endswitch");
    p.a(28, "case");
    p.a(29, "default");
    p.a(30, "break");
    p.a(31, "continue");
    p.a(15, "echo");
    p.a(69, "print");
    p.a(42, "class");
    p.a(33, "old_function");
    p.a(43, "extends");
    p.a(119, "new");
    p.a(62, "eval");
    p.a(60, "include");
    p.a(61, "include_once");
    p.a(63, "require");
    p.a(64, "require_once");
    p.a(36, "use");
    p.a(37, "global");
    p.a(40, "isset");
    p.a(41, "empty");
    p.a(123, "static");
    p.a(39, "unset");
    p.a(46, "array");
    p.a(38, "var");
    p.a(23, "declare");
    p.a(24, "enddeclare");
    p.a(44, "->");
    p.a(57, "::");
    p.a(56, "}");
    p.a(55, "{");
    p.a(45, "=>");
    p.a(54, "${");
  }

  private void d()
  {
    p.c();
    p.a(115, "++");
    p.a(116, "--");
    p.a(99, "===");
    p.a(100, "!==");
    p.a(97, "==");
    p.a(98, "!=");
    p.a(101, "<=+");
    p.a(102, ">=+");
    p.a(79, "+=");
    p.a(80, "-=");
    p.a(81, "*=");
    p.a(82, "/=");
    p.a(83, ".=");
    p.a(84, "%=");
    p.a(88, "<<=");
    p.a(89, ">>=");
    p.a(85, "&=");
    p.a(86, "|+");
    p.a(87, "^=");
    p.a(92, "||");
    p.a(93, "&&");
    p.a(74, "OR");
    p.a(76, "AND");
    p.a(75, "XOR");
    p.a(105, "<<");
    p.a(106, ">>");
    p.a(91, ";");
    p.a(139, ":");
    p.a(73, ",");
    p.a(114, ".");
    p.a(125, "[");
    p.a(126, "]");
    p.a(137, "(");
    p.a(138, ")");
    p.a(94, "|");
    p.a(95, "^");
    p.a(96, "&");
    p.a(107, "+");
    p.a(108, "-");
    p.a(110, "/");
    p.a(109, "*");
    p.a(78, "=");
    p.a(111, "%");
    p.a(112, "!");
    p.a(113, "~");
    p.a(140, "$");
    p.a(103, "<");
    p.a(104, ">");
    p.a(90, "?");
    p.a(124, "@");
    p.a(2, "exit");
    p.a(34, "function");
    p.a(35, "const");
    p.a(36, "return");
    p.a(3, "if");
    p.a(129, "elseif");
    p.a(128, "endif");
    p.a(130, "else");
    p.a(17, "while");
    p.a(18, "endwhile");
    p.a(16, "do");
    p.a(19, "for");
    p.a(20, "endfor");
    p.a(21, "foreach");
    p.a(22, "endforeach");
    p.a(27, "as");
    p.a(28, "switch");
    p.a(29, "endswitch");
    p.a(30, "case");
    p.a(31, "default");
    p.a(32, "break");
    p.a(33, "continue");
    p.a(15, "echo");
    p.a(77, "print");
    p.a(47, "class");
    p.a(37, "try");
    p.a(38, "catch");
    p.a(39, "throw");
    p.a(25, "instanceof");
    p.a(48, "interface");
    p.a(50, "implements");
    p.a(132, "abstract");
    p.a(133, "final");
    p.a(134, "private");
    p.a(135, "protected");
    p.a(136, "public");
    p.a(49, "extends");
    p.a(127, "new");
    p.a(70, "eval");
    p.a(68, "include");
    p.a(69, "include_once");
    p.a(71, "require");
    p.a(72, "require_once");
    p.a(40, "use");
    p.a(41, "global");
    p.a(44, "isset");
    p.a(45, "empty");
    p.a(131, "static");
    p.a(43, "unset");
    p.a(53, "array");
    p.a(42, "var");
    p.a(23, "declare");
    p.a(24, "enddeclare");
    p.a(51, "->");
    p.a(65, "::");
    p.a(64, "}");
    p.a(63, "{");
    p.a(52, "=>");
    p.a(62, "${");
  }

  private boolean e()
  {
    return b.a("desktop.phpVersion").c().toString().equals("PHP5");
  }

  static boolean b(boolean paramBoolean)
  {
    return p.u = paramBoolean;
  }

  static boolean a(p paramp)
  {
    return paramp.e();
  }

  static void b(p paramp)
  {
    paramp.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.p
 * JD-Core Version:    0.6.0
 */