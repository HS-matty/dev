package com.zend.ide.v;

import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

class v extends com.zend.ide.p.a.e
{
  final w b;

  public v(w paramw, ActionMap paramActionMap)
  {
    super(paramActionMap);
  }

  public Action get(Object paramObject)
  {
    Action localAction = super.get(paramObject);
    if (localAction == null)
      localAction = d.a(this.b.m).c().getActionMap().get(paramObject);
    return localAction;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.v
 * JD-Core Version:    0.6.0
 */