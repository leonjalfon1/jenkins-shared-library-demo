@Library('my-shared-library')
import static org.foo.helper
package org.foo

class mainclass {
static def mainfunction(script,prefix) {
//def msg = helperfunction()
def msg = "testmessage"
script.sh """echo ${prefix}:${msg}"""
}
}
