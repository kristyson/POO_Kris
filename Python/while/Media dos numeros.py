qtde, soma, num = 0, 0, 1
print(" O Programa a seguir irá mostrar quantos números forám digitados e a média deles \n Digite 0 para SAIR ")

while num != 0 :
    num = float(input(" Digite o numero: "))
    if num >0:
        qtde = qtde + 1
        soma = soma + num

media = soma/qtde

print (" Você digitou ", qtde, " números maior que 0  e a média deles é ", media )