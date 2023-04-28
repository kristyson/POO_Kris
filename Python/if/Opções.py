print (" 1 - SALDO \n 2 - EXTRATO \n 3 - TRANSFERÊNCIA \n 4 - CARTÕES \n 5 - OUTRAS ")

opcao = int (input("\n Por favor  informe a opção desejada "))

if opcao == 1 :
    print("O usuário selecionou 1")
elif opcao == 2 :
    print("O usuário selecionou 2")
elif opcao == 3 :
    print("O usuário selecionou 3")
elif opcao == 4 :
    print("O usuário selecionou 4")
elif opcao == 5 :
    print("O usuário selecionou 5")
else  :
    print("Opção INVALIDA")