package com.zend.ide.n.td;

import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.g;
import com.zend.ide.m.v;
import com.zend.ide.m.z;
import com.zend.ide.n.ho;
import com.zend.ide.util.cl;
import java.util.ArrayList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class f extends d
{
  public f(jb paramjb, ho paramho)
  {
    super(paramjb, paramho);
  }

  public void a(bf parambf)
  {
    if (this.h)
    {
      this.g = a.c();
      this.h = false;
    }
    a();
    if (parambf == null)
      return;
    bh[] arrayOfbh = parambf.d();
    v[] arrayOfv = parambf.c();
    try
    {
      a(parambf, arrayOfbh, arrayOfv);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    finally
    {
      this.g = false;
    }
  }

  private void a(bf parambf, bh[] paramArrayOfbh, v[] paramArrayOfv)
    throws BadLocationException
  {
    this.d.clear();
    g localg = parambf.a();
    a(localg, this.f);
    bd[] arrayOfbd = parambf.k();
    for (int i = 0; i < arrayOfbd.length; i++)
      a(arrayOfbd[i].a(), this.f);
    for (i = 0; i < paramArrayOfbh.length; i++)
      a(paramArrayOfbh[i].a(), this.f);
    for (i = 0; i < paramArrayOfv.length; i++)
    {
      a(paramArrayOfv[i].a(), this.f);
      bh[] arrayOfbh = paramArrayOfv[i].h();
      for (int j = 0; j < arrayOfbh.length; j++)
        a(arrayOfbh[j].a(), this.f);
      c[] arrayOfc = paramArrayOfv[i].a();
      for (int k = 0; k < arrayOfc.length; k++)
        a(arrayOfc[k].a(), this.f);
      z[] arrayOfz = paramArrayOfv[i].g();
      for (int m = 0; m < arrayOfz.length; m++)
        a(arrayOfz[m].a(), this.f);
    }
  }

  private void a(g paramg, Document paramDocument)
    throws BadLocationException
  {
    if (paramg == null)
      return;
    int i = paramg.a();
    int j = paramg.b();
    if ((j > i) && (i >= 0))
    {
      t localt = new t(this.g, paramDocument.createPosition(i), paramDocument.createPosition(j));
      this.d.add(localt);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.f
 * JD-Core Version:    0.6.0
 */