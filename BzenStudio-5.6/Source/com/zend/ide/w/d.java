package com.zend.ide.w;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import javax.swing.JTextPane;

public class d extends com.zend.ide.k.d
  implements cu
{
  final bb f;

  public d(bb parambb)
  {
    super(parambb.c(), "sourceControlOutput", ct.a(1599), null, ct.a(1600));
  }

  public boolean c()
  {
    return true;
  }

  public void d()
  {
    bb.a(this.f).removeAll();
    super.d();
  }

  public int o()
  {
    return bb.a(this.f).getText().length();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.d
 * JD-Core Version:    0.6.0
 */