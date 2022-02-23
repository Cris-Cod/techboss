Feature: Acceder a los productos

  Scenario: Listar los productos
    Given El usuario ingresa a la web
    When el usuario lista las opciones del boton productos
    And ingresa a la seccion Seif
    When El usuario lista  la seccion soluciones
    And  ingresa a la seccion Minuta Virtual
    Then selecciona el logo


  Scenario: Ingresar a Contacto
    Given El usuario se encuentra en el home de la pagina
    When se ingresa a la pagina de contancto
    And el usuario ingresa los datos del registro
    Then Se envia del registro

  Scenario: Busqueda
    Given El usuario ingresa al home de la pagina
    When El usuario ingresa al caja de busqueda
    And  busca las sedes de la compañia
    Then se muestra un mensaje dentro de la pagina

