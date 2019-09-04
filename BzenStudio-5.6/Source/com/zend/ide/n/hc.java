package com.zend.ide.n;

import com.zend.ide.n.a.e;
import com.zend.ide.n.a.m;
import java.util.Hashtable;

class hc extends m
{
  final cb a;

  hc(cb paramcb, String paramString, bw parambw)
  {
    super(paramString, parambw);
  }

  protected is g(e parame)
  {
    co localco = (co)parame;
    it localit = new it(j(), localco.b(), localco.c(), 1);
    cb.d(this.a).put(localco, localit);
    return localit;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hc
 * JD-Core Version:    0.6.0
 */