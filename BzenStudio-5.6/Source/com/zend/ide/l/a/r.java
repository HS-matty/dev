package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.w.c.k;
import java.util.ArrayList;
import java.util.List;

public class r extends a
{
  public r()
  {
    super("Subversion", k.class);
  }

  public Object a(e parame)
  {
    k localk = new k();
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      localk.a(localh.b());
    }
    return localk;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    k localk = (k)c();
    localArrayList.add(localk.a());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.r
 * JD-Core Version:    0.6.0
 */