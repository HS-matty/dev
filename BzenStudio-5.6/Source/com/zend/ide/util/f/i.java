package com.zend.ide.util.f;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.dn;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class i extends dn
{
  private static final String b = ct.a(1542);
  private static boolean c = false;
  private String d;
  private Component e;

  public i(Action paramAction)
  {
    this(paramAction, b);
  }

  public i(Action paramAction, String paramString)
  {
    this(paramAction, paramString, null);
  }

  public i(Action paramAction, String paramString, Component paramComponent)
  {
    super(paramAction);
    this.e = paramComponent;
    if ((paramString == null) || (paramString.length() == 0))
      paramString = b;
    this.d = paramString;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a.b())
    {
      a(this.e, this.d);
      return;
    }
    super.actionPerformed(paramActionEvent);
  }

  private static void a(Component paramComponent, String paramString)
  {
    if (paramComponent == null)
      paramComponent = c.b().h();
    ba.a(paramComponent, paramString, ct.a(1545), -1, 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.i
 * JD-Core Version:    0.6.0
 */