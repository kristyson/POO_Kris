print("------------------------------")
print("       URNA ELETRÔNICA")
print("------------------------------")
print("\n 1. Candidato Paulo Rodrigues \n 2. Candidato Carlos Luz \n 3. Candidato Neves Rocha \n 4. NULO \n 5. BRANCO \n 6. APURAR OS VOTOS")

voto,paulo,carlos,neves,nulo,branco=0,0,0,0,0
while voto != 6 :
    print("\n 1. Candidato Paulo Rodrigues \n 2. Candidato Carlos Luz \n 3. Candidato Neves Rocha \n 4. NULO \n 5. BRANCO \n 6. APURAR OS VOTOS")
    voto = float(input("\n Digite seu voto :"))

    if voto == 1 :
        paulo = paulo + 1
    elif voto == 2 :
        carlos = carlos +1
    elif voto == 3 :
        neves = neves +1
    elif voto == 4 :
        nulo = nulo +1
    elif voto == 5 :
        branco = branco +1
    elif voto > 6  or voto < 1 :
        print("\n Opção invalida")
soma = paulo+carlos+neves+nulo+branco
Pnulo = (nulo/soma)*100
Pbranco = (branco/soma)*100

if paulo>carlos>neves or paulo>neves>carlos :
    vencedor = "Paulo Rodrigues"
elif carlos>paulo>neves or carlos>neves>paulo :
    vencedor = "Carlos Luz"
elif neves>carlos>paulo or neves>paulo>carlos :
    vencedor = "Neves Rocha"
elif paulo==carlos==neves:
    vencedor = "EMPATE"

print("\n Candidato Paulo Rodrigues >", paulo , " votos \n Candidato Carlos Luz >", carlos, "votos \n Candidato Neves Rocha >", neves, "votos \n")
print("\n",Pnulo, "porcento de votos nulos \n", Pbranco, "porcento de votos brancos")
print (" O resultado foi ", vencedor)