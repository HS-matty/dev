package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;

class y extends x
{
  final c b;

  private y(c paramc)
  {
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    c.a(this.b, b());
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean)
      paramBoolean = b();
    c.a(this.b, paramBoolean);
  }

  private boolean b()
  {
    boolean bool = false;
    bw[] arrayOfbw = this.b.v();
    for (int i = 0; (!bool) && (i < arrayOfbw.length); i++)
      bool = arrayOfbw[i].h();
    return bool;
  }

  y(c paramc, f paramf)
  {
    this(paramc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.y
 * JD-Core Version:    0.6.0
 */