package com.zend.ide.cb.a;

import com.zend.ide.cb.b.b;
import com.zend.ide.cb.c.w;
import com.zend.ide.util.c.d;
import com.zend.ide.util.cl;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

class bb
  implements d, Runnable
{
  final s a;

  private bb(s params)
  {
  }

  public void run()
  {
    File localFile = new File(w.a, "sql/history.db");
    if (localFile.exists())
      try
      {
        ArrayList localArrayList = new b(localFile.getAbsolutePath()).a();
        for (int i = 0; i < localArrayList.size(); i++)
          s.a(this.a).addElement(new r(localArrayList.get(i).toString(), null, null));
      }
      catch (Throwable localThrowable)
      {
        cl.a("Error while loading SQL history: " + localThrowable.getMessage());
      }
  }

  public Object k()
  {
    SwingUtilities.invokeLater(this);
    return null;
  }

  bb(s params, hb paramhb)
  {
    this(params);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.bb
 * JD-Core Version:    0.6.0
 */