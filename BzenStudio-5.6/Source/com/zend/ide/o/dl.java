package com.zend.ide.o;

import com.zend.ide.n.a.d;
import com.zend.ide.n.a.e;
import com.zend.ide.n.bw;
import javax.swing.event.DocumentEvent;

public class dl extends d
{
  final dj b;

  protected dl(dj paramdj)
  {
    super(paramdj);
  }

  public void a(DocumentEvent paramDocumentEvent)
  {
    if (dj.a(this.b) == null)
      return;
    if (dj.b(this.b).k().equals(dj.a(this.b).j()))
      super.a(paramDocumentEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dl
 * JD-Core Version:    0.6.0
 */