package com.zend.ide.util;

import javax.swing.ActionMap;

public class u extends s
  implements r
{
  protected y g = new y(this, null);
  protected rb f = new rb(this, null);
  final en h;

  public u(en paramen)
  {
  }

  public void b()
  {
    ActionMap localActionMap = this.h.getActionMap();
    dr localdr = new dr(this, new dt(this.h), this.g);
    localActionMap.put("closeAction", localdr);
    localdr = new dr(this, new du(this.h), this.g);
    localActionMap.put("closeAllAction", localdr);
    localdr = new dr(this, new jc(this.h), this.f);
    localActionMap.put("closeOthersAction", localdr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.u
 * JD-Core Version:    0.6.0
 */