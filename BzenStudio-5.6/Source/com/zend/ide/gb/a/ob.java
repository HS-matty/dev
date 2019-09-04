package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import javax.swing.JPanel;

public abstract class ob extends JPanel
  implements cu
{
  protected b a = null;
  protected static mb b;

  abstract void a(b paramb);

  abstract void a();

  abstract void b();

  protected bp c()
  {
    bp localbp = new bp(false);
    localbp.setAcceptAllFileFilterUsed(true);
    localbp.setApproveButtonText(ct.a(116));
    localbp.setFileSelectionMode(2);
    localbp.setMultiSelectionEnabled(true);
    return localbp;
  }

  public boolean b(boolean paramBoolean)
  {
    return true;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.ob
 * JD-Core Version:    0.6.0
 */