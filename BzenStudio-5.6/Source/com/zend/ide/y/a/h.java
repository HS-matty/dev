package com.zend.ide.y.a;

import com.a.a.a;
import com.a.a.d;
import com.a.a.f;
import com.a.a.g;
import com.a.e;
import com.zend.ide.n.bd;
import com.zend.ide.util.l;
import java.awt.Color;
import java.util.ArrayList;

public class h extends a
{
  public h()
  {
    super("styleAttributes", bd.class);
  }

  public Object a(e parame)
  {
    bd localbd = new bd();
    ArrayList localArrayList = (ArrayList)parame.b();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      String str = ((com.a.h)localArrayList.get(i)).c();
      Object localObject = ((com.a.h)localArrayList.get(i)).b();
      if ((str.equals("BGColor")) && (!(localObject instanceof l)))
      {
        localbd.b((Color)localObject);
      }
      else if ((str.equals("FGColor")) && (!(localObject instanceof l)))
      {
        localbd.a((Color)localObject);
      }
      else if ((str.equals("integer")) || (str.equals("fontStyle")))
      {
        localbd.a(((Integer)localObject).intValue());
      }
      else if (str.equals("token"))
      {
        localbd.b(((Integer)localObject).intValue());
      }
      else if (str.equals("underline"))
      {
        localbd.b(((Boolean)localObject).booleanValue());
      }
      else
      {
        if (!str.equals("background"))
          continue;
        localbd.a(((Boolean)localObject).booleanValue());
      }
    }
    return localbd;
  }

  public e e()
  {
    bd localbd = (bd)c();
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    g localg1 = new g("BGColor");
    localg1.a(localbd.c());
    localArrayList.add(localg1);
    g localg2 = new g("FGColor");
    localg2.a(localbd.b());
    localArrayList.add(localg2);
    d locald1 = new d("fontStyle");
    locald1.a(new Integer(localbd.e()));
    localArrayList.add(locald1);
    d locald2 = new d("token");
    locald2.a(new Integer(localbd.g()));
    localArrayList.add(locald2);
    f localf1 = new f("underline");
    localf1.a(new Boolean(localbd.f()));
    localArrayList.add(localf1);
    f localf2 = new f("background");
    localf2.a(new Boolean(localbd.d()));
    localArrayList.add(localf2);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.h
 * JD-Core Version:    0.6.0
 */