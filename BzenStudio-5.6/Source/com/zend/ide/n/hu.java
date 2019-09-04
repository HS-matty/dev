package com.zend.ide.n;

import com.zend.ide.v.x;
import java.util.Map;

class hu extends x
{
  final dr b;

  private hu(dr paramdr)
  {
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    gx localgx = (gx)((bw)paramdz).e();
    localgx.addFocusListener(dr.a(this.b));
    il localil = new il(this.b, null);
    dr.b(this.b).put(localgx, localil);
    localgx.a(localil, -1);
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    gx localgx = (gx)((bw)paramdz).e();
    localgx.removeFocusListener(dr.a(this.b));
    il localil = (il)dr.b(this.b).get(localgx);
    localgx.a(localil);
    dr.b(this.b).remove(localgx);
  }

  hu(dr paramdr, dx paramdx)
  {
    this(paramdr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hu
 * JD-Core Version:    0.6.0
 */