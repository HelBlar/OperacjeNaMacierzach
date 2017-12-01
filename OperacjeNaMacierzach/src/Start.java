/**
 *
 * @author HelBlar
 */
import java.util.Scanner;
public class Start {

    
    
    public static void main(String[] args) {
       Scanner scOdczyt = new Scanner(System.in);
       int iMenu=0;
       int iIloscWierszyA=0, iIloscKolumnA=0;       
       int iIloscWierszyB=0, iIloscKolumnB=0; 
       boolean bPrawda=true;
       System.out.println("PROGRAM WYKONUJĄCY PODSTAWOWE OPERACJE NA MACIERZACH");
      while (bPrawda==true) { 
       System.out.println();
       System.out.println("MENU: ");
       System.out.println("1. Dodawanie");
       System.out.println("2. Odejmowanie");
       System.out.println("3. Mnożenie przez liczbę");
       System.out.println("4. Mnożenie przez macierz");
       System.out.println("5. Potęgowanie macierzy");
       System.out.println("0. Wyjście z programu");
       iMenu = scOdczyt.nextInt();
       switch(iMenu){
           case 1:
       System.out.print("Podaj liczbę wierszy macierzy A: ");
       iIloscWierszyA = scOdczyt.nextInt();
       System.out.print("Podaj liczbę Kolumn macierzy A: ");
       iIloscKolumnA = scOdczyt.nextInt();
       int iMacierzA[][] = new int[iIloscWierszyA][iIloscKolumnA];
       System.out.print("Podaj kolejne elementy macierzy A, każdy zatwierdzając ENTEREM: ");
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           iMacierzA[i-1][j-1]= scOdczyt.nextInt();
        }
       }
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           System.out.print(iMacierzA[i-1][j-1]+" ");
        }
        System.out.println();
       }
       System.out.print("Podaj liczbę wierszy macierzy B: ");
       iIloscWierszyB = scOdczyt.nextInt();
       System.out.print("Podaj liczbę Kolumn macierzy B: ");
       iIloscKolumnB = scOdczyt.nextInt();
       int iMacierzB[][] = new int[iIloscWierszyB][iIloscKolumnB];
       System.out.print("Podaj kolejne elementy macierzy B, każdy zatwierdzając ENTEREM: ");
       for(int i=1;i<=iIloscWierszyB;i++){
        for (int j=1;j<=iIloscKolumnB;j++){
           iMacierzB[i-1][j-1]= scOdczyt.nextInt();
        }
       }
       for(int i=1;i<=iIloscWierszyB;i++){
        for (int j=1;j<=iIloscKolumnB;j++){
           System.out.print(iMacierzB[i-1][j-1]+" ");
        }
        System.out.println();
        
       }
       int iMacierzC[][]= new int[iIloscWierszyB][iIloscKolumnB];
       if (iIloscKolumnA==iIloscKolumnB&&iIloscWierszyA==iIloscWierszyB){
           System.out.println("A+B= ");
            for(int i=1;i<=iIloscWierszyB;i++){
             for (int j=1;j<=iIloscKolumnB;j++){
                iMacierzC[i-1][j-1]=iMacierzA[i-1][j-1]+iMacierzB[i-1][j-1];
                System.out.print(iMacierzC[i-1][j-1]+" ");
             }
             System.out.println();
            }
       } 
       else {
          System.out.println("Wprowadzonych macierzy nie można dodać!!");
       }
       break;
           case 2:
       System.out.print("Podaj liczbę wierszy macierzy A: ");
       iIloscWierszyA = scOdczyt.nextInt();
       System.out.print("Podaj liczbę Kolumn macierzy A: ");
       iIloscKolumnA = scOdczyt.nextInt();
       int iMacierzAmin[][] = new int[iIloscWierszyA][iIloscKolumnA];
       System.out.print("Podaj kolejne elementy macierzy A, każdy zatwierdzając ENTEREM: ");
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           iMacierzAmin[i-1][j-1]= scOdczyt.nextInt();
        }
       }
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           System.out.print(iMacierzAmin[i-1][j-1]+" ");
        }
        System.out.println();
       }
       System.out.print("Podaj liczbę wierszy macierzy B: ");
       iIloscWierszyB = scOdczyt.nextInt();
       System.out.print("Podaj liczbę Kolumn macierzy B: ");
       iIloscKolumnB = scOdczyt.nextInt();
       int iMacierzBmin[][] = new int[iIloscWierszyB][iIloscKolumnB];
       System.out.print("Podaj kolejne elementy macierzy B, każdy zatwierdzając ENTEREM: ");
       for(int i=1;i<=iIloscWierszyB;i++){
        for (int j=1;j<=iIloscKolumnB;j++){
           iMacierzBmin[i-1][j-1]= scOdczyt.nextInt();
        }
       }
       for(int i=1;i<=iIloscWierszyB;i++){
        for (int j=1;j<=iIloscKolumnB;j++){
           System.out.print(iMacierzBmin[i-1][j-1]+" ");
        }
        System.out.println();
        
       }
       int iMacierzCmin[][]= new int[iIloscWierszyB][iIloscKolumnB];
       if (iIloscKolumnA==iIloscKolumnB&&iIloscWierszyA==iIloscWierszyB){
           System.out.println("A-B= ");
            for(int i=1;i<=iIloscWierszyB;i++){
             for (int j=1;j<=iIloscKolumnB;j++){
                iMacierzCmin[i-1][j-1]=iMacierzAmin[i-1][j-1]-iMacierzBmin[i-1][j-1];
                System.out.print(iMacierzCmin[i-1][j-1]+" ");
             }
             System.out.println();
            }
       } 
       else {
          System.out.println("Wprowadzonych macierzy nie można odjąć!!");
       }
        break;
           case 3:
       System.out.print("Podaj liczbę wierszy macierzy A: ");
       iIloscWierszyA = scOdczyt.nextInt();
       System.out.print("Podaj liczbę Kolumn macierzy A: ");
       iIloscKolumnA = scOdczyt.nextInt();
       int iMacierzAraz[][] = new int[iIloscWierszyA][iIloscKolumnA];
       System.out.print("Podaj kolejne elementy macierzy A, każdy zatwierdzając ENTEREM: ");
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           iMacierzAraz[i-1][j-1]= scOdczyt.nextInt();
        }
       }
       for(int i=1;i<=iIloscWierszyA;i++){
        for (int j=1;j<=iIloscKolumnA;j++){
           System.out.print(iMacierzAraz[i-1][j-1]+" ");
        }
        System.out.println();
       }
        System.out.print("Podaj liczbę przez jaką chcesz pomnożyć macierz: ");
       int iMnozenie= scOdczyt.nextInt();
       int iMacierzCraz[][]= new int[iIloscWierszyA][iIloscKolumnA];
       for(int i=1;i<=iIloscWierszyA;i++){
             for (int j=1;j<=iIloscKolumnA;j++){
                iMacierzCraz[i-1][j-1]=iMacierzAraz[i-1][j-1]*iMnozenie;
                System.out.print(iMacierzCraz[i-1][j-1]+" ");
             }
             System.out.println();
            }
        break;
           case 4: //mnożenie
             System.out.print("Podaj liczbę wierszy macierzy A: ");
             iIloscWierszyA = scOdczyt.nextInt();
             System.out.print("Podaj liczbę Kolumn macierzy A: ");
             iIloscKolumnA = scOdczyt.nextInt(); 
             System.out.print("Podaj liczbę wierszy macierzy B: ");
             iIloscWierszyB = scOdczyt.nextInt();
             System.out.print("Podaj liczbę Kolumn macierzy B: ");
             iIloscKolumnB = scOdczyt.nextInt();
             if (iIloscKolumnA!=iIloscWierszyB){
                System.out.print("Podanych macierzy nie można wymnożyć"); 
             } else {
               int iMacierzArazy[][] = new int[iIloscWierszyA][iIloscKolumnA];
               System.out.print("Podaj kolejne elementy macierzy A, każdy zatwierdzając ENTEREM: ");
               for(int i=1;i<=iIloscWierszyA;i++){
               for (int j=1;j<=iIloscKolumnA;j++){
               iMacierzArazy[i-1][j-1]= scOdczyt.nextInt();
               }
               }
                for(int i=1;i<=iIloscWierszyA;i++){
                for (int j=1;j<=iIloscKolumnA;j++){
                    System.out.print(iMacierzArazy[i-1][j-1]+" ");
                }
                    System.out.println();
                }  
                
             int iMacierzBrazy[][] = new int[iIloscWierszyB][iIloscKolumnB];
                System.out.print("Podaj kolejne elementy macierzy B, każdy zatwierdzając ENTEREM: ");
                for(int i=1;i<=iIloscWierszyB;i++){
                for (int j=1;j<=iIloscKolumnB;j++){
                    iMacierzBrazy[i-1][j-1]= scOdczyt.nextInt();
                }
                }
                    for(int i=1;i<=iIloscWierszyB;i++){
                    for (int j=1;j<=iIloscKolumnB;j++){
                        System.out.print(iMacierzBrazy[i-1][j-1]+" ");
                    }
                        System.out.println();
                    }
                    System.out.println("\n\n");
                    System.out.println("Nowa macierz: ");
                  int iMacierzCrazy [][] =new int [iIloscWierszyA][iIloscKolumnB];
                  int iCsuma=0;
                     for(int i=1;i<=iIloscWierszyA;i++){
                         
                         for(int j=1;j<=iIloscKolumnB;j++){
                             
                             
                             for (int k=1; k<=iIloscKolumnA;k++){
                                 
                             iCsuma =iCsuma+(iMacierzArazy[i-1][k-1]*iMacierzBrazy[k-1][j-1]);
                            
                             }
                             iMacierzCrazy[i-1][j-1] = iCsuma;
                             iCsuma = 0;
                             System.out.print(iMacierzCrazy[i-1][j-1]+" ");
                                }
                                 System.out.println();
                          }
                     } 
                     
             
           break;
           case 5: //potęgowanie
             System.out.print("Podaj liczbę wierszy macierzy A: ");
             iIloscWierszyA = scOdczyt.nextInt();
             System.out.print("Podaj liczbę Kolumn macierzy A: ");
             iIloscKolumnA = scOdczyt.nextInt();
             if (iIloscKolumnA!=iIloscWierszyA){
                System.out.print("Potęgować można tylko macierze kwadratowe"); 
             } else {
               System.out.print("Do której potęgi chcesz podnieść macierz A: ");
               int iPotega = scOdczyt.nextInt();
               int iMacierzApot[][] = new int[iIloscWierszyA][iIloscKolumnA];
               System.out.print("Podaj kolejne elementy macierzy A, każdy zatwierdzając ENTEREM: ");
               for(int i=1;i<=iIloscWierszyA;i++){
               for (int j=1;j<=iIloscKolumnA;j++){
               iMacierzApot[i-1][j-1]= scOdczyt.nextInt();
               }
               }
                for(int i=1;i<=iIloscWierszyA;i++){
                for (int j=1;j<=iIloscKolumnA;j++){
                    System.out.print(iMacierzApot[i-1][j-1]+" ");
                }
                    System.out.println();
                }  
               
                    System.out.println("\n\n");
                    System.out.println("Nowa macierz: ");
                  int iMacierzCpot [][] =new int [iIloscWierszyA][iIloscKolumnA];
                  int iCsuma=0,iP=1;
                     while (iP<=iPotega){
                     for(int i=1;i<=iIloscWierszyA;i++){
                         
                         for(int j=1;j<=iIloscKolumnA;j++){
                             
                             
                             for (int k=1; k<=iIloscKolumnA;k++){
                                 
                             iCsuma =iCsuma+(iMacierzApot[i-1][k-1]*iMacierzApot[k-1][j-1]);
                            
                             }
                             iMacierzCpot[i-1][j-1] = iCsuma;
                             iCsuma = 0;                            
                             System.out.print(iMacierzCpot[i-1][j-1]+" ");
                             iP++;
                             
                                }
                                 System.out.println();
                          }
                     iMacierzApot=iMacierzCpot;
             }
                     
                      
             }
                     
           break;
        case 0:// wyjście
            bPrawda=false;   
       break;
               
       }
      
      } 
    }
    
}
