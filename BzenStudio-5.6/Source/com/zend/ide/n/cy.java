package com.zend.ide.n;

class cy
  implements ea
{
  final gz b;

  cy(gz paramgz)
  {
  }

  public void a(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (paramString2.indexOf(".") == -1) || (paramString1 == null) || (paramString1.indexOf(".") == -1))
    {
      gz.a(this.b, kc.d((ho)this.b.getDocument()));
      gz.a(this.b, kc.a((ho)this.b.getDocument()));
      return;
    }
    String str1 = paramString1.substring(paramString1.lastIndexOf(".") + 1);
    String str2 = paramString2.substring(paramString2.lastIndexOf(".") + 1);
    if (str1.equals(str2))
      return;
    gz.a(this.b, kc.d((ho)this.b.getDocument()));
    gz.a(this.b, kc.a((ho)this.b.getDocument()));
  }

  public void a(String paramString, boolean paramBoolean)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cy
 * JD-Core Version:    0.6.0
 */