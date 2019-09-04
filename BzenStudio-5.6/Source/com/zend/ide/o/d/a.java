package com.zend.ide.o.d;

import com.zend.ide.o.di;
import com.zend.ide.util.cl;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class a extends com.zend.ide.t.j
  implements bl
{
  private DataOutputStream a;
  private com.zend.ide.util.bh b = com.zend.ide.util.bh.a;

  public void a(Object paramObject, OutputStream paramOutputStream)
  {
    try
    {
      this.a = ((DataOutputStream)paramOutputStream);
      ((com.zend.ide.t.o)paramObject).a(this);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void a(com.zend.ide.util.bh parambh)
  {
    this.b = parambh;
  }

  public void a(h paramh)
    throws IOException
  {
    a(paramh.c());
  }

  public void a(v paramv)
    throws IOException
  {
    this.a.writeInt(paramv.c());
    this.a.writeInt(paramv.d());
  }

  public void a(j paramj)
    throws IOException
  {
    this.a.writeInt(paramj.c());
  }

  public void a(x paramx)
    throws IOException
  {
    this.a.writeInt(paramx.c());
  }

  public void a(i parami)
    throws IOException
  {
  }

  public void a(w paramw)
    throws IOException
  {
    this.a.writeInt(paramw.c());
  }

  public void a(r paramr)
  {
  }

  public void a(bf parambf)
    throws IOException
  {
    this.a.writeInt(parambf.c());
  }

  public void a(t paramt)
  {
  }

  public void a(bh parambh)
    throws IOException
  {
    this.a.writeInt(parambh.c());
  }

  public void a(s params)
  {
  }

  public void a(bg parambg)
    throws IOException
  {
    this.a.writeInt(parambg.c());
  }

  public void a(q paramq)
  {
  }

  public void a(be parambe)
    throws IOException
  {
    this.a.writeInt(parambe.c());
  }

  public void a(k paramk)
    throws IOException
  {
    b(paramk.c());
  }

  public void a(y paramy)
    throws IOException
  {
    this.a.writeInt(paramy.c());
    a(paramy.d());
  }

  public void a(p paramp)
  {
  }

  public void a(bd parambd)
    throws IOException
  {
    this.a.writeInt(parambd.c());
  }

  public void a(l paraml)
    throws IOException
  {
    a(paraml.c());
  }

  public void a(db paramdb)
    throws IOException
  {
    a(paramdb.d());
    this.a.writeInt(paramdb.a());
    this.a.writeInt(paramdb.c());
  }

  public void a(z paramz)
    throws IOException
  {
    int i = 0;
    this.a.writeInt(paramz.c());
    byte[] arrayOfByte = paramz.d();
    if (arrayOfByte != null)
      i = arrayOfByte.length;
    this.a.writeInt(i);
    if (arrayOfByte != null)
      this.a.write(arrayOfByte);
  }

  public void a(u paramu)
  {
  }

  public void a(bi parambi)
    throws IOException
  {
    this.a.writeInt(parambi.c());
  }

  public void a(o paramo)
    throws IOException
  {
    b(paramo.c());
    this.a.writeInt(paramo.d());
    String[] arrayOfString = paramo.e();
    this.a.writeInt(arrayOfString.length);
    for (int i = 0; i < arrayOfString.length; i++)
      a(arrayOfString[i]);
  }

  public void a(bc parambc)
    throws IOException
  {
    this.a.writeInt(parambc.c());
    a(new String(parambc.d()));
  }

  public void a(m paramm)
  {
  }

  public void a(ba paramba)
    throws IOException
  {
    this.a.writeInt(paramba.c());
  }

  public void a(n paramn)
    throws IOException
  {
    this.a.writeInt(paramn.f());
    a(paramn.c());
    this.a.writeInt(paramn.d());
    String[] arrayOfString = paramn.e();
    this.a.writeInt(arrayOfString.length);
    for (int i = 0; i < arrayOfString.length; i++)
      a(arrayOfString[i]);
  }

  public void a(bb parambb)
    throws IOException
  {
    this.a.writeInt(parambb.c());
    a(new String(parambb.d()));
  }

  public void a(g paramg)
    throws IOException
  {
    a(paramg.b());
    this.a.writeInt(paramg.c());
    this.a.writeInt(0);
  }

  public void a(c paramc)
    throws IOException
  {
    a(paramc.b());
    a(paramc.c());
  }

  public void a(bm parambm)
  {
  }

  public void a(bn parambn)
  {
  }

  public void a(e parame)
    throws IOException
  {
    a(new String(parame.b()));
  }

  public void a(d paramd)
    throws IOException
  {
    a(paramd.b());
  }

  public void a(b paramb)
    throws IOException
  {
    this.a.writeInt(paramb.b());
    a(paramb.c());
  }

  public void a(f paramf)
    throws IOException
  {
    this.a.writeInt(paramf.b());
    a(paramf.d());
    this.a.writeInt(paramf.e() + 1);
    a(paramf.c());
  }

  public void a(bq parambq)
  {
  }

  public void a(bt parambt)
    throws IOException
  {
    this.a.writeInt(parambt.c());
  }

  public void a(bp parambp)
    throws IOException
  {
    this.a.writeInt(parambp.c());
  }

  public void a(bs parambs)
    throws IOException
  {
    this.a.writeInt(parambs.c());
  }

  public void a(bo parambo)
  {
  }

  public void a(br parambr)
    throws IOException
  {
    this.a.writeInt(parambr.c());
  }

  public void a(ab paramab)
    throws IOException
  {
    b(paramab.a());
    b(paramab.b());
    this.a.writeInt(paramab.c());
    String[] arrayOfString = paramab.d();
    this.a.writeInt(arrayOfString.length);
    for (int i = 0; i < arrayOfString.length; i++)
      a(arrayOfString[i]);
  }

  public void a(cb paramcb)
    throws IOException
  {
    this.a.writeInt(paramcb.c());
  }

  private void a(String paramString)
    throws IOException
  {
    byte[] arrayOfByte = paramString.getBytes();
    this.a.writeInt(arrayOfByte.length);
    this.a.write(arrayOfByte);
  }

  private void b(String paramString)
    throws IOException
  {
    byte[] arrayOfByte = com.zend.ide.util.bh.a(paramString, this.b);
    this.a.writeInt(arrayOfByte.length);
    this.a.write(arrayOfByte);
  }

  private void a(di paramdi)
    throws IOException
  {
    this.a.writeShort(paramdi.f());
    this.a.writeShort(paramdi.g());
    if (paramdi.e())
    {
      a(paramdi.h());
      if (!paramdi.d())
        return;
    }
    a(paramdi.j());
    if (paramdi.d())
    {
      int i = paramdi.b();
      if (i >= 0)
        i++;
      this.a.writeInt(i);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.a
 * JD-Core Version:    0.6.0
 */