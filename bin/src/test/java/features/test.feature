Feature: Validar Links pagina principal

  Scenario: Ingresar a la categoria comics desde la pantalla Home
    Given El usuario se encuentra en la pagina Home de iamalittletester
    When Hace clic solo el boton de The little tester comics
    Then Se debe redirigir a la pantalla Comics

  Scenario: Ingresar a la categoria Tutoriales desde la pantalla Home
    Given El usuario se encuentra en la pagina Home de iamalittletester
    When Hace clic solo el boton de My tutorial and talks
    Then Se debe redirigir a la pantalla Tutorial