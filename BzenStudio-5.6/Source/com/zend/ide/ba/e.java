package com.zend.ide.ba;

import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class e
  implements TreeSelectionListener
{
  final f a;

  e(f paramf)
  {
  }

  public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent)
  {
    if (paramTreeSelectionEvent.getNewLeadSelectionPath() == null)
      return;
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramTreeSelectionEvent.getNewLeadSelectionPath().getLastPathComponent();
    String str = "0";
    if ((localDefaultMutableTreeNode instanceof p))
    {
      localObject = (b)localDefaultMutableTreeNode.getUserObject();
      str = "" + ((b)localObject).c();
    }
    Object localObject = cv.c(str + ".html");
    try
    {
      f.b(this.a).setPage((URL)localObject);
    }
    catch (IOException localIOException)
    {
      cl.a("Problem loading analyzer output:" + str + ".html, url:" + ((URL)localObject).getFile() + "\n" + localIOException.toString());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.e
 * JD-Core Version:    0.6.0
 */