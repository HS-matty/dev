package com.zend.ide.f;

import com.zend.ide.f.b.i;
import com.zend.ide.m.r;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class cs extends AbstractAction
{
  final db a;

  public cs(db paramdb)
  {
    super("CheckIncludeFileAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Object localObject = this.a.getLastSelectedPathComponent();
    if ((localObject instanceof i))
    {
      r localr = (r)((i)localObject).getUserObject();
      db.a(this.a).a(new File(localr.a()));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cs
 * JD-Core Version:    0.6.0
 */