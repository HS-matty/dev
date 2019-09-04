package com.zend.ide.h;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class ba extends AbstractAction
{
  final bf a;

  public ba(bf parambf)
  {
    super(bf.z);
    InputMap localInputMap = parambf.getInputMap(0).getParent();
    KeyStroke[] arrayOfKeyStroke = localInputMap.keys();
    for (int i = 0; (arrayOfKeyStroke != null) && (i < arrayOfKeyStroke.length); i++)
    {
      Object localObject = localInputMap.get(arrayOfKeyStroke[i]);
      if ((localObject == null) || (!localObject.equals("startEditing")))
        continue;
      putValue("AcceleratorKey", arrayOfKeyStroke[i]);
      break;
    }
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.w();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.ba
 * JD-Core Version:    0.6.0
 */