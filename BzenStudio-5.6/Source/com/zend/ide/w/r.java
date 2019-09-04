package com.zend.ide.w;

import com.zend.ide.util.dr;

public class r extends com.zend.ide.util.s
  implements com.zend.ide.util.r
{
  final bb f;

  public r(bb parambb)
  {
  }

  public void a()
  {
    s locals = new s(this, null);
    dr localdr = new dr(this, new w(this.f), locals);
    a("keys.clear", localdr, "default", true);
    localdr = new dr(this, new y(this.f), locals);
    a("keys.print", localdr, "default", true);
    localdr = new dr(this, new z(this.f), locals);
    a("keys.saveOutputAsFile", localdr, "default", true);
    localdr = new dr(this, new x(this.f), locals);
    a("keys.copy", localdr, "default", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.r
 * JD-Core Version:    0.6.0
 */