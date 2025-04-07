# Duck Behavior Simulation

A Java implementation demonstrating the Strategy design pattern through a duck simulation system.

## Overview

This project showcases how the Strategy pattern can be used to encapsulate various behaviors (flying, quacking, swimming) that can be dynamically assigned to different duck types at runtime, promoting code reuse and flexibility.

## Design Pattern

The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

In this implementation:
- Duck behaviors are defined as interfaces (strategies)
- Concrete implementations provide specific behavior variants
- Duck types can mix and match behaviors without inheritance complications

## Project Structure

### Core Components

#### Behavior Interfaces
- **`FlyBehaviour`**: Defines methods for flight capabilities
- **`QuackBehaviour`**: Defines methods for sound production
- **`SwimBehaviour`**: Defines methods for water movement

#### Duck Base Class
- **`Duck`**: Abstract base class with:
  - References to behavior interfaces
  - Methods to set behaviors at runtime
  - Common duck methods

### Concrete Implementations

#### Sound Behaviors
- **`Quack`**: Natural duck quacking sound
- **`Squeak`**: Rubber duck squeaking sound
- **`MuteQuack`**: Silent behavior (no sounds)

#### Water Movement Behaviors
- **`Swim`**: Active swimming motion
- **`Float`**: Passive floating on water

#### Flight Behaviors
- **`FlyWithWings`**: Natural flying ability
- **`FlyNoWay`**: Inability to fly

#### Duck Types
- **`MallardDuck`**: Wild duck with standard behaviors
- **`RedHeadDuck`**: Wild duck variant
- **`RubberDuck`**: Toy duck (squeaks, floats, cannot fly)
- **`DecoyDuck`**: Wooden decoy (silent, floats, cannot fly)

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git (optional)

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/samarthsb4real/PIJ-Assignment-6.git
   ```

2. Navigate to the project directory:
   ```sh
   cd PIJ-Assignment-6
   ```

3. Compile the Java files:
   ```sh
   javac *.java
   ```

4. Run the main class:
   ```sh
   java DuckSimulator
   ```

## 🧪 Examples

Create new duck types by combining behaviors:

```java
Duck customDuck = new MallardDuck();
// Change behaviors at runtime
customDuck.setFlyBehavior(new FlyNoWay());
customDuck.setQuackBehavior(new Squeak());
```

## Notes

- This implementation demonstrates polymorphic behavior without complex inheritance hierarchies
- New behaviors can be added without modifying existing duck classes
- Behaviors can be changed at runtime