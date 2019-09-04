package com.zend.ide.v;

import com.zend.ide.n.bw;

class jb
  implements Runnable
{
  final be a;

  jb(be parambe)
  {
  }

  public void run()
  {
    bw localbw = this.a.e.u();
    if (localbw != null)
      localbw.grabFocus();
    else
      this.a.requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.jb
 * JD-Core Version:    0.6.0
 */