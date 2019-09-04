package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.q;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.AbstractAction;

class ic extends AbstractAction
{
  final v a;

  public ic(v paramv)
  {
    super("", cv.b("sql/next.gif"));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      this.a.g();
    }
    catch (IllegalStateException localIllegalStateException)
    {
      v.a(this.a).a(v.b(this.a), ct.a(1497), true);
    }
    catch (SQLException localSQLException)
    {
      if (v.b(this.a).a(true, true))
      {
        cl.a(localSQLException);
        v.a(this.a).a(v.b(this.a), localSQLException, true);
      }
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
      v.a(this.a).a(v.b(this.a), localThrowable, true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ic
 * JD-Core Version:    0.6.0
 */