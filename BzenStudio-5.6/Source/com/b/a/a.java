package com.b.a;

import java.io.PrintStream;
import java.util.Stack;

public abstract class a
{
  protected boolean a = false;
  protected int b;
  protected c c;
  protected Stack d = new Stack();
  protected short[][] e;
  protected short[][] f;
  protected short[][] g;
  private b h;
  protected c[] i;
  protected int j;

  public a()
  {
  }

  public a(b paramb)
  {
    this();
    a(paramb);
  }

  protected int v()
  {
    return 3;
  }

  public abstract short[][] b();

  public abstract short[][] c();

  public abstract short[][] d();

  public abstract int e();

  public abstract int f();

  public abstract int g();

  public abstract int h();

  public void i()
  {
    this.a = true;
  }

  public void a(b paramb)
  {
    this.h = paramb;
  }

  public b j()
  {
    return this.h;
  }

  public abstract c a(int paramInt1, a parama, Stack paramStack, int paramInt2)
    throws Exception;

  public void k()
    throws Exception
  {
  }

  protected abstract void l()
    throws Exception;

  public c m()
    throws Exception
  {
    return j().d();
  }

  public void a(String paramString, Object paramObject)
    throws Exception
  {
    i();
    b(paramString, paramObject);
    throw new Exception("Can't recover from previous error(s)");
  }

  public void b(String paramString, Object paramObject)
  {
    System.err.print(paramString);
    if ((paramObject instanceof c))
    {
      if (((c)paramObject).d != -1)
        System.err.println(" at character " + ((c)paramObject).d + " of input");
      else
        System.err.println("");
    }
    else
      System.err.println("");
  }

  public void a(c paramc)
  {
    b("Syntax error", paramc);
  }

  public void b(c paramc)
    throws Exception
  {
    a("Couldn't repair and continue parse", paramc);
  }

  protected final short a(int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = this.f[paramInt1];
    int i1;
    if (arrayOfShort.length < 20)
      for (i1 = 0; i1 < arrayOfShort.length; i1++)
      {
        int k = arrayOfShort[(i1++)];
        if ((k == paramInt2) || (k == -1))
          return arrayOfShort[i1];
      }
    int m = 0;
    int n = (arrayOfShort.length - 1) / 2 - 1;
    while (m <= n)
    {
      i1 = (m + n) / 2;
      if (paramInt2 == arrayOfShort[(i1 * 2)])
        return arrayOfShort[(i1 * 2 + 1)];
      if (paramInt2 > arrayOfShort[(i1 * 2)])
      {
        m = i1 + 1;
        continue;
      }
      n = i1 - 1;
    }
    return arrayOfShort[(arrayOfShort.length - 1)];
    return 0;
  }

  protected final short b(int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = this.g[paramInt1];
    if (arrayOfShort == null)
      return -1;
    for (int m = 0; m < arrayOfShort.length; m++)
    {
      int k = arrayOfShort[(m++)];
      if ((k == paramInt2) || (k == -1))
        return arrayOfShort[m];
    }
    return -1;
  }

  public c n()
    throws Exception
  {
    c localc = null;
    this.e = b();
    this.f = c();
    this.g = d();
    l();
    k();
    this.c = m();
    this.d.removeAllElements();
    this.d.push(new c(0, e()));
    this.b = 0;
    this.a = false;
    while (!this.a)
    {
      if (this.c.c)
        throw new Error("Symbol recycling detected (fix your scanner).");
      int k = a(((c)this.d.peek()).b, this.c.a);
      if (k > 0)
      {
        this.c.b = (k - 1);
        this.c.c = true;
        this.d.push(this.c);
        this.b += 1;
        this.c = m();
        continue;
      }
      if (k < 0)
      {
        localc = a(-k - 1, this, this.d, this.b);
        int n = this.e[(-k - 1)][0];
        int m = this.e[(-k - 1)][1];
        for (int i1 = 0; i1 < m; i1++)
        {
          this.d.pop();
          this.b -= 1;
        }
        k = b(((c)this.d.peek()).b, n);
        localc.b = k;
        localc.c = true;
        this.d.push(localc);
        this.b += 1;
        continue;
      }
      if (k != 0)
        continue;
      a(this.c);
      if (!a(false))
      {
        b(this.c);
        i();
        continue;
      }
      localc = (c)this.d.peek();
      localc.c = false;
    }
    return localc;
  }

  public void a(String paramString)
  {
    System.err.println(paramString);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a("# Reduce with prod #" + paramInt1 + " [NT=" + paramInt2 + ", " + "SZ=" + paramInt3 + "]");
  }

  public void c(c paramc)
  {
    a("# Shift under term #" + paramc.a + " to state #" + paramc.b);
  }

