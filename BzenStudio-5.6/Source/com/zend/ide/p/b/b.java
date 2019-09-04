package com.zend.ide.p.b;

class b
  implements Runnable
{
  final a a;

  b(a parama)
  {
  }

  public void run()
  {
    a.a(this.a).setModal(false);
    a.a(this.a).setVisible(true);
    a.a(this.a).toFront();
    a.a(this.a).setModal(true);
    a.a(this.a).repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.b.b
 * JD-Core Version:    0.6.0
 */