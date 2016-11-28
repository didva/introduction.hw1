package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll


class Task10Specification extends Specification {
    @Unroll
    def "containDigitTwo should return #expectedResult for n=#n"() {
        expect:
        Task10.containDigitTwo(n) == expectedResult
        where:
        n       || expectedResult
        27      || true
        15      || false
        9       || false
        21      || true
        1       || false
        29914   || true
        5555555 || false
        -12345  || true
    }
}
