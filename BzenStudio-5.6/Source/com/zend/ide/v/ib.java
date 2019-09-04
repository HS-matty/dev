package com.zend.ide.v;

import com.zend.ide.n.dz;
import com.zend.ide.n.pb;
import com.zend.ide.n.qb;
import java.util.ArrayList;

class ib extends x
{
  final c a;
  final ab b;

  ib(ab paramab, c paramc)
  {
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (paramBoolean)
      paramdz.a().a();
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      pb localpb = paramdz.a();
      for (int i = 0; i < ab.a(this.b).size(); i++)
        localpb.a((qb)ab.b(this.b).get(i));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.ib
 * JD-Core Version:    0.6.0
 */