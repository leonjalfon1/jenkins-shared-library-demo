package org.foo
import static *

class mainclass {
static def mainfunction(script,prefix) {
//def msg = helperfunction()
def msg = "testmessage"
script.sh """echo ${prefix}:${msg}"""
}
}
