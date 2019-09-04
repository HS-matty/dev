package com.zend.ide.h;

import com.zend.ide.bd.c;
import com.zend.ide.j.t;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

public class v extends AbstractAction
{
  final bf a;

  public v(bf parambf)
  {
    super(bf.y);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = null;
    try
    {
      this.a.a(true);
      TreePath localTreePath = this.a.getSelectionPath();
      if ((localTreePath != null) && (!this.a.isExpanded(localTreePath)))
        this.a.expandPath(localTreePath);
      String str = (String)JOptionPane.showInputDialog(c.b().h(), ct.a(1009), ct.a(1011), 3, null, null, "NewFolder");
      if ((str == null) || (str.equals("")))
        return;
      localFile = t.b(this.a.l(), str);
      if (localFile != null)
      {
        this.a.b(localFile);
        bf.a(this.a, this.a.getSelectionPath(), true);
        bf.b(this.a, this.a.getSelectionPath(), false);
      }
    }
    finally
    {
      this.a.a(false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.v
 * JD-Core Version:    0.6.0
 */