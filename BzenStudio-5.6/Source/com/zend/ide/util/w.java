package com.zend.ide.util;

import java.util.ArrayList;
import javax.swing.Action;

public class w
  implements v
{
  private ArrayList a = new ArrayList(10);
  private boolean b = false;

  public void b(Action paramAction)
  {
    if (!this.a.contains(paramAction))
    {
      this.a.add(paramAction);
      a(paramAction);
    }
  }

  public void a(Action paramAction)
  {
    paramAction.setEnabled(b());
  }

  void c(Action paramAction)
  {
    paramAction.setEnabled(this.b);
  }

  public void c()
  {
    int i = this.a.size();
    boolean bool = b();
    if (bool != this.b)
    {
      this.b = bool;
      for (int j = 0; j < i; j++)
      {
        Action localAction = (Action)this.a.get(j);
        c(localAction);
      }
    }
  }

  public boolean b()
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.w
 * JD-Core Version:    0.6.0
 */