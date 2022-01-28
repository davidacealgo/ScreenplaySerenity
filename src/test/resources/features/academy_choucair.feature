#Autor: David Acevedo

@stories
  Feature: Academy Choucair
    AS a user, I want to learn to automate in screenplay at Choucair Academy with the automation course

  @scenario
    Scenario: Search automation course
    Given that 'Lauren' wants to learn automation at the Academy Choucair
    When he searches for the course "Recursos Automatización Bancolombia" on the choucair academy platform
    Then he finds the course called "Recursos Automatización Bancolombia"