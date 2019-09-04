package com.zend.ide.cb.a.b;

import com.zend.ide.cb.q;
import com.zend.ide.p.f.j;
import com.zend.ide.p.f.l;
import javax.swing.text.Position.Bias;
import javax.swing.tree.TreePath;

public class cb
  implements j
{
  private final int a = 1;
  private final int b = 2;
  private final int c = 3;
  private int d;
  private TreePath e;
  private String f;
  private wb g;

  public cb(wb paramwb)
  {
    this.g = paramwb;
  }

  public void a(TreePath paramTreePath, q paramq)
  {
    if ((paramTreePath != null) && (paramq != null))
    {
      this.d = 0;
      this.e = paramTreePath;
      this.f = paramq.l().d();
      if ((this.f != null) && (!this.f.equals("")))
      {
        this.g.a(this);
        this.d += 1;
        a(this.d);
      }
    }
  }

  public void a(q paramq)
  {
    if (paramq == null)
      return;
    TreePath localTreePath = this.g.getNextMatch(paramq.a(), 0, Position.Bias.Forward);
    a(localTreePath, paramq);
  }

  private void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
      paramInt = 1;
      this.g.expandPath(this.e);
      break;
    case 2:
      this.e = a(q.d, this.e);
      this.g.expandPath(this.e);
      break;
    case 3:
      this.e = a(this.f, this.e);
      this.g.expandPath(this.e);
      this.g.setSelectionPath(this.e);
      this.g.b(this);
    }
  }

  private TreePath a(String paramString, TreePath paramTreePath)
  {
    if (paramTreePath == null)
      return null;
    com.zend.ide.p.f.e locale1 = (com.zend.ide.p.f.e)paramTreePath.getLastPathComponent();
    for (int i = 0; i < locale1.getChildCount(); i++)
    {
      com.zend.ide.p.f.e locale2 = (com.zend.ide.p.f.e)locale1.getChildAt(i);
      if (locale2.toString().equalsIgnoreCase(paramString))
        return paramTreePath.pathByAddingChild(locale2);
    }
    return paramTreePath.pathByAddingChild(new com.zend.ide.p.f.e(paramString));
  }

  public void a(l paraml)
  {
    TreePath localTreePath = paraml.getPath();
    if ((this.e == null) || (this.e.isDescendant(localTreePath)))
    {
      this.d += 1;
      a(this.d);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.cb
 * JD-Core Version:    0.6.0
 */