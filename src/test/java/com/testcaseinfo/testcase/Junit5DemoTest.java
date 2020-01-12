package com.testcaseinfo.testcase;

import org.junit.jupiter.api.*;

@DisplayName("Junit5 演示方法")
public class Junit5DemoTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    @DisplayName("fun 测试方法")
    @RepeatedTest(5)
    @Tag("testDemo")
    void fun() {
        System.out.println("fun");
    }

    @Test
    @DisplayName("fun1 测试方法")
    @Tag("testDemo")
    void fun1() {
        System.out.println("fun1");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}
