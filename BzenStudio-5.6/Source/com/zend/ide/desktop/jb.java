package com.zend.ide.desktop;

import com.zend.ide.j.h;
import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class jb extends AbstractAction
{
  final bx a;

  public jb(bx parambx)
  {
    super("AddEditorToProject");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!this.a.f().e())
      return;
    bw localbw = bx.b(this.a).X();
    String str = localbw.k();
    if (str == null)
      return;
    File localFile = h.m.g(str);
    if (!localFile.exists())
      return;
    if (this.a.f().g().m(localFile))
      return;
    this.a.f().b(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.jb
 * JD-Core Version:    0.6.0
 */