### 📱 EspressoSampleApp
A beginner-friendly app showcasing Android UI testing with Espresso. This project provides a hands-on example of how to set up and run Espresso tests for instrumented and local configurations.

---

### ✨ Features
- **📱 Application Under Test**: Explore a simple app located in the `src/main/java` directory.
- **🧪 Instrumentation Tests**: Automate UI interactions and validate app behavior in `src/androidTest/java`.
- **⚡ Local Unit Tests**: Test app logic without needing an emulator in `src/test/java`.
- **🚀 Seamless Execution**: Follow guided steps to configure and run tests with ease.
- **🔄 Turn Off Animations**: Ensure tests run smoothly by disabling animations on the device/emulator.

---

### 🛠️ Technologies Used
- **Espresso**: A concise and reliable UI testing framework for Android.
- **Gradle**: The build system managing project dependencies and configurations.
- **Android Studio**: Integrated development environment recommended for smooth test execution.

---

### 📂 Project Structure
```
.
├── src
│   ├── main/java              # Application code
│   ├── androidTest/java       # Instrumentation tests
│   └── test/java              # Local unit tests
├── build.gradle               # Project's build configuration file
└── README.md                  # Project documentation
```

---

### 🚀 Getting Started

#### **Prerequisites**
1. Android Studio 3.4 or higher.
2. A physical Android device or an emulator.
3. Developer options enabled on the device.

---

#### **Setup and Run Instructions**

1. **Clone the Repository**  
   Clone the project using:
   ```bash
   git clone <https://github.com/meet32001/Sem3_AndroidProject2InstrumentedTesting.git>
   ```

2. **Open the Project**
   - Open Android Studio.
   - Select `File > Open...` and point to the `build.gradle` file in the project directory.

3. **Prepare the Environment**
   - On your physical device or emulator, disable the following animations:
      - **Window animation scale**
      - **Transition animation scale**
      - **Animator duration scale**  
        *(Found under Settings > Developer options.)*

4. **Run Instrumented Tests**
   - Go to **Run > Edit Configurations** in Android Studio.
   - Add a new **Android Instrumented Tests** configuration:
      - Set the **Module** to `app`.
   - Connect your device or start the emulator.
   - Run the test configuration.  
     Espresso will launch the app and automatically execute test actions.

5. **Run Local Tests**
   - Go to **Run > Edit Configurations**.
   - Add a new **JUnit Test** configuration:
      - Set `Use classpath of module` to `app`.
      - Specify `Class` as `ChangeTextBehaviorLocalTest`.
   - Run the configuration to execute tests locally without an emulator.

---

### 📸 Screenshots (Optional)

Add relevant screenshots here (e.g., app interface, test execution results, etc.).

---

### 🤝 Contributing
Contributions are welcome!
1. Fork this repository.
2. Create a new branch (`feature-name`).
3. Commit your changes (`git commit -m "Add feature"`).
4. Push to your branch (`git push origin feature-name`).
5. Submit a pull request.

---

### 📄 License
This project is licensed under the **MIT License**.

---

### 💬 Connect
**GitHub**: [@Qusai007](https://github.com/Qusai007)  
**LinkedIn**: [Qusai Johar](https://www.linkedin.com/in/qusai-johar/)

Feel free to share your feedback, ideas, or report issues! 🚀

---

### 🔗 Quick Commands

| **Task**                | **Command**                  |
|-------------------------|------------------------------|
| Clone Repository        | `git clone <repo-url>`      |
| Run Instrumented Tests  | Execute test configuration  |
| Run Local Tests         | Execute local test config   |
| Disable Animations      | Modify Developer Options    |

Enjoy learning and implementing Android UI tests with Espresso! 🎉