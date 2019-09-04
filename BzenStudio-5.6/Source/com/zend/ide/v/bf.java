package com.zend.ide.v;

import com.zend.ide.p.a.f;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

class bf extends f
{
  int b;
  final w c;

  public bf(w paramw, InputMap paramInputMap, int paramInt)
  {
    super(paramInputMap);
    this.b = paramInt;
  }

  public Object get(KeyStroke paramKeyStroke)
  {
    Object localObject = super.get(paramKeyStroke);
    if (localObject == null)
      localObject = d.a(this.c.m).c().getInputMap(this.b).get(paramKeyStroke);
    return localObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.bf
 * JD-Core Version:    0.6.0
 */