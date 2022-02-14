//use @Grab on annotation
//grab commons-lang3
//show something like joining Strings

//@Grab('org.apache.commons:commons-lang:3.9')
@Grab(group='org.apache.commons', module='commons-lang3', version='3.9')
import org.apache.commons.lang3.*

println StringUtils.joinWith(" ", "Hello", "world")
