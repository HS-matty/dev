package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.w.j;
import java.util.ArrayList;
import java.util.List;

public class p extends a
{
  public p()
  {
    super("SourceControl", j.class);
  }

  public Object a(e parame)
  {
    j localj = new j();
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      localj.a(localh.b().toString());
    }
    return localj;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    j localj = (j)c();
    localArrayList.add(localj.b());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.p
 * JD-Core Version:    0.6.0
 */