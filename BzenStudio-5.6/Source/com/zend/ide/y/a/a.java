package com.zend.ide.y.a;

import com.a.e;
import com.a.h;
import com.zend.ide.y.k;
import com.zend.ide.y.l;
import java.util.ArrayList;
import java.util.List;

public class a extends com.a.a.a
{
  public a()
  {
    super("zde_properties", l.class);
  }

  public Object a(e parame)
  {
    l locall = new l("name", new k[0]);
    locall.a = ((k[])(k[])((h)parame.b().get(0)).b());
    return locall;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    l locall = (l)c();
    localArrayList.add(locall.a);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.a
 * JD-Core Version:    0.6.0
 */