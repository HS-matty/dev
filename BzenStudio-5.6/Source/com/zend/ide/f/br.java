package com.zend.ide.f;

import com.zend.ide.b.e;
import com.zend.ide.b.m;
import com.zend.ide.m.ba;
import com.zend.ide.m.g;

abstract class br extends e
  implements ba
{
  private ba f;
  protected g g;

  public br(String paramString, g paramg, m paramm)
  {
    super(paramString, paramg != null ? paramg.a() : "", paramm);
    this.g = paramg;
  }

  public ba l()
  {
    return this.f;
  }

  public void a(ba paramba)
  {
    this.f = paramba;
  }

  public g a()
  {
    return this.g;
  }

  public String b()
  {
    if (a() != null)
      return a().a();
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.br
 * JD-Core Version:    0.6.0
 */