package com.zend.ide.n;

import com.zend.ide.s.bk;
import com.zend.ide.y.b;
import java.beans.PropertyChangeListener;
import javax.swing.text.Document;

public class bp extends bo
{
  private PropertyChangeListener g = new dk(this, null);

  public bp(Document paramDocument, int paramInt)
  {
    super(paramDocument, paramInt);
    b.a(this.g, "editing.supportAspTags");
  }

  protected bk d(int paramInt)
  {
    return com.zend.ide.s.bp.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bp
 * JD-Core Version:    0.6.0
 */