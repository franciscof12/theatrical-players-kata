# 🎭 Theatrical Players Kata 🎭

## **Introduction**
This Kata was inspired by the book *Refactoring* by **Martin Fowler**, a must-read for developers looking to improve their code through **incremental, safe, and structured changes**.

One of the first examples in the book presents a **theater company’s billing system**, initially written in **JavaScript**. The goal of the original example is to show how refactoring can make a system more maintainable. I decided to adapt it to **Kotlin** and turn it into a **Kata**, so you can practice **Test-Driven Development (TDD)** and **Refactoring** while keeping a strong focus on **preserving behavior**.

## **What You’ll Learn**
- ✅ Writing **tests to validate behavior** before refactoring.
- 🔄 Applying **safe and structured refactoring** techniques.
- 🏗️ Improving code **without changing its external behavior**.
- 💡 Practicing **incremental changes** while keeping tests green.

## **Rules of the Kata**
Before refactoring any code, we must **first write tests** to ensure that we don’t accidentally change the system’s behavior.

✅ **First, write tests** to capture the current functionality.  
🔄 **Then, refactor** the code step by step, keeping tests green.  
🆕 **Finally, add a new feature** once the code is clean and testable.

## **Getting Started**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/franciscof12/theatrical-players-kata
cd theatrical-players-kata
```

### **2️⃣ Install Dependencies**
If using Gradle, ensure you have **JUnit 5** and **Kotest** for testing.

#### *If using Gradle Kotlin DSL (`build.gradle.kts`)*:
```kotlin
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("io.kotest:kotest-assertions-core:5.5.4")
}
```

### **3️⃣ Run the Tests**
```sh
./gradlew test
```

## **The Starting Code**
The current code calculates the cost of a customer’s **theater invoice** based on different play types (`tragedy`, `comedy`). Your goal is to **write tests** and **refactor** it.

---

## **Your Tasks**

### **Step 1: Write Tests First**
Before making any changes, start by writing tests to ensure the current behavior is correct.

### **Step 2: Refactor the Code**
Once the tests are in place, focus on improving the structure and readability of the code.

### **Step 3: Add a New Feature**
Once refactored, try adding a **new feature** like:
- Outputting the statement as **JSON**.
- Formatting the statement in **HTML**.

---

## **Contributing**
This Kata is designed to be an **iterative learning experience**. Feel free to:
- **Share your solutions** and refactoring strategies.
- **Suggest new challenges** to extend the Kata.
- **Submit pull requests** if you find improvements!

---

## **Credits**
📖 **Inspired by** *Refactoring* by Martin Fowler  
🛠️ **Original Code from the Book** in JavaScript  
🚀 **Refactored into Kotlin for this Kata**

Happy Coding! 🎭✨