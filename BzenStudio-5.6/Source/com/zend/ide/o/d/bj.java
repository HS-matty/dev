package com.zend.ide.o.d;

import com.zend.ide.o.di;
import com.zend.ide.o.ib;
import com.zend.ide.o.jb;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class bj
  implements com.zend.ide.t.h, bl
{
  private DataInputStream a;
  private com.zend.ide.t.g b;
  private com.zend.ide.util.bh c = com.zend.ide.util.bh.a;

  public com.zend.ide.t.g a(InputStream paramInputStream, Object paramObject)
    throws Exception
  {
    synchronized (this)
    {
      this.b = ((com.zend.ide.t.g)paramObject);
      this.a = ((DataInputStream)paramInputStream);
      ((com.zend.ide.t.o)paramObject).a(this);
      return this.b;
    }
  }

  public void a(com.zend.ide.util.bh parambh)
  {
    this.c = parambh;
  }

  public void a(h paramh)
    throws IOException
  {
    paramh.a(c());
  }

  public void a(v paramv)
    throws IOException
  {
    paramv.b(this.a.readInt());
    paramv.c(this.a.readInt());
  }

  public void a(j paramj)
    throws IOException
  {
    paramj.b(this.a.readInt());
  }

  public void a(x paramx)
    throws IOException
  {
    paramx.b(this.a.readInt());
  }

  public void a(i parami)
    throws IOException
  {
  }

  public void a(w paramw)
    throws IOException
  {
    paramw.b(this.a.readInt());
  }

  public void a(r paramr)
    throws IOException
  {
  }

  public void a(bf parambf)
    throws IOException
  {
    parambf.b(this.a.readInt());
  }

  public void a(t paramt)
    throws IOException
  {
  }

  public void a(bh parambh)
    throws IOException
  {
    parambh.b(this.a.readInt());
  }

  public void a(s params)
    throws IOException
  {
  }

  public void a(bg parambg)
    throws IOException
  {
    parambg.b(this.a.readInt());
  }

  public void a(k paramk)
    throws IOException
  {
    paramk.a(d());
  }

  public void a(y paramy)
    throws IOException
  {
    paramy.b(this.a.readInt());
    paramy.a(d());
  }

  public void a(p paramp)
  {
  }

  public void a(bd parambd)
    throws IOException
  {
    parambd.b(this.a.readInt());
  }

  public void a(q paramq)
  {
  }

  public void a(be parambe)
    throws IOException
  {
    parambe.b(this.a.readInt());
  }

  public void a(l paraml)
    throws IOException
  {
    paraml.a(d());
  }

  public void a(db paramdb)
    throws IOException
  {
    paramdb.a(d());
    paramdb.b(this.a.readInt());
    paramdb.c(this.a.readInt());
  }

  public void a(z paramz)
    throws IOException
  {
    paramz.b(this.a.readInt());
    paramz.a(b());
  }

  public void a(u paramu)
  {
  }

  public void a(bi parambi)
    throws IOException
  {
    parambi.b(this.a.readInt());
  }

  public void a(o paramo)
    throws IOException
  {
    paramo.a(d());
    paramo.b(this.a.readInt());
    int i = this.a.readInt();
    if (i > 0)
    {
      String[] arrayOfString = new String[i];
      for (int j = 0; j < i; j++)
        arrayOfString[j] = d();
      paramo.a(arrayOfString);
    }
  }

  public void a(bc parambc)
    throws IOException
  {
    parambc.b(this.a.readInt());
    parambc.a(e());
  }

  public void a(m paramm)
  {
  }

  public void a(ba paramba)
    throws IOException
  {
    ib localib = new ib();
    int i = this.a.readInt();
    for (int j = 0; j < i; j++)
    {
      jb localjb = new jb(j, d(), this.a.readInt(), d(), d(), this.a.readInt(), d());
      int k = this.a.readInt();
      for (int m = 0; m < k; m++)
        localjb.a(e(), e());
      localib.a(localjb);
    }
    paramba.a(localib);
  }

  public void a(n paramn)
    throws IOException
  {
    paramn.c(this.a.readInt());
    paramn.a(d());
    paramn.b(this.a.readInt());
    int i = this.a.readInt();
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++)
      arrayOfString[j] = d();
    paramn.a(arrayOfString);
  }

  public void a(bb parambb)
    throws IOException
  {
    parambb.b(this.a.readInt());
    parambb.a(e());
  }

  public void a(g paramg)
    throws IOException
  {
    paramg.a(d());
    paramg.a(this.a.readInt() - 1);
    this.a.readInt();
  }

  public void a(c paramc)
    throws IOException
  {
    paramc.a(this.a.readInt());
    paramc.a(d());
    paramc.b(d());
    paramc.c(d());
    paramc.d(d());
  }

  public void a(bm parambm)
    throws IOException
  {
    parambm.a(this.a.readInt());
  }

  public void a(bn parambn)
  {
  }

  public void a(e parame)
    throws IOException
  {
    parame.a(e());
  }

  public void a(d paramd)
    throws IOException
  {
    paramd.a(d());
  }

  public void a(b paramb)
    throws IOException
  {
    int i = this.a.readInt();
    String str = d();
    paramb.a(i);
    paramb.a(str);
  }

  public void a(f paramf)
    throws IOException
  {
    paramf.a(this.a.readInt());
    paramf.b(d());
    paramf.b(this.a.readInt() - 1);
    paramf.a(d());
  }

  public void a(bq parambq)
  {
  }

  public void a(bt parambt)
    throws IOException
  {
    com.zend.ide.z.u localu = new com.zend.ide.z.u();
    localu.a(d());
    localu.b(d());
    localu.c(d());
    localu.a(this.a.readInt());
    localu.b(this.a.readInt());
    localu.d(this.a.readInt());
    localu.c(this.a.readInt());
    for (int i = 0; i < localu.d(); i++)
      localu.d(d());
    parambt.a(localu);
  }

  public void a(bp parambp)
  {
  }

  public void a(bs parambs)
    throws IOException
  {
    com.zend.ide.z.n localn = new com.zend.ide.z.n();
    localn.a(d());
    localn.a(this.a.readInt());
    for (int i = 0; i < localn.b(); i++)
    {
      com.zend.ide.z.r localr = new com.zend.ide.z.r(localn.e(), d(), this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt());
      localn.a(localr);
    }
    parambs.a(localn);
  }

  public void a(bo parambo)
  {
  }

  public void a(br parambr)
    throws IOException
  {
    com.zend.ide.z.i locali = new com.zend.ide.z.i();
    locali.a(this.a.readInt());
    for (int i = 0; i < locali.c(); i++)
      locali.a(new com.zend.ide.z.j(this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt(), this.a.readInt()));
    parambr.a(locali);
  }

  public void a(ab paramab)
    throws IOException
  {
    paramab.a(d());
    paramab.b(d());
    paramab.b(this.a.readInt());
    int i = this.a.readInt();
    if (i > 0)
    {
      String[] arrayOfString = new String[i];
      for (int j = 0; j < i; j++)
        arrayOfString[j] = d();
      paramab.a(arrayOfString);
    }
  }

  public void a(cb paramcb)
    throws IOException
  {
    paramcb.b(this.a.readInt());
  }

  private String d()
    throws IOException
  {
    return new String(b());
  }

  private String e()
    throws IOException
  {
    byte[] arrayOfByte = b();
    String str = com.zend.ide.util.bh.a(arrayOfByte, this.c);
    return str;
  }

  private byte[] b()
    throws IOException
  {
    byte[] arrayOfByte = new byte[this.a.readInt()];
    this.a.readFully(arrayOfByte);
    return arrayOfByte;
  }

  private di c()
    throws IOException
  {
    di localdi = new di();
    localdi.c(this.a.readShort());
    localdi.d(this.a.readShort());
    if (localdi.f() == 2)
      localdi.b(d());
    localdi.a(d());
    if (localdi.f() == 1)
      localdi.a(this.a.readInt());
    return localdi;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.bj
 * JD-Core Version:    0.6.0
 */