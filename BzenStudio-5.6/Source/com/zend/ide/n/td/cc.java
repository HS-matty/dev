package com.zend.ide.n.td;

import com.zend.ide.n.dz;
import com.zend.ide.util.wb;
import com.zend.ide.v.x;
import java.util.Map;

class cc extends x
{
  final bc a;

  private cc(bc parambc)
  {
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    String str = paramdz.k();
    if (bc.c(this.a).containsKey(str))
      bc.c(this.a).remove(str);
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    String str = paramdz.k();
    if (!bc.c(this.a).containsKey(str))
      bc.a(this.a, str, true);
  }

  public void a(dz paramdz)
  {
    bc.a(this.a, paramdz != null ? paramdz.k() : "");
    if (!bc.c(this.a).containsKey(bc.d(this.a)))
      bc.a(this.a, bc.d(this.a), true);
  }

  public void a(String paramString1, String paramString2)
  {
    jb localjb = (jb)bc.c(this.a).get(paramString1);
    if (localjb != null)
    {
      bc.c(this.a).remove(paramString1);
      if (wb.a(paramString2))
        bc.c(this.a).put(paramString2, localjb);
      else
        localjb.a();
    }
  }

  cc(bc parambc, bb parambb)
  {
    this(parambc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.cc
 * JD-Core Version:    0.6.0
 */