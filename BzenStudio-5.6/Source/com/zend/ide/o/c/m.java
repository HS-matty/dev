package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.ab;
import com.zend.ide.o.hb;
import com.zend.ide.p.f.e;
import com.zend.ide.util.cv;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class m extends e
{
  private static final ImageIcon i = cv.b("primitive.gif");
  private static final ImageIcon j = cv.b("object.gif");
  private static final ImageIcon k = cv.b("array.gif");
  public static final Comparator l = new f(null);
  protected ab m;

  public m(a parama, ab paramab)
  {
    super(parama, true);
    this.m = paramab;
  }

  public boolean isLeaf()
  {
    return ((a)getUserObject()).d().f();
  }

  protected boolean c()
  {
    a locala = (a)getUserObject();
    this.m.b(locala, 1);
    return true;
  }

  public Object d()
  {
    a[] arrayOfa = ((a)getUserObject()).d().d();
    if (arrayOfa != null)
      Arrays.sort(arrayOfa, l);
    return arrayOfa;
  }

  public DefaultMutableTreeNode a(Object paramObject)
  {
    return new m((a)paramObject, this.m);
  }

  public Object a(HashSet paramHashSet)
  {
    String str = ((a)getUserObject()).c();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.c().equals(str))
        return locala;
    }
    return null;
  }

  public String f()
  {
    return "variableContext";
  }

  public String g()
  {
    return getUserObject().toString();
  }

  public Icon e()
  {
    a locala = (a)getUserObject();
    int n = locala.d().a();
    ImageIcon localImageIcon;
    if (n == 5)
      localImageIcon = k;
    else if (n == 6)
      localImageIcon = j;
    else
      localImageIcon = i;
    return localImageIcon;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.m
 * JD-Core Version:    0.6.0
 */