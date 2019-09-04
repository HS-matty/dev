package com.zend.ide.n;

import com.zend.ide.n.b.g;
import javax.swing.text.Document;

class xd
  implements Runnable
{
  final ct a;

  xd(ct paramct)
  {
  }

  public void run()
  {
    br.b(this.a.a);
    this.a.a.setCaretPosition(0);
    g localg = (g)this.a.a.getDocument().getProperty("undoTool");
    if (localg != null)
      localg.discardAllEdits();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.xd
 * JD-Core Version:    0.6.0
 */