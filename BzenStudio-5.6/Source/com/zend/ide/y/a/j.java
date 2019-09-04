package com.zend.ide.y.a;

import com.a.a.a;
import com.a.h;
import com.zend.ide.d.co;
import com.zend.ide.d.cp;
import com.zend.ide.n.be;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.k;
import java.util.ArrayList;

public class j extends a
{
  public j()
  {
    super("styleScheme", co.class);
  }

  public Object a(com.a.e parame)
  {
    cp localcp = new cp();
    ArrayList localArrayList = (ArrayList)parame.b();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      String str = ((h)localArrayList.get(i)).c();
      Object localObject = ((h)localArrayList.get(i)).b();
      if (str.equals("schemeName"))
      {
        localcp.a(localObject.toString());
      }
      else if (str.equals("styleManager"))
      {
        localcp.a((be)localObject);
      }
      else
      {
        k localk = (k)localObject;
        localcp.a(localk.a.toString(), localk.b);
      }
    }
    return localcp;
  }

  public com.a.e e()
  {
    com.a.e locale = new com.a.e();
    ArrayList localArrayList = new ArrayList();
    co localco = (co)c();
    com.a.a.e locale1 = new com.a.a.e("schemeName");
    locale1.a(localco.b());
    localArrayList.add(locale1);
    i locali = new i();
    locali.a(localco.c());
    localArrayList.add(locali);
    c localc1 = b.a("editing.background");
    k localk1 = new k(localc1.e(), localco.e());
    localArrayList.add(localk1);
    c localc2 = b.a("editing.bracketQuoteMatching");
    k localk2 = new k(localc2.e(), localco.f());
    localArrayList.add(localk2);
    c localc3 = b.a("editing.bracketMatchingErrorColor");
    k localk3 = new k(localc3.e(), localco.g());
    localArrayList.add(localk3);
    c localc4 = b.a("highlighting.breakpointColor");
    k localk4 = new k(localc4.e(), localco.j());
    localArrayList.add(localk4);
    c localc5 = b.a("editing.currentLineColor");
    k localk5 = new k(localc5.e(), localco.i());
    localArrayList.add(localk5);
    c localc6 = b.a("highlighting.debugStepColor");
    k localk6 = new k(localc6.e(), localco.k());
    localArrayList.add(localk6);
    c localc7 = b.a("editing.font");
    k localk7 = new k(localc7.e(), localco.d());
    localArrayList.add(localk7);
    c localc8 = b.a("editing.searchInSelectedHighlightingColor");
    k localk8 = new k(localc8.e(), localco.h());
    localArrayList.add(localk8);
    c localc9 = b.a("cvsDiff.diffAppend");
    k localk9 = new k(localc9.e(), localco.n());
    localArrayList.add(localk9);
    c localc10 = b.a("cvsDiff.diffChange");
    k localk10 = new k(localc10.e(), localco.o());
    localArrayList.add(localk10);
    c localc11 = b.a("cvsDiff.diffDelete");
    k localk11 = new k(localc11.e(), localco.p());
    localArrayList.add(localk11);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.j
 * JD-Core Version:    0.6.0
 */