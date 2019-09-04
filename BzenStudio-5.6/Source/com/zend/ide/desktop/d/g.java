package com.zend.ide.desktop.d;

import com.zend.ide.ba.b;
import com.zend.ide.n.bw;
import javax.swing.text.BadLocationException;

class g
  implements Runnable
{
  final b a;
  final f b;

  g(f paramf, b paramb)
  {
  }

  public void run()
  {
    try
    {
      a.c(this.b.a).d(a.c(this.b.a).getLineStartOffset(this.a.b() - 1));
    }
    catch (BadLocationException localBadLocationException)
    {
      a.c(this.b.a).a(this.a.b() - 1, true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.g
 * JD-Core Version:    0.6.0
 */