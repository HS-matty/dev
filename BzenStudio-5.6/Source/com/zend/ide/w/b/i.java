package com.zend.ide.w.b;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

class i
{
  public static void a(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    if (paramInt < 0)
      throw new BadLocationException("Non existing line number", paramInt);
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(paramInt - 1);
    paramDocument.remove(localElement2.getStartOffset(), Math.min(localElement2.getEndOffset() - localElement2.getStartOffset(), paramDocument.getLength() - localElement2.getStartOffset()));
  }

  public static void a(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    if (paramInt < 0)
      throw new BadLocationException("Non existing line number", paramInt);
    if (!paramString.endsWith("\n"))
      paramString = paramString + "\n";
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(paramInt - 1);
    paramDocument.insertString(localElement2.getStartOffset(), paramString, null);
  }

  public static void b(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    if (paramInt < 0)
      throw new BadLocationException("Non existing line number", paramInt);
    if (!paramString.endsWith("\n"))
      paramString = paramString + "\n";
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(paramInt - 1);
    int i = localElement2.getStartOffset();
    int j = Math.min(localElement2.getEndOffset(), paramDocument.getLength()) - i;
    paramDocument.insertString(i, paramString, null);
    paramDocument.remove(i + paramString.length(), j);
  }

  public static Document a(Document paramDocument)
    throws BadLocationException, IllegalAccessException, InstantiationException
  {
    Document localDocument = (Document)paramDocument.getClass().newInstance();
    localDocument.insertString(0, paramDocument.getText(0, paramDocument.getLength()), null);
    return localDocument;
  }

  public static int b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    if (paramInt < 1)
      throw new BadLocationException("Non existing line number " + paramInt, paramInt);
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(paramInt - 1);
    return Math.min(localElement2.getStartOffset(), paramDocument.getLength());
  }

  public static int b(Document paramDocument)
  {
    Element localElement = paramDocument.getDefaultRootElement();
    return localElement.getElementCount();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.i
 * JD-Core Version:    0.6.0
 */