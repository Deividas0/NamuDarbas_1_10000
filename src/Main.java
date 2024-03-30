public class Main {
    public static void main(String[] args) {
        int x = 0;


        do{
            if(x%2==0){
                System.out.println(x + " Dalinasi iš 2 be liekanos");
            }
            x++;
            if(x%5==0){
                System.out.println(x + " Dalinasi is 5");
            }
            if(x%7==0){
                System.out.println(x + " Dalinasi is 7");
            }
            if(x%8==0){
                System.out.println(x + " Dalinasi is 8");
            }
            if(x%12==0){
                System.out.println(x + " Dalinasi is 12");
            }
            if(x%16==0){
                System.out.println(x + " Dalinasi is 16");
            }
            if(x%42==0){
                System.out.println(x + " Dalinasi is 42");
            }
            if(x%103==0){
                System.out.println(x + " Dalinasi is 103");
            }
            if(x%111==0){
                System.out.println(x + " Dalinasi is 111");
            }
            if(x%223==0){
                System.out.println(x + " Dalinasi is 223");
            }
            if(x%250==0){
                System.out.println(x + " Dalinasi is 250");
            }if(x%2!=0 && x%5!=0 && x%7!=0 && x%8!=0 && x%12!=0 && x%16!=0 && x%42!=0 && x%103!=0 && x%111!=0 && x%223!=0 && x%250!=0){
                System.out.println(x + " Nesidalina nei iš vieno išvardinto skaičiaus.");
            }
        }while(x<=10000);
}}