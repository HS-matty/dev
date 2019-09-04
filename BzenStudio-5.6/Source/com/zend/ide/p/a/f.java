package com.zend.ide.p.a;

import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class f extends InputMap
{
  private InputMap a;

  public f(InputMap paramInputMap)
  {
    this.a = paramInputMap;
  }

  public void setParent(InputMap paramInputMap)
  {
    this.a.setParent(paramInputMap);
  }

  public InputMap getParent()
  {
    return this.a.getParent();
  }

  public void put(KeyStroke paramKeyStroke, Object paramObject)
  {
    this.a.put(paramKeyStroke, paramObject);
  }

  public Object get(KeyStroke paramKeyStroke)
  {
    return this.a.get(paramKeyStroke);
  }

  public void remove(KeyStroke paramKeyStroke)
  {
    this.a.remove(paramKeyStroke);
  }

  public void clear()
  {
    this.a.clear();
  }

  public KeyStroke[] keys()
  {
    return this.a.keys();
  }

  public int size()
  {
    return this.a.size();
  }

  public KeyStroke[] allKeys()
  {
    return this.a.allKeys();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.f
 * JD-Core Version:    0.6.0
 */