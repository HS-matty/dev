package com.zend.ide.v;

import com.zend.ide.n.ek;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.FocusManager;
import javax.swing.JComponent;

class n
{
  JComponent a;
  final d b;

  private n(d paramd)
  {
    this.a = d.a(paramd).c();
    FocusManager.getCurrentManager().addPropertyChangeListener("permanentFocusOwner", new m(this, paramd));
  }

  private void a(Component paramComponent)
  {
    boolean bool = b(paramComponent);
    if (bool)
    {
      if (this.b.u() != d.a(this.b))
      {
        this.b.a(d.a(this.b));
        this.b.x().a(d.a(this.b).u());
      }
      return;
    }
    w localw = c(paramComponent);
    if (localw != null)
    {
      this.b.a(localw);
      this.b.x().a(localw);
    }
  }

  private boolean b(Component paramComponent)
  {
    return (this.a == paramComponent) || (this.a.isAncestorOf(paramComponent));
  }

  private w c(Component paramComponent)
  {
    Iterator localIterator = d.a(this.b).iterator();
    while (localIterator.hasNext())
    {
      w localw = (w)localIterator.next();
      JComponent localJComponent = localw.c();
      if ((localJComponent == paramComponent) || (localJComponent.isAncestorOf(paramComponent)))
        return localw;
    }
    return null;
  }

  n(d paramd, l paraml)
  {
    this(paramd);
  }

  static void a(n paramn, Component paramComponent)
  {
    paramn.a(paramComponent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.n
 * JD-Core Version:    0.6.0
 */