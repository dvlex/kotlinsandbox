# Kotlin Console Sandbox

This project is a Kotlin console sandbox designed to help you learn Kotlin without the complications of Android UI development. It includes Gradle for managing dependencies, such as Koin, for learning purposes. The project is set up as a devcontainer to ensure a consistent development environment.

## Prerequisites

- Docker
- Visual Studio Code (with Remote - Containers extension)

## Setup Instructions

1. Clone the repository:
    ```sh
    git clone <repository-url>
    ```

2. Open the project in Visual Studio Code:
    ```sh
    code <repository-directory>
    ```

3. Open the project in the devcontainer:
    - Press `F1` and select `Remote-Containers: Reopen in Container`.

## Usage

- To build the project, run:
    ```sh
    ./gradlew build
    ```

- To run the project, use:
    ```sh
    ./gradlew run
    ```

## Dependencies

This project uses Gradle to manage dependencies. Key dependencies include:

- [Kotlin](https://kotlinlang.org/)
- [Koin](https://insert-koin.io/)

## Learning Resources

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Koin Documentation](https://insert-koin.io/docs/quickstart/kotlin/)

## Contributing

Feel free to open issues or submit pull requests if you find any bugs or have suggestions for improvements.

## License

This project is licensed under the MIT License.
