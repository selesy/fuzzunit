FuzzUnit
========

This project provides a mechanism for creating a large number of JUnit tests
that will, in theory, blanket the problem space of a test case.  It is intended
to have the following features:

-   The TestCase runner will generate all permutations of tests described by
    fuzzing annotations included in the test class.

-   The fuzzing annotations will provide a mechanism for describing whether
    a generated testcase should pass, fail or throw an exception

-   The fuzzing will be accomplished (in some cases) using genetic algorithms
    to learn what patterns should be applied as test case parameters.