  protected boolean a(boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean)
      a("# Attempting error recovery");
    if (!b(paramBoolean))
    {
      if (paramBoolean)
        a("# Error recovery fails");
      return false;
    }
    p();
    while (true)
    {
      if (paramBoolean)
        a("# Trying to parse ahead");
      if (c(paramBoolean))
        break;
      if (this.i[0].a == g())
      {
        if (paramBoolean)
          a("# Error recovery fails at EOF");
        return false;
      }
      if (paramBoolean)
        a("# Consuming Symbol #" + q().a);
      s();
    }
    if (paramBoolean)
      a("# Parse-ahead ok, going back to normal parse");
    d(paramBoolean);
    return true;
  }

  protected boolean o()
  {
    return a(((c)this.d.peek()).b, h()) > 0;
  }

  protected boolean b(boolean paramBoolean)
  {
    if (paramBoolean)
      a("# Finding recovery state on stack");
    int m = ((c)this.d.peek()).e;
    int n = ((c)this.d.peek()).d;
    while (!o())
    {
      if (paramBoolean)
        a("# Pop stack by one, state was # " + ((c)this.d.peek()).b);
      n = ((c)this.d.pop()).d;
      this.b -= 1;
      if (!this.d.empty())
        continue;
      if (paramBoolean)
        a("# No recovery state found on stack");
      return false;
    }
    int k = a(((c)this.d.peek()).b, h());
    if (paramBoolean)
    {
      a("# Recover state found (#" + ((c)this.d.peek()).b + ")");
      a("# Shifting on error to state #" + (k - 1));
    }
    c localc = new c(h(), n, m);
    localc.b = (k - 1);
    localc.c = true;
    this.d.push(localc);
    this.b += 1;
    return true;
  }

  protected void p()
    throws Exception
  {
    this.i = new c[v()];
    for (int k = 0; k < v(); k++)
    {
      this.i[k] = this.c;
      this.c = m();
    }
    this.j = 0;
  }

  protected c q()
  {
    return this.i[this.j];
  }

  protected boolean r()
  {
    this.j += 1;
    return this.j < v();
  }

  protected void s()
    throws Exception
  {
    for (int k = 1; k < v(); k++)
      this.i[(k - 1)] = this.i[k];
    this.c = m();
    this.i[(v() - 1)] = this.c;
    this.j = 0;
  }

  protected boolean c(boolean paramBoolean)
    throws Exception
  {
    d locald = new d(this.d);
    while (true)
    {
      int k = a(locald.b(), q().a);
      if (k == 0)
        return false;
      if (k > 0)
      {
        locald.a(k - 1);
        if (paramBoolean)
          a("# Parse-ahead shifts Symbol #" + q().a + " into state #" + (k - 1));
        if (!r())
          return true;
      }
      if (-k - 1 == f())
      {
        if (paramBoolean)
          a("# Parse-ahead accepts");
        return true;
      }
      int m = this.e[(-k - 1)][0];
      int n = this.e[(-k - 1)][1];
      for (int i1 = 0; i1 < n; i1++)
        locald.c();
      if (paramBoolean)
        a("# Parse-ahead reduces: handle size = " + n + " lhs = #" + m + " from state #" + locald.b());
      locald.a(b(locald.b(), m));
      if (!paramBoolean)
        continue;
      a("# Goto state #" + locald.b());
    }
  }

  protected void d(boolean paramBoolean)
    throws Exception
  {
    c localc = null;
    this.j = 0;
    if (paramBoolean)
    {
      a("# Reparsing saved input with actions");
      a("# Current Symbol is #" + q().a);
      a("# Current state is #" + ((c)this.d.peek()).b);
    }
    while (!this.a)
    {
      int k = a(((c)this.d.peek()).b, q().a);
      if (k > 0)
      {
        q().b = (k - 1);
        q().c = true;
        if (paramBoolean)
          c(q());
        this.d.push(q());
        this.b += 1;
        if (!r())
        {
          if (paramBoolean)
            a("# Completed reparse");
          return;
        }
        if (!paramBoolean)
          continue;
        a("# Current Symbol is #" + q().a);
        continue;
      }
      if (k < 0)
      {
        localc = a(-k - 1, this, this.d, this.b);
        int n = this.e[(-k - 1)][0];
        int m = this.e[(-k - 1)][1];
        if (paramBoolean)
          a(-k - 1, n, m);
        for (int i1 = 0; i1 < m; i1++)
        {
          this.d.pop();
          this.b -= 1;
        }
        k = b(((c)this.d.peek()).b, n);
        localc.b = k;
        localc.c = true;
        this.d.push(localc);
        this.b += 1;
        if (!paramBoolean)
          continue;
        a("# Goto state #" + k);
        continue;
      }
      if (k != 0)
        continue;
      a("Syntax error", localc);
      return;
    }
  }

  protected static short[][] a(String[] paramArrayOfString)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfString[0]);
    for (int k = 1; k < paramArrayOfString.length; k++)
      localStringBuffer.append(paramArrayOfString[k]);
    k = 0;
    int m = localStringBuffer.charAt(k) << '\020' | localStringBuffer.charAt(k + 1);
    k += 2;
    short[][] arrayOfShort = new short[m][];
    for (int n = 0; n < m; n++)
    {
      int i1 = localStringBuffer.charAt(k) << '\020' | localStringBuffer.charAt(k + 1);
      k += 2;
      arrayOfShort[n] = new short[i1];
      for (int i2 = 0; i2 < i1; i2++)
        arrayOfShort[n][i2] = (short)(localStringBuffer.charAt(k++) - '\002');
    }
    return arrayOfShort;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.b.a.a
 * JD-Core Version:    0.6.0
 */