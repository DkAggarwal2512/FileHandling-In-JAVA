

import java.io.File;
public class fileH {
    public static void main(String[]args){

// ------>>>>> FIle Delete

File a =new File("jind.txt");
if(a.exists()){
    a.delete();
    System.out.println("File Delete");
}
else{
    System.out.println("File not found");
}

}}


// ----->>>>>> File Scanner
    //     try{
    //         File a =new File("Hr.txt");
    //         Scanner b = new Scanner(a);
    // String data =b.nextLine();
    // System.out.println(data);
    //         // while (b.nextLine()) {
    //         //     String data = b.nextLine();
    //         //     System.out.println(data);
                
    //         // }
    //     }
        
    //         catch(Exception e ){
    //             System.out.println("FIle not Written");

    //         }
    //             }   
    //          }





// ---->>>>>> File Write
    //     try {
    //         FileWriter a =new FileWriter("HRR.txt");
    //     a.write("Written using java");
    //     a.close();
    //     System.out.println("file Written done");
            
    //     } 
    //     catch (Exception e) {
    //         System.out.println("File can not be written");
    //     }

        



    // }}

// Read The File----->>>>>>

    //     File a =new File("jind.txt");
    //     if(a.exists()){
    //         System.out.println("file name "+a.getName());
    //         System.out.println("Path Is:  "+a.getAbsolutePath());
    //         System.out.println("parent is   "+a.getParent());
    //         System.out.println("File size  "+a.length());
    //         System.out.println("File is readable  "+a.canRead());
    //         System.out.println("File is Writeable  "+a.canWrite());


    //     }
    //     else{
    //         System.out.println("file not found");
    //     }


    // }}


// CREATE A FILE -->>>>>>
//         File a = new File("HRR.txt");


//         try{
//             if(a.createNewFile())
//             {
//             System.out.println("File created Done");
//         }
//         else{
//             System.out.println("File Already Exicst");
//         }
//     }
//         catch(Exception e ){
//             System.out.println("File not created ");
//         }
//     }
    
// }
