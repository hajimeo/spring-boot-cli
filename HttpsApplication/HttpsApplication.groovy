/*
@see: https://www.javadevjournal.com/spring-boot/spring-boot-ssl/

As per https://www.baeldung.com/spring-boot-cli
  Created ./config/application.properties
Also, created ./resources/javadevjournal.p12 as this should be included in the classpath
  and using server.ssl.key-store=resources/javadevjournal.p12
 */

@RestController
class HttpsApplication
{
  @RequestMapping("/")

  String welcome() {
    "SSL/TLS/HTTPS is working!"
  }
}
