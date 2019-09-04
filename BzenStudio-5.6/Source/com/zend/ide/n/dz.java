package com.zend.ide.n;

import com.zend.ide.util.bh;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public abstract interface dz
{
  public abstract Document getDocument();

  public abstract String getText();

  public abstract String getText(int paramInt1, int paramInt2)
    throws BadLocationException;

  public abstract void b(String paramString);

  public abstract String k();

  public abstract boolean l();

  public abstract void c(boolean paramBoolean);

  public abstract void a(bh parambh);

  public abstract bh n();

  public abstract int getLineStartOffset(int paramInt)
    throws BadLocationException;

  public abstract int getLineOfOffset(int paramInt)
    throws BadLocationException;

  public abstract int p();

  public abstract void a(int paramInt, String paramString, Object paramObject);

  public abstract void a(int paramInt, String paramString);

  public abstract void addDocumentListener(DocumentListener paramDocumentListener);

  public abstract void removeDocumentListener(DocumentListener paramDocumentListener);

  public abstract void a(ea paramea);

  public abstract void b(ea paramea);

  public abstract pb a();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dz
 * JD-Core Version:    0.6.0
 */