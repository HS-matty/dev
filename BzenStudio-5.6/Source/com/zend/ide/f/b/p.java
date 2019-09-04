package com.zend.ide.f.b;

import com.zend.ide.b.d;
import com.zend.ide.f.s;
import com.zend.ide.m.ab;
import com.zend.ide.m.ba;
import com.zend.ide.m.t;
import javax.swing.tree.DefaultMutableTreeNode;

public class p extends c
{
  public p(ab paramab, s params)
  {
    super(paramab, params);
  }

  protected void a(ba[] paramArrayOfba)
  {
  }

  protected d a(String paramString1, String paramString2)
  {
    t localt = (t)((ab)this.userObject).l();
    ab[] arrayOfab = localt.d();
    for (int i = 0; i < arrayOfab.length; i++)
    {
      ab localab = arrayOfab[i];
      if (localab.a().equals(paramString2))
        return localab;
    }
    return super.a(paramString1, paramString2);
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    if ((paramObject instanceof ab))
      return new q((ab)paramObject, this.k);
    return super.a(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.b.p
 * JD-Core Version:    0.6.0
 */