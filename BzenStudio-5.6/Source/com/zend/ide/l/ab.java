package com.zend.ide.l;

import com.zend.ide.h.be;
import com.zend.ide.util.a.b;
import com.zend.ide.util.dj;
import com.zend.ide.y.g;
import com.zend.ide.y.h;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ab extends AbstractAction
{
  final bk a;

  public ab(bk parambk)
  {
    super("deleteProjectFileAction");
    putValue("AcceleratorKey", g.a("phpEditorPane.delete").d());
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      ((be)this.a.f()).a();
    }
    catch (dj localdj)
    {
      b.a(localdj);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.ab
 * JD-Core Version:    0.6.0
 */