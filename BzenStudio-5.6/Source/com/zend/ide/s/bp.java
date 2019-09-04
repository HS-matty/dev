package com.zend.ide.s;

import com.zend.ide.util.da;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.Iterator;

public class bp
{
  private static bp a;
  private PropertyChangeListener b = new br(this, null);
  private Collection c = new da(10);

  public static bc a(int paramInt)
  {
    return b().b(paramInt);
  }

  private static bp b()
  {
    if (a == null)
      a = new bp();
    return a;
  }

  private bp()
  {
    b.a(this.b, "editing.supportAspTags");
  }

  private synchronized bc b(int paramInt)
  {
    String str = b.a("desktop.phpVersion").c().toString();
    Object localObject;
    if (str.equals("PHP5"))
      localObject = new fc(paramInt);
    else
      localObject = new ec(paramInt);
    ((bc)localObject).a(((Boolean)b.a("editing.supportAspTags").c()).booleanValue());
    this.c.add(localObject);
    return (bc)localObject;
  }

  private synchronized void a(boolean paramBoolean)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      bc localbc = (bc)localIterator.next();
      localbc.a(paramBoolean);
    }
  }

  static void a(bp parambp, boolean paramBoolean)
  {
    parambp.a(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bp
 * JD-Core Version:    0.6.0
 */