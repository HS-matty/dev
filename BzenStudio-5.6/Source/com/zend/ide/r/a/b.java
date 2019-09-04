package com.zend.ide.r.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.r.c;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import java.util.ArrayList;
import java.util.List;

public class b extends a
{
  public b()
  {
    super("fileTypeGroup", c.class);
  }

  public Object a(e parame)
  {
    c localc = new c();
    p.a(localc, parame.a("name"));
    p.b(localc, parame.a("description"));
    if (localc.b().equals("Web Documents"))
    {
      localc.d("php");
      localc.a(true);
    }
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      String str = localh.c();
      if (!str.equals("fileType"))
        continue;
      localc.a((o)localh.b());
    }
    return localc;
  }

  public e e()
  {
    c localc = (c)c();
    e locale = new e();
    locale.a("name", localc.b());
    String str = localc.getDescription();
    if (str != null)
      locale.a("description", str);
    locale.a(new ArrayList(localc.e()));
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.a.b
 * JD-Core Version:    0.6.0
 */