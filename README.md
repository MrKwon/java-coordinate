# Week 3. Coordinate Calculator

## [Sub Mission] Inheritance and Interface - Charging Fuel

### Function Description
1. Input
    - approximate Travel Distance
2. Domain
    - calculate Fuel Amount based on Travel Distance
3. Output
    - showing Fuel Amount about each Car

### Programming Requirements
1. Using **Abstract Class** and **Interface**
2. Don't Use **if-expression**

## [Main Mission] Coordinate Calculator
### Step 1. Length of Line
#### Function Requirements
1. View
    - X and Y coordinates
        - [INPUT] coordinates are written in parenthesis ``(x,y)``
    - When two coordinates are found from user input, it is a **Line**
        - [INPUT] separate each coordinate using ``-``
        - [OUTPUT] print distance between coordinates

2. Domain
    - ~~Point (which contains x-coordinate and y-coordinate)~~
        - ~~{EXCEPTION} upper bound is 24, lower bound is 0~~
    - Line (which contains two ``Point`` instance)

### Step 2. Area of Square
#### Function Requirements
1. View
    - distinguish between Line and Square by input string
        - if input string have only one dash, shape is Line
        - if input string have three dashes, shape is Square

2. Domain
    - Square
        - contains four Point instance
        - {EXCEPTION} input *must be* **RECTANGLE**

### Step 3. Area of Triangle
#### Function Requirements
1. Domain
    - Triangle
        - contains three Point instance

### 피드백 반영 TODO LIST

- [x] Delta 테스트

- [x] GenerateFigure 테스트

- [x] DuplicateChecker 테스트

- [x] InputParser 테스트