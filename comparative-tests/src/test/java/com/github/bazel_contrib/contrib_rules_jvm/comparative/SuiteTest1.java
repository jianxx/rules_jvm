package com.github.bazel_contrib.contrib_rules_jvm.comparative;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SuiteTest1 {

  private static Stream<Arguments> argsProvider() {
    return Stream.of(Arguments.of("alpha"), Arguments.of("beta"), Arguments.of("gamma"));
  }

  @Test
  void doSomething() {
    System.out.println("Hello, World!");
  }

  @ParameterizedTest
  @MethodSource("argsProvider")
  void testSuiteParameters(String goGreek) {
    System.out.println("Suite Test 1: " + goGreek);
  }
}
