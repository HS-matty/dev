package com.zend.ide.f.zc.b;

import com.zend.ide.desktop.bx;
import com.zend.ide.desktop.cj;
import com.zend.ide.f.di;
import com.zend.ide.f.zc.a.b;
import com.zend.ide.l.eb;
import com.zend.ide.l.g;
import com.zend.ide.l.u;
import com.zend.ide.l.w;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.i;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.cl;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class f
  implements w
{
  private static final f a;
  private d b;
  private boolean c;
  private final Map d = new WeakHashMap();
  static final boolean e = !f.class.desiredAssertionStatus();

  public static final f a()
  {
    return a;
  }

  private f()
  {
    c();
    a(b());
  }

  public final void a(c paramc)
  {
    if ((!e) && (paramc == null))
      throw new AssertionError();
    this.b = paramc;
    this.d.clear();
  }

  public final com.zend.ide.m.v a(String paramString1, String paramString2, int paramInt)
    throws ClassNotFoundException
  {
    return a(new String[] { paramString1 }, new String[] { paramString2 }, new int[] { paramInt })[0];
  }

  public com.zend.ide.m.v[] a(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
    throws ClassNotFoundException
  {
    c();
    com.zend.ide.m.v[] arrayOfv = new com.zend.ide.m.v[paramArrayOfString1.length];
    Class[] arrayOfClass = this.b.a(paramArrayOfString1);
    for (int i = 0; i < paramArrayOfString1.length; i++)
    {
      String str = paramArrayOfString1[i];
      com.zend.ide.m.v localv = (com.zend.ide.m.v)this.d.get(str);
      if (localv != null)
      {
        arrayOfv[i] = localv;
      }
      else
      {
        Class localClass = arrayOfClass[i];
        com.zend.ide.b.m localm = di.a(paramArrayOfString2[i], paramArrayOfInt[i], paramArrayOfInt[i], paramArrayOfInt[i], 0);
        z[] arrayOfz = a(localClass.getFields(), localm);
        bh[] arrayOfbh = a(localClass.getMethods(), localm);
        Arrays.sort(arrayOfbh);
        Arrays.sort(arrayOfz);
        y localy = di.a("Java", localm);
        i locali = new i("", "", new com.zend.ide.m.j[0], 1);
        arrayOfv[i] = di.a(str, 1, locali, localm, localy, di.h, arrayOfz, di.j, arrayOfbh);
        this.d.put(str, arrayOfv[i]);
      }
    }
    return arrayOfv;
  }

  protected z[] a(Field[] paramArrayOfField, com.zend.ide.b.m paramm)
  {
    z[] arrayOfz = new z[paramArrayOfField.length];
    for (int i = 0; i < paramArrayOfField.length; i++)
    {
      Field localField = paramArrayOfField[i];
      String str = a(localField.getType());
      i locali = new i("", "", new com.zend.ide.m.j[0], 3);
      arrayOfz[i] = di.a(localField.getName(), a(localField.getModifiers()), str, locali, paramm);
    }
    return arrayOfz;
  }

  protected final int a(int paramInt)
  {
    int i = 0;
    i |= (Modifier.isAbstract(paramInt) ? 1024 : 0);
    i |= (Modifier.isFinal(paramInt) ? 16 : 0);
    i |= (Modifier.isPrivate(paramInt) ? 2 : 0);
    i |= (Modifier.isProtected(paramInt) ? 4 : 0);
    i |= (Modifier.isPublic(paramInt) ? 1 : 0);
    i |= (Modifier.isStatic(paramInt) ? 8 : 0);
    i |= (Modifier.isInterface(paramInt) ? 512 : 0);
    return i;
  }

  protected bi[] a(Class[] paramArrayOfClass, com.zend.ide.b.m paramm)
  {
    bi[] arrayOfbi = new bi[paramArrayOfClass.length];
    for (int i = 0; i < paramArrayOfClass.length; i++)
    {
      Class localClass = paramArrayOfClass[i];
      String str = a(localClass);
      arrayOfbi[i] = di.a("arg" + Integer.toString(i), paramm, false, false, str, null);
    }
    return arrayOfbi;
  }

  protected c b()
  {
    if (g.b != null)
      try
      {
        com.zend.ide.l.l locall = (com.zend.ide.l.l)g.b.d().get("javaBridge");
        if (locall != null)
        {
          localObject = (eb)locall.b();
          return ((eb)localObject).b();
        }
        cl.a("Project's Java Bridge memento was null");
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
      }
    j localj = l.b();
    Object localObject = new c("JavaBuildPath");
    ((c)localObject).a(0, localj);
    localj.a();
    return (c)localObject;
  }

  private void c()
  {
    if ((!this.c) && (cj.J != null))
    {
      cj.J.f().a(this);
      this.c = true;
      a(b());
    }
  }

  private bh[] a(Method[] paramArrayOfMethod, com.zend.ide.b.m paramm)
  {
    bh[] arrayOfbh = new bh[paramArrayOfMethod.length];
    for (int i = 0; i < paramArrayOfMethod.length; i++)
    {
      Method localMethod = paramArrayOfMethod[i];
      bi[] arrayOfbi = a(localMethod.getParameterTypes(), paramm);
      int j = a(localMethod.getModifiers());
      String str = a(localMethod.getReturnType());
      i locali = new i("", "", new com.zend.ide.m.j[0], 2);
      arrayOfbh[i] = di.a(localMethod.getName(), j, locali, paramm, arrayOfbi, str);
    }
    return arrayOfbh;
  }

  public String[] a(String paramString)
  {
    b localb1 = this.b.a();
    if ((!e) && (localb1 == null))
      throw new AssertionError();
    int i = paramString.lastIndexOf('.');
    String str1;
    String str2;
    if (i > 0)
    {
      str1 = paramString.substring(0, i);
      str2 = paramString.substring(i + 1);
    }
    else
    {
      str1 = paramString.substring(0, 0);
      str2 = paramString;
    }
    b localb2 = str1.length() != 0 ? localb1.c(str1) : localb1;
    if (localb2 == null)
      return new String[0];
    Collection localCollection = localb2.b();
    if (localCollection.size() == 0)
      return new String[0];
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localCollection.iterator();
    while (localIterator.hasNext())
    {
      b localb3 = (b)localIterator.next();
      String str3 = localb3.a();
      if (str3.startsWith(str2))
        localArrayList.add(str3);
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public String[] b(String paramString)
  {
    b localb1 = this.b.a();
    if ((!e) && (localb1 == null))
      throw new AssertionError();
    int i = paramString.lastIndexOf('.');
    String str1 = i != -1 ? paramString.substring(0, i) : paramString.substring(0, 0);
    String str2 = i != -1 ? paramString.substring(i + 1).toLowerCase() : paramString.toLowerCase();
    b localb2 = localb1.c(str1);
    if (localb2 == null)
      return new String[0];
    Set localSet = localb2.c();
    if (localSet.size() == 0)
      return new String[0];
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      if (str3.toLowerCase().startsWith(str2))
        localArrayList.add(str3);
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  private String a(Class paramClass)
  {
    return paramClass.isArray() ? m.a(paramClass.getComponentType().getName()) + "[]" : m.a(paramClass.getName());
  }

  public void c(u paramu)
  {
  }

  public void a(u paramu)
  {
  }

  public void d(u paramu)
  {
    a(b());
  }

  public void b(u paramu)
  {
    a(b());
  }

  public void a(File paramFile)
  {
  }

  public void t(File paramFile)
  {
  }

  public void r(File paramFile)
  {
  }

  public void c(File paramFile, boolean paramBoolean)
  {
  }

  public void s(File paramFile)
  {
  }

  public void c(File paramFile1, File paramFile2)
  {
  }

  public void a(File[] paramArrayOfFile)
  {
  }

  public void b(File[] paramArrayOfFile)
  {
  }

  static
  {
    a = new f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.f
 * JD-Core Version:    0.6.0
 */