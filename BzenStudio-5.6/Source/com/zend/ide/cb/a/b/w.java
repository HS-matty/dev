package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.p.f.e;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class w extends MouseAdapter
{
  private JTree a;
  final db b;

  public w(db paramdb, JTree paramJTree)
  {
    this.a = paramJTree;
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
  }

  private void a(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isPopupTrigger())
    {
      TreePath localTreePath = this.a.getSelectionPath();
      if ((localTreePath == null) || (localTreePath.getParentPath() == null))
      {
        db.a(this.b, paramMouseEvent);
        return;
      }
      e locale = (e)localTreePath.getLastPathComponent();
      Object localObject = locale.getUserObject();
      g localg;
      boolean bool;
      if ((localObject instanceof g))
      {
        localg = (g)localObject;
        bool = localg.c().a(false);
      }
      else
      {
        return;
      }
      if ((localg instanceof q))
        db.a(this.b, (q)localObject, bool, paramMouseEvent);
      else if ((localg instanceof v))
        db.b(this.b, (v)localObject, paramMouseEvent);
      else if ((!(localg instanceof com.zend.ide.cb.w)) && (bool))
        db.a(this.b, localg, paramMouseEvent);
    }
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if ((!paramMouseEvent.isPopupTrigger()) && (paramMouseEvent.getClickCount() > 1))
      this.b.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.w
 * JD-Core Version:    0.6.0
 */