# FHCI FTC Robotics

This repository holds the robot code for the FHCI FIRST Tech Challenge team. All of our OpModes are stored here so everyone on the team can find them, use them, and build on them.

Team number: tbd

## What's in this repo

The java folder contains our robot code. TeleOp programs (driver controlled) and autonomous programs will each have their own folder as the season goes on.

Current programs:

- BiobuzzStarterBot: a TeleOp tank drive robot with an intake, a flywheel, and a servo actuator.
- MechanumDrive: a TeleOp mecanum drive with a distance sensor that helps the driver hold a set distance from a wall.

## Controls for the Biobuzz Starter Bot

- Left stick and right stick: drive the left and right sides of the robot
- Right bumper: intake in
- Left bumper: intake out
- Right trigger: flywheel speed
- A button: move the actuator out
- X button: bring the actuator back home

## Robot configuration names

The names in the code have to match the robot configuration on the Control Hub exactly, including capital letters. This robot uses leftDrive, rightDrive, Intake, FlyWheel, and fwActuator.

## How to use this code

1. Download or clone this repository.
2. Copy the program files into the TeamCode folder in Android Studio, or paste them into OnBot Java.
3. Build the project and deploy it to the Control Hub.

## Team guidelines

- Pull the latest code before you start working.
- Write a clear commit message that explains what you changed.
- Test your changes on the robot before pushing them.

## Contributors

-Naveed Shaik
-Dario Ricci
-Ron? (dunno if he even knows abt this)
