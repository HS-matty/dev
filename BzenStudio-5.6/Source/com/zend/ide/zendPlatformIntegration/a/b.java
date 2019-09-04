package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.r;
import com.zend.ide.util.s;
import javax.swing.Action;
import javax.swing.ActionMap;

public class b extends s
  implements r
{
  final hb f;

  public b(hb paramhb)
  {
    ActionMap localActionMap = paramhb.j();
    Action localAction = localActionMap.get("OpenZendPlatformWindowAction");
    a("keys.showZendPlatformWindow", localAction, "default", false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.b
 * JD-Core Version:    0.6.0
 */