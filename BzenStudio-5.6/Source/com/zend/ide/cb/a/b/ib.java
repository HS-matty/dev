package com.zend.ide.cb.a.b;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ib
  implements PropertyChangeListener
{
  final db a;

  private ib(db paramdb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str1 = b.a("sql.basicClickBehaviour").c().toString();
    String str2 = b.a("sql.tableClickBehaviour").c().toString();
    if (str1.equals(db.l()))
      this.a.b(1);
    else
      this.a.b(0);
    if (str2.equals(db.m()))
      this.a.a(2);
    else if (str2.equals(db.l()))
      this.a.a(1);
    else
      this.a.a(0);
  }

  ib(db paramdb, eb parameb)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.ib
 * JD-Core Version:    0.6.0
 */