package com.zend.ide.o.d;

import com.zend.ide.o.di;
import com.zend.ide.t.r;
import com.zend.ide.util.cz;

public class h extends r
{
  private di d;

  public h()
  {
    super(2);
  }

  public void a(di paramdi)
  {
    this.d = paramdi;
  }

  public di c()
  {
    return this.d;
  }

  public void a(cz paramcz)
    throws Exception
  {
    ((bl)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.h
 * JD-Core Version:    0.6.0
 */