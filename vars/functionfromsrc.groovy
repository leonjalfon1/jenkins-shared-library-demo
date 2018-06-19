import static org.foo.democlass.*

def call(String parameter = "MyParam") {
echo "From Var:"
echo "Parameter is ${parameter}"
echo "From Src:"
demofunction(this, parameter)
}
