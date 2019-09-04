package com.zend.ide.f.c;

import com.zend.ide.b.d;
import com.zend.ide.bf.b.a;
import com.zend.ide.f.bl;
import com.zend.ide.f.bp;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.f.vb;
import com.zend.ide.m.bf;
import com.zend.ide.n.bw;

public class c extends a
{
  public c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramString3, paramBoolean);
  }

  public String a(bw parambw, int paramInt)
  {
    s locals = bp.d().b();
    bf localbf = locals.a(parambw.k());
    vb localvb = bl.a(localbf, paramInt);
    d[] arrayOfd = locals.g().a(parambw.k(), localvb, "", false);
    for (int i = 0; i < arrayOfd.length; i++)
    {
      d locald = arrayOfd[i];
      if (!('$' + locald.a()).equals(this.a))
        continue;
      this.a = ("$" + (char)(locald.a().charAt(0) + '\001'));
      return a(parambw, paramInt);
    }
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.c.c
 * JD-Core Version:    0.6.0
 */