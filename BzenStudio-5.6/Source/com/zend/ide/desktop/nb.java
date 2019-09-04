package com.zend.ide.desktop;

import com.zend.ide.o.fk;
import com.zend.ide.util.c.a;
import com.zend.ide.util.cl;
import javax.swing.JFrame;

public class nb extends a
{
  private String a;
  private String b;
  private int c;
  final cj d;

  public nb(cj paramcj)
  {
  }

  public void a(Object paramObject)
  {
    this.a = ((String)paramObject);
    String[] arrayOfString = this.a.split(":::");
    this.b = arrayOfString[0];
    if (arrayOfString.length > 1)
      try
      {
        this.c = Integer.parseInt(arrayOfString[1]);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  public void run()
  {
    synchronized (this.d)
    {
      cj.d(this.d).e(this.b, this.c);
      this.d.o.setVisible(true);
      this.d.o.setState(0);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.nb
 * JD-Core Version:    0.6.0
 */