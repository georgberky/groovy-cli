@RestController
class Prototype {

    @RequestMapping("/")
    String home() {
        return "Hello Softwerkskammer!"
    }
}
