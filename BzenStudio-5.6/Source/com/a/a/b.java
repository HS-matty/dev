package com.a.a;

import com.a.d;
import com.a.e;
import com.a.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class b extends a
{
  private d g;

  public b(String paramString, d paramd)
  {
    super(paramString, Array.newInstance(paramd.b(), 0).getClass());
    this.g = paramd;
  }

  public Object a(e parame)
  {
    List localList1 = parame.b();
    if (localList1 == null)
    {
      arrayOfObject = (Object[])(Object[])Array.newInstance(this.g.b(), 0);
      return arrayOfObject;
    }
    if ((localList1.size() == 1) && ((((h)localList1.get(0)).b() instanceof Object[])))
      return ((h)localList1.get(0)).b();
    Object[] arrayOfObject = (Object[])(Object[])Array.newInstance(this.g.b(), localList1.size());
    List localList2 = parame.b();
    for (int i = 0; (localList2 != null) && (i < localList2.size()); i++)
    {
      h localh = (h)localList2.get(i);
      arrayOfObject[i] = localh.b();
    }
    return arrayOfObject;
  }

  public e e()
  {
    e locale = new e();
    ArrayList localArrayList = new ArrayList();
    Object[] arrayOfObject = (Object[])(Object[])c();
    for (int i = 0; i < arrayOfObject.length; i++)
      localArrayList.add(arrayOfObject[i]);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.b
 * JD-Core Version:    0.6.0
 */