package com.zend.ide.f;

import com.zend.ide.b.h;
import com.zend.ide.bf.m;
import com.zend.ide.bf.r;
import com.zend.ide.m.bd;
import com.zend.ide.m.bg;
import com.zend.ide.m.bh;
import com.zend.ide.m.bj;
import com.zend.ide.m.k;
import com.zend.ide.m.x;
import com.zend.ide.n.bw;
import com.zend.ide.n.sb;
import com.zend.ide.s.j;
import com.zend.ide.s.kc;
import com.zend.ide.y.e;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class cj extends j
{
  protected static final char[] e = { '?', ':', ';', '|', '^', '&', '<', '>', '+', '-', '.', '*', '/', '%', '!', '~', '[', ']', '(', ')', '{', '}', '@', '\n', '\t', ' ', ',', '$', '\'', '"' };
  protected static final char[] V = { '?', ':', ';', '|', '^', '&', '<', '>', '+', '-', '*', '/', '%', '!', '~', '[', ']', '(', ')', '{', '}', '@', '\n', '\t', ' ', ',', '$', '\'', '"' };
  private static final Pattern j = Pattern.compile("\\Wextends\\W", 2);
  private static final Pattern k = Pattern.compile("\\Wimplements", 2);
  private static final Pattern l = Pattern.compile("catch\\s[^{]*", 2);
  protected static final s u = bp.d().b();
  private boolean m;
  private boolean n;
  private boolean W;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean h;
  private boolean s;
  private int t;
  private boolean L;
  protected ca v = new ca(this);
  private ca M = new dw(this, null);
  private ca R = new wb(this, null);
  private ca w = new cc(this, null);
  private ca x = new cb(this, null);
  private ca S = new xb(this, null);
  protected ca y;
  private bz z;
  private static boolean o = false;
  private static boolean X = com.zend.ide.util.f.a.a.b();
  private static com.zend.ide.b.d[] T;
  private static com.zend.ide.b.d[] Y;
  private static com.zend.ide.b.d[] Z;
  private e f;
  private PropertyChangeListener A = new u(this, null);
  private PropertyChangeListener B = new be(this, null);
  private PropertyChangeListener C = new z(this, null);
  private PropertyChangeListener D = new v(this, null);
  private PropertyChangeListener E = new y(this, null);
  private PropertyChangeListener F = new w(this, null);
  private PropertyChangeListener G = new bf(this, null);
  private PropertyChangeListener H = new bc(this, null);
  private PropertyChangeListener P = new dt(this, null);
  private PropertyChangeListener I = new bk(this, null);
  private PropertyChangeListener J = new bb(this, null);
  private PropertyChangeListener K = new ba(this, null);
  private PropertyChangeListener N = new dv(this, null);
  private PropertyChangeListener Q = new dq(this, null);
  private PropertyChangeListener ab = new yd(this, null);
  private PropertyChangeListener U = new oc(this, null);
  private static final cm[] O = { new cm() };

  public cj()
  {
    this.c = new by(this);
    m();
    this.z = new bz();
  }

  public void a(bw parambw)
  {
    super.a(parambw);
    this.z.a(parambw);
  }

  public com.zend.ide.s.z b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.z.a(paramInt2, paramBoolean);
    return this.z;
  }

  public com.zend.ide.s.z a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.y = null;
    c(paramInt1, paramInt2, paramBoolean);
    return this.y;
  }

  protected void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    com.zend.ide.m.bf localbf = u.a(d().k());
    if (localbf == null)
      return;
    sb localsb = k.a(paramInt2, localbf, d(), true);
    if (a(paramInt1, paramInt2, localsb))
      return;
    int i = localsb.length();
    if ((a(paramInt1, paramInt2, localsb, i)) && (!X))
      return;
    if ((paramInt1 == kc.h(142)) || (paramInt1 == kc.h(133)) || (paramInt1 == kc.h(139)))
      return;
    if (c(localsb, paramInt2, paramBoolean))
      return;
    if (b(localsb, paramInt2, paramBoolean))
      return;
    if (a(localsb, paramInt2, paramBoolean))
      return;
    int i1 = k.a(localsb, i);
    int i2 = k.a(localsb, i1, true);
    String str1 = localsb.subSequence(i2, i1).toString();
    boolean bool = i != i1;
    if ((bool) && (a(str1, "", paramInt2, paramBoolean, paramInt1)))
      return;
    if (a(localsb, paramInt2, str1, i2, bool, paramBoolean))
      return;
    i1 = k.a(localsb, i2);
    i2 = k.a(localsb, i1, true);
    String str2 = localsb.subSequence(i2, i1).toString();
    if ((!bool) && (a(str2, str1, paramInt2, paramBoolean, paramInt1)))
      return;
    if ((bool) && (a(str1)))
      return;
    if (a(bool, str2, str1, i2, paramInt2, localsb))
      return;
    if (bool)
      this.y = a("", paramInt2, paramBoolean, paramInt1);
    else
      this.y = a(str1, paramInt2, paramBoolean, paramInt1);
  }

  private static boolean a(String paramString)
  {
    com.zend.ide.b.d[] arrayOfd = u.d(paramString);
    return (arrayOfd != null) && (arrayOfd.length > 0);
  }

  private ca a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if ((!paramBoolean) && (paramString.length() == 0))
      return null;
    if (paramString.startsWith("$"))
    {
      if ((!paramBoolean) && (!this.n))
        return null;
      if (kc.d(paramInt2))
      {
        localObject1 = d().getDocument();
        try
        {
          int i = ((Document)localObject1).getText(paramInt1 - 2, 1).charAt(0);
          if (i == 92)
            return null;
        }
        catch (BadLocationException localBadLocationException)
        {
          localBadLocationException.printStackTrace();
        }
      }
      localObject1 = a(paramInt1 - paramString.length());
      paramString = paramString.substring(1);
      arrayOfd1 = u.a(d().k(), (vb)localObject1, paramString, this.p);
      this.v.a(paramInt1, arrayOfd1, paramString);
      return this.v;
    }
    if (kc.d(paramInt2))
      return null;
    Object localObject1 = null;
    com.zend.ide.b.d[] arrayOfd1 = null;
    com.zend.ide.b.d[] arrayOfd2 = null;
    if ((paramBoolean) || (this.W))
    {
      if (paramString.length() == 0)
        localObject1 = u.c();
      else
        localObject1 = u.c(paramString.substring(0, 1));
      if (!this.r)
        if (paramString.length() == 0)
          arrayOfd1 = u.e();
        else
          arrayOfd1 = u.g(paramString.substring(0, 1));
      arrayOfd2 = s.d();
    }
    com.zend.ide.b.d[] arrayOfd3 = null;
    if ((this.L) && ((paramBoolean) || (this.m)))
      arrayOfd3 = u.f();
    com.zend.ide.bf.d[] arrayOfd;
    if (paramString.length() == 0)
      arrayOfd = r.b().a(paramInt2, "");
    else
      arrayOfd = r.b().a(paramInt2, paramString);
    Object localObject2 = null;
    if (a(d(), paramInt1, paramString))
      localObject2 = O;
    localObject2 = bl.a(arrayOfd, localObject2);
    localObject2 = bl.a(arrayOfd2, localObject2);
    localObject2 = bl.a(arrayOfd3, localObject2);
    localObject2 = bl.a(arrayOfd1, localObject2);
    localObject2 = bl.a(localObject1, localObject2);
    this.M.a(paramInt1, localObject2, paramString);
    return (ca)(ca)this.M;
  }

  private boolean a(boolean paramBoolean, String paramString1, String paramString2, int paramInt1, int paramInt2, sb paramsb)
  {
    int i = 0;
    if ((paramInt1 > 0) && (!paramString2.startsWith("$")))
      if (paramBoolean)
      {
        if ((paramString2.length() == 0) && (paramString1.length() == 0) && (paramsb.charAt(paramInt1 - 1) == '['))
          i = 1;
      }
      else if ((paramString1.length() == 0) && (paramsb.charAt(paramInt1 - 1) == '['))
        i = 1;
    if (i == 0)
      return false;
    int i1 = paramInt1 - 1;
    i1 = k.a(paramsb, i1);
    paramInt1 = k.a(paramsb, i1, true);
    String str = paramsb.subSequence(paramInt1, i1).toString();
    if (str.startsWith("$"))
      str = str.substring(1);
    com.zend.ide.b.d[] arrayOfd1 = u.b(d().k(), str, paramString2, this.q);
    com.zend.ide.b.d[] arrayOfd2;
    com.zend.ide.b.d[] arrayOfd3;
    if (paramString2.length() == 0)
    {
      arrayOfd2 = u.c();
      arrayOfd3 = this.r ? null : u.e();
    }
    else
    {
      arrayOfd2 = u.c(paramString2.substring(0, 1));
      arrayOfd3 = this.r ? null : u.g(paramString2.substring(0, 1));
    }
    com.zend.ide.b.d[] arrayOfd4 = bl.a(arrayOfd2, bl.a(arrayOfd1, arrayOfd3));
    this.x.a(paramInt2, arrayOfd4, paramString2);
    this.y = this.x;
    return true;
  }

  private boolean a(int paramInt1, int paramInt2, sb paramsb)
  {
    if ((paramInt1 != kc.h(142)) && (paramInt1 != kc.h(135)))
      return false;
    int i = paramsb.length();
    int i1 = k.a(paramsb, i);
    int i2 = k.a(paramsb, i1, false);
    if ((i1 != i) && (i2 != i1))
      return false;
    String str1 = paramsb.subSequence(i2, i1).toString();
    i1 = k.a(paramsb, i2);
    int i3 = paramsb.charAt(i1 - 1);
    if ((i3 != 34) && (i3 != 39))
      return false;
    i1--;
    i1 = k.a(paramsb, i1);
    if ((i1 == 0) || (paramsb.charAt(i1 - 1) != '['))
      return false;
    i1--;
    i1 = k.a(paramsb, i1);
    i2 = k.a(paramsb, i1, true);
    String str2 = paramsb.subSequence(i2, i1).toString();
    if (str2.startsWith("$"))
      str2 = str2.substring(1);
    com.zend.ide.b.d[] arrayOfd = u.b(d().k(), str2, str1, this.q);
    this.x.a(paramInt2, arrayOfd, str1);
    this.y = this.x;
    return true;
  }

  private boolean a(sb paramsb, int paramInt1, String paramString, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramInt2 = k.a(paramsb, paramInt2);
    if (paramInt2 <= 2)
      return false;
    int i = 0;
    String str1 = paramsb.subSequence(paramInt2 - 2, paramInt2).toString();
    if (!str1.equals("->"))
      if (str1.equals("::"))
        i = 1;
      else
        return false;
    String str2 = a(paramsb, paramInt2, paramInt1);
    if (str2 == null)
      str2 = "";
    if ((paramBoolean1) && (paramString.length() > 0))
      return a(str2, paramString);
    String str3 = d().k();
    int i1 = paramsb.a(0);
    if (i != 0)
    {
      a(str3, paramInt1, i1, str2, paramString, paramBoolean2);
    }
    else
    {
      boolean bool = !paramsb.toString().trim().equals("$this->");
      a(str3, paramInt1, i1, str2, paramString, bool, paramBoolean2);
    }
    return true;
  }

  private String a(sb paramsb, int paramInt1, int paramInt2)
  {
    paramInt1 = k.a(paramsb, paramInt1);
    boolean bool = false;
    String str1 = paramsb.subSequence(paramInt1 - 2, paramInt1).toString();
    if (!str1.equals("->"))
      if (str1.equals("::"))
        bool = true;
      else
        return null;
    int i = k.a(paramsb, paramInt1 - 2);
    int i1 = k.e(paramsb, i);
    if (i1 == -1)
      return a(paramsb, i, bool, paramInt2);
    int i2 = k.b(paramsb, i1 + 2);
    String str2 = paramsb.subSequence(i2, i).toString();
    String str3 = a(paramsb, i2, paramInt2);
    int i3 = str2.indexOf('(');
    if (i3 == -1)
      return a(d().k(), str3, str2, paramInt2);
    String str4 = str2.substring(0, i3).trim();
    return a(d().k(), str3, str4);
  }

  private String a(sb paramsb, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = k.a(paramsb, paramInt1, true);
    String str1 = paramsb.subSequence(i, paramInt1).toString();
    if (paramBoolean)
    {
      com.zend.ide.m.v localv1;
      if (str1.equals("self"))
      {
        localv1 = b(paramInt2 - 6);
        if (localv1 != null)
          return localv1.a();
      }
      else if (str1.equals("parent"))
      {
        localv1 = b(paramInt2 - 8);
        if (localv1 != null)
          return u.c(d().k(), localv1.a());
      }
      return str1;
    }
    int i1;
    if ((str1.length() > 0) && (str1.charAt(0) == '$'))
    {
      i1 = paramInt2 - paramsb.length();
      return bg.a(d(), str1, i1, u, this.q);
    }
    if (paramsb.charAt(paramInt1 - 1) == ')')
    {
      i1 = a(paramsb, paramInt1 - 1);
      int i2 = k.a(paramsb, i1, false);
      String str2 = paramsb.subSequence(i2, i1).toString();
      com.zend.ide.m.v localv2 = b(paramInt2);
      if (localv2 != null)
        return a(d().k(), localv2.a(), str2);
      com.zend.ide.m.bf localbf = u.a(d().k());
      bh[] arrayOfbh = localbf.d();
      for (int i3 = 0; i3 < arrayOfbh.length; i3++)
      {
        bh localbh = arrayOfbh[i3];
        if (localbh.a().equals(str2))
          return localbh.d();
      }
    }
    return null;
  }

  private int a(sb paramsb, int paramInt)
  {
    if (paramsb.charAt(paramInt) != ')')
      return 0;
    int i = paramInt;
    int i1 = 1;
    while ((i1 != 0) && (i >= 0))
    {
      i--;
      if (paramsb.charAt(i) == ')')
      {
        i1++;
        continue;
      }
      if (paramsb.charAt(i) != '(')
        continue;
      i1--;
    }
    return i;
  }

  private String a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    String str = bg.a(d(), "this;*" + paramString3, paramInt, u, this.q);
    if (str != null)
      return str;
    com.zend.ide.b.d locald = u.a(paramString1, paramString2, paramString3, true);
    if (locald != null)
    {
      if ((locald instanceof com.zend.ide.m.z))
        return ((com.zend.ide.m.z)locald).c();
      return null;
    }
    com.zend.ide.m.v localv = u.a(paramString1, paramString2, true);
    if (localv == null)
      return null;
    com.zend.ide.m.y localy = localv.c();
    if (localy == null)
      return null;
    return a(paramString1, localy.a(), paramString3, paramInt);
  }

  private String a(String paramString1, String paramString2, String paramString3)
  {
    com.zend.ide.b.d locald = u.a(paramString1, paramString2, paramString3);
    if (locald != null)
    {
      if ((locald instanceof bh))
        return ((bh)locald).d();
      return null;
    }
    com.zend.ide.m.v localv = u.a(paramString1, paramString2, false);
    if (localv == null)
      return null;
    String str = null;
    com.zend.ide.m.y localy = localv.c();
    if (localy != null)
      str = a(paramString1, localy.a(), paramString3);
    Object localObject1;
    if (str == null)
    {
      localObject1 = u.a(paramString1);
      bh[] arrayOfbh = ((com.zend.ide.m.bf)localObject1).d();
      for (int i1 = 0; i1 < arrayOfbh.length; i1++)
      {
        bh localbh = arrayOfbh[i1];
        if ((!localbh.a().equals(paramString3)) || (!(localbh instanceof bh)))
          continue;
        str = ((bh)localbh).d();
      }
    }
    if (str == null)
    {
      localObject1 = u.c();
      for (int i = 0; i < localObject1.length; i++)
      {
        Object localObject2 = localObject1[i];
        if ((!localObject2.a().equals(paramString3)) || (!(localObject2 instanceof bh)))
          continue;
        str = ((bh)localObject2).d();
      }
    }
    return (String)str;
  }

  private void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    com.zend.ide.b.d[] arrayOfd1 = null;
    if ((paramBoolean2) || (this.W))
      arrayOfd1 = u.b(paramString1, paramString2, "");
    com.zend.ide.b.d[] arrayOfd2 = null;
    if ((paramBoolean2) || (this.n))
    {
      arrayOfd2 = u.c(paramString1, paramString2, "");
      if (this.g)
        arrayOfd2 = bl.a(arrayOfd2, bl.b);
    }
    com.zend.ide.b.d[] arrayOfd3 = bl.a(bl.a(arrayOfd1, arrayOfd2), a(paramString1, paramString2, paramInt2, paramBoolean1));
    this.v.a(paramInt1, arrayOfd3, paramString3);
    this.y = this.v;
  }

  private void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean)
  {
    com.zend.ide.b.d[] arrayOfd1 = null;
    if ((paramBoolean) || (this.W))
      arrayOfd1 = u.b(paramString1, paramString2, "");
    com.zend.ide.b.d[] arrayOfd2 = null;
    if ((paramBoolean) || (this.n))
      arrayOfd2 = bl.a(u.c(paramString1, paramString2, ""), u.d(paramString1, paramString2, ""));
    com.zend.ide.b.d[] arrayOfd3 = bl.a(bl.a(arrayOfd1, arrayOfd2), a(paramString1, paramString2, paramInt2, false));
    this.S.a(paramInt1, arrayOfd3, paramString3);
    this.y = this.S;
  }

  private boolean a(String paramString1, String paramString2)
  {
    com.zend.ide.b.d locald = u.a(d().k(), paramString1, paramString2);
    return locald != null;
  }

  private rb a(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    vb localvb = a(paramInt);
    String str1 = localvb.a();
    if (str1.equals(paramString2))
      return bl.e;
    if (paramBoolean)
      return bl.g;
    if (str1.equals(""))
      return bl.i;
    com.zend.ide.m.v localv = u.a(paramString1, str1, false);
    for (String str2 = localv.c().a(); str2 != null; str2 = localv.c().a())
    {
      if (str2.equals(paramString2))
        return bl.h;
      localv = u.a(paramString1, str2, false);
      if (localv == null)
        break;
    }
    if ((str2 == null) && (!str1.equals("")))
      return bl.i;
    return bl.g;
  }

  private boolean a(String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (kc.d(paramInt2))
      return false;
    if (paramString1.equalsIgnoreCase("instanceof"))
    {
      a(paramString2, paramInt1, false, paramBoolean);
      return true;
    }
    if (paramString1.equalsIgnoreCase("new"))
    {
      a(paramString2, paramInt1, true, paramBoolean);
      return true;
    }
    return false;
  }

  private boolean a(sb paramsb, int paramInt, boolean paramBoolean)
  {
    Matcher localMatcher = l.matcher(paramsb);
    int i = paramsb.length();
    while (localMatcher.find())
    {
      if (paramsb.length() != localMatcher.end())
        continue;
      i = localMatcher.start() + 1;
    }
    if (i == paramsb.length())
      return false;
    int i1 = i + 5;
    paramsb = paramsb.a(i1, paramsb.length());
    for (int i2 = 0; (i2 < paramsb.length()) && (paramsb.charAt(i2) != '('); i2++);
    if (i2 == paramsb.length())
      return true;
    i2 = k.b(paramsb, i2 + 1);
    int i3 = k.b(paramsb, i2, false);
    String str = paramsb.subSequence(i2, i3).toString();
    if (i3 == paramsb.length())
      a(str, paramInt, false, paramBoolean);
    return true;
  }

  private boolean c(sb paramsb, int paramInt, boolean paramBoolean)
  {
    int i = k.a(paramsb);
    if (i == -1)
      return false;
    com.zend.ide.m.v localv = b(paramsb.a(i));
    if (localv == null)
      return true;
    for (int i1 = paramsb.length() - 1; i1 >= i; i1--)
      if (paramsb.charAt(i1) == '(')
        return true;
    i1 = k.a(paramsb, paramsb.length());
    int i2 = k.a(paramsb, i1, false);
    String str1 = paramsb.subSequence(i2, i1).toString();
    String str2;
    if (str1.equals("function"))
      str2 = "";
    else if (i1 == paramsb.length())
      str2 = str1;
    else
      return true;
    if ((!paramBoolean) && (str2.length() == 0))
      return true;
    this.y = this.R;
    com.zend.ide.b.d[] arrayOfd;
    if (o)
      arrayOfd = new com.zend.ide.b.d[] { di.a("__construct", 1, null, localv.f(), di.k, null), di.a("__destruct", 1, null, localv.f(), di.k, null), di.a(localv.a(), 1, null, localv.f(), di.k, null) };
    else
      arrayOfd = new com.zend.ide.b.d[] { di.a(localv.a(), 1, null, localv.f(), di.k, null) };
    this.y.a(paramInt, arrayOfd, str2);
    return true;
  }

  private boolean b(sb paramsb, int paramInt, boolean paramBoolean)
  {
    int i = k.d(paramsb);
    if (i == -1)
      return false;
    boolean bool1 = true;
    if (i >= 6)
    {
      String str1 = paramsb.subSequence(i - 6, i - 1).toString();
      bool1 = str1.equals("class");
    }
    paramsb = paramsb.a(i, paramsb.length());
    for (int i1 = 0; (i1 < paramsb.length()) && (Character.isLetterOrDigit(paramsb.charAt(i1))); i1++);
    if (i1 == paramsb.length())
      return true;
    paramsb = paramsb.a(i1, paramsb.length());
    int i2 = paramsb.length();
    int i3 = k.a(paramsb, i2, false);
    String str2 = paramsb.subSequence(i3, i2).toString();
    Matcher localMatcher1 = j.matcher(paramsb);
    Matcher localMatcher2 = k.matcher(paramsb);
    boolean bool2 = localMatcher1.find();
    boolean bool3 = localMatcher2.find();
    if ((!bool2) && (!bool3))
    {
      if ((paramBoolean) || (str2.length() > 0))
        if (bool1)
          a(str2, paramInt, paramBoolean);
        else
          d(str2, paramInt, paramBoolean);
      return true;
    }
    i2 = k.a(paramsb, i3);
    i3 = k.a(paramsb, i2, true);
    String str3 = paramsb.subSequence(i3, i2).toString();
    if (str3.equalsIgnoreCase("extends"))
    {
      b(str2, paramInt, bool1, paramBoolean);
      return true;
    }
    if (str3.equalsIgnoreCase("implements"))
    {
      b(str2, paramInt, paramBoolean);
      return true;
    }
    if ((bool2) && (bool3))
    {
      if ((paramBoolean) || (str2.length() > 0))
        if (localMatcher1.start() < localMatcher2.start())
          b(str2, paramInt, paramBoolean);
        else
          b(str2, paramInt, bool1, paramBoolean);
      return true;
    }
    if (bool3)
    {
      if (paramBoolean)
        b(str2, paramInt, paramBoolean);
      return true;
    }
    if (((paramBoolean) || (str2.length() > 0)) && (bool1))
      c(str2, paramInt, paramBoolean);
    return true;
  }

  private void a(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) && (!this.m))
      return;
    com.zend.ide.b.d[] arrayOfd;
    if (paramBoolean1)
    {
      this.y = this.w;
      arrayOfd = a();
    }
    else
    {
      this.y = this.v;
      arrayOfd = u.e("");
    }
    this.y.a(paramInt, arrayOfd, paramString);
  }

  private void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean1)
    {
      b(paramString, paramInt, paramBoolean2);
      return;
    }
    if ((!paramBoolean2) && (!this.m))
      return;
    this.y = this.v;
    com.zend.ide.b.d[] arrayOfd = a();
    this.y.a(paramInt, arrayOfd, paramString);
  }

  private com.zend.ide.b.d[] a()
  {
    com.zend.ide.b.d[] arrayOfd1 = u.e("");
    int i = 0;
    for (int i1 = 0; i1 < arrayOfd1.length; i1++)
    {
      if (!bj.a(((com.zend.ide.m.v)arrayOfd1[i1]).k()))
        continue;
      i++;
    }
    if (i == 0)
      return arrayOfd1;
    com.zend.ide.b.d[] arrayOfd2 = new com.zend.ide.b.d[arrayOfd1.length - i];
    int i2 = 0;
    for (int i3 = 0; i3 < arrayOfd1.length; i3++)
    {
      if (bj.a(((com.zend.ide.m.v)arrayOfd1[i3]).k()))
        continue;
      arrayOfd2[i2] = arrayOfd1[i3];
      i2++;
    }
    return arrayOfd2;
  }

  private void b(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!this.m))
      return;
    com.zend.ide.b.d[] arrayOfd1 = u.e("");
    ArrayList localArrayList = new ArrayList(arrayOfd1.length / 10);
    for (int i = 0; i < arrayOfd1.length; i++)
    {
      if (!bj.a(((com.zend.ide.m.v)arrayOfd1[i]).k()))
        continue;
      localArrayList.add(arrayOfd1[i]);
    }
    com.zend.ide.b.d[] arrayOfd2 = new com.zend.ide.b.d[localArrayList.size()];
    localArrayList.toArray(arrayOfd2);
    this.y = this.v;
    this.y.a(paramInt, arrayOfd2, paramString);
  }

  private void a(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!this.m))
      return;
    com.zend.ide.b.d[] arrayOfd = e();
    this.v.a(paramInt, arrayOfd, paramString);
    this.y = this.v;
  }

  protected boolean a(int paramInt1, int paramInt2, sb paramsb, int paramInt3)
  {
    if ((paramInt1 != kc.h(135)) && (paramInt1 != kc.h(142)))
      return false;
    int i = k.d(paramsb, paramInt3);
    sb localsb1 = paramsb.a(i, paramInt3);
    int i1 = k.c(paramsb, i);
    sb localsb2 = paramsb.a(i1, i - 2);
    if ((localsb2.length() > 0) && (b(localsb2.toString().toLowerCase())))
    {
      com.zend.ide.f.zc.b.f localf = com.zend.ide.f.zc.b.f.a();
      String str1 = localsb1.toString();
      int i2 = str1.lastIndexOf(".");
      if (i2 < 0)
        i2 = 0;
      String str2 = str1.substring(0, i2) + ((str1.length() == 0) || (i2 < 1) ? "" : ".");
      String[] arrayOfString1 = localf.a(str2);
      Arrays.sort(arrayOfString1);
      String[] arrayOfString2 = localf.b(str2);
      Arrays.sort(arrayOfString2);
      xd[] arrayOfxd = new xd[arrayOfString1.length + arrayOfString2.length];
      for (int i3 = 0; i3 < arrayOfString1.length; i3++)
      {
        String str3 = str2 + arrayOfString1[i3];
        arrayOfxd[i3] = new xd(this, str3, '\000');
      }
      for (int i4 = 0; i4 < arrayOfString2.length; i4++)
      {
        String str4 = str2 + arrayOfString2[i4];
        arrayOfxd[i3] = new xd(this, str4, '\001');
        i3++;
      }
      this.y = this.v;
      this.y.a(paramInt2, arrayOfxd, str1.substring(str2.length()));
      return true;
    }
    return false;
  }

  private boolean b(String paramString)
  {
    return paramString.equals("java");
  }

  private static com.zend.ide.b.d[] e()
  {
    if (T == null)
    {
      Object localObject1 = null;
      Object localObject2 = null;
      com.zend.ide.m.s[] arrayOfs = bm.b();
      for (int i = 0; i < arrayOfs.length; i++)
      {
        if (arrayOfs[i].a().equals("extends"))
          localObject1 = arrayOfs[i];
        if (!arrayOfs[i].a().equals("implements"))
          continue;
        localObject2 = arrayOfs[i];
      }
      if (o)
        T = new com.zend.ide.b.d[] { localObject1, localObject2 };
      else
        T = new com.zend.ide.b.d[] { localObject1 };
    }
    return T;
  }

  private void c(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!this.m))
      return;
    com.zend.ide.b.d[] arrayOfd = b();
    this.v.a(paramInt, arrayOfd, paramString);
    this.y = this.v;
  }

  private static com.zend.ide.b.d[] b()
  {
    if (!o)
      return null;
    if (Y == null)
    {
      Object localObject = null;
      com.zend.ide.m.s[] arrayOfs = bm.b();
      for (int i = 0; i < arrayOfs.length; i++)
      {
        if (!arrayOfs[i].a().equals("implements"))
          continue;
        localObject = arrayOfs[i];
        break;
      }
      Y = new com.zend.ide.b.d[] { localObject };
    }
    return Y;
  }

  private void d(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (!this.m))
      return;
    com.zend.ide.b.d[] arrayOfd = c();
    this.v.a(paramInt, arrayOfd, paramString);
    this.y = this.v;
  }

  private static com.zend.ide.b.d[] c()
  {
    if (Z == null)
    {
      Object localObject = null;
      com.zend.ide.m.s[] arrayOfs = bm.b();
      for (int i = 0; i < arrayOfs.length; i++)
      {
        if (!arrayOfs[i].a().equals("extends"))
          continue;
        localObject = arrayOfs[i];
        break;
      }
      Z = new com.zend.ide.b.d[] { localObject };
    }
    return Z;
  }

  private boolean a(com.zend.ide.b.d paramd, Document paramDocument, int paramInt)
  {
    int i = d().getCaretPosition();
    a(paramDocument, paramInt, i, (paramd instanceof xd) ? V : e);
    int i2 = 1;
    Object localObject1;
    int i1;
    if (a(paramd))
    {
      localObject1 = "php";
      i2 = 0;
      i1 = paramInt + ((String)localObject1).length();
    }
    else if ((paramd instanceof com.zend.ide.m.z))
    {
      localObject1 = paramd.a();
      if ((bj.b(((com.zend.ide.m.z)paramd).d())) && (paramInt == i))
        localObject1 = '$' + (String)localObject1;
      i1 = paramInt + ((String)localObject1).length();
      i2 = 0;
    }
    else if ((paramd instanceof bd))
    {
      localObject1 = paramd.a();
      i1 = paramInt + ((String)localObject1).length();
      i2 = 0;
    }
    else
    {
      Object localObject2;
      if ((paramd instanceof x))
      {
        localObject2 = paramd.a();
        if (c(paramInt - 1) == '$')
          localObject1 = localObject2;
        else
          localObject1 = '$' + (String)localObject2;
        i1 = paramInt + ((String)localObject1).length();
        i2 = 0;
      }
      else if ((paramd instanceof com.zend.ide.m.s))
      {
        localObject2 = (com.zend.ide.m.s)paramd;
        localObject1 = ((com.zend.ide.m.s)localObject2).a() + ((com.zend.ide.m.s)localObject2).c();
        if (((com.zend.ide.m.s)localObject2).c().equals(""))
          i2 = 0;
        i1 = paramInt + ((com.zend.ide.m.s)localObject2).a().length() + ((com.zend.ide.m.s)localObject2).d();
      }
      else if ((paramd instanceof bh))
      {
        localObject2 = (bh)paramd;
        localObject1 = paramd.a() + "()";
        int i3 = ((String)localObject1).length();
        int i4 = ((bh)localObject2).c().length > 0 ? 1 : 0;
        if (i4 != 0)
          i3--;
        String str = ((bh)localObject2).d();
        if ((str != null) && (str.compareToIgnoreCase("void") == 0))
        {
          localObject1 = (String)localObject1 + ";";
          if (i4 == 0)
            i3++;
        }
        i1 = paramInt + i3;
      }
      else
      {
        if ((paramd instanceof com.zend.ide.bf.d))
        {
          m.b().a(d(), (com.zend.ide.bf.d)paramd, paramInt);
          return i2;
        }
        if ((paramd instanceof xd))
        {
          i2 = 0;
          localObject2 = (xd)paramd;
          localObject1 = paramd.a();
          if (((xd)localObject2).b == 0)
          {
            i2 = 1;
            localObject1 = (String)localObject1 + ".";
          }
          i1 = paramInt + ((String)localObject1).length();
        }
        else
        {
          localObject1 = paramd.a() + ' ';
          i1 = paramInt + ((String)localObject1).length();
        }
      }
    }
    try
    {
      a(paramDocument, paramInt, (String)localObject1);
    }
    catch (Exception localException)
    {
    }
    d().setCaretPosition(i1);
    return i2;
  }

  private vb a(int paramInt)
  {
    com.zend.ide.m.bf localbf = u.a(d().k());
    return bl.a(localbf, paramInt);
  }

  private com.zend.ide.m.v b(int paramInt)
  {
    com.zend.ide.m.bf localbf = u.a(d().k());
    return bg.a(localbf, paramInt);
  }

  protected h g()
  {
    return com.zend.ide.m.a.c();
  }

  private void m()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.f = new e(localf);
    localf.a("completion.phpAutoShowCompletion", this.A);
    localf.a("completion.phpShowFewerThan", this.B);
    localf.a("completion.phpDelay", this.C);
    localf.a("completion.phpAutoClassNames", this.D);
    localf.a("completion.phpAutoVariables", this.E);
    localf.a("completion.phpAutoFunctions", this.F);
    localf.a("completion.phpVariablesFromOtherFiles", this.I);
    localf.a("completion.phpObjectsFromOtherFiles", this.G);
    localf.a("completion.phpDisableConstants", this.H);
    localf.a("completion.phpCaseSensitiveForConstants", this.P);
    localf.a("completion.phpDescriptions", this.J);
    localf.a("completion.phpDescriptionDelay", this.K);
    localf.a("completion.phpclassNamesInGlobalsList", this.N);
    localf.a("completion.phpRemoveEnding", this.Q);
    localf.a("completion.phpStrictLanguage", this.ab);
    localf.a("desktop.phpVersion", this.U);
    this.f.a("completion.phpAutoShowCompletion");
    this.f.a("completion.phpShowFewerThan");
    this.f.a("completion.phpDelay");
    this.f.a("completion.phpAutoClassNames");
    this.f.a("completion.phpAutoVariables");
    this.f.a("completion.phpAutoFunctions");
    this.f.a("completion.phpVariablesFromOtherFiles");
    this.f.a("completion.phpObjectsFromOtherFiles");
    this.f.a("completion.phpDisableConstants");
    this.f.a("completion.phpCaseSensitiveForConstants");
    this.f.a("completion.phpDescriptions");
    this.f.a("completion.phpDescriptionDelay");
    this.f.a("completion.phpclassNamesInGlobalsList");
    this.f.a("completion.phpRemoveEnding");
    this.f.a("completion.phpStrictLanguage");
    this.f.a("desktop.phpVersion");
  }

  private static boolean a(com.zend.ide.b.d paramd)
  {
    return (paramd.a().equals("php")) && ((paramd instanceof cm));
  }

  private static boolean a(bw parambw, int paramInt, String paramString)
  {
    paramInt -= paramString.length() + 2;
    try
    {
      String str = parambw.getText(paramInt, 2);
      if (str.equals("<?"))
        return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private void a()
  {
    T = null;
  }

  static boolean a(cj paramcj)
  {
    return paramcj.h;
  }

  static bw o(cj paramcj)
  {
    return paramcj.d();
  }

  static boolean a(cj paramcj, com.zend.ide.b.d paramd, Document paramDocument, int paramInt)
  {
    return paramcj.a(paramd, paramDocument, paramInt);
  }

  static boolean b(cj paramcj)
  {
    return paramcj.s;
  }

  static int c(cj paramcj)
  {
    return paramcj.t;
  }

  static bw p(cj paramcj)
  {
    return paramcj.d();
  }

  static bw d(cj paramcj)
  {
    return paramcj.d();
  }

  static bw e(cj paramcj)
  {
    return paramcj.d();
  }

  static bw a(cj paramcj)
  {
    return paramcj.d();
  }

  static bw i(cj paramcj)
  {
    return paramcj.d();
  }

  static bw j(cj paramcj)
  {
    return paramcj.d();
  }

  static char b(cj paramcj, Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    return paramcj.a(paramDocument, paramInt1, paramInt2, paramArrayOfChar);
  }

  static void b(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    a(paramDocument, paramInt, paramString);
  }

  static bw f(cj paramcj)
  {
    return paramcj.d();
  }

  static bw k(cj paramcj)
  {
    return paramcj.d();
  }

  static bw m(cj paramcj)
  {
    return paramcj.d();
  }

  static char a(cj paramcj, Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    return paramcj.a(paramDocument, paramInt1, paramInt2, paramArrayOfChar);
  }

  static void c(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    a(paramDocument, paramInt, paramString);
  }

  static bw g(cj paramcj)
  {
    return paramcj.d();
  }

  static bw n(cj paramcj)
  {
    return paramcj.d();
  }

  static bw h(cj paramcj)
  {
    return paramcj.d();
  }

  static char c(cj paramcj, Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    return paramcj.a(paramDocument, paramInt1, paramInt2, paramArrayOfChar);
  }

  static void b(Document paramDocument, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    a(paramDocument, paramInt1, paramInt2);
  }

  static void c(Document paramDocument, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    a(paramDocument, paramInt1, paramInt2);
  }

  static void d(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    a(paramDocument, paramInt, paramString);
  }

  static bw q(cj paramcj)
  {
    return paramcj.d();
  }

  static bw r(cj paramcj)
  {
    return paramcj.d();
  }

  static bw b(cj paramcj)
  {
    return paramcj.d();
  }

  static char d(cj paramcj, Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    return paramcj.a(paramDocument, paramInt1, paramInt2, paramArrayOfChar);
  }

  static void f(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    a(paramDocument, paramInt, paramString);
  }

  static bw c(cj paramcj)
  {
    return paramcj.d();
  }

  static h d(cj paramcj)
  {
    return paramcj.d;
  }

  static boolean b(com.zend.ide.b.d paramd)
  {
    return a(paramd);
  }

  static h e(cj paramcj)
  {
    return paramcj.d;
  }

  static h f(cj paramcj)
  {
    return paramcj.d;
  }

  static h g(cj paramcj)
  {
    return paramcj.d;
  }

  static h h(cj paramcj)
  {
    return paramcj.d;
  }

  static h i(cj paramcj)
  {
    return paramcj.d;
  }

  static boolean j(cj paramcj, boolean paramBoolean)
  {
    return paramcj.m = paramBoolean;
  }

  static boolean a(cj paramcj, boolean paramBoolean)
  {
    return paramcj.n = paramBoolean;
  }

  static boolean b(cj paramcj, boolean paramBoolean)
  {
    return paramcj.W = paramBoolean;
  }

  static boolean c(cj paramcj, boolean paramBoolean)
  {
    return paramcj.p = paramBoolean;
  }

  static boolean d(cj paramcj, boolean paramBoolean)
  {
    return paramcj.q = paramBoolean;
  }

  static boolean e(cj paramcj, boolean paramBoolean)
  {
    return paramcj.r = paramBoolean;
  }

  static boolean g(cj paramcj, boolean paramBoolean)
  {
    return paramcj.h = paramBoolean;
  }

  static boolean h(cj paramcj, boolean paramBoolean)
  {
    return paramcj.s = paramBoolean;
  }

  static int a(cj paramcj, int paramInt)
  {
    return paramcj.t = paramInt;
  }

  static boolean f(cj paramcj, boolean paramBoolean)
  {
    return paramcj.L = paramBoolean;
  }

  static boolean i(cj paramcj, boolean paramBoolean)
  {
    return paramcj.i = paramBoolean;
  }

  static boolean k(cj paramcj, boolean paramBoolean)
  {
    return paramcj.g = paramBoolean;
  }

  static boolean a(boolean paramBoolean)
  {
    return cj.o = paramBoolean;
  }

  static void j(cj paramcj)
  {
    paramcj.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cj
 * JD-Core Version:    0.6.0
 */