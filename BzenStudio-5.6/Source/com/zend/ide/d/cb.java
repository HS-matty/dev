package com.zend.ide.d;

import javax.swing.JTextField;
import javax.swing.text.Document;

public class cb extends JTextField
{
  public cb()
  {
    b();
  }

  public cb(int paramInt)
  {
    super(paramInt);
    b();
  }

  public cb(Document paramDocument, String paramString, int paramInt)
  {
    super(paramDocument, paramString, paramInt);
    b();
  }

  protected void b()
  {
    addKeyListener(new bu(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cb
 * JD-Core Version:    0.6.0
 */