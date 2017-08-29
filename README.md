The problem is that if aspects are used and `spring.aop.proxy-target-class=true` is set, than JavaFX components are not
autowired in controllers (logBox == null). 

If `spring.aop.proxy-target-class=false` then: 
`Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'downloadController' is expected to be of type 'com.develmagic.javafxissue.DownloadController' but was actually of type 'com.sun.proxy.$Proxy55'`


