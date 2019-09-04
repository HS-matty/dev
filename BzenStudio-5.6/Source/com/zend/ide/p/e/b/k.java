package com.zend.ide.p.e.b;

import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.plaf.basic.BasicMenuItemUI.MouseInputHandler;

class k extends BasicMenuItemUI.MouseInputHandler
{
  final j a;

  private k(j paramj)
  {
    super(paramj);
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    MenuSelectionManager localMenuSelectionManager = MenuSelectionManager.defaultManager();
    if ((paramMouseEvent.getModifiers() & 0x1C) != 0)
    {
      MenuSelectionManager.defaultManager().processMouseEvent(paramMouseEvent);
    }
    else
    {
      MenuElement[] arrayOfMenuElement = localMenuSelectionManager.getSelectedPath();
      if ((arrayOfMenuElement.length > 1) && (!(arrayOfMenuElement[(arrayOfMenuElement.length - 1)] instanceof JPopupMenu)))
        localMenuSelectionManager.setSelectedPath(a(arrayOfMenuElement));
    }
  }

  private MenuElement[] a(MenuElement[] paramArrayOfMenuElement)
  {
    MenuElement[] arrayOfMenuElement = new MenuElement[paramArrayOfMenuElement.length - 1];
    for (int i = 0; i < paramArrayOfMenuElement.length - 1; i++)
      arrayOfMenuElement[i] = paramArrayOfMenuElement[i];
    return arrayOfMenuElement;
  }

  k(j paramj, i parami)
  {
    this(paramj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.k
 * JD-Core Version:    0.6.0
 */