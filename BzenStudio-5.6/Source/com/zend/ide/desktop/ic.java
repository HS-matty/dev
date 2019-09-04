package com.zend.ide.desktop;

class ic
  implements Runnable
{
  final h a;

  ic(h paramh)
  {
  }

  public void run()
  {
    Runtime.getRuntime().gc();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ic
 * JD-Core Version:    0.6.0
 */