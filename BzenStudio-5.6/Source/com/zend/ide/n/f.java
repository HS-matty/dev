package com.zend.ide.n;

import com.zend.ide.util.di;
import com.zend.ide.y.e;
import java.awt.Toolkit;
import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public final class f
{
  private static SwingPropertyChangeSupport a = new SwingPropertyChangeSupport(f.class.getName());
  private static boolean b = true;
  private static boolean c = true;
  private static boolean d;
  private static PropertyChangeListener e;
  private static PropertyChangeListener f;
  private static e g;

  public static void a(String paramString, PropertyChangeListener paramPropertyChangeListener)
  {
    a.addPropertyChangeListener(paramString, di.a(paramPropertyChangeListener, a));
  }

  public static void a(boolean paramBoolean)
  {
    if (paramBoolean != b)
    {
      b = paramBoolean;
      a.firePropertyChange("insertionMode", !paramBoolean, paramBoolean);
    }
  }

  public static boolean d()
  {
    return b;
  }

  public static void b(boolean paramBoolean)
  {
    if (paramBoolean != c)
    {
      c = paramBoolean;
      a.firePropertyChange("tabAsSpaces", !paramBoolean, paramBoolean);
    }
  }

  public static boolean b()
  {
    return c;
  }

  public static void c(boolean paramBoolean)
  {
    if (paramBoolean != d)
    {
      d = paramBoolean;
      a.firePropertyChange("smartHome", !paramBoolean, paramBoolean);
    }
  }

  public static boolean c()
  {
    return d;
  }

  static
  {
    Toolkit.getDefaultToolkit().addAWTEventListener(new df(), 8L);
    d = true;
    e = new dw(null);
    f = new dv(null);
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    g = new e(localf);
    localf.a("editing.tabAsSpaces", e);
    localf.a("editing.smartHome", f);
    g.a("editing.tabAsSpaces");
    g.a("editing.smartHome");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.f
 * JD-Core Version:    0.6.0
 */