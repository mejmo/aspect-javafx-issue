The problem is that if aspects are used and `spring.aop.proxy-target-class=true` is set, than JavaFX components are not
autowired in controllers (logBox == null). 

If `spring.aop.proxy-target-class=false` then: 
`Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'downloadController' is expected to be of type 'com.develmagic.javafxissue.DownloadController' but was actually of type 'com.sun.proxy.$Proxy55'`

Original StackOverflow thread:

https://stackoverflow.com/questions/45933616/cant-create-aspect-in-spring-boot?noredirect=1#comment78826078_45933616
