package com.zend.ide.f;

import java.io.IOException;
import java.io.Reader;
import javax.swing.JFrame;

public class bp
{
  private static bp a = null;
  private bq b = new bq(this.c);
  private s c = new s();
  private bg d;

  public static bp d()
  {
    if (a == null)
      a = new bp();
    return a;
  }

  public void a(Reader paramReader, String paramString)
    throws IOException
  {
    this.b.a(paramReader, paramString);
  }

  public synchronized void a(String paramString)
  {
    this.b.b(paramString);
  }

  public s b()
  {
    return this.c;
  }

  public void a(JFrame paramJFrame)
  {
    this.d = new bg(b(), paramJFrame);
  }

  public bg c()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bp
 * JD-Core Version:    0.6.0
 */