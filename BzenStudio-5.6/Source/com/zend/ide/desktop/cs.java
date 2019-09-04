package com.zend.ide.desktop;

import com.zend.ide.be.d;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;

public class cs extends AbstractAction
{
  final cj a;

  public cs(cj paramcj)
  {
    super("CloseWindowsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    d locald = cj.a(this.a).c();
    String[] arrayOfString = locald.e();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str = arrayOfString[i];
      if ((str.equals("EditorComponent")) || (str.equals("FileManagerWindowID")))
        continue;
      boolean bool = locald.c(str);
      if (!bool)
        continue;
      locald.a(str, false);
      localArrayList.add(str);
    }
    if (localArrayList.size() > 0)
      cj.a(this.a, localArrayList);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cs
 * JD-Core Version:    0.6.0
 */