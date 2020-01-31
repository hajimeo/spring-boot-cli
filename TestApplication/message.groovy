@Controller
@Grab('spring-boot-starter-thymeleaf')

class MessageController {
  @RequestMapping("/message")

  String getMessage(Model model) {
    String message = "Welcome to TutorialsPoint.Com!";
    model.addAttribute("message", message);
    return "message";
  }
}
