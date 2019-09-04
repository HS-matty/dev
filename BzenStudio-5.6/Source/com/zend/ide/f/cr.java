package com.zend.ide.f;

import com.zend.ide.f.b.b;
import com.zend.ide.m.o;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cr extends AbstractAction
{
  final db a;

  public cr(db paramdb)
  {
    super("addDescriptionAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Object localObject = this.a.getLastSelectedPathComponent();
    if ((localObject instanceof b))
    {
      com.zend.ide.b.d locald = (com.zend.ide.b.d)((b)localObject).getUserObject();
      o.a(locald, com.zend.ide.v.d.y(), true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cr
 * JD-Core Version:    0.6.0
 */