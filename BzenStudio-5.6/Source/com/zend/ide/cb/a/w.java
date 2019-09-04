package com.zend.ide.cb.a;

import com.zend.ide.cb.q;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JFormattedTextField;

class w extends KeyAdapter
{
  final JFormattedTextField a;
  final hd b;

  w(hd paramhd, JFormattedTextField paramJFormattedTextField)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      try
      {
        this.a.commitEdit();
        this.b.j.a(true);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        v.a(this.b.j).a(v.b(this.b.j), ct.a(1497), true);
      }
      catch (ParseException localParseException)
      {
        v.a(this.b.j).a(ct.a(94) + ": " + ct.a(1351) + 3000, true);
      }
      catch (SQLException localSQLException)
      {
        if (v.b(this.b.j).a(true, true))
          cl.a(localSQLException);
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.w
 * JD-Core Version:    0.6.0
 */