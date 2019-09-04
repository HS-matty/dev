package com.zend.ide.f;

import com.zend.ide.m.bf;
import com.zend.ide.util.ct;
import javax.swing.tree.DefaultMutableTreeNode;

public class dc extends db
{
  public dc(s params)
  {
    super(params, ct.a(533));
    setRootVisible(false);
    setShowsRootHandles(true);
    setName("Project Inspector");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new dn(this, paramObject);
  }

  public void b(bf parambf)
  {
    b();
  }

  public void a(bf parambf)
  {
    b();
  }

  public void c(bf parambf)
  {
    b();
  }

  public void h()
  {
    b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dc
 * JD-Core Version:    0.6.0
 */