package com.zend.ide.cb.a.b;

import com.zend.ide.cb.q;
import javax.swing.AbstractAction;
import javax.swing.Icon;

public abstract class lb extends AbstractAction
  implements ab
{
  protected q a;
  protected boolean b;

  public lb()
  {
  }

  public lb(String paramString)
  {
    super(paramString);
  }

  public lb(String paramString, Icon paramIcon)
  {
    super(paramString, paramIcon);
  }

  public void a(q paramq)
  {
    this.a = paramq;
  }

  public void a(q paramq, boolean paramBoolean)
  {
    this.a = paramq;
    this.b = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.lb
 * JD-Core Version:    0.6.0
 */