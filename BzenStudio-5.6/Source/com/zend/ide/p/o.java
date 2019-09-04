package com.zend.ide.p;

import com.zend.ide.util.dr;

public class o extends com.zend.ide.util.s
  implements com.zend.ide.util.r
{
  final bc g;

  public o(bc parambc)
  {
  }

  public void b()
  {
    p localp = new p(this, null);
    dr localdr = new dr(this, new r(this.g), localp);
    a("keys.clear", localdr, "default", true);
    localdr = new dr(this, new s(this.g), localp);
    a("keys.print", localdr, "default", true);
    localdr = new dr(this, new t(this.g), localp);
    a("keys.saveOutputAsFile", localdr, "default", true);
    localdr = new dr(this, new bq(this.g), localp);
    a("keys.copy", localdr, "default", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.o
 * JD-Core Version:    0.6.0
 */