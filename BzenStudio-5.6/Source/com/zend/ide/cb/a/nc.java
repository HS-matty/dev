package com.zend.ide.cb.a;

import com.zend.ide.bd.c;
import com.zend.ide.j.bd;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class nc extends AbstractAction
{
  final jd a;

  public nc(jd paramjd)
  {
    super("");
    putValue("SmallIcon", cv.b("explorer/explorer16.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (jd.b(this.a) != null)
      try
      {
        jd.c(this.a).setCurrentDirectory(new File(jd.b(this.a)).getParentFile());
      }
      catch (Throwable localThrowable)
      {
      }
    if (jd.c(this.a).showOpenDialog(c.b().h()) == 0)
    {
      File localFile = jd.c(this.a).getSelectedFile();
      if ((localFile instanceof bd))
      {
        ba.a(c.b().h(), ct.a(1520), ct.a(1521), 0);
      }
      else
      {
        jd.a(this.a, localFile.getAbsolutePath());
        this.a.a(jd.b(this.a));
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.nc
 * JD-Core Version:    0.6.0
 */