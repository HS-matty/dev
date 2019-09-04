package com.zend.ide.h;

import com.zend.ide.bd.c;
import com.zend.ide.j.t;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

public class u extends AbstractAction
{
  final bf a;

  public u(bf parambf)
  {
    super(bf.x);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = null;
    this.a.a(true);
    try
    {
      TreePath localTreePath = this.a.getSelectionPath();
      if ((localTreePath != null) && (!this.a.isExpanded(localTreePath)))
        this.a.expandPath(localTreePath);
      String str = (String)JOptionPane.showInputDialog(c.b().h(), ct.a(1013), ct.a(1012), 3, null, null, "newFile.php");
      if ((str == null) || (str.equals("")))
        return;
      localFile = t.a(this.a.l(), str);
    }
    finally
    {
      this.a.a(false);
    }
    if (localFile != null)
    {
      this.a.b(localFile);
      if (this.a.getSelectionPath() == null)
        this.a.c(new File[] { localFile });
      else
        this.a.p();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.u
 * JD-Core Version:    0.6.0
 */