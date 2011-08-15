package com.yuvimasory.myproj

import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("myproj dummy test works") {
    assert(1 === 1)

    expect(1) {
      2 - 1
    }

    intercept[IllegalArgumentException] {
      throw new IllegalArgumentException()
    }
  }
}
