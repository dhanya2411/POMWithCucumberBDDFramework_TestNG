@RegressionTest
Feature: Login Page Test Feature
  
@RegressionTest
  Scenario: Login Page Test
    Given Navigate to Login Page
    Then Enter Username "student" and Password "Password123"
    Then Login Page Title is verified
    Then Click on Login Button
    And Close Browser
    
