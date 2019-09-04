package com.zend.ide.desktop;

import com.zend.ide.b.m;
import com.zend.ide.f.bp;
import com.zend.ide.f.bt;
import com.zend.ide.f.pd;
import com.zend.ide.f.s;
import com.zend.ide.m.bc;
import com.zend.ide.m.bf;
import com.zend.ide.n.bu;
import com.zend.ide.n.bw;
import com.zend.ide.n.ca;
import com.zend.ide.n.dz;
import com.zend.ide.n.is;
import com.zend.ide.n.it;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

public class ek extends ca
  implements pd, r
{
  private static final DefaultHighlighter.DefaultHighlightPainter p = new em(null);
  private bu e;
  private el f;
  private bs i;
  private ej g;
  private long j = 0L;
  private e k;
  private PropertyChangeListener l = new ev(this, null);
  private PropertyChangeListener m = new eu(this, null);
  private int n = 100;
  private boolean o = true;
  private Hashtable h = new Hashtable();
  private String q = "";

  public ek()
  {
    super("RealTimeErrorDetectionTool");
    bp.d().b().g().a(this);
    this.f = new el(this, null);
    this.g = new ej(this, null);
    this.i = new bs(this, null);
    f localf = new f();
    this.k = new e(localf);
    localf.a("editing.realTimeError", this.l);
    localf.a("editing.maxRealTimeErrors", this.m);
    this.k.a("editing.realTimeError");
    this.k.a("editing.maxRealTimeErrors");
  }

  protected void a(bw parambw)
  {
    this.e = new bu(parambw, 5);
    b().a(this.f);
    b().a(this.g);
    b().addDocumentListener(this.i);
    p.e().a(this);
  }

  protected void d()
  {
  }

  private void a(String paramString)
  {
    bf localbf = bp.d().b().a(paramString);
    a(paramString, localbf, true);
  }

  private void a(String paramString, bf parambf, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      long l1 = System.currentTimeMillis();
      if (l1 - this.j < 500L)
        return;
    }
    a(paramString, parambf);
    b(paramString, parambf);
    if (this.q.equals(paramString))
      b().repaint();
  }

  private void a(String paramString, bf parambf)
  {
    this.e.b(paramString);
    if (parambf != null)
    {
      bc[] arrayOfbc = parambf.i();
      for (int i1 = 0; (i1 < arrayOfbc.length) && (i1 < this.n); i1++)
      {
        bc localbc = arrayOfbc[i1];
        m localm = localbc.b();
        int i2 = localm.d();
        int i3 = localm.e();
        if (i2 < 0)
          continue;
        if (i3 - i2 < 1)
          i3 = i2 + 1;
        try
        {
          this.e.a(paramString, i2, i3, p);
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
      }
    }
  }

  public void a(bf parambf)
  {
    a(parambf.a(), parambf, false);
  }

  public void b(bf parambf)
  {
    a(parambf.a(), parambf, true);
  }

  public void c(bf parambf)
  {
    a(parambf.a(), parambf, true);
  }

  public void h()
  {
  }

  public void a(bo parambo)
  {
    SwingUtilities.invokeLater(new eh(this, parambo));
  }

  public void a(o paramo)
  {
  }

  public void c(o paramo)
  {
  }

  private void a(int paramInt)
  {
    this.n = paramInt;
    if ((this.o) && (b() != null) && (b().e() != null))
    {
      dz[] arrayOfdz = b().i();
      for (int i1 = 0; i1 < arrayOfdz.length; i1++)
        a(arrayOfdz[i1].k());
    }
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      bp.d().b().g().a(this);
      this.o = true;
      a(((Integer)b.a("editing.maxRealTimeErrors").c()).intValue());
    }
    else
    {
      bp.d().b().g().b(this);
      a(0);
      this.o = false;
    }
  }

  private void b(String paramString, bf parambf)
  {
    Object localObject1;
    Object localObject2;
    if (this.h.containsKey(paramString))
    {
      localObject1 = (ArrayList)this.h.get(paramString);
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        is localis = (is)((Iterator)localObject2).next();
        b().a(paramString, localis);
      }
    }
    if (parambf != null)
    {
      localObject1 = parambf.i();
      if (localObject1.length > 0)
      {
        localObject2 = new ArrayList();
        for (int i1 = 0; (i1 < localObject1.length) && (i1 < this.n); i1++)
        {
          it localit = new it(Color.red, localObject1[i1].b().d(), localObject1[i1].c(), 0);
          ((ArrayList)localObject2).add(localit);
          b().a(paramString, localit, 0);
        }
        this.h.put(paramString, localObject2);
      }
      else
      {
        this.h.remove(paramString);
      }
    }
  }

  static bw a(ek paramek)
  {
    return paramek.b();
  }

  static bu b(ek paramek)
  {
    return paramek.e;
  }

  static void a(ek paramek, String paramString, bf parambf)
  {
    paramek.b(paramString, parambf);
  }

  static bw c(ek paramek)
  {
    return paramek.b();
  }

  static void a(ek paramek, String paramString)
  {
    paramek.a(paramString);
  }

  static void a(ek paramek, boolean paramBoolean)
  {
    paramek.a(paramBoolean);
  }

  static void a(ek paramek, int paramInt)
  {
    paramek.a(paramInt);
  }

  static String b(ek paramek, String paramString)
  {
    return paramek.q = paramString;
  }

  static long a(ek paramek, long paramLong)
  {
    return paramek.j = paramLong;
  }

  static bw d(ek paramek)
  {
    return paramek.b();
  }

  static int e(ek paramek)
  {
    return paramek.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ek
 * JD-Core Version:    0.6.0
 */