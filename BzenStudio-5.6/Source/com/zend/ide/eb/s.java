package com.zend.ide.eb;

import com.zend.ide.p.f.e;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

public class s extends e
{
  public s(Object paramObject)
  {
    super(paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new q(paramObject);
  }

  public Object d()
  {
    String str = (String)((e)getParent()).getUserObject();
    a[] arrayOfa = j.a().a(str, (String)getUserObject());
    if (arrayOfa != null)
      Arrays.sort(arrayOfa);
    return arrayOfa;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.s
 * JD-Core Version:    0.6.0
 */