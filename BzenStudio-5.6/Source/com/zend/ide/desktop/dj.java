package com.zend.ide.desktop;

import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class dj extends AbstractAction
{
  boolean a = false;
  int b;
  final cj c;

  public dj(cj paramcj, boolean paramBoolean, int paramInt)
  {
    super("SearchFileSystemAction");
    this.a = paramBoolean;
    this.b = paramInt;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = this.c.X().getSelectedText();
    String str2 = "";
    File localFile = null;
    if (this.a)
    {
      if (this.b == 1)
        localFile = this.c.v().x();
      else if (this.b == 2)
        localFile = this.c.l().h().x();
      if (localFile != null)
        str2 = localFile.getAbsolutePath();
    }
    this.c.a(str1, str2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dj
 * JD-Core Version:    0.6.0
 */