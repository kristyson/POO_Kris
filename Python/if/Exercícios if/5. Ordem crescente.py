valor1 = int(input("Digite um valor: "))
valor2 = int(input("Digite um valor: "))
valor3 = int(input("Digite um valor: "))

if valor1 < valor2 < valor3:
    print(valor1,valor2,valor3)
elif valor1 < valor3 < valor2:
    print(valor1,valor3,valor2)
elif valor2 < valor1 < valor3:
    print(valor2,valor1,valor3)
elif valor2 < valor3 < valor1:
    print(valor2,valor3,valor1) 
elif valor3 < valor1 < valor2:
    print(valor3,valor1,valor2)  
elif valor3 < valor2 < valor1:
    print(valor3,valor2,valor1)
