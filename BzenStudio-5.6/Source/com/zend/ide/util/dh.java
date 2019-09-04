package com.zend.ide.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class dh extends WeakReference
{
  private int a;

  public dh(Object paramObject)
  {
    super(paramObject);
    this.a = paramObject.hashCode();
  }

  public dh(Object paramObject, ReferenceQueue paramReferenceQueue)
  {
    super(paramObject, paramReferenceQueue);
    this.a = paramObject.hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    Object localObject1 = get();
    Object localObject2 = (paramObject instanceof dh) ? ((dh)paramObject).get() : paramObject;
    if ((localObject1 == null) || (localObject2 == null))
      return false;
    if (localObject1 == localObject2)
      return true;
    return localObject1.equals(localObject2);
  }

  public int hashCode()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dh
 * JD-Core Version:    0.6.0
 */