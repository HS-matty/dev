package com.zend.ide.o;

class nb
  implements Runnable
{
  final h a;

  nb(h paramh)
  {
  }

  public void run()
  {
    h.a(this.a, 200);
    for (int i = 0; (i < 5) && (!this.a.a.e); i++)
    {
      h.a(this.a, 200);
      this.a.a.toFront();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.nb
 * JD-Core Version:    0.6.0
 */