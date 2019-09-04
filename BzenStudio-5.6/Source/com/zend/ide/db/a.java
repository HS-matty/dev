package com.zend.ide.db;

import com.zend.ide.k.d;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import javax.swing.JTextArea;

public class a extends d
  implements cu
{
  final z h;

  public a(z paramz)
  {
    super(paramz.c(), "phpDocOutput", ct.a(1332), null, ct.a(1333));
  }

  public boolean c()
  {
    return true;
  }

  public void d()
  {
    z.a(this.h).removeAll();
    super.d();
  }

  public int o()
  {
    return z.a(this.h).getText().length();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.a
 * JD-Core Version:    0.6.0
 */