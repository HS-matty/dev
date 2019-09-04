package com.zend.ide.bf.a;

import com.a.e;
import com.zend.ide.bf.bf;
import com.zend.ide.bf.d;

public class b extends com.a.a.a
{
  private com.a.a.b d = new com.a.a.b("templates", new a());

  public b()
  {
    super("templates", bf.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    if (paramObject != null)
      this.d.a(((bf)paramObject).b());
  }

  public Object a(e parame)
  {
    bf localbf = new bf();
    Object localObject = this.d.a(parame);
    localbf.a((d[])(d[])localObject);
    return localbf;
  }

  public e e()
  {
    return this.d.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.a.b
 * JD-Core Version:    0.6.0
 */