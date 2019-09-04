package com.zend.ide.desktop.e;

import com.zend.ide.db.l;
import com.zend.ide.db.o;
import com.zend.ide.h.e;
import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractAction;

class n extends AbstractAction
{
  final h a;

  public n(h paramh)
  {
    super("phpDocProject");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      File[] arrayOfFile = h.a(this.a).b();
      String[] arrayOfString1 = a(arrayOfFile);
      String[] arrayOfString2 = b(arrayOfFile);
      o.a().a(h.b(this.a).a(arrayOfString1, arrayOfString2));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private String[] a(File[] paramArrayOfFile)
  {
    if (paramArrayOfFile == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      if (!localFile.isFile())
        continue;
      localArrayList.add(localFile.getPath());
    }
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    return arrayOfString;
  }

  private String[] b(File[] paramArrayOfFile)
  {
    if (paramArrayOfFile == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      File localFile = paramArrayOfFile[i];
      if (!localFile.isDirectory())
        continue;
      localArrayList.add(localFile.getPath());
    }
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    return arrayOfString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.n
 * JD-Core Version:    0.6.0
 */