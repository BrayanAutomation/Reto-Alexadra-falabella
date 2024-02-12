Feature: Buy product

  As a user
  I want to purchase a product
  So that I can use it personally

  Scenario Outline: User buys a product
    Given the user is on the main page
    When the user adds the "<product>" to the cart ensuring its validity
    And proceeds to checkout completing the purchase process "<correo>" "<Departamento>" "<Ciudad>" "<Barrio>" "<Direccion>" "<TorreAptoUnidad>"
    Then the user should observe the message "<product>"

    Examples:
      | product                     | correo                    | Departamento | Ciudad    | Barrio    | Direccion              | TorreAptoUnidad           |
      | iPhone 15 de 128GB  6GB RAM | brayangranado90@gmail.com | ANTIOQUIA    | MEDELLÍN  | MEDELLÍN  | Carrera 99             | Luna del valle            |
      | iPhone 11 128 GB 4GB RAM    | alguien@dominio.com       | CUNDINAMARCA | CABRERA   | CABRERA   | Calle sal si puedes 91 | Unidad los altos, torre 5 |
      | iPhone 12 de 256GB          | sacarias@piedras.com      | LA GUAJIRA   | EL MOLINO | EL MOLINO | Trasversal superor 45  | Torres los campos         |