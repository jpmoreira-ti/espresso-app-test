# MyTestApp

This is a simple Android application that demonstrates navigation between two activities.

## Project Structure

The project contains the following activities and files:

- **MainActivity.java**: The main activity that displays a welcome message and a button to start the second activity.
- **SecondActivity.java**: The second activity that displays a welcome message.
- **activity_main.xml**: The user interface layout for MainActivity, which includes a title, a subtitle, and a button.
- **activity_second.xml**: The user interface layout for SecondActivity, which displays a welcome message.
- **strings.xml**: Contains the string resources used in the application.
- **AndroidManifest.xml**: Declares the app components, including both activities.

## Setup Instructions

1. Clone the repository or download the source code.
2. Open the project in an Android development environment.
3. Build and run the application on an Android device or emulator.

## Important: Disable System Animations for Reliable Testing

To avoid flaky UI tests, it is highly recommended to disable system animations on your emulator or device before running Espresso tests.  
You can do this manually in **Settings > Developer options** by setting the following to **Animation off**:

- Window animation scale
- Transition animation scale
- Animator duration scale

**Alternatively, you can disable animations via command line with ADB:**

```sh
adb shell settings put global window_animation_scale 0
adb shell settings put global transition_animation_scale 0
adb shell settings put global animator_duration_scale 0
```

Disabling these animations ensures your UI tests run faster and more reliably.

For more details, see the official Espresso setup documentation:
https://developer.android.com/training/testing/espresso/setup

## Functionality

- When the app starts, MainActivity is displayed with the message "My Training App" and the subtitle "To get started, click the button below", along with a "Begin" button.
- When the "Begin" button is clicked, the user is taken to SecondActivity, where the message "Congratulations. You finished your training!" is