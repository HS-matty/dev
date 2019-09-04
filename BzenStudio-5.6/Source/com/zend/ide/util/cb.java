package com.zend.ide.util;

import java.io.ByteArrayOutputStream;

class cb extends ByteArrayOutputStream
{
  final cl a;

  private cb(cl paramcl)
  {
  }

  public synchronized void write(int paramInt)
  {
    super.write(paramInt);
    cl.a(this.a);
  }

  public synchronized void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super.write(paramArrayOfByte, paramInt1, paramInt2);
    cl.a(this.a);
  }

  cb(cl paramcl, vb paramvb)
  {
    this(paramcl);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cb
 * JD-Core Version:    0.6.0
 */