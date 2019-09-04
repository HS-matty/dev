package com.zend.ide.n;

import javax.swing.event.DocumentEvent.EventType;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class hf extends AbstractDocument.LeafElement
  implements cw
{
  private Object a;
  final ho b;

  public hf(ho paramho, Element paramElement, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramho, paramElement, paramAttributeSet, paramInt1, paramInt2);
  }

  public void a(Object paramObject)
  {
    this.a = paramObject;
  }

  public Object b()
  {
    return this.a;
  }

  public void addAttribute(Object paramObject1, Object paramObject2)
  {
    super.addAttribute(paramObject1, paramObject2);
    int i = getStartOffset();
    int j = getEndOffset() - i;
    AbstractDocument.DefaultDocumentEvent localDefaultDocumentEvent = new AbstractDocument.DefaultDocumentEvent(this.b, i, j, DocumentEvent.EventType.CHANGE);
    ho.b(this.b, localDefaultDocumentEvent);
  }

  public void removeAttribute(Object paramObject)
  {
    super.removeAttribute(paramObject);
    int i = getStartOffset();
    int j = getEndOffset() - i;
    AbstractDocument.DefaultDocumentEvent localDefaultDocumentEvent = new AbstractDocument.DefaultDocumentEvent(this.b, i, j, DocumentEvent.EventType.CHANGE);
    ho.c(this.b, localDefaultDocumentEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hf
 * JD-Core Version:    0.6.0
 */