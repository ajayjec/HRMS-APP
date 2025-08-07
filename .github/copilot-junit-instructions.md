---
applyTo: "*test/java/com/demo/hrms*"
---
Add a comment at the start and End of the section: 'Contains AI-generated edits.'

# Project general coding standards
- Meaningful Names: Test methods should have names that clearly indicate what they are testing.
- Small, Focused Tests: Each test should verify a single, specific behavior.
- Test Lifecycle Management: Use annotations like @BeforeEach, @AfterEach, @BeforeAll, and @AfterAll to manage test setup and teardown.
- Descriptive Assertions: Provide clear messages within assertions to aid in debugging.
- Correct Assertion Usage: Choose the appropriate assertion method (e.g., assertEquals, assertTrue, assertFalse) and ensure correct argument order.
- Reduce Code Duplication: Use lifecycle annotations to initialize common test data and objects.
- AAA Pattern: Follow the Arrange-Act-Assert pattern:
- Arrange: Set up the necessary objects and data for the test.
- Act: Execute the code being tested.
- Assert: Verify the results.
- Independent Tests: Tests should not rely on the results of other tests.
- Mock Dependencies: Use mocking frameworks to isolate the unit under test from its dependencies.
- High Coverage: Strive for good test coverage, but avoid over-testing.
- Positive and Negative Tests: Include both positive (valid input) and negative (invalid input) test cases.
- Fast Execution: Ensure tests run quickly to facilitate rapid feedback.
- Real-Device Testing: While unit tests are valuable, real-device testing is crucial for identifying issues that may arise on different platforms or with specific device configurations. 