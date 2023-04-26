print("----- QUAL O TIPO DO TRIÂNGULO ? -----")
lado1 = int(input("\nDigite o lado 1 do triângulo: "))
lado2 = int(input("\nDigite o lado 2 do triângulo: "))
lado3 = int(input("\nDigite o lado 3 do triângulo: "))

if lado1 == lado2 and lado2 == lado3 :
    print ("\nTriângulo  Equiláreto")
elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3 :
    print("\nTriângulo Isóscele")
elif lado1 != lado2 and lado1 != lado3 and lado2 != lado3 :
    print("\nTriângulo Escaleno")