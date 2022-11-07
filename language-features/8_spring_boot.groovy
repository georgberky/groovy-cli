@RestController
class Prototype {

    @RequestMapping("/")
    String home() {
        return "Hello Developer Week 2022"
    }
}
