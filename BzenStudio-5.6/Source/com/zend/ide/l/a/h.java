package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.v.o;
import com.zend.ide.v.p;
import java.util.ArrayList;
import java.util.List;

public class h extends a
{
  public h()
  {
    super("editor_component", o.class);
  }

  public Object a(e parame)
  {
    o localo = new o();
    localo.a(Integer.valueOf(parame.a("selectedEditor")).intValue());
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      com.a.h localh = (com.a.h)localList.get(i);
      String str = localh.c();
      if (!str.equals("openEditors"))
        continue;
      localo.a((p[])(p[])localh.b(), localo.b());
    }
    return localo;
  }

  public e e()
  {
    e locale = new e();
    o localo = (o)c();
    locale.a("selectedEditor", "" + localo.b());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localo.c());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.h
 * JD-Core Version:    0.6.0
 */