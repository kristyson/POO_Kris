nome = input("\n Escreva o nome do funcionário: ")
horaextra = float(input("\n Informe a quantidae de horas extras: "))
horafalta = float(input("\n Informe o número de faltas: "))


premio = (horaextra - (2/3 * horafalta))*60


if horaextra>=2.401 :
    print("De acordo com a sua contribuição voçê tem ", horaextra, " de trabalho extra na empresa !\n Seu prêmio é de  reais" )
elif horaextra >= 1.801 :
    print("De acordo com a sua contribuição voçê tem ", horaextra, " de trabalho extra na empresa !\n Seu prêmio é de  reais" )
elif horaextra >= 1.201 :
    print("De acordo com a sua contribuição voçê tem ", horaextra, " de trabalho extra na empresa !\n Seu prêmio é de  reais" )
elif horaextra >= 600 :
    print("De acordo com a sua contribuição voçê tem ", horaextra, " de trabalho extra na empresa !\n Seu prêmio é de  reais" )
else :
    print("De acordo com a sua contribuição voçê tem ", horaextra, " de trabalho extra na empresa !\n Seu prêmio é de  reais" )