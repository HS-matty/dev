package com.zend.ide.n;

import java.util.ArrayList;

public class nb
  implements pb
{
  protected ArrayList a = new ArrayList(5);

  public void a(qb paramqb)
  {
    this.a.add(paramqb);
  }

  public void a()
  {
    this.a.clear();
  }

  public ob a(dz paramdz, int paramInt)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      ob localob = ((qb)this.a.get(i)).a(paramdz, paramInt);
      if (localob != null)
        return localob;
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.nb
 * JD-Core Version:    0.6.0
 */