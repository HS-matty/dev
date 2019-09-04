package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

class bk extends JMenuBar
{
  private bk()
  {
  }

  public void setFont(Font paramFont)
  {
    super.setFont(paramFont);
    for (int i = 0; i < getMenuCount(); i++)
    {
      getMenu(i).setFont(paramFont);
      a(getMenu(i), paramFont);
    }
  }

  private void a(JMenu paramJMenu, Font paramFont)
  {
    for (int i = 0; i < paramJMenu.getMenuComponentCount(); i++)
    {
      Component localComponent = paramJMenu.getMenuComponent(i);
      localComponent.setFont(paramFont);
      if (!(localComponent instanceof JMenu))
        continue;
      a((JMenu)localComponent, paramFont);
    }
  }

  bk(j paramj)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bk
 * JD-Core Version:    0.6.0
 */