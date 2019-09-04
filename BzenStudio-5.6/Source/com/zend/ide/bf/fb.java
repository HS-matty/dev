package com.zend.ide.bf;

import com.zend.ide.p.d.bp;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class fb
  implements ActionListener
{
  final ba a;

  fb(ba paramba)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp localbp = ba.a(this.a, 0);
    int i = localbp.a(this.a, ct.a(1739));
    if (i == 0)
    {
      File localFile = localbp.getSelectedFile();
      ba.a(this.a, localFile, true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.fb
 * JD-Core Version:    0.6.0
 */