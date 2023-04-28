sexo = input("Digite (M) para MASCULINO e (F) para FEMININO : ")
altura = float(input("Digite agora sua altura: "))

if sexo == "M" or sexo == "m" :
    peso = (altura*72.7) - 58
elif sexo =="F" or sexo == "f" :
    peso = (altura*62.1) - 44.7
else :
    print("OPÇÃO INVALIDA !")

print("Seu peso ideal é ", peso )