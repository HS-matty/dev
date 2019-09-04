package com.zend.ide.f;

import com.b.a.a;
import com.b.a.b;
import com.b.a.c;
import com.zend.ide.m.g;
import java.io.StringReader;
import java.util.Stack;

public class zb extends a
  implements e
{
  protected static final short[][] k = a(new String[] { "" });
  protected static final short[][] l = a(new String[] { "" });
  protected static final short[][] m = a(new String[] { "" });
  protected hc n;
  public static final Integer o = new Integer(0);
  public static final Integer p = new Integer(1);
  public static final Integer q = new Integer(2);
  public static final Integer r = new Integer(4);
  public static final Integer s = new Integer(8);
  public static final Integer t = new Integer(16);
  public static final Integer u = new Integer(512);
  public static final Integer v = new Integer(1024);
  private sc w = new rc(this);
  private sc x = new tc(this);
  private sc y = this.w;
  private bn z;

  public zb()
  {
  }

  public zb(b paramb)
  {
    super(paramb);
  }

  public short[][] b()
  {
    return k;
  }

  public short[][] c()
  {
    return l;
  }

  public short[][] d()
  {
    return m;
  }

  protected void l()
  {
    this.n = new hc(this);
  }

  public c a(int paramInt1, a parama, Stack paramStack, int paramInt2)
    throws Exception
  {
    return this.n.a(paramInt1, parama, paramStack, paramInt2);
  }

  public int e()
  {
    return 0;
  }

  public int f()
  {
    return 1;
  }

  public int g()
  {
    return 0;
  }

  public int h()
  {
    return 1;
  }

  public void a(bn parambn)
  {
    this.z = parambn;
  }

  public bn a()
  {
    return this.z;
  }

  public void a(c paramc)
  {
    int i = ((c)this.d.peek()).b;
    short[] arrayOfShort = this.f[i];
    a().a(paramc.a, (String)paramc.f, arrayOfShort, paramc.d, paramc.e, u());
  }

  public void b(String paramString, Object paramObject)
  {
    a().a("report_error", this.c.d, this.c.e, u());
  }

  public void b(c paramc)
    throws Exception
  {
    a().a("unrecovered_syntax_error", paramc.d, paramc.e, u());
  }

  public void a(String paramString, Object paramObject)
    throws Exception
  {
    a().a("report_fatal_error", this.c.d, this.c.e, u());
  }

  protected boolean a(boolean paramBoolean)
    throws Exception
  {
    return this.y.a(paramBoolean);
  }

  public int u()
  {
    bi localbi = (bi)j();
    return localbi.c();
  }

  public int w()
  {
    bi localbi = (bi)j();
    return localbi.o();
  }

  g a(int paramInt)
  {
    bi localbi = (bi)j();
    Object[] arrayOfObject = localbi.a(paramInt);
    if (arrayOfObject[0] == null)
      return null;
    return a((String)arrayOfObject[0], ((Integer)arrayOfObject[1]).intValue());
  }

  public String a(int paramInt1, int paramInt2)
  {
    bi localbi = (bi)j();
    return localbi.a(paramInt1, paramInt2);
  }

  public c n()
    throws Exception
  {
    c localc = super.n();
    bi localbi = (bi)j();
    Object[] arrayOfObject = localbi.a();
    if (arrayOfObject[0] == null)
    {
      a().a(null);
      return localc;
    }
    g localg = a((String)arrayOfObject[0], ((Integer)arrayOfObject[1]).intValue());
    a().a(localg);
    return localc;
  }

  private g a(String paramString, int paramInt)
  {
    sb localsb = new sb(new StringReader(paramString));
    g localg = localsb.a();
    localg.a(paramInt);
    int i = 0;
    for (int j = 0; j < paramString.length(); j++)
    {
      if (paramString.charAt(j) != '\r')
        continue;
      i++;
    }
    localg.b(paramInt + paramString.length() - i - 1);
    return localg;
  }

  protected int v()
  {
    return 1;
  }

  static boolean a(zb paramzb, boolean paramBoolean)
    throws Exception
  {
    return paramzb.a(paramBoolean);
  }

  static Stack a(zb paramzb)
  {
    return paramzb.d;
  }

  static Stack b(zb paramzb)
  {
    return paramzb.d;
  }

  static int c(zb paramzb)
  {
    return paramzb.b--;
  }

  static c d(zb paramzb)
  {
    return paramzb.c;
  }

  static c a(zb paramzb, c paramc)
  {
    return paramzb.c = paramc;
  }

  static c e(zb paramzb)
  {
    return paramzb.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zb
 * JD-Core Version:    0.6.0
 */