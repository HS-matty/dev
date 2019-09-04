package com.zend.ide.util.f;

import com.zend.ide.util.bi;
import java.awt.Component;

class e
  implements h
{
  final a a;

  e(a parama)
  {
  }

  public void b()
  {
    String str1 = a.a(this.a).c();
    String str2 = a.a(this.a).d();
    f localf = a.a(this.a, str1, str2);
    Component localComponent = a.a(this.a).b();
    if ((localf.a()) && (!this.a.a()))
    {
      if (a.a(this.a, str1, str2, localComponent))
        return;
      localf = a.a(this.a, "Evaluation Copy", str2);
      if ((localf.a()) && (!this.a.a()))
      {
        if (!localf.g)
          a.a(this.a).a(localComponent);
        else
          a.a(this.a).b(localComponent);
        return;
      }
    }
    a.a(this.a, localf);
    if ((a.b(this.a).c()) && (a.b(this.a).e > 0))
      a.a(this.a).a(localComponent, str1, a.b(this.a).e);
    bi.b("USER_NAME", a.b(this.a).a);
    bi.b("LICENSE_KEY", a.b(this.a).b);
    a.b(this.a.e);
    a.a(this.a).e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.e
 * JD-Core Version:    0.6.0
 */