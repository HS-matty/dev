package com.zend.ide.db;

import com.zend.ide.util.dr;
import com.zend.ide.util.s;

public class q extends s
  implements com.zend.ide.util.r
{
  final z g;

  public q(z paramz)
  {
  }

  public void a()
  {
    r localr = new r(this, null);
    dr localdr = new dr(this, new t(this.g), localr);
    a("keys.clear", localdr, "default", true);
    localdr = new dr(this, new v(this.g), localr);
    a("keys.print", localdr, "default", true);
    localdr = new dr(this, new w(this.g), localr);
    a("keys.saveOutputAsFile", localdr, "default", true);
    localdr = new dr(this, new u(this.g), localr);
    a("keys.copy", localdr, "default", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.q
 * JD-Core Version:    0.6.0
 */