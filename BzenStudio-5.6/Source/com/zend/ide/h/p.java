package com.zend.ide.h;

public class p extends o
{
  final i d;

  protected p(i parami)
  {
    super(parami);
  }

  public boolean b()
  {
    bg localbg = (bg)this.d.i.getLastSelectedPathComponent();
    if ((localbg == null) || (localbg.isLeaf()))
      return false;
    return super.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.p
 * JD-Core Version:    0.6.0
 */