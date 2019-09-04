package com.zend.ide.cb.a;

import java.util.ArrayList;
import java.util.HashMap;

public class ob extends HashMap
{
  private ArrayList a;

  public ob()
  {
    this.a = new ArrayList();
  }

  public ob(int paramInt)
  {
    super(paramInt);
    this.a = new ArrayList(paramInt);
  }

  public Object put(Object paramObject1, Object paramObject2)
  {
    this.a.add(paramObject1);
    return super.put(paramObject1, paramObject2);
  }

  public Object remove(Object paramObject)
  {
    this.a.remove(paramObject);
    return super.remove(paramObject);
  }

  public Object[] a()
  {
    Object[] arrayOfObject = new Object[this.a.size()];
    this.a.toArray(arrayOfObject);
    return arrayOfObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ob
 * JD-Core Version:    0.6.0
 */