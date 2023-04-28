n1 = float(input(" Digite a primeira nota: " ))
n2 = float(input(" Digite a segunda nota: "))

media = (n1+n2)/2

print(" A Sua média foi > ", media, " e " )

if media > 7 :
     print("Você foi aprovado !!")
elif media < 4 :
    print("Você reprovou !")
else :
    print(" Você foi para a recuperação, estude um pouco mais")


