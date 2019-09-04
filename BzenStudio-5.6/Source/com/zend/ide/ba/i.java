package com.zend.ide.ba;

import com.zend.ide.util.dr;
import com.zend.ide.util.r;
import com.zend.ide.util.s;

public class i extends s
  implements r
{
  final f g;

  public i(f paramf)
  {
  }

  public void b()
  {
    j localj = new j(this, null);
    dr localdr = new dr(this, new k(this.g), localj);
    a("keys.clear", localdr, "default", true);
    localdr = new dr(this, new m(this.g), localj);
    a("keys.print", localdr, "default", true);
    localdr = new dr(this, new n(this.g), localj);
    a("keys.saveOutputAsFile", localdr, "default", true);
    localdr = new dr(this, new l(this.g), localj);
    a("keys.copy", localdr, "default", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.i
 * JD-Core Version:    0.6.0
 */