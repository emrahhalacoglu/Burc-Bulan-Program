import java.util.Scanner;
public class Code{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int month,day;
            String burc="";
            boolean isError=false;

            System.out.print("Dogdugunuz ayi giriniz : ");
            month=input.nextInt();
            System.out.print("Dogdugunuz gunu giriniz : ");
            day=input.nextInt();

            if((month==1)&&(day>=1&&day<=31)){
                if((day<=21)){
                    burc="Oglak";}else{
                        burc="Kova";}
                    }
            else if((month==2)&&(day>=1&&day<=28)){
                if(day<=19){
                    if((day<=28)&&(day>0)){
                        burc="Kova";}else{
                            isError=true;}}
                    else{
                        if((day<=28)&&(day>0)){
                            burc="Balik";}else{
                                isError=true;}}
                            }
            else if((month==3)&&(day>=1&&day<=31)){
                if((day<=20)){
                    burc="Balik";}else{
                        burc="Koc";}
                    }
            else if((month==4)&&(day>=1&&day<=30)){
                if(day<=20){
                    if((day<=30)&&(day>0)){
                        burc="Koc";}else{
                            isError=true;}}
                    else{
                        if((day<=30)&&(day>0)){
                            burc="Boga";}else{
                                isError=true;}}
                            }
            else if((month==5)&&(day>=1&&day<=31)){
                if((day<=21)){
                    burc="Boga";}else{
                        burc="Ikizler";}
                    }
            else if((month==6)&&(day>=1&&day<=30)){
                if(day<=22){
                    if((day<=30)&&(day>0)){
                        burc="Ikizler";}else{
                            isError=true;}}
                    else{
                        if((day<=30)&&(day>0)){
                            burc="Yengec";}else{
                                isError=true;}}
                            }
            else if((month==7)&&(day>=1&&day<=31)){
                if((day<=22)){
                    burc="Yengec";}else{
                        burc="Aslan";}
                    }
            else if((month==8)&&(day>=1&&day<=31)){
                if((day<=22)){
                    burc="Aslan";}else{
                        burc="Basak";}
                    }
            else if((month==9)&&(day>=1&&day<=30)){
                if(day<=22){
                    if((day<=30)&&(day>0)){
                        burc="Basak";}else{
                            isError=true;}}
                    else{
                        if((day<=30)&&(day>0)){
                            burc="Terazi";}else{
                                isError=true;}}
                            }
            else if((month==10)&&(day>=1&&day<=31)){
                if((day<=22)){
                    burc="Terazi";}else{
                        burc="Akrep";}
                    }
            else if((month==11)&&(day>=1&&day<=30)){
                if(day<=22){
                    if((day<=30)&&(day>0)){
                        burc="Akrep";}else{
                            isError=true;}}
                    else{
                        if((day<=30)&&(day>0)){
                            burc="Yay";}else{
                                isError=true;}}
                            }
            else if((month==12)&&(day>=1&&day<=31)){
                if((day<=22)){
                    burc="Yay";}else{
                        burc="Oglak";}
                    }
            else{
                isError=true;
            }
            if(isError){
                System.out.println("Gecersiz bir tarih girdiniz!");}
                else{
                    System.out.println("Burcunuz : "+burc);}
        }
}
}