package com.zend.ide.v;

import com.zend.ide.bd.c;
import com.zend.ide.be.b;
import com.zend.ide.n.bw;
import com.zend.ide.n.dm;
import com.zend.ide.util.cl;
import javax.swing.JComponent;
import javax.swing.JTextArea;

class w extends dm
{
  final d m;

  private w(d paramd)
  {
    v localv = new v(this, d.a(paramd).c().getActionMap());
    c().setActionMap(localv);
    int i = 1;
    bf localbf = new bf(this, c().getInputMap(i), i);
    c().setInputMap(i, localbf);
    i = 0;
    localbf = new bf(this, c().getInputMap(i), i);
    c().setInputMap(i, localbf);
    bw localbw = paramd.u();
    if (localbw != null)
    {
      JTextArea localJTextArea = (JTextArea)localbw.e();
      localJTextArea.addPropertyChangeListener("foldChanged", this.g);
      localJTextArea.addPropertyChangeListener("foldChanged", this.i);
    }
  }

  public boolean a(boolean paramBoolean)
  {
    boolean bool = d(!paramBoolean);
    if (bool)
    {
      d.a(this.m, this);
      JComponent localJComponent = c();
      String str = (String)localJComponent.getClientProperty("Window Name");
      try
      {
        c.b().c().a(str);
      }
      catch (b localb)
      {
        cl.a("this not supposed to happend");
        cl.a(localb);
      }
    }
    return bool;
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    if (paramString.equals(k()))
      return a(paramBoolean);
    return true;
  }

  public Object s()
  {
    p localp = (p)super.s();
    localp.a(true);
    return localp;
  }

  w(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.w
 * JD-Core Version:    0.6.0
 */