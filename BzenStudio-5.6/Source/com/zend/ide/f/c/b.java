package com.zend.ide.f.c;

import com.zend.ide.b.d;
import com.zend.ide.bf.b.a;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.ba;
import com.zend.ide.m.bf;
import com.zend.ide.m.bg;
import com.zend.ide.m.bh;
import com.zend.ide.m.v;
import com.zend.ide.n.bw;

public class b extends a
{
  public b(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super(paramString1, paramString2, paramString3, paramBoolean);
  }

  public String a(bw parambw, int paramInt)
  {
    s locals = bp.d().b();
    bf localbf = locals.a(parambw.k());
    d locald = bg.a(localbf, paramInt);
    if ((locald instanceof v))
      return locald.a();
    if (((locald instanceof bh)) && (((bh)locald).l() != null) && ((((bh)locald).l() instanceof v)))
      return ((bh)locald).l().a();
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.c.b
 * JD-Core Version:    0.6.0
 */