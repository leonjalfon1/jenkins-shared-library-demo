package org.foo
import static org.foo.helper.*

class mainclass {
static def mainfunction(script,prefix) {
def msg = helperfunction()
script.sh """echo ${prefix}:${msg}"""
}
}
