Feature: WebOrder Login functionality with Scenario Outline

Background:
Given User navigates to the WebOrder

Scenario: Validation of WebOrder Login Scenario(correct username and password)
  When User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
  Then User validates the 'ORDER DETAILS - Weborder' from homepage
Scenario Outline: Validation of WebOrder Login Scenario(correct username and wrong password)
  When User provides credentials '<username>' and '<password>' for WebOrder
  Then User validates the '<massage>' error message.
  Examples:
  | username                | password      | massage         |
  | hussein@gmail.com       | Guest1!       | Sign in Failed  |
  | gust1@microworks.com    | sdgf          | Sign in Failed  |
  |                         |               | Sign in Failed  |
  | gust1@microworks.com    | sdgf          | Sign in Failed  |
  |                         | Guest1!       | Sign in Failed  |

