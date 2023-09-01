Feature: Login

Background:

Scenario: Login succesful
Given User launches the chrome Browser
And enters the URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
When User enters the "username" and "email"
And clicks on login button
And clicks on the customer enters the information
|Sudha@gmail|
|Keerthi|
|Vasan|
|Indian Oil|
Then Dashboard Tittle

Scenario Outline: Different users
Given User launches the chrome Browser
And enters the URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
When User enters the "<username>" and "<email>"
And clicks on login button
Then Dashboard Tittle

Examples:

|username |email |
|Keerthi |keerthi@|
|Kvasan |kvasan@|
|ckvasan |ckvasan@|
|7845381160|pass|