/*
@see: https://www.javadevjournal.com/spring-boot/spring-boot-ssl/

As per https://www.baeldung.com/spring-boot-cli
  Created ./config/application.properties
Also, created ./resources/javadevjournal.p12 as this should be included in the classpath
  and using server.ssl.key-store=resources/standalone.localdomain.p12

How to override keystore:
  java -jar HttpsApplication.jar --spring.config.location=./new_config/application.properties
Didn't work (maybe because application.properties was good?):
  #java -Djavax.net.ssl.keyStore=./resources/javadevjournal.p12 -Djavax.net.ssl.keyStorePassword=changeit -jar HttpsApplication.jar
 */

@RestController
class HttpsApplication
{
  @RequestMapping("/")

  String welcome() {
    "SSL/TLS/HTTPS is working!"
  }
}
