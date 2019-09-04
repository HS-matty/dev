package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import com.zend.ide.w.a.bc;
import java.util.ArrayList;
import java.util.List;

public class f extends a
{
  public f()
  {
    super("CVS", bc.class);
  }

  public Object a(e parame)
  {
    bc localbc = new bc();
    List localList = parame.b();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      h localh = (h)localList.get(i);
      localbc.a(localh.b());
    }
    return localbc;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    bc localbc = (bc)c();
    localArrayList.add(localbc.c());
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.f
 * JD-Core Version:    0.6.0
 */