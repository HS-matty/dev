package com.zend.ide.n;

import com.zend.ide.n.b.g;
import com.zend.ide.util.cl;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.text.Document;

class ei extends g
{
  private dz f;
  private AbstractDocument.DefaultDocumentEvent g;
  private int h = 0;

  public ei(Document paramDocument)
  {
    this.f = ((dz)paramDocument);
    if (!this.f.l())
      h();
    this.f.a(new dy(this));
  }

  public void undo()
  {
    super.undo();
    i();
  }

  public void redo()
  {
    super.redo();
    i();
  }

  public synchronized void discardAllEdits()
  {
    super.discardAllEdits();
    this.g = null;
  }

  private void h()
  {
    this.g = b();
    this.h = j();
  }

  private void i()
  {
    AbstractDocument.DefaultDocumentEvent localDefaultDocumentEvent = b();
    if ((localDefaultDocumentEvent == this.g) && (this.h == j()))
      this.f.c(false);
  }

  private int j()
  {
    try
    {
      return this.f.getText().hashCode();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return -1;
  }

  static void a(ei paramei)
  {
    paramei.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ei
 * JD-Core Version:    0.6.0
 */