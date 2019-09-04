package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.o.cf;
import com.zend.ide.o.dg;
import com.zend.ide.o.di;
import com.zend.ide.o.fu;
import java.util.ArrayList;
import java.util.List;

public class g extends a
{
  public g()
  {
    super("debugger", cf.class);
  }

  public Object a(e parame)
  {
    cf localcf = new cf();
    localcf.a(Boolean.valueOf(parame.a("use_defaults")).booleanValue());
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      String str = localh.c();
      if (str.equals("breakpoints"))
      {
        localcf.a((di[])(di[])localh.b());
      }
      else if (str.equals("watches"))
      {
        localcf.a((dg[])(dg[])localh.b());
      }
      else
      {
        if (!str.equals("connectionInfo"))
          continue;
        localcf.a((fu)localh.b());
      }
    }
    return localcf;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    cf localcf = (cf)c();
    localArrayList.add(localcf.h());
    localArrayList.add(localcf.i());
    localArrayList.add(localcf.b());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.g
 * JD-Core Version:    0.6.0
 */