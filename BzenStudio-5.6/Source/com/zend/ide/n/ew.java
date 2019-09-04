package com.zend.ide.n;

import com.zend.ide.d.co;
import com.zend.ide.y.m;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class ew
  implements PropertyChangeListener
{
  final dr a;

  private ew(dr paramdr)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str.equals("editing.bracketQuoteMatching"))
    {
      dr.a(this.a, (Color)paramPropertyChangeEvent.getNewValue());
    }
    else if (str.equals("editing.bracketMatchingErrorColor"))
    {
      dr.b(this.a, (Color)paramPropertyChangeEvent.getNewValue());
    }
    else if (str.equals("editing.bracketMatchingEnabled"))
    {
      dr.a(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
    }
    else if (str.equals("editnig.matchingBracketLineTooltip"))
    {
      dr.b(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
    }
    else if (str.equals("application.chosenScheme"))
    {
      dr.a(this.a, m.a().c());
      dr.k(this.a);
    }
    else if (str.equals("editing.font"))
    {
      if (dr.j(this.a) != null)
        dr.j(this.a).setFont((Font)paramPropertyChangeEvent.getNewValue());
    }
    else if (str.equals("editing.background"))
    {
      dr.c(this.a, (Color)paramPropertyChangeEvent.getNewValue());
      dr.k(this.a);
    }
    else if (str.equals("editing.quoteMatchingEnabled"))
    {
      dr.c(this.a, ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue());
    }
    fm.a(dr.c(this.a));
    fm.b(dr.d(this.a));
    Iterator localIterator = dr.b(this.a).values().iterator();
    while (localIterator.hasNext())
    {
      il localil = (il)localIterator.next();
      il.c(localil);
      il.d(localil);
    }
  }

  ew(dr paramdr, dx paramdx)
  {
    this(paramdr);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ew
 * JD-Core Version:    0.6.0
 */