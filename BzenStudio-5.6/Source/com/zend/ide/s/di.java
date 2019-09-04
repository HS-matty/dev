package com.zend.ide.s;

import com.zend.ide.util.cr;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class di extends dn
{
  boolean c = cr.c() == 3;
  final db b;

  private di(db paramdb, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    db.g = true;
    int i = 0;
    String str = paramActionEvent.getActionCommand();
    int j = paramActionEvent.getModifiers();
    if ((str != null) && (str.length() > 0) && ((this.c) || ((j & 0x8) == (j & 0x2))) && ((j & 0x2) == (j & 0x4)))
    {
      int k = str.charAt(0);
      if ((k >= 32) && (k != 127) && (k != 255))
        i = 1;
    }
    if (i != 0)
      db.a(this.b).a(1);
    super.actionPerformed(paramActionEvent);
    if (i != 0)
      db.a(this.b).c(1);
    db.g = false;
  }

  public void a(boolean paramBoolean)
  {
    db.g = paramBoolean;
  }

  di(db paramdb, Action paramAction, cm paramcm)
  {
    this(paramdb, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.di
 * JD-Core Version:    0.6.0
 */