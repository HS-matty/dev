package com.zend.ide.y;

import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class i
{
  private e a;
  private f b;
  private JComponent c;

  public i(JComponent paramJComponent)
  {
    this.c = paramJComponent;
    this.b = new f();
    this.a = new e(this.b);
  }

  public void a(String paramString)
  {
    this.b.a(paramString);
    this.a.b(paramString);
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, 1);
  }

  public void a(String paramString1, String paramString2, int paramInt)
  {
    j localj = new j(this, paramString2, paramInt);
    this.b.a(paramString1, localj);
    this.a.a(paramString1);
  }

  private static void a(JComponent paramJComponent, Action paramAction, KeyStroke[] paramArrayOfKeyStroke, int paramInt)
  {
    InputMap localInputMap = paramJComponent.getInputMap(paramInt);
    Object localObject = paramAction.getValue("Name");
    a(localInputMap, localObject);
    for (int i = 0; i < paramArrayOfKeyStroke.length; i++)
      localInputMap.put(paramArrayOfKeyStroke[i], localObject);
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

  static JComponent a(i parami)
  {
    return parami.c;
  }

  static void b(JComponent paramJComponent, Action paramAction, KeyStroke[] paramArrayOfKeyStroke, int paramInt)
  {
    a(paramJComponent, paramAction, paramArrayOfKeyStroke, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.i
 * JD-Core Version:    0.6.0
 */