package com.zend.ide.f.c;

import com.zend.ide.bf.b.a;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.bf;
import com.zend.ide.m.bg;
import com.zend.ide.m.bh;
import com.zend.ide.n.bw;

public class d extends a
{
  public d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramString3, paramBoolean);
  }

  public String a(bw parambw, int paramInt)
  {
    s locals = bp.d().b();
    bf localbf = locals.a(parambw.k());
    com.zend.ide.b.d locald = bg.a(localbf, paramInt);
    if ((locald instanceof bh))
      return locald.a();
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.c.d
 * JD-Core Version:    0.6.0
 */