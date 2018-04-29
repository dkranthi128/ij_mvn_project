package com.groovy

import spock.lang.Specification

    class helloSpockTest extends Specification {
        def "length of Spock's and his friends' names"() {
            println("***********Hello Rao - Groovy******")
            expect:
            name.size() == length

            where:
            name     | length
            "Spock"  | 5
        }
    }

