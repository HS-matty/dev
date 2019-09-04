package com.zend.ide.eb;

import com.zend.ide.p.f.e;
import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

public class p extends e
{
  public p(Object paramObject)
  {
    super(paramObject);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new s(paramObject);
  }

  public Object d()
  {
    String[] arrayOfString = j.a().a((String)getUserObject());
    Arrays.sort(arrayOfString);
    return arrayOfString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.p
 * JD-Core Version:    0.6.0
 */