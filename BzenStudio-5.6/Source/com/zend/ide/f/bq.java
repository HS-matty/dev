package com.zend.ide.f;

import java.io.IOException;
import java.io.Reader;

class bq
{
  private s a;
  private r b = new r();
  private p c = new p();

  public bq(s params)
  {
    this.a = params;
  }

  public synchronized void b(String paramString)
  {
    this.a.b(paramString);
  }

  public synchronized void a(Reader paramReader, String paramString)
    throws IOException
  {
    this.b.a(paramReader, paramString, this.c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bq
 * JD-Core Version:    0.6.0
 */