package com.zend.ide.o.n;

import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.net.ServerSocket;
import java.net.URLDecoder;

public class e
  implements d
{
  private ServerSocket a;
  private int b = 0;

  public void a()
  {
    this.b = 0;
    c();
  }

  // ERROR //
  public void c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: ldc 4
    //   11: invokestatic 5	com/zend/ide/y/b:a	(Ljava/lang/String;)Lcom/zend/ide/y/c;
    //   14: invokevirtual 6	com/zend/ide/y/c:c	()Ljava/lang/Object;
    //   17: checkcast 7	java/lang/Integer
    //   20: invokevirtual 8	java/lang/Integer:intValue	()I
    //   23: istore 5
    //   25: aload_0
    //   26: new 9	java/net/ServerSocket
    //   29: dup
    //   30: iload 5
    //   32: iconst_0
    //   33: ldc 10
    //   35: invokestatic 11	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   38: invokespecial 12	java/net/ServerSocket:<init>	(IILjava/net/InetAddress;)V
    //   41: putfield 13	com/zend/ide/o/n/e:a	Ljava/net/ServerSocket;
    //   44: goto +58 -> 102
    //   47: astore 5
    //   49: aload_0
    //   50: dup
    //   51: getfield 2	com/zend/ide/o/n/e:b	I
    //   54: iconst_1
    //   55: iadd
    //   56: putfield 2	com/zend/ide/o/n/e:b	I
    //   59: aload_0
    //   60: getfield 2	com/zend/ide/o/n/e:b	I
    //   63: bipush 10
    //   65: if_icmpge +10 -> 75
    //   68: aload_0
    //   69: invokevirtual 3	com/zend/ide/o/n/e:c	()V
    //   72: goto +30 -> 102
    //   75: new 15	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 16	java/lang/StringBuilder:<init>	()V
    //   82: ldc 17
    //   84: invokevirtual 18	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload 5
    //   89: invokevirtual 19	java/io/IOException:getMessage	()Ljava/lang/String;
    //   92: invokevirtual 18	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 20	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokestatic 21	com/zend/ide/util/cl:a	(Ljava/lang/String;)V
    //   101: return
    //   102: iload_1
    //   103: ifne +418 -> 521
    //   106: aload_0
    //   107: getfield 13	com/zend/ide/o/n/e:a	Ljava/net/ServerSocket;
    //   110: ifnonnull +4 -> 114
    //   113: return
    //   114: aload_0
    //   115: getfield 13	com/zend/ide/o/n/e:a	Ljava/net/ServerSocket;
    //   118: invokevirtual 22	java/net/ServerSocket:accept	()Ljava/net/Socket;
    //   121: astore 4
    //   123: goto +96 -> 219
    //   126: astore 5
    //   128: invokestatic 24	java/lang/Thread:yield	()V
    //   131: aload_2
    //   132: ifnull +17 -> 149
    //   135: aload_2
    //   136: invokevirtual 25	java/io/OutputStream:close	()V
    //   139: goto +10 -> 149
    //   142: astore 6
    //   144: aload 6
    //   146: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   149: aload 4
    //   151: ifnull +18 -> 169
    //   154: aload 4
    //   156: invokevirtual 27	java/net/Socket:close	()V
    //   159: goto +10 -> 169
    //   162: astore 6
    //   164: aload 6
    //   166: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   169: return
    //   170: astore 5
    //   172: aload 5
    //   174: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   177: invokestatic 24	java/lang/Thread:yield	()V
    //   180: aload_2
    //   181: ifnull +17 -> 198
    //   184: aload_2
    //   185: invokevirtual 25	java/io/OutputStream:close	()V
    //   188: goto +10 -> 198
    //   191: astore 6
    //   193: aload 6
    //   195: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   198: aload 4
    //   200: ifnull +18 -> 218
    //   203: aload 4
    //   205: invokevirtual 27	java/net/Socket:close	()V
    //   208: goto +10 -> 218
    //   211: astore 6
    //   213: aload 6
    //   215: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   218: return
    //   219: aload 4
    //   221: invokevirtual 29	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   224: astore_3
    //   225: aload 4
    //   227: invokevirtual 30	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   230: astore_2
    //   231: new 31	java/io/BufferedReader
    //   234: dup
    //   235: new 32	java/io/InputStreamReader
    //   238: dup
    //   239: aload_3
    //   240: invokespecial 33	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   243: invokespecial 34	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   246: astore 5
    //   248: new 35	java/io/PrintWriter
    //   251: dup
    //   252: new 36	java/io/OutputStreamWriter
    //   255: dup
    //   256: aload_2
    //   257: invokespecial 37	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   260: invokespecial 38	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   263: astore 6
    //   265: aload 5
    //   267: invokevirtual 39	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   270: astore 7
    //   272: aload_0
    //   273: aload 7
    //   275: invokespecial 40	com/zend/ide/o/n/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   278: astore 8
    //   280: invokestatic 41	com/zend/ide/o/n/o:a	()Lcom/zend/ide/o/n/o;
    //   283: invokevirtual 42	com/zend/ide/o/n/o:g	()Z
    //   286: ifeq +19 -> 305
    //   289: invokestatic 43	com/zend/ide/util/ew:c	()Ljava/lang/String;
    //   292: astore 9
    //   294: invokestatic 41	com/zend/ide/o/n/o:a	()Lcom/zend/ide/o/n/o;
    //   297: invokevirtual 44	com/zend/ide/o/n/o:e	()I
    //   300: istore 10
    //   302: goto +24 -> 326
    //   305: invokestatic 45	com/zend/ide/util/ew:a	()Ljava/lang/String;
    //   308: astore 9
    //   310: ldc 46
    //   312: invokestatic 5	com/zend/ide/y/b:a	(Ljava/lang/String;)Lcom/zend/ide/y/c;
    //   315: invokevirtual 6	com/zend/ide/y/c:c	()Ljava/lang/Object;
    //   318: checkcast 7	java/lang/Integer
    //   321: invokevirtual 8	java/lang/Integer:intValue	()I
    //   324: istore 10
    //   326: aload 6
    //   328: aload_0
    //   329: invokespecial 47	com/zend/ide/o/n/e:d	()Ljava/lang/String;
    //   332: invokevirtual 48	java/io/PrintWriter:write	(Ljava/lang/String;)V
    //   335: aload 8
    //   337: ifnonnull +20 -> 357
    //   340: aload 6
    //   342: aload_0
    //   343: iconst_0
    //   344: aload 9
    //   346: iload 10
    //   348: invokespecial 49	com/zend/ide/o/n/e:a	(ZLjava/lang/String;I)Ljava/lang/String;
    //   351: invokevirtual 50	java/io/PrintWriter:println	(Ljava/lang/String;)V
    //   354: goto +18 -> 372
    //   357: aload 6
    //   359: aload_0
    //   360: aload 8
    //   362: aload 9
    //   364: iload 10
    //   366: invokespecial 51	com/zend/ide/o/n/e:a	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   369: invokevirtual 48	java/io/PrintWriter:write	(Ljava/lang/String;)V
    //   372: aload 6
    //   374: invokevirtual 52	java/io/PrintWriter:flush	()V
    //   377: invokestatic 24	java/lang/Thread:yield	()V
    //   380: aload_2
    //   381: ifnull +17 -> 398
    //   384: aload_2
    //   385: invokevirtual 25	java/io/OutputStream:close	()V
    //   388: goto +10 -> 398
    //   391: astore 5
    //   393: aload 5
    //   395: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   398: aload 4
    //   400: ifnull +118 -> 518
    //   403: aload 4
    //   405: invokevirtual 27	java/net/Socket:close	()V
    //   408: goto +110 -> 518
    //   411: astore 5
    //   413: aload 5
    //   415: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   418: goto +100 -> 518
    //   421: astore 5
    //   423: aload 5
    //   425: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   428: invokestatic 24	java/lang/Thread:yield	()V
    //   431: aload_2
    //   432: ifnull +17 -> 449
    //   435: aload_2
    //   436: invokevirtual 25	java/io/OutputStream:close	()V
    //   439: goto +10 -> 449
    //   442: astore 5
    //   444: aload 5
    //   446: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   449: aload 4
    //   451: ifnull +67 -> 518
    //   454: aload 4
    //   456: invokevirtual 27	java/net/Socket:close	()V
    //   459: goto +59 -> 518
    //   462: astore 5
    //   464: aload 5
    //   466: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   469: goto +49 -> 518
    //   472: astore 11
    //   474: invokestatic 24	java/lang/Thread:yield	()V
    //   477: aload_2
    //   478: ifnull +17 -> 495
    //   481: aload_2
    //   482: invokevirtual 25	java/io/OutputStream:close	()V
    //   485: goto +10 -> 495
    //   488: astore 12
    //   490: aload 12
    //   492: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   495: aload 4
    //   497: ifnull +18 -> 515
    //   500: aload 4
    //   502: invokevirtual 27	java/net/Socket:close	()V
    //   505: goto +10 -> 515
    //   508: astore 12
    //   510: aload 12
    //   512: invokestatic 26	com/zend/ide/util/cl:a	(Ljava/lang/Throwable;)V
    //   515: aload 11
    //   517: athrow
    //   518: goto -416 -> 102
    //   521: return
    //
    // Exception table:
    //   from	to	target	type
    //   9	44	47	java/io/IOException
    //   114	123	126	java/net/SocketException
    //   135	139	142	java/io/IOException
    //   154	159	162	java/io/IOException
    //   114	123	170	java/lang/Exception
    //   184	188	191	java/io/IOException
    //   203	208	211	java/io/IOException
    //   384	388	391	java/io/IOException
    //   403	408	411	java/io/IOException
    //   114	128	421	java/lang/Exception
    //   170	177	421	java/lang/Exception
    //   219	377	421	java/lang/Exception
    //   435	439	442	java/io/IOException
    //   454	459	462	java/io/IOException
    //   114	128	472	finally
    //   170	177	472	finally
    //   219	377	472	finally
    //   421	428	472	finally
    //   472	474	472	finally
    //   481	485	488	java/io/IOException
    //   500	505	508	java/io/IOException
  }

  public void b()
  {
    if (this.a != null)
    {
      try
      {
        this.a.close();
      }
      catch (Exception localException)
      {
      }
      this.a = null;
    }
  }

  public boolean c()
  {
    return (this.a != null) && (!this.a.isClosed());
  }

  private String a(String paramString)
  {
    if (paramString == null)
      return null;
    String str1 = "platform_gui=";
    int i = paramString.indexOf(str1);
    if (i == -1)
      return null;
    String str2 = null;
    try
    {
      str2 = paramString.substring(i + str1.length());
      str2 = str2.substring(0, str2.indexOf(" "));
      str2 = URLDecoder.decode(str2, "UTF-8");
    }
    catch (Exception localException)
    {
      cl.a(localException);
      return null;
    }
    return str2;
  }

  private String d()
  {
    return "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\n";
  }

  private String a(boolean paramBoolean, String paramString, int paramInt)
  {
    String str = paramBoolean ? "?" : "&";
    str = str + "debug_port=" + paramInt + "&debug_host=" + paramString;
    boolean bool = ((Boolean)b.a("debugging.encryptedData").c()).booleanValue();
    if (bool)
      str = str + "&use_ssl=1";
    if (o.a().g())
      str = str + "&use_tunneling=1";
    else
      str = str + "&use_tunneling=0";
    str = str + "&debug_fastfile=1";
    return str;
  }

  private String a(String paramString1, String paramString2, int paramInt)
  {
    String str1 = paramString1;
    if (paramString1.indexOf("://") == -1)
      str1 = "http://" + paramString1;
    str1 = str1 + a(paramString1.indexOf("?") == -1, paramString2, paramInt);
    String str2 = "<html>\n<head>\n<script>\n    try {\n        parent.location = '" + str1 + "';\n" + "    } catch (e) {\n" + "    }\n" + "</script>\n" + "</head>\n" + "<body>\n" + "    <p>This page should refresh automatically. If not, please click here \n" + "<a href=\"" + str1 + "\" target=\"_parent\">Go back to \n" + "ZendPlatform GUI</a>.</p>\n" + "</body>\n" + "</html>";
    return str2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.e
 * JD-Core Version:    0.6.0
 */