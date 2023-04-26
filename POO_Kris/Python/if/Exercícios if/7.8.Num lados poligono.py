poligono = int (input("Digite quantos lados tem o poligono: "))

if poligono == 3 :
    print("\nTRIÂNGULO IDENTIFICADO")
    lado = float(input("\nDigite agora a medida do lado do triângulo: "))
    lado = ((lado*lado)*(3**0.5))/4
    print("\nA área do triângulo é: ", lado)

elif poligono == 4 :
    print ("\nQUADRADO IDENTIFICADO")
    lado = float(input("\nDigite agora a medida do lado do quadrado: "))
    lado = lado*lado
    print("\nA área do quadrado é: ", lado)

elif poligono == 5 :
    print("\nPENTAGONO IDENTIFICADO")

elif poligono < 3 :
    print("\nNÃO É UM POLIGONO")    

else :
    print("\nPOLIGONO NÃO IDENTIFICADO")