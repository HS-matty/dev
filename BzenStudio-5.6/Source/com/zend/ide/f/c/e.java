package com.zend.ide.f.c;

import com.zend.ide.b.d;
import com.zend.ide.bf.b.a;
import com.zend.ide.f.bl;
import com.zend.ide.f.bp;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.f.vb;
import com.zend.ide.m.bf;
import com.zend.ide.m.bk;
import com.zend.ide.m.q;
import com.zend.ide.n.bw;
import javax.swing.text.BadLocationException;

public class e extends a
{
  public e(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramString3, paramBoolean);
  }

  public String a(bw parambw, int paramInt)
  {
    int i;
    try
    {
      i = parambw.getLineOfOffset(paramInt);
    }
    catch (BadLocationException localBadLocationException)
    {
      i = 0;
    }
    s locals = bp.d().b();
    bf localbf = locals.a(parambw.k());
    vb localvb = bl.a(localbf, paramInt);
    d[] arrayOfd = locals.g().a(parambw.k(), localvb, "", false);
    bk localbk = localbf.g();
    Object localObject = null;
    String str = null;
    for (int j = 0; j < arrayOfd.length; j++)
    {
      q localq = localbk.a(localvb, arrayOfd[j].a(), i);
      if ((localObject != null) && (!a((q)localObject, localq, i)))
        continue;
      localObject = localq;
      str = arrayOfd[j].a();
    }
    return localObject != null ? '$' + str : (String)this.a;
  }

  private static boolean a(q paramq1, q paramq2, int paramInt)
  {
    if (paramq2 == null)
      return false;
    if (paramq1 == null)
      return true;
    int i = paramq1.d();
    int j = paramq2.d();
    return (j > i) && (j <= paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.c.e
 * JD-Core Version:    0.6.0
 */