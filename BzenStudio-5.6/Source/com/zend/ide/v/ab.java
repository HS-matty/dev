package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.nb;
import com.zend.ide.n.ob;
import com.zend.ide.n.pb;
import com.zend.ide.n.qb;
import java.util.ArrayList;

class ab extends nb
  implements pb
{
  final c b;

  public ab(c paramc)
  {
    paramc.a(new ib(this, paramc));
  }

  public void a(qb paramqb)
  {
    super.a(paramqb);
    bw[] arrayOfbw = this.b.v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a().a(paramqb);
  }

  public void a()
  {
    super.a();
    bw[] arrayOfbw = this.b.v();
    for (int i = 0; i < arrayOfbw.length; i++)
      arrayOfbw[i].a().a();
  }

  public ob a(dz paramdz, int paramInt)
  {
    return this.b.u().a().a(paramdz, paramInt);
  }

  static ArrayList a(ab paramab)
  {
    return paramab.a;
  }

  static ArrayList b(ab paramab)
  {
    return paramab.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.ab
 * JD-Core Version:    0.6.0
 */