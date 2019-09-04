package com.zend.ide.cb.a.b;

import com.zend.ide.cb.f;
import com.zend.ide.cb.g;
import com.zend.ide.cb.p;
import com.zend.ide.cb.v;
import javax.swing.tree.DefaultMutableTreeNode;

public class t extends l
{
  public t(Object paramObject)
  {
    super(paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new j((v)paramObject);
  }

  public Object d()
  {
    g localg = a();
    if ((localg instanceof f))
      return ((f)localg).a((String)getUserObject());
    return ((p)localg).a((String)getUserObject());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.t
 * JD-Core Version:    0.6.0
 */