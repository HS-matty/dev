package com.zend.ide.p.ab;

import com.zend.ide.util.d.a;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class h
{
  private static final Comparator a = new j();
  private static final Comparator b = new k();
  private static final Comparator c = new i();
  private static final Comparator d = new l();
  private static Map e = new HashMap();
  private Map f = new HashMap();
  private com.zend.ide.util.d.h g = new a();

  public static void a(Class paramClass, Comparator paramComparator)
  {
    if (paramComparator == null)
      e.remove(paramClass);
    else
      e.put(paramClass, paramComparator);
  }

  public void b(Class paramClass, Comparator paramComparator)
  {
    if (paramComparator == null)
      this.f.remove(paramClass);
    else
      this.f.put(paramClass, paramComparator);
  }

  public Comparator a(int paramInt, Class paramClass)
  {
    Comparator localComparator = (Comparator)this.g.b(paramInt);
    if (localComparator != null)
      return localComparator;
    localComparator = (Comparator)this.f.get(paramClass);
    if (localComparator != null)
      return localComparator;
    localComparator = (Comparator)e.get(paramClass);
    if (localComparator != null)
      return localComparator;
    if (Comparable.class.isAssignableFrom(paramClass))
      return a;
    return d;
  }

  public void a(int paramInt, Comparator paramComparator)
  {
    if (paramComparator == null)
      this.g.c(paramInt);
    else
      this.g.a(paramInt, paramComparator);
  }

  static
  {
    a(String.class, b);
    a(Character.class, b);
    a(Boolean.class, c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.h
 * JD-Core Version:    0.6.0
 */