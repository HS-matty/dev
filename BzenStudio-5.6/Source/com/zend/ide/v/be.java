package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.ek;
import com.zend.ide.util.en;
import javax.swing.SwingUtilities;

class be extends en
{
  final e e;

  private be(e parame)
  {
    super("editor");
    addMouseListener(new hb(this));
  }

  protected void p()
  {
    this.e.x().a(this.e.u());
    SwingUtilities.invokeLater(new jb(this));
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    int i = getTabCount() == paramInt - 1 ? 1 : 0;
    bw localbw = e.a(this.e, paramInt);
    if (localbw != null)
    {
      boolean bool = localbw.d(!paramBoolean);
      if (bool)
        bool = super.a(paramInt, paramBoolean);
      if (bool)
      {
        e.a(this.e, localbw);
        if (i == 0)
          this.e.x().a(this.e.u());
      }
      return bool;
    }
    return false;
  }

  be(e parame, q paramq)
  {
    this(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.be
 * JD-Core Version:    0.6.0
 */