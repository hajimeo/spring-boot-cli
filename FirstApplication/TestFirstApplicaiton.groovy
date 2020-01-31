class TestFirstApplication {
  // @Test didn't work
  @Grab('junit')
  void welcomeTest() {
    assertEquals("Welcome to TutorialsPoint.Com", new FirstApplication().welcome())
  }
}
