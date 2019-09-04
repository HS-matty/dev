package com.zend.ide.y;

import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class n
{
  private InputMap a;
  private e b;
  private f c;

  public n(InputMap paramInputMap)
  {
    this.a = paramInputMap;
    this.c = new f();
    this.b = new e(this.c);
  }

  public void a(String paramString1, String paramString2)
  {
    o localo = new o(this, paramString2);
    this.c.a(paramString1, localo);
    this.b.a(paramString1);
  }

  private static void a(InputMap paramInputMap, Object paramObject)
  {
    if (paramInputMap == null)
      return;
    KeyStroke[] arrayOfKeyStroke = paramInputMap.keys();
    if (arrayOfKeyStroke != null)
      for (int i = 0; i < arrayOfKeyStroke.length; i++)
      {
        Object localObject = paramInputMap.get(arrayOfKeyStroke[i]);
        if (!localObject.equals(paramObject))
          continue;
        paramInputMap.remove(arrayOfKeyStroke[i]);
      }
    a(paramInputMap.getParent(), paramObject);
  }

  static InputMap a(n paramn)
  {
    return paramn.a;
  }

  static void b(InputMap paramInputMap, Object paramObject)
  {
    a(paramInputMap, paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.n
 * JD-Core Version:    0.6.0
 */