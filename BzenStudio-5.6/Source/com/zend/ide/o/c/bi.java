package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.hb;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class bi extends AbstractAction
{
  final bo a;

  public bi(bo parambo)
  {
    super("CopyValueAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    m localm = (m)this.a.getLastSelectedPathComponent();
    a locala = (a)localm.getUserObject();
    String str = "null";
    if (locala.d().b() != null)
      str = (String)locala.d().b();
    try
    {
      StringSelection localStringSelection = new StringSelection(str);
      this.a.getToolkit().getSystemClipboard().setContents(localStringSelection, localStringSelection);
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bi
 * JD-Core Version:    0.6.0
 */