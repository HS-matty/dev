package com.zend.ide.s;

import com.zend.ide.b.h;
import com.zend.ide.n.ho;
import com.zend.ide.util.dj;
import com.zend.ide.x.a;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

public class k extends j
{
  private static final char[] e = { ' ', '\t', '\n', '/', '<', '>', '"', '\'', '=', '(', ')', ';', '$' };
  private PropertyChangeListener h = new ci(this, null);
  private PropertyChangeListener k = new cl(this, null);
  private PropertyChangeListener l = new ck(this, null);
  private PropertyChangeListener m = new cj(this, null);
  private PropertyChangeListener n = new cg(this, null);
  private PropertyChangeListener o = new ch(this, null);
  private PropertyChangeListener j = new ba(this, null);
  private PropertyChangeListener y = new bs(this, null);
  private e z;
  private bd x = new bo(this);
  public bd p = new bi(this);
  private bd q = new bf(this);
  private bd r = new bg(this);
  private bd s = new bd(this);
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w = false;
  private int g;

  public k()
  {
    this.c = new g(this, null);
    h();
  }

  private void h()
  {
    f localf = new f();
    this.z = new e(localf);
    localf.a("completion.htmlAutoShowCompletion", this.h);
    localf.a("completion.htmlShowFewerThan", this.k);
    localf.a("completion.htmlDelay", this.l);
    localf.a("completion.htmlAutoTags", this.m);
    localf.a("completion.htmlAutoAtributes", this.n);
    localf.a("completion.htmlAutoAtributesValues", this.o);
    localf.a("editing.htmlTagUppercase", this.j);
    localf.a("completion.htmlRemoveEnding", this.y);
    this.z.a("completion.htmlAutoShowCompletion");
    this.z.a("completion.htmlShowFewerThan");
    this.z.a("completion.htmlDelay");
    this.z.a("completion.htmlAutoTags");
    this.z.a("completion.htmlAutoAtributes");
    this.z.a("completion.htmlAutoAtributesValues");
    this.z.a("editing.htmlTagUppercase");
    this.z.a("completion.htmlRemoveEnding");
  }

  public z a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.g = paramInt1;
    bd localbd;
    switch (kc.g(paramInt1))
    {
    case 120:
      Segment localSegment = a(0, paramInt2, d());
      for (int i = paramInt2; (i > 1) && (Character.isLetterOrDigit(localSegment.array[(i - 1)])); i--);
      if ((i > 0) && (localSegment.array[(i - 1)] == '#'))
        i--;
      if ((i > 0) && (localSegment.array[(i - 1)] == '&'))
      {
        i--;
        String str = a(localSegment, i, paramInt2);
        localbd = this.x;
        bo.a((bo)localbd, str, paramInt2);
      }
      else
      {
        localbd = this.p;
      }
      break;
    case 121:
    case 125:
      localbd = this.q;
      break;
    case 114:
    case 116:
    case 123:
      localbd = this.r;
      break;
    case 115:
    case 117:
    case 118:
    case 119:
    case 122:
    case 124:
    default:
      localbd = this.s;
    }
    localbd.a(paramInt2, paramBoolean);
    return localbd;
  }

  public z b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.s;
  }

  private static String a(Document paramDocument, int paramInt, Segment paramSegment)
  {
    int i = b(paramDocument, paramInt, paramSegment);
    if (i == -1)
      return "";
    while ((i < paramInt) && (!d(paramSegment.array[i])))
      i++;
    for (int i1 = i; (i1 < paramInt) && (d(paramSegment.array[i1])); i1++);
    String str = a(paramSegment, i, i1).toLowerCase();
    if (("?".equals(str)) || ("?php".equalsIgnoreCase(str)))
      return "";
    return str;
  }

  private static int b(Document paramDocument, int paramInt, Segment paramSegment)
  {
    try
    {
      for (int i = paramInt; i > 0; i--)
      {
        char c = paramSegment.array[(i - 1)];
        if (c == '>')
        {
          i1 = kc.g(a(paramDocument, i));
          if (i1 == 120)
            return -1;
        }
        if (c == '<')
        {
          i1 = ((ho)paramDocument).c(i);
          int i2 = (i1 == bb.br) || (i1 == bb.bp) || (i1 == bb.bq) ? 1 : 0;
          if (i2 != 0)
            return i - 1;
        }
        if ((!Character.isSpaceChar(c)) && (c != '<'))
          continue;
        int i1 = kc.g(a(paramDocument, i));
        if (i1 == 120)
          return i - 1;
      }
      return 0;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    throw new dj(localBadLocationException);
  }

  private static boolean d(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (paramChar == '?') || (paramChar == '!') || (paramChar == '-');
  }

  protected h g()
  {
    return a.c();
  }

  static char[] e()
  {
    return e;
  }

  static boolean a(k paramk)
  {
    return paramk.t;
  }

  static int a(k paramk)
  {
    return paramk.g;
  }

  static boolean a(char paramChar)
  {
    return d(paramChar);
  }

  static boolean c(k paramk)
  {
    return paramk.w;
  }

  static boolean b(k paramk)
  {
    return paramk.u;
  }

  static String b(Document paramDocument, int paramInt, Segment paramSegment)
  {
    return a(paramDocument, paramInt, paramSegment);
  }

  static boolean d(k paramk)
  {
    return paramk.v;
  }

  static boolean b(k paramk, boolean paramBoolean)
  {
    return paramk.t = paramBoolean;
  }

  static boolean a(k paramk, boolean paramBoolean)
  {
    return paramk.u = paramBoolean;
  }

  static boolean d(k paramk, boolean paramBoolean)
  {
    return paramk.v = paramBoolean;
  }

  static boolean c(k paramk, boolean paramBoolean)
  {
    return paramk.w = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.k
 * JD-Core Version:    0.6.0
 */