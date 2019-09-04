package com.zend.ide.f;

import com.zend.ide.m.bk;
import com.zend.ide.m.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bv
{
  private Map a = new HashMap();
  private Map b = new HashMap();

  public x a(vb paramvb, String paramString)
  {
    paramString = a(paramString);
    x localx = b(paramvb, paramString);
    if (localx != null)
      return localx;
    Object localObject = (List)this.a.get(paramvb);
    if (localObject == null)
    {
      localObject = new ArrayList(6);
      this.a.put(paramvb, localObject);
    }
    localx = di.b(paramString, null, null);
    ((List)localObject).add(localx);
    return (x)localx;
  }

  public void a(vb paramvb, x paramx)
  {
    if (b(paramvb, paramx.a()) != null)
      return;
    Object localObject = (List)this.a.get(paramvb);
    if (localObject == null)
    {
      localObject = new ArrayList(6);
      this.a.put(paramvb, localObject);
    }
    ((List)localObject).add(paramx);
  }

  public void a(vb paramvb, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramString1 = a(paramString1);
    String str = a(paramString1, paramvb);
    Object localObject = (List)this.b.get(str);
    if (localObject == null)
    {
      localObject = new ArrayList(4);
      this.b.put(str, localObject);
    }
    ((List)localObject).add(new dl(paramString2, paramInt1, paramInt2, paramBoolean));
  }

  public bk b()
  {
    HashMap localHashMap = new HashMap(this.a.size());
    Iterator localIterator = this.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      List localList = (List)this.a.get(localObject);
      x[] arrayOfx = new x[localList.size()];
      localList.toArray(arrayOfx);
      Arrays.sort(arrayOfx);
      localHashMap.put(localObject, arrayOfx);
    }
    return new bx(localHashMap, this.b, null);
  }

  private x b(vb paramvb, String paramString)
  {
    paramString = a(paramString);
    List localList = (List)this.a.get(paramvb);
    if (localList == null)
      return null;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      if (localx.a().equals(paramString))
        return localx;
    }
    return null;
  }

  private static String a(String paramString, vb paramvb)
  {
    StringBuffer localStringBuffer = new StringBuffer(16);
    localStringBuffer.append(paramString);
    localStringBuffer.append(';');
    localStringBuffer.append(paramvb.a());
    localStringBuffer.append(';');
    localStringBuffer.append(paramvb.b());
    return localStringBuffer.toString();
  }

  private static String a(String paramString)
  {
    if ((paramString.length() > 0) && (paramString.charAt(0) == '$'))
      paramString = paramString.substring(1);
    return paramString;
  }

  public static dl a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new dl(paramString, paramInt1, paramInt2, paramBoolean);
  }

  public static bx a(Map paramMap1, Map paramMap2)
  {
    return new bx(paramMap1, paramMap2, null);
  }

  static String b(String paramString)
  {
    return a(paramString);
  }

  static String b(String paramString, vb paramvb)
  {
    return a(paramString, paramvb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bv
 * JD-Core Version:    0.6.0
 */