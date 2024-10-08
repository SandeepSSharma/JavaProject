# Banking System Project Code
Overview
This Java-based Banking System simulates basic banking operations, including account management, deposits, withdrawals, and interest calculations for savings and current accounts.

Features
Account Management: Input and display customer details (account number, name, mobile number).
Deposit and Withdraw: Functionality to deposit and withdraw funds from savings and current accounts, with balance checks.
Interest Calculation: Calculate interest on savings and current account balances based on defined rates.

Classes
RBI: Interface defining a method for interest calculation.
BankAccount: Abstract class providing common functionality for accounts, such as customer data input and balance management.
SavingsAccount: Class extending BankAccount for savings account-specific behavior.
CurrentAccount: Class extending BankAccount for current account-specific behavior.
InterestCalculator: Class for calculating interest on savings accounts.
CurrentInterestCalculator: Class for calculating interest on current accounts.
Banking: Main class to run the application and handle user interactions.

Usage
Run the Banking class.
Follow the prompts to input customer data, deposit or withdraw funds, and calculate interest.
Select options from the menu to perform various banking operations.

Requirements
Java Development Kit (JDK) installed on your machine.

How to Run
Clone the repository.
Open the project in your preferred IDE or text editor.
Compile and run the Banking class.
