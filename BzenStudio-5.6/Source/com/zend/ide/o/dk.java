package com.zend.ide.o;

import com.zend.ide.n.a.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dk extends c
{
  final fk k;

  public dk(fk paramfk)
  {
    super("breakpoint", paramfk.bd(), -3);
    super.a(true);
  }

  public Collection k()
  {
    return super.m();
  }

  public Collection c(String paramString)
  {
    return super.b(paramString);
  }

  public di b(String paramString, int paramInt)
  {
    return (di)a(paramString, paramInt);
  }

  public void a(di paramdi)
  {
    super.b(paramdi);
  }

  public boolean b(di paramdi)
  {
    if (!super.m().contains(paramdi))
    {
      super.a(paramdi);
      return true;
    }
    return false;
  }

  public void b(boolean paramBoolean)
  {
    Iterator localIterator = m().iterator();
    while (localIterator.hasNext())
      ((di)localIterator.next()).c(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dk
 * JD-Core Version:    0.6.0
 */