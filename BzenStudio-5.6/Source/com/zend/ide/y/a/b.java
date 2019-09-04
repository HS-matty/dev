package com.zend.ide.y.a;

import com.a.a.a;
import com.a.a.d;
import com.a.h;
import com.zend.ide.y.k;
import java.util.ArrayList;
import java.util.List;

public class b extends a
{
  private d d = new d("integer");
  private com.a.a.e f = new com.a.a.e("string");

  public b()
  {
    super("customized_property", k.class);
  }

  public Object a(com.a.e parame)
  {
    String str = parame.a("ID");
    Object localObject = ((h)parame.b().get(0)).b();
    return new k(str, localObject);
  }

  public com.a.e e()
  {
    k localk = (k)c();
    com.a.e locale = new com.a.e();
    locale.a("ID", (String)localk.a);
    ArrayList localArrayList = new ArrayList();
    Object localObject = localk.b;
    if ((localObject instanceof Integer))
    {
      this.d.a(localObject);
      localArrayList.add(this.d);
    }
    else if ((localObject instanceof String))
    {
      this.f.a(localObject);
      localArrayList.add(this.f);
    }
    else
    {
      localArrayList.add(localObject);
    }
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.b
 * JD-Core Version:    0.6.0
 */