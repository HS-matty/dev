package com.zend.ide.p.a;

import javax.swing.Action;
import javax.swing.ActionMap;

public class e extends ActionMap
{
  private ActionMap a;

  public e(ActionMap paramActionMap)
  {
    this.a = paramActionMap;
  }

  public void setParent(ActionMap paramActionMap)
  {
    this.a.setParent(paramActionMap);
  }

  public ActionMap getParent()
  {
    return this.a.getParent();
  }

  public void put(Object paramObject, Action paramAction)
  {
    this.a.put(paramObject, paramAction);
  }

  public Action get(Object paramObject)
  {
    return this.a.get(paramObject);
  }

  public void remove(Object paramObject)
  {
    this.a.remove(paramObject);
  }

  public void clear()
  {
    this.a.clear();
  }

  public Object[] keys()
  {
    return this.a.keys();
  }

  public int size()
  {
    return this.a.size();
  }

  public Object[] allKeys()
  {
    return this.a.allKeys();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.e
 * JD-Core Version:    0.6.0
 */