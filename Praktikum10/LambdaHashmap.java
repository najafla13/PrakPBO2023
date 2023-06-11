/**
File		: LambdaHashmap.java 02/06/2023
Nama		: Agnian Naja Aflak
Deskripsi	: Implementasi lambda pada Hashmap
**/

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashmap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121120015", "Agnian Naja Aflak"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama)); 
    } 
}
