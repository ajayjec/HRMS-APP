---
applyTo: "**"
---
Add a comment at the start and End of the section: 'Contains AI-generated edits.'

# Project general coding standards

## Naming Conventions
- Classes and Interfaces: Use PascalCase (e.g., MyClass, MyInterface).
- Methods and Variables: Use camelCase (e.g., myMethod, myVariable).
- Constants: Use SCREAMING_SNAKE_CASE (e.g., MAX_SIZE, DEFAULT_VALUE).
- Packages: Use lowercase (e.g., com.example.project).
- New classes should be created in the appropriate package structure.

## Code Formatting:
- Indentation: Use consistent indentation, typically 4 spaces.
- Braces: Maintain consistent brace placement (e.g., K&R style or Allman style).
- Spacing: Use spaces around operators, after commas, and between keywords and parentheses.
- Line Length: Keep lines concise, often recommending a maximum of 80-120 characters.

## Structure and Organization:
- File Organization: Typically, each Java source file contains a single public class or interface.
- Import Statements: Organize and group import statements.
- Class Members: Order class members consistently (e.g., fields, constructors, methods).
- Add copyright headers to each file as per project guidelines.(e.g. ******* Copyright 2025, Example Corp. All rights reserved. ******)
- Thread ID, Transaction id and api name should be visible in Logs
- Use meaningful log messages that provide context about the operation being performed.

## Best Practices:
- Encapsulation: Make fields private and use getters/setters for access.
- Error Handling: Implement robust error handling using exceptions.
- Resource Management: Ensure proper closing of resources (e.g., using try-with-resources).
- Avoid Magic Numbers: Use named constants instead of hardcoding literal values.
- Simplicity and Clarity: Write code that is easy to understand and avoid unnecessary complexity.
- after every changes, execute mvn clean install to ensure the project builds successfully.
- create seprate classes for Pojos and DTOs.


