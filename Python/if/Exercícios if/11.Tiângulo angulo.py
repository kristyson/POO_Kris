print ("----Qual o tipo de triângulo ?----")
angulo1 = int(input("\nDigite um dos ângulos do triângulo:"))
angulo2 = int(input("Digite um dos ângulos do triângulo:"))
angulo3 = int(input("Digite um dos ângulos do triângulo:"))

if angulo1 == 90 :
    print("\nTriânguo Retângulo")
elif angulo1 > 90 or angulo2 > 90 or angulo3 > 90:
    print("\nTriângulo Obtusângulo")
elif angulo1 < 90 or angulo2 < 90 or angulo3 < 90:
    print("\nTriângulo Acutângulo")