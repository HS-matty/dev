package com.zend.ide.w;

import com.zend.ide.j.y;
import com.zend.ide.l.be;
import com.zend.ide.l.l;
import com.zend.ide.l.u;
import java.io.File;
import java.util.Hashtable;
import javax.swing.SwingUtilities;

class lb extends Thread
{
  private File[] a;
  final fb b;

  public lb(fb paramfb, File[] paramArrayOfFile)
  {
    this.a = paramArrayOfFile;
  }

  public void run()
  {
    a();
  }

  private void a()
  {
    if (this.a == null)
    {
      y localy = ((be)((l)this.b.e.d().get("project_roots")).b()).b();
      this.a = localy.b();
    }
    for (int i = 0; i < this.a.length; i++)
    {
      File localFile = this.a[i];
      a(localFile);
    }
    SwingUtilities.invokeLater(new hb(this));
  }

  private void a(File paramFile)
  {
    Object localObject;
    int i;
    if (!paramFile.isDirectory())
    {
      localObject = paramFile.getPath();
      i = this.b.d.a((String)localObject, null);
      if (fb.a(this.b, i))
        this.b.c.b((String)localObject);
    }
    else
    {
      if (paramFile.getName().equals(this.b.d.e()))
        return;
      if (new File(paramFile, this.b.d.e()).exists())
        this.b.c.a(paramFile);
      localObject = paramFile.listFiles();
      if (localObject == null)
        return;
      for (i = 0; i < localObject.length; i++)
        a(localObject[i]);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.lb
 * JD-Core Version:    0.6.0
 */