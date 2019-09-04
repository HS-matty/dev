package com.zend.ide.gb.c;

import com.a.a.a;
import com.a.a.f;
import com.a.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d extends a
{
  com.a.a.b d = new com.a.a.b("inputFiles", new b());
  com.a.a.b e = new com.a.a.b("unknowenClasses", new c());

  public d()
  {
    super("WsdlCreatorProperties", com.zend.ide.gb.b.b.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    if (paramObject != null)
    {
      this.d.a(((com.zend.ide.gb.b.b)paramObject).b().toArray());
      this.e.a(((com.zend.ide.gb.b.b)paramObject).a().toArray());
    }
  }

  public Object a(com.a.e parame)
  {
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    String str1 = null;
    String str2 = "";
    String str3 = parame.a("configName");
    boolean bool1 = false;
    String str4 = "";
    boolean bool2 = true;
    List localList = parame.b();
    for (int i = 0; i < localList.size(); i++)
    {
      h localh = (h)localList.get(i);
      String str5 = localh.c();
      if (str5.equals("inputFiles"))
      {
        localArrayList1 = new ArrayList(Arrays.asList((com.zend.ide.gb.b.c[])(com.zend.ide.gb.b.c[])localh.b()));
      }
      else if (str5.equals("unknowenClasses"))
      {
        localArrayList2 = new ArrayList(Arrays.asList((com.zend.ide.gb.b.d[])(com.zend.ide.gb.b.d[])localh.b()));
      }
      else if (str5.equals("outputFile"))
      {
        str1 = (String)localh.b();
      }
      else if (str5.equals("namespace"))
      {
        str2 = (String)localh.b();
      }
      else if (str5.equals("useEncoding"))
      {
        bool1 = ((Boolean)localh.b()).booleanValue();
      }
      else if (str5.equals("encodingStyle"))
      {
        str4 = (String)localh.b();
      }
      else
      {
        if (!str5.equals("useRpcBindingStyle"))
          continue;
        bool2 = ((Boolean)localh.b()).booleanValue();
      }
    }
    return new com.zend.ide.gb.b.b(str3, localArrayList1, str1, str2, localArrayList2, bool1, str4, bool2);
  }

  public com.a.e e()
  {
    com.zend.ide.gb.b.b localb = (com.zend.ide.gb.b.b)c();
    com.a.e locale = new com.a.e();
    locale.a("configName", localb.d());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.d);
    com.a.a.e locale1 = new com.a.a.e("outputFile");
    locale1.a(localb.c());
    localArrayList.add(locale1);
    com.a.a.e locale2 = new com.a.a.e("namespace");
    locale2.a(localb.g());
    localArrayList.add(locale2);
    localArrayList.add(this.e);
    f localf1 = new f("useEncoding");
    localf1.a(new Boolean(localb.e()));
    localArrayList.add(localf1);
    com.a.a.e locale3 = new com.a.a.e("encodingStyle");
    locale3.a(localb.f());
    localArrayList.add(locale3);
    f localf2 = new f("useRpcBindingStyle");
    localf2.a(new Boolean(localb.a()));
    localArrayList.add(localf2);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.c.d
 * JD-Core Version:    0.6.0
 */