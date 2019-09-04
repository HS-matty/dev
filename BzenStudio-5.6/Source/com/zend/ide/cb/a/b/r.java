package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import com.zend.ide.cb.p;
import javax.swing.tree.DefaultMutableTreeNode;

public class r extends l
{
  public r(Object paramObject)
  {
    super(paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new f((com.zend.ide.cb.l)paramObject);
  }

  public Object d()
  {
    g localg = a();
    if ((localg instanceof com.zend.ide.cb.f))
      return ((com.zend.ide.cb.f)localg).c();
    return ((p)localg).c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.r
 * JD-Core Version:    0.6.0
 */