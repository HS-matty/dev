package com.zend.ide.y.a;

import com.a.a.a;
import com.zend.ide.n.dq;
import com.zend.ide.n.hk;
import java.util.ArrayList;

public class g extends a
{
  public g()
  {
    super("groupedStyleAttributes", dq.class);
  }

  public Object a(com.a.e parame)
  {
    dq localdq = new dq();
    ArrayList localArrayList = (ArrayList)parame.b();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      String str = ((com.a.h)localArrayList.get(i)).c();
      Object localObject = ((com.a.h)localArrayList.get(i)).b();
      if (str.equals("tokensIDS"))
        localdq.a(localObject.toString());
      else if (str.equals("groupName"))
        localdq.b(localObject.toString());
      else
        localdq.a((hk)localObject);
    }
    return localdq;
  }

  public com.a.e e()
  {
    dq localdq = (dq)c();
    com.a.e locale = new com.a.e();
    ArrayList localArrayList = new ArrayList();
    com.a.a.e locale1 = new com.a.a.e("groupName");
    locale1.a(localdq.b());
    localArrayList.add(locale1);
    h localh = new h();
    localh.a(localdq.b());
    localArrayList.add(localh);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.g
 * JD-Core Version:    0.6.0
 */