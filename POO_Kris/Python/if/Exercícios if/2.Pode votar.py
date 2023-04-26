anonasc = int(input("Digite o ano do seu nascimento para saber se ja pode votar: "))
anoatual = int(input("\nDigite o ano em que nos estamos: "))
idade= anoatual- anonasc

if idade >= 16 :
    print("\nParabéns você ja pode votar esse ano")
else :
    print ("\nhmm você ainda não tem idade para votar")     