package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.h;
import com.zend.ide.m.a;
import com.zend.ide.m.bf;
import com.zend.ide.m.bg;
import com.zend.ide.m.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.n.sb;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.s.x;
import com.zend.ide.s.z;
import com.zend.ide.util.dj;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class bz extends z
{
  private e d;
  private h e = a.c();
  private s f = bp.d().b();
  private bw g;
  private PropertyChangeListener i = new i(this, null);
  private PropertyChangeListener j = new k(this, null);
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private j p = new j(this, null);

  bz()
  {
    f localf = new f();
    this.d = new e(localf);
    localf.a("completion.phpAutoFunctionsArguments", this.i);
    localf.a("completion.phpFullFunctionPrototype", this.j);
    this.d.a("completion.phpAutoFunctionsArguments");
    this.d.a("completion.phpFullFunctionPrototype");
  }

  public void a(bw parambw)
  {
    this.g = parambw;
  }

  private boolean a(int paramInt, boolean paramBoolean, Segment paramSegment)
  {
    if (paramBoolean)
      return true;
    if (this.l)
    {
      int k = paramSegment.last();
      if (((k == 40) || (k == 44)) && (a(this.g.getDocument(), paramInt)))
        return true;
    }
    return false;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    a(null);
    Segment localSegment = c(paramInt);
    if (!a(paramInt, paramBoolean, localSegment))
      return;
    this.o = a(localSegment, paramInt, 0);
    if (this.o <= 0)
      return;
    bf localbf = this.f.a(this.g.k());
    if (localbf == null)
      return;
    sb localsb = com.zend.ide.m.k.a(this.o, localbf, this.g, true);
    if (com.zend.ide.m.k.a(localsb) != -1)
      return;
    if (com.zend.ide.m.k.d(localsb) != -1)
      return;
    int k = com.zend.ide.m.k.a(localsb, localsb.length());
    int i1 = com.zend.ide.m.k.a(localsb, k, true);
    String str = localsb.subSequence(i1, k).toString();
    k = com.zend.ide.m.k.a(localsb, i1);
    i1 = com.zend.ide.m.k.a(localsb, k, true);
    d[] arrayOfd = null;
    Object localObject;
    if (k != i1)
    {
      localObject = localsb.subSequence(i1, k).toString();
      if (((String)localObject).equalsIgnoreCase("new"))
      {
        d locald = this.f.b(str, this.g.k());
        if (locald != null)
          arrayOfd = new d[] { locald };
      }
      else
      {
        arrayOfd = this.f.d(str);
      }
    }
    else if (a(localsb, i1))
    {
      localObject = a(localsb, str, i1);
      if (localObject != null)
        arrayOfd = new d[] { localObject };
    }
    else
    {
      arrayOfd = this.f.d(str);
    }
    a(arrayOfd);
    a(paramInt);
    a(localSegment, paramInt);
  }

  private int a(Segment paramSegment, int paramInt1, int paramInt2)
  {
    int k = 0;
    for (int i1 = paramInt1 - 1; i1 >= paramInt2; i1--)
    {
      int i2 = paramSegment.array[i1];
      switch (i2)
      {
      case 41:
        if (!a(this.g.getDocument(), i1))
          continue;
        k++;
        break;
      case 40:
        if (!a(this.g.getDocument(), i1))
          continue;
        k--;
        if (k >= 0)
          continue;
        return i1;
      case 59:
        if (!a(this.g.getDocument(), i1))
          continue;
        return -1;
      }
    }
    return -1;
  }

  private v a(int paramInt)
  {
    bf localbf = this.f.a(this.g.k());
    return bg.a(localbf, paramInt);
  }

  private void a(Segment paramSegment, int paramInt)
  {
    this.n = 0;
    int k = 0;
    int i1 = 32;
    int i2 = 32;
    int i3 = 0;
    paramSegment.setIndex(Math.min(paramInt, this.o));
    while (paramSegment.getIndex() < paramInt)
    {
      int i4 = paramSegment.next();
      if ((i4 == 92) && (i4 == i2))
        i4 = 32;
      if (((i4 == 34) || (i4 == 39) || (i4 == 96)) && (i2 != 92))
        if (k == 0)
        {
          k = 1;
          i1 = i4;
        }
        else if (i4 == i1)
        {
          k = 0;
        }
      i2 = i4;
      if (k != 0)
        continue;
      if (i4 == 40)
      {
        i3++;
        continue;
      }
      if (i4 == 41)
      {
        i3--;
        continue;
      }
      if ((i3 == 0) && (i4 == 44))
        this.n += 1;
    }
  }

  public x f()
  {
    return this.p;
  }

  private boolean o()
  {
    int k = this.g.getCaretPosition();
    Segment localSegment = c(k);
    int i1 = a(localSegment, k, this.o - 1);
    if (i1 == this.o)
    {
      a(k);
      a(localSegment, k);
    }
    else
    {
      a(k, true);
    }
    return true;
  }

  public boolean g()
  {
    return o();
  }

  public boolean h()
  {
    return o();
  }

  public boolean i()
  {
    return o();
  }

  public boolean j()
  {
    return o();
  }

  public boolean k()
  {
    return o();
  }

  public boolean l()
  {
    return o();
  }

  public boolean m()
  {
    return o();
  }

  public boolean n()
  {
    return o();
  }

  private static boolean a(CharSequence paramCharSequence, int paramInt)
  {
    if (paramInt < 2)
      return false;
    int k = paramCharSequence.charAt(paramInt - 1);
    int i1 = paramCharSequence.charAt(paramInt - 2);
    return ((i1 == 45) && (k == 62)) || ((i1 == 58) && (k == 58));
  }

  private d a(sb paramsb, String paramString, int paramInt)
  {
    int k = paramsb.charAt(paramInt - 1) == ':' ? 1 : 0;
    paramInt -= 2;
    paramInt = com.zend.ide.m.k.a(paramsb, paramInt);
    int i1 = com.zend.ide.m.k.a(paramsb, paramInt, true);
    String str = paramsb.subSequence(i1, paramInt).toString();
    if (k != 0)
    {
      if (str.equals("self"))
      {
        localObject = a(this.g.getCaretPosition());
        if (localObject != null)
          str = ((v)localObject).a();
      }
      else if (str.equals("parent"))
      {
        localObject = a(this.g.getCaretPosition());
        if (localObject != null)
          str = this.f.c(this.g.k(), ((v)localObject).a());
      }
    }
    else
      str = bg.a(this.g, str, this.g.getCaretPosition(), this.f, true);
    Object localObject = null;
    if ((str != null) && (str.length() > 0))
      localObject = this.f.a(this.g.k(), str, paramString);
    return (d)localObject;
  }

  private Segment c(int paramInt)
  {
    Segment localSegment = new Segment();
    localSegment.setPartialReturn(false);
    try
    {
      this.g.getDocument().getText(0, paramInt, localSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      throw new dj(localBadLocationException);
    }
    return localSegment;
  }

  private static boolean a(Document paramDocument, int paramInt)
  {
    try
    {
      ho localho = (ho)paramDocument;
      bl localbl = (bl)localho.b(paramInt);
      int k = localbl.c();
      return kc.e(k);
    }
    catch (Exception localException)
    {
    }
    throw new dj(localException);
  }

  static int a(bz parambz)
  {
    return parambz.n;
  }

  static boolean b(bz parambz)
  {
    return parambz.m;
  }

  static h c(bz parambz)
  {
    return parambz.e;
  }

  static boolean a(bz parambz, boolean paramBoolean)
  {
    return parambz.l = paramBoolean;
  }

  static boolean b(bz parambz, boolean paramBoolean)
  {
    return parambz.m = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bz
 * JD-Core Version:    0.6.0
 */