package com.zend.ide.o;

import com.zend.ide.p.bv;
import java.awt.Component;
import javax.swing.JList;

class dv extends bv
{
  final fq b;

  private dv(fq paramfq)
  {
    super(paramfq);
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    di localdi = (di)paramObject;
    if (localdi.i())
      setIcon(fq.e());
    else
      setIcon(fq.f());
    return this;
  }

  dv(fq paramfq, f paramf)
  {
    this(paramfq);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dv
 * JD-Core Version:    0.6.0
 */