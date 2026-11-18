void main(){
    int quantidade= 0;
    int soma = 0;
    int temperatura = Integer.parseInt(IO.readln("Digite uma das temperaturas do sensor, diferente de 999 °C: ")); 
    int tempmedia = 0; 

    while (temperatura != 999){
        soma = temperatura + soma;
        tempmedia = 
         temperatura = Integer.parseInt(IO.readln("Digite a temperatura atual ou 999 para encerrar: "));
        quantidade = quantidade + 1;

        IO.println("A temperatura atual é: " + temperatura + " °C, a soma das temperaturas é igual à  " + soma + " e houveram " + quantidade + " leituras");


    }
    tempmedia = (soma / quantidade);
       { if (tempmedia<18)
            IO.println(tempmedia + " °C Temperatura baixa, ligar aquecimento!");
        else if (temperatura<=28)
            IO.println(tempmedia + " °C Temperatura ideal");
        else 
            IO.readln(tempmedia + " °C Temperatura Alta: Ligar Ventilação");
        

    } 

  
   







}