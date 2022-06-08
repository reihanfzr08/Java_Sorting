import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class Reihanrei{
	public static void main (String[] args) throws IOException{

	Scanner scan = new Scanner(System.in);
	BufferedReader inptdata = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("1. Bubble Sort");
	System.out.println("2. Exchange Sort");
	System.out.println("3. Selection Sort");
	System.out.println("4. Insertion Sort");
	System.out.print("Masukkan Pilihan Sorting	: ");
	int pilih1 = scan.nextInt();

	switch (pilih1){

		case 1 : //Ini case 1

        //input jumlah data
        System.out.print("Input Batasan Jumlah Data : ");    
        int jum_data = scan.nextInt();
         
        //Inputan nilai setiap Data
        int[] data = new int[jum_data]; //Array untuk tampung nilai tiap Data
        System.out.println();
        for(int f = 0; f < jum_data; f++)
        {
            System.out.print("Value Data ke > "+(f+1)+" : ");
            data[f] = scan.nextInt();
        }
         
        // Menampilkan Data Sebelum di Sorting
        System.out.println("\nBefore Sorting Data Bubble Sort :");
        for(int f = 0; f < jum_data; f++)
            System.out.print(data[f]+" ");
         
        // Cara Sorting Bubble Sort
        System.out.println("\nCara Sorting Bubble Sort");
        for(int f = 0; f < jum_data; f++)
        {
            System.out.println("Iterasi ke > "+(f+1)+" :");
            for(int k = 0; k < jum_data; k++)
                System.out.print(data[k]+"  ");
             
            System.out.println("   Compare "+data[0]+" dengan "+data[1]);
            for(int k = 0; k < jum_data-1; k++)
            {
                String message = "   Gak ada angka yang ditukar";
                if(data[k] > data[k+1])
                {
                    // Cara Tuker nilai Data
                    message = "   Data "+data[k]+" dituker dengan "+data[k+1];
                    int temp = data[k];        //Variable 
                    data[k] = data[k+1];    
                    data[k+1] = temp;
                     
                }
             
                if(k < jum_data-(f+1))
                {
                    for(int a = 0; a < jum_data; a++)
                        System.out.print(data[a]+"  ");
                     
                    System.out.println(message);;
                }
            }
 
            System.out.println("\n");
        }
         
        //menampilkan Data Sesudah di Sorting
        System.out.print("After Sorting Data Bubble Sort : ");
        for(int f = 0; f < jum_data; f++)
            System.out.print(data[f]+"  ");
        break;

        case 2 : //Ini case 2

        int[] data2=new int[1000]; 
		int v;
		//masukin v
		System.out.print("Input Batasan jumlah data = "); //input angka
		v=scan.nextInt();
		for(int r=0;r<=v-1;r++){
		System.out.print("Input datanya = "); //input angka

		data2[r]=scan.nextInt();
		}
		for(int r=0;r<=v-2;r++){
		for(int f=1;f<=v-1;f++){
		if(data2[r]>data2[f]){
		int temp=data2[r];
		data2[r]=data2[f];
		data2[f]=temp;
	}
	}
	}
	System.out.println();
	for(int r=0;r<=v-1;r++){

	System.out.print("After Sorting Data Exchange Sort = ");
	System.out.println(data2[r]);
	}

	break;

	case 3 : //Ini case 3

	//Input jumlah Data
        System.out.print("Input Batasan jumlah Data : ");  
        int jum_data2 = scan.nextInt();
         
        //    Inputan nilai setiap Data
        int[] data3 = new int[jum_data2];  //Array untuk nilai setiap Data
        System.out.println();
        for(int p = 0; p < jum_data2; p++)
        {
            System.out.print("Value Data ke > "+(p+1)+" : ");
            data3[p] = scan.nextInt();
        }
         
        // menampilkan Data Sebelum di sorting
        System.out.println();
        System.out.print("Before Sorting Data Selection Sort : ");
        for(int p = 0; p < jum_data2; p++)
            System.out.print(data3[p]+" ");
         
        // Cara Sorting Selection Sort
        System.out.println("\n\nCara Sorting Selection Sort");
        for(int p = 0; p < jum_data2-1; p++)
        {
            System.out.println("Iterasi ke > "+(p+1)+" : ");
            for(int q = 0; q < jum_data2; q++)
                System.out.print(data3[q]+" ");
             
            System.out.println("   Data "+data3[p]+" sudah Ter-urut ?");
             
            boolean exc = false;
            int idx = 0;
            int hm = data3[p];
            String message = "   Ga ada Angka Yang Dituker";
            for(int q = p+1; q < jum_data2; q++)
            {
                if(hm > data3[q])
                {
                    exc = true;
                    idx = q;
                    hm = data3[q];
                     
                }
            }
             
            if(exc == true)
            {
                //Tuker Data
                message = "   Data "+data3[p]+" ditukar dengan  "+data3[idx];
                int temp = data3[p];
                data3[p] = data3[idx];
                data3[idx] = temp;
            }
             
            for(int q = 0; q < jum_data2; q++)
                System.out.print(data3[q]+" ");
             
            System.out.println(message+"\n");
        }
         
        //menampilkan Data Sesudah di Sorting
        System.out.print("After Sorting Data Selection Sort : ");
        for(int p = 0; p < jum_data2; p++)
            System.out.print(data3[p]+" ");

       	break;

       	case 4 : //Ini case 4
         
        //  Input jumlah Data
        System.out.print("Input Batasan Jumlah Data : ");    int jum_data3 = Integer.parseInt(inptdata.readLine());
         
        //  Array untuk tampung nilai Data
        int[] data4 = new int[jum_data3];
         
        //  Pilihan fill data
        System.out.println("\nPilihan Fill Data");
        System.out.println("1. input data oleh user");
        System.out.println("2. input otomatis sama program");
        System.out.print("Choise : ");     int fill_data = Integer.parseInt(inptdata.readLine());
         
        switch(fill_data)
        {
            case 1  :   //input data oleh user
                        System.out.println();
                        for(int y = 0; y < jum_data3; y++)
                        {
                            System.out.print("Data ke > "+(y+1)+" : ");   data4[y] = Integer.parseInt(inptdata.readLine());
                        }
                         
                            break;
             
            case 2  :   //  Pengisian Data random oleh program
                        System.out.println();
                        for(int y = 0; y < jum_data3; y++)
                            data4[y] = new Random().nextInt(201);
                         
                        //  Tampilkan Data yang di isi oleh program
                        System.out.print("Data : ");
                        for(int y = 0; y < jum_data3; y++)
                            System.out.print(data4[y]+" ");
                         
                            break;
                             
            default :   System.out.println("\nPilihan tidak ada");
        }
         
        //  Cara Sorting Insertion Sort
        System.out.println("\nCara Sorting Insertion Sort");
        for(int y = 0; y < jum_data3-1; y++)
        {
            System.out.println("Iterasi > "+(y+1));
            for(int z = 0; z < jum_data3; z++)
                System.out.print(data4[z]+"\t");
             
            System.out.print("   --> Compare "+data4[y+1]+" dengan "+data4[y]);
             
            for(int z = y+1; z > 0; z--)
            {
                String message = "   --> Engga ada yang dituker";
                if(data4[z] < data4[z-1])
                {
                    message = "   --> "+data4[z]+" tuker posisi dengan "+data4[z-1];
                     
                    //  Proses Pertukaran data
                    int temp = data4[z];
                    data4[z] = data4[z-1];
                    data4[z-1] = temp;
                     
                    System.out.println();
                    for(int a = 0; a < jum_data3; a++)
                        System.out.print(data4[a]+"\t");
                     
                    System.out.print(message);
                }
                 
                else
                {
                    System.out.println();
                    for(int a = 0; a < jum_data3; a++)
                        System.out.print(data4[a]+"\t");
                     
                    System.out.print(message);
                        break;
                }
            }
            System.out.println("\n");
        }
         
        //  menampilkan hasil Sorting
        System.out.print("\nAfter Sorting data Insertion sort : ");
        for(int y = 0; y < jum_data3; y++)
            System.out.print(data4[y]+" ");

        }
	}
	
}