package com.zend.ide.l.a;

import com.a.e;
import com.zend.ide.n.co;
import com.zend.ide.n.u;

public class a extends com.a.a.a
{
  private com.a.a.b d = new com.a.a.b("bookmarks", new b());

  public a()
  {
    super("bookmarks", u.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    if (paramObject != null)
      this.d.a(((u)paramObject).b());
  }

  public Object a(e parame)
  {
    u localu = new u();
    Object localObject = this.d.a(parame);
    localu.a((co[])(co[])localObject);
    return localu;
  }

  public e e()
  {
    return this.d.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.a
 * JD-Core Version:    0.6.0
 */