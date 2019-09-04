package com.zend.ide.y.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.n.bd;
import com.zend.ide.n.be;
import com.zend.ide.n.bf;
import com.zend.ide.n.dq;
import java.util.ArrayList;

public class i extends a
{
  public i()
  {
    super("styleManager", be.class);
  }

  public Object a(e parame)
  {
    bf localbf = new bf();
    ArrayList localArrayList = (ArrayList)parame.b();
    int i;
    Object localObject;
    if ((localArrayList.size() > 0) && ((((h)localArrayList.get(0)).b() instanceof bd)))
      for (i = 0; i < localArrayList.size(); i++)
      {
        localObject = (bd)((h)localArrayList.get(i)).b();
        localbf.a(((bd)localObject).g(), (bd)localObject);
      }
    else
      for (i = 0; i < localArrayList.size(); i++)
      {
        localObject = (dq)((h)localArrayList.get(i)).b();
        localbf.a((dq)localObject);
      }
    return localbf;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    be localbe = (be)c();
    dq[] arrayOfdq = localbe.d();
    for (int i = 0; i < arrayOfdq.length; i++)
      localArrayList.add(arrayOfdq[i]);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.i
 * JD-Core Version:    0.6.0
 */