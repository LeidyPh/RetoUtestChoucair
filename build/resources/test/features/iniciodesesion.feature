@stories

Feature: Leidy quiere registrarce en la pagina web de Utest

  @scenario1
  Scenario: Ingresar Datos Personales
    Given Leidy Ingresa Datos personales
      | textoNombre  | textoApellido | textoCorreo            | textoMes | textoDia | textoAno |
      | Leidy        | Hernandez     | Leidyhq186@gmail.com | May      | 20       | 1996     |
    When Ella Ingresa Datos de Ubicacion Dispositivo y Contrasena
      | textoZip | textoMovil | textoContrasena | textoConfirmarContrasena |
      | 252212   | Apple      | Prueba123*      | Prueba123*               |
    Then Ella finalizo su registro en Utest
      | textoExitoso                                                            |
      | Welcome to the world's largest community of freelance software testers! |
