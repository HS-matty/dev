package com.zend.ide.n;

import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class he extends AbstractDocument.BranchElement
{
  final ho a;

  public he(ho paramho, Element paramElement, AttributeSet paramAttributeSet)
  {
    super(paramho, paramElement, paramAttributeSet);
  }

  public void replace(int paramInt1, int paramInt2, Element[] paramArrayOfElement)
  {
    if ((paramInt2 > 0) && (paramArrayOfElement.length > 0))
    {
      localObject1 = getElement(paramInt1);
      Object localObject2 = ((cw)localObject1).b();
      ((cw)paramArrayOfElement[0]).a(localObject2);
    }
    Object localObject1 = new AbstractDocument.AbstractElement[paramInt2];
    for (int i = 0; i < paramInt2; i++)
      localObject1[i] = getElement(paramInt1 + i);
    if (paramInt2 <= paramArrayOfElement.length)
    {
      for (i = 0; (i < paramInt2) && (i < paramArrayOfElement.length); i++)
      {
        AttributeSet localAttributeSet1 = localObject1[i].getAttributes();
        ((AbstractDocument.AbstractElement)paramArrayOfElement[i]).addAttributes(localAttributeSet1);
      }
    }
    else
    {
      i = paramInt2 - paramArrayOfElement.length;
      for (int j = 0; j < paramArrayOfElement.length; j++)
      {
        AttributeSet localAttributeSet2 = localObject1[(i + j)].getAttributes();
        ((AbstractDocument.AbstractElement)paramArrayOfElement[j]).addAttributes(localAttributeSet2);
      }
    }
    super.replace(paramInt1, paramInt2, paramArrayOfElement);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.he
 * JD-Core Version:    0.6.0
 */