package com.zend.ide.s;

import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class dh extends dn
{
  private int b;
  final db c;

  public dh(db paramdb, Action paramAction, int paramInt)
  {
    super(paramAction);
    this.b = paramInt;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    db.g = true;
    if (!db.a(this.c).a(this.b))
      super.actionPerformed(paramActionEvent);
    db.a(this.c).c(this.b);
    db.g = false;
  }

  public void a(boolean paramBoolean)
  {
    db.g = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.dh
 * JD-Core Version:    0.6.0
 */