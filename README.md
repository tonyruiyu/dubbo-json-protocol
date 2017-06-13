# dubbo-json-protocol

## 	dubbo protocol config

```xml
<dubbo:protocol name="json" port="${dubbo.server.port}" server="servlet" contextpath="${dubbo.server.context}" />
```

## dubbo provider config 

```xml
<dubbo:service protocol="json" interface="com.xx.xx.facade.xxxService" ref="xxService" />
```

## web.xml config 
```xml
<servlet>
  <servlet-name>dubbo</servlet-name>
	<servlet-class>com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet</servlet-class>
	<load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
	<servlet-name>dubbo</servlet-name>
	<url-pattern>/dubbo/*</url-pattern>
</servlet-mapping>
```

## web request
provider interface:
```java
package com.tony.facade;
public interface MyService {
  public String hello(String msg1,String msg2);
}
```



```
http://127.0.0.1:8080/${dubbo.server.context}/dubbo/com.tony.facade.MyService?method=hello&param=['this is msg1','this is msg2']
```
